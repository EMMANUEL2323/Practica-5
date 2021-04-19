/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clase.ito.poo;

import Clase.ito.poo.Maquina ;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of MaquinaEmpaquetado.
 * 
 * @author emman
 */
public class MaquinaEmpaquetado extends Maquina  {
	/**
	 * Description of the property tipoEmpaque.
	 */
	public int tipoEmpaque = 0;
	
	/**
	 * Description of the property cantidadEmpaques.
	 */
	public int cantidadEmpaques = 0;
	
	// Start of user code (user defined attributes for MaquinaEmpaquetado)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public MaquinaEmpaquetado() {
		// Start of user code constructor for MaquinaEmpaquetado)
		super();
		// End of user code
	}
	
	/**
	 * Description of the method costoEmpaquetado.
	 * @param costo 
	 * @param tipoEmpaque 
	 * @param cantidadEmpaques 
	 * @return 
	 */
	public float costoEmpaquetado(float costo, int tipoEmpaque, int cantidadEmpaques) {
		// Start of user code for method costoEmpaquetado
		float costoEmpaquetado = 0F;
		return costoEmpaquetado;
		// End of user code
	}
	 
	// Start of user code (user defined methods for MaquinaEmpaquetado)
	
	// End of user code
	/**
	 * Returns tipoEmpaque.
	 * @return tipoEmpaque 
	 */
	public int getTipoEmpaque() {
		return this.tipoEmpaque;
	}
	
	/**
	 * Sets a value to attribute tipoEmpaque. 
	 * @param newTipoEmpaque 
	 */
	public void setTipoEmpaque(int newTipoEmpaque) {
	    this.tipoEmpaque = newTipoEmpaque;
	}

	/**
	 * Returns cantidadEmpaques.
	 * @return cantidadEmpaques 
	 */
	public int getCantidadEmpaques() {
		return this.cantidadEmpaques;
	}
	
	/**
	 * Sets a value to attribute cantidadEmpaques. 
	 * @param newCantidadEmpaques 
	 */
	public void setCantidadEmpaques(int newCantidadEmpaques) {
	    this.cantidadEmpaques = newCantidadEmpaques;
	}



}
