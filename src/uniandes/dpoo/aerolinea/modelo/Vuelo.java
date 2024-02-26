package uniandes.dpoo.aerolinea.modelo;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;

public class Vuelo 
{

	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private Cliente cliente;
	private CalculadoraTarifas calculadora;
	
	
	
	public Vuelo (Ruta ruta, String fecha, Avion avion)
	{
		this.ruta = ruta;
		this.fecha = fecha;
		this.avion = avion;
	}
	
	
	public String getFecha() {
		return fecha;
	}


	public Ruta getRuta() {
		return ruta;
	}



	public Avion getAvion() {
		return avion;
	}


	public static int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad)
	{
		return cantidad;
		
	}
	
	
	public boolean equals (Object obj)
	{
		return false;
		
	}




}
