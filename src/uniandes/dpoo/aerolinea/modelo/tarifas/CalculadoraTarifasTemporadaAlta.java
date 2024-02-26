package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta 
{
	protected int COSTO_POR_KM = 1000;
	
	
	public int calcularCostoBase (Vuelo vuelo, Cliente cliente)
	{
		return COSTO_POR_KM;
		
	}
	
	
	public double calcularPorcentajeDescuento (Cliente cliente)
	{
		return COSTO_POR_KM;
		
	}

}
