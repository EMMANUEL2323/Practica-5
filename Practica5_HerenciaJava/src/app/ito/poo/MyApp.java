package app.ito.poo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();

		class MaquinaLavado {
			/**
			 * Description of the property capacidadLitros.
			 */
			private float capacidadLitros = 0F;

			/**
			 * Description of the property tiempoLavado.
			 */
			private float tiempoLavado = 20;

			/**
			 * Description of the property costoLavado.
			 */
			private static float costoLavado = 2.5F;

			// Start of user code (user defined attributes for MaquinaLavado)

			// End of user code
			private double porcentaje = 0.5F;

			/**
			 * The constructor.
			 */
			public MaquinaLavado() {
				// Start of user code constructor for MaquinaLavado)
				super();
				// End of user code
			}

			// Start of user code (user defined methods for MaquinaLavado)

			// End of user code
			/**
			 * Returns capacidadLitros.
			 * @return capacidadLitros 
			 */
			public float getCapacidadLitros() {
				return this.capacidadLitros;
			}

			/**
			 * Sets a value to attribute capacidadLitros. 
			 * @param newCapacidadLitros 
			 */
			public void setCapacidadLitros(float newCapacidadLitros) {
				this.capacidadLitros = newCapacidadLitros;
			}

			/**
			 * Returns tiempoLavado.
			 * @return tiempoLavado 
			 */
			public float getTiempoLavado() {
				return this.tiempoLavado;
			}

			/**
			 * Sets a value to attribute tiempoLavado. 
			 * @param newTiempoLavado 
			 */
			public void setTiempoLavado(float newTiempoLavado) {
				this.tiempoLavado = newTiempoLavado;

				float TiempoLavado = 20;

			}

			/**
			 * Returns costoLavado.
			 * @return costoLavado 
			 */
			public void CostoLavado(double porcentaje) {

				double Costo = costoLavado * porcentaje / 3;

				costoLavado = 2.5F;
				Costo += costoLavado;

			}

			/**
			 * Sets a value to attribute costoLavado. 
			 * @param newCostoLavado 
			 */
			public void setCostoLavado(float newCostoLavado) {
				this.costoLavado = newCostoLavado;
			}

			@Override
			public String toString() {
				return "MaquinaLavado [capacidadLitros=" + capacidadLitros + ", tiempoLavado=" + tiempoLavado
						+ ", porcentaje=" + porcentaje + "]";
			}

			public void main(String[] args) {
				System.out.println("El costo de lavado de una botella es: " + costoLavado);
			}
		}
	}

	private static void run() {
		// TODO Auto-generated method stub

	}
}