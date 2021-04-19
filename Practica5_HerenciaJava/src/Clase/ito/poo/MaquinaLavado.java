/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clase.ito.poo;

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
	public long capacidadLitros = 0L;
	
	/**
	 * Description of the property tiempoLavadoBotella.
	 */
	public float tiempoLavadoBotella = 0F;
	
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
	
	/**
	 * Description of the method costoLavado.
	 * @param costo 
	 * @param tiempoLvadoBotella 
	 * @return 
	 */
	public float costoLavado(float costo, float tiempoLvadoBotella) {
		// Start of user code for method costoLavado
		float costoLavado = 0F;
		return costoLavado;
		// End of user code
	}
	 
	// Start of user code (user defined methods for MaquinaLavado)
	
	// End of user code
	/**
	 * Returns capacidadLitros.
	 * @return capacidadLitros 
	 */
	public long getCapacidadLitros() {
		return this.capacidadLitros;
	}
	
	/**
	 * Sets a value to attribute capacidadLitros. 
	 * @param newCapacidadLitros 
	 */
	public void setCapacidadLitros(long newCapacidadLitros) {
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



}
