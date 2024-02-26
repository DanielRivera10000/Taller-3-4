package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas 
{
	public double IMPUESTO = 0.28;
	private Vuelo vuelo;
	private Cliente cliente;
	
	
	
	public int calcularTarifa (Vuelo vuelo, Cliente cliente)
	{
		this.vuelo = vuelo;
		this.cliente = cliente;
		return 0;
	}
	
	protected int calcularCostoBase (Vuelo vuelo, Cliente cliente)
	{
		return 0;
		
	}
	
	protected double calcularPorcentajeDescuento (Cliente cliente)
	{
		return IMPUESTO;
		
	}
	
	
	protected abstract int calcularDistanciaVuelo (Ruta ruta);
	{
		
	}
	
	protected int calcularValorImpuestos (int costoBase)
	{
		return costoBase;
	}

}
