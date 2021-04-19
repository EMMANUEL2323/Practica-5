/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clase.ito.poo;

import Clase.ito.poo.Maquina ;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of MaquinaLlenadoEnvasado.
 * 
 * @author emman
 */
public class MaquinaLlenadoEnvasado extends Maquina  {
	/**
	 * Description of the property cantidadEnvases.
	 */
	public int cantidadEnvases = 0;
	
	/**
	 * Description of the property listaRegulacion.
	 */
	public long listaRegulacion = 0L;
	
	// Start of user code (user defined attributes for MaquinaLlenadoEnvasado)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public MaquinaLlenadoEnvasado() {
		// Start of user code constructor for MaquinaLlenadoEnvasado)
		super();
		// End of user code
	}
	
	/**
	 * Description of the method costoLlenadoEnvasado.
	 * @param costo 
	 * @param cantidadEnvases 
	 * @return 
	 */
	public float costoLlenadoEnvasado(float costo, int cantidadEnvases) {
		// Start of user code for method costoLlenadoEnvasado
		float costoLlenadoEnvasado = 0F;
		return costoLlenadoEnvasado;
		// End of user code
	}
	 
	// Start of user code (user defined methods for MaquinaLlenadoEnvasado)
	
	// End of user code
	/**
	 * Returns cantidadEnvases.
	 * @return cantidadEnvases 
	 */
	public int getCantidadEnvases() {
		return this.cantidadEnvases;
	}
	
	/**
	 * Sets a value to attribute cantidadEnvases. 
	 * @param newCantidadEnvases 
	 */
	public void setCantidadEnvases(int newCantidadEnvases) {
	    this.cantidadEnvases = newCantidadEnvases;
	}

	/**
	 * Returns listaRegulacion.
	 * @return listaRegulacion 
	 */
	public long getListaRegulacion() {
		return this.listaRegulacion;
	}
	
	/**
	 * Sets a value to attribute listaRegulacion. 
	 * @param newListaRegulacion 
	 */
	public void setListaRegulacion(long newListaRegulacion) {
	    this.listaRegulacion = newListaRegulacion;
	}



}
