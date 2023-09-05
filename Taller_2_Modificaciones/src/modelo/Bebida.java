package modelo;

public class Bebida implements Producto{
	//Atributos
	
	private String nombreBebida;
	private int precioBebida;
	private int caloriasBebida;
	
	//Metodos
	
	public Bebida(String nombreBebida, int precioBebida, int caloriasBebida)
	{
		this.nombreBebida = nombreBebida;
		this.caloriasBebida = caloriasBebida;
		this.precioBebida = precioBebida;
	}
	
	@Override
	public String getNombre()
	{
		return nombreBebida;
	}
	@Override
	public int getPrecio()
	{
		return precioBebida;
	}
	@Override
	public int getCalorias()
	{
		return caloriasBebida;
	}
	@Override
	public String generarTextoFactura() {
		return nombreBebida + " Cal: " + caloriasBebida+ "  $" + precioBebida;
	}
}
