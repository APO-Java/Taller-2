package modelo;

public class ProductoMenu implements Producto{
	//Atributos
	
	private String nombre;
	private int precioBase;
	
	//Metodos
	
	//Constructor
	
	public ProductoMenu(String nombre, int precioBase) 
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
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
		return nombre + " $" + precioBase;
	}
	
	
}
