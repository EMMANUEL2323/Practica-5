package app.ito.poo;

import Clase.ito.poo.MaquinaEmpaquetado;
import Clase.ito.poo.MaquinaLavado;
import Clase.ito.poo.MaquinaLlenadoEnvasado;
import java.time.LocalDate;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        run();
        
	}

	private static void run() {
		// TODO Auto-generated method stub
		MaquinaLavado L=new MaquinaLavado (LocalDate.of(2021, 04, 23), 1500, "Maquina de Lavado",50, 20);
		System.out.println(L);
		System.out.println(L.costoFinal());
		MaquinaEmpaquetado E=new MaquinaEmpaquetado (LocalDate.of(2021, 04, 23), 8500, "Maquina de Empaquetado",9, 3);
		System.out.println(E);
		System.out.println(E.costoFinal());
		MaquinaLlenadoEnvasado LE=new MaquinaLlenadoEnvasado (LocalDate.of(2021, 04, 23), 5000, "Maquina de Llenado y Envasado",15, 250);
		System.out.println(LE);
		System.out.println(LE.costoFinal());
		
	}

}
