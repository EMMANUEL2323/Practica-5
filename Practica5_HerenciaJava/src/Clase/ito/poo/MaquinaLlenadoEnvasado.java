/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clase.ito.poo;

import java.time.LocalDate;

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
	 * Description of the property cantidadEnvasesxMinuto.
	 */
	private int cantidadEnvasesxMinuto = 0;
	
	/**
	 * Description of the property listaRegulacion.
	 */
	private float listaRegulacion = 0F;
	
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
	
	public MaquinaLlenadoEnvasado(LocalDate fechaAdquisicion, float costo, String descripcion,
			int cantidadEnvasesxMinuto, float listaRegulacion) {
		super(fechaAdquisicion, costo, descripcion);
		this.cantidadEnvasesxMinuto = cantidadEnvasesxMinuto;
		this.listaRegulacion = listaRegulacion;
	}
	
	// Start of user code (user defined methods for MaquinaLlenadoEnvasado)
	
	// End of user code
	/**
	 * Returns cantidadEnvasesxMinuto.
	 * @return cantidadEnvasesxMinuto 
	 */
	public int getCantidadEnvasesxMinuto() {
		return this.cantidadEnvasesxMinuto;
	}
	
	/**
	 * Sets a value to attribute cantidadEnvasesxMinuto. 
	 * @param newCantidadEnvasesxMinuto 
	 */
	public void setCantidadEnvasesxMinuto(int newCantidadEnvasesxMinuto) {
	    this.cantidadEnvasesxMinuto = newCantidadEnvasesxMinuto;
	}

	/**
	 * Returns listaRegulacion.
	 * @return listaRegulacion 
	 */
	public float getListaRegulacion() {
		return this.listaRegulacion;
	}
	
	/**
	 * Sets a value to attribute listaRegulacion. 
	 * @param newListaRegulacion 
	 */
	public void setListaRegulacion(float newListaRegulacion) {
	    this.listaRegulacion = newListaRegulacion;
	}

	@Override
	public String toString() {
		return "MaquinaLlenadoEnvasado [cantidadEnvasesxMinuto=" + cantidadEnvasesxMinuto + ", listaRegulacion="
				+ listaRegulacion + ", FechaAdquisicion=" + getFechaAdquisicion() + ", Costo=" + getCosto()
				+ ", Descripcion=" + getDescripcion() + "]";
	}

	@Override
	public float costoFinal() {
		// TODO Auto-generated method stub
		float costoFinal=0f;
		float costodemaquina=super.getCosto()*0.25f/100f;
		costoFinal=costodemaquina/this.cantidadEnvasesxMinuto;
		return costoFinal;
	
	}



}
