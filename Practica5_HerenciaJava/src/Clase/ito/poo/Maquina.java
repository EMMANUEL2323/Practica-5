/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clase.ito.poo;

import java.time.LocalDate;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Maquina .
 * 
 * @author emman
 */
public class Maquina  {

	/**
	 * Description of the property fechaAdquisicion.
	 */
	private java.time.LocalDate fechaAdquisicion = null;
	
	/**
	 * Description of the property costo.
	 */
	private float costo = 0F;
	
	/**
	 * Description of the property descripcion.
	 */
	private String descripcion = "";
	
	// Start of user code (user defined attributes for Maquina )
	
	// End of user code
	
	public Maquina(LocalDate fechaAdquisicion, float costo, String descripcion) {
		super();
		this.fechaAdquisicion = fechaAdquisicion;
		this.costo = costo;
		this.descripcion = descripcion;
	}
	
	/**
	 * The constructor.
	 */
	public Maquina () {
		// Start of user code constructor for Maquina )
		super();
		// End of user code
	}
	
	/**
	 * Description of the method costoFinal.
	 * @return 
	 */
	public float costoFinal() {
		// Start of user code for method costoFinal
		float costoFinal = 0F;
		return costoFinal;
		// End of user code
	}
	 
	// Start of user code (user defined methods for Maquina )
	
	// End of user code
	/**
	 * Returns fechaAdquisicion.
	 * @return fechaAdquisicion 
	 */
	public java.time.LocalDate getFechaAdquisicion() {
		return this.fechaAdquisicion;
	}
	
	/**
	 * Sets a value to attribute fechaAdquisicion. 
	 * @param newFechaAdquisicion 
	 */
	public void setFechaAdquisicion(java.time.LocalDate newFechaAdquisicion) {
	    this.fechaAdquisicion = newFechaAdquisicion;
	}

	/**
	 * Returns costo.
	 * @return costo 
	 */
	public float getCosto() {
		return this.costo;
	}
	
	/**
	 * Sets a value to attribute costo. 
	 * @param newCosto 
	 */
	public void setCosto(float newCosto) {
	    this.costo = newCosto;
	}

	/**
	 * Returns descripcion.
	 * @return descripcion 
	 */
	public String getDescripcion() {
		return this.descripcion;
	}
	
	/**
	 * Sets a value to attribute descripcion. 
	 * @param newDescripcion 
	 */
	public void setDescripcion(String newDescripcion) {
	    this.descripcion = newDescripcion;
	}

	@Override
	public String toString() {
		return "Maquina [fechaAdquisicion=" + fechaAdquisicion + ", costo=" + costo + ", descripcion=" + descripcion
				+ "]";
	}



}
