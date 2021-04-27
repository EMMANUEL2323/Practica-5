/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clase.ito.poo;

import java.time.LocalDate;

import Clase.ito.poo.Maquina ;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of MaquinaLavado.
 * 
 * @author emman
 */
public class MaquinaLavado extends Maquina  {

	/**
	 * Description of the property capacidadLitros.
	 */
	private int capacidadLitros = 0;
	
	/**
	 * Description of the property tiempoLavadoBotella.
	 */
	private float tiempoLavadoBotella = 0F;
	
	// Start of user code (user defined attributes for MaquinaLavado)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public MaquinaLavado() {
		// Start of user code constructor for MaquinaLavado)
		super();
		// End of user code
	}
	
	public MaquinaLavado(LocalDate fechaAdquisicion, float costo, String descripcion, int capacidadLitros,
			float tiempoLavadoBotella) {
		super(fechaAdquisicion, costo, descripcion);
		this.capacidadLitros = capacidadLitros;
		this.tiempoLavadoBotella = tiempoLavadoBotella;
	}

	// Start of user code (user defined methods for MaquinaLavado)
	
	// End of user code
	/**
	 * Returns capacidadLitros.
	 * @return capacidadLitros 
	 */
	public int getCapacidadLitros() {
		return this.capacidadLitros;
	}
	
	/**
	 * Sets a value to attribute capacidadLitros. 
	 * @param newCapacidadLitros 
	 */
	public void setCapacidadLitros(int newCapacidadLitros) {
	    this.capacidadLitros = newCapacidadLitros;
	}

	/**
	 * Returns tiempoLavadoBotella.
	 * @return tiempoLavadoBotella 
	 */
	public float getTiempoLavadoBotella() {
		return this.tiempoLavadoBotella;
	}
	
	/**
	 * Sets a value to attribute tiempoLavadoBotella. 
	 * @param newTiempoLavadoBotella 
	 */
	public void setTiempoLavadoBotella(float newTiempoLavadoBotella) {
	    this.tiempoLavadoBotella = newTiempoLavadoBotella;
	}

	@Override
	public String toString() {
		return "MaquinaLavado [capacidadLitros=" + capacidadLitros + ", tiempoLavadoBotella=" + tiempoLavadoBotella
				+ ", FechaAdquisicion=" + getFechaAdquisicion() + ", Costo=" + getCosto()
				+ ", Descripcion=" + getDescripcion() + "]";
	}

	@Override
	public float costoFinal() {
		// TODO Auto-generated method stub
		float costoFinal=0f;
		float costmaquina=super.getCosto()*0.5f/100f;
		float tiempo=60f/this.getTiempoLavadoBotella();
		costoFinal=costmaquina/tiempo;
		return costoFinal;
	}



}
