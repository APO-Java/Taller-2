package modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto{

	//Atributos
	private ProductoMenu base;
	private ArrayList<Ingrediente> agregados;
	private ArrayList<Ingrediente> eliminados;
	
	//Metodos
	//Constructor
	public ProductoAjustado(ProductoMenu base){
		this.base = base;
		this.agregados = new ArrayList<>();
		this.eliminados = new ArrayList<>();
	}
	
	@Override
	public String getNombre()
	{
		return base.getNombre();
	}
	
	@Override
	public int getPrecio()
	{
		int precioFinal = base.getPrecio();
		for (int i=0; i < agregados.size(); i++)
		{
			precioFinal += agregados.get(i).getCostoAdicional();
		}
		return precioFinal;
	}
	
	@Override
	public String generarTextoFactura()
	{
		int precio = 0;
		String factura = getNombre();
		precio += base.getPrecio();
		if (agregados.size() > 0) {
			factura +=" con ";
			for (int i = 0; i < agregados.size(); i++) {
				factura += agregados.get(i).getNombre();
				precio += agregados.get(i).getCostoAdicional();
				if (i+1 < agregados.size()) {
					factura += ", ";
				}
			}
		}
		if (agregados.size()>0 && eliminados.size()>0) {
			factura += "; ";
		}
		if (eliminados.size() > 0) {
			factura +=" sin ";
			for (int i = 0; i < eliminados.size(); i++) {
				factura += eliminados.get(i).getNombre();
				if (i+1 < eliminados.size()) {
					factura += ", ";
				}
			}
		}
		factura += " Cal: " + getCalorias();
		factura += "  $" + precio;
		return factura;
	}
	
	@Override
	public int getCalorias() {
		int caloriaCambio = 0;
		for (int i = 0; i < agregados.size(); i++) {
			caloriaCambio += agregados.get(i).getCalorias();
		}
		for (int i = 0; i < eliminados.size(); i++) {
			caloriaCambio -= eliminados.get(i).getCalorias();
		}
		return base.getCalorias() + caloriaCambio;
	}
	public void agregarIngrediente(Ingrediente ingrediente) 
	{
		agregados.add(ingrediente);
	}
	
	public void eliminarIngrediente(Ingrediente ingrediente) 
	{
		eliminados.add(ingrediente);
	}
	
}
