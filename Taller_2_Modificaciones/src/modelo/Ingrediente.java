package modelo;

public class Ingrediente {
	//Atributos
	private String nombre;
	private int costoAdicional;
	private int calorias;
	
	//Metodos
	
	//Constructor
	
	public Ingrediente(String nombre, int costoAdicional, int calorias)
	{
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
		this.calorias = calorias;
	}
	
	//Getter y Setters
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public int getCostoAdicional()
	{
		return costoAdicional;
	}
	public int getCalorias()
	{
		return calorias;
	}
}
