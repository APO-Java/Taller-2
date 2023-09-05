package modelo;

public class ProductoMenu implements Producto{
	//Atributos
	
	private String nombre;
	private int precioBase;
	private int calorias;
	
	//Metodos
	
	//Constructor
	
	public ProductoMenu(String nombre, int precioBase, int calorias) 
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.calorias = calorias;
	}
	
	//Getters y Setters
	
	@Override
	public String getNombre()
	{
		return nombre;
	}
	
	@Override
	public int getPrecio()
	{
		return precioBase;
	}
	
	@Override
	public String generarTextoFactura()
	{
		return nombre + " Cal: " + getCalorias()  +" $" + precioBase;
	}
	
	public int getCalorias()
	{
		return calorias;
	}
}
