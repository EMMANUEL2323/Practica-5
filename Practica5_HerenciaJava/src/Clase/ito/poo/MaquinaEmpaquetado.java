/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clase.ito.poo;

import java.time.LocalDate;

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
	private int tipoEmpaque = 0;
	
	/**
	 * Description of the property cantidadEmpaques.
	 */
	private int cantidadEmpaques = 0;
	
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
	
	public MaquinaEmpaquetado(LocalDate fechaAdquisicion, float costo, String descripcion, int tipoEmpaque,
			int cantidadEmpaques) {
		super(fechaAdquisicion, costo, descripcion);
		this.tipoEmpaque = tipoEmpaque;
		this.cantidadEmpaques = cantidadEmpaques;
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

	@Override
	public String toString() {
		return "MaquinaEmpaquetado [tipoEmpaque=" + tipoEmpaque + ", cantidadEmpaques=" + cantidadEmpaques
				+ ", FechaAdquisicion=" + getFechaAdquisicion() + ", Costo=" + getCosto()
				+ ", Descripcion=" + getDescripcion() + "]";
	}

	@Override
	public float costoFinal() {
		// TODO Auto-generated method stub
		float costoFinal=0f;
		float costodemaquina=super.getCosto()*0.06f/100f;
		float empaquetado=this.getTipoEmpaque()*this.getCantidadEmpaques();
		costoFinal=costodemaquina/empaquetado;
		return costoFinal;
	}



}
