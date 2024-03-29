package modelo;

import java.util.ArrayList;


public class Combo implements Producto{
	
	//Atributos
	
	private double descuento;
	private String nombreCombo;
	private ArrayList<ProductoMenu> itemsCombo;
	
	//Metodos
	
	//Constructor
	
	public Combo(String nombre, double descuento)
	{
		this.nombreCombo = nombre;
		this.descuento = descuento;
		this.itemsCombo = new ArrayList<>();
	}
	
	// Getters y Setters
	
	public void agregarItemACombo(ProductoMenu itemCombo)
	{
		itemsCombo.add(itemCombo);
	}
	
	@Override
	public int getPrecio()
	{
		int precioNeto = 0;
		for (int i = 0; i < itemsCombo.size(); i++) {
		    precioNeto += itemsCombo.get(i).getPrecio();
		}
		return (int) (precioNeto * (1 - descuento));
	}
	
	@Override
	public String generarTextoFactura()
	{
		String texto = nombreCombo + " Cal: "+ getCalorias() +" $" + getPrecio() +
				"\n Items: ";
		for (int i=0; i < itemsCombo.size(); i++ )
		{
			texto += "\n\t" + itemsCombo.get(i).getNombre();
		}
		return texto;
	}
	
	@Override
	public String getNombre()
	{
		return nombreCombo;
	}

	public double getDescuento()
	{
		return descuento;
	}
	
	@Override
	public int getCalorias() {
		int calorias = 0;
		for (int i = 0; i < itemsCombo.size(); i++) {
			calorias += itemsCombo.get(i).getCalorias();
		}
		return calorias;
	}
	
}
