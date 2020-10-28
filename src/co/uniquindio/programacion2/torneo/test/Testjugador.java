package co.uniquindio.programacion2.torneo.test;

import co.uniquindio.programacion2.torneo.model.*;

public class Testjugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Posicion tipo=Posicion.VOLANTE;	
		//Jugador jugador01=new Jugador("001", "Luis", 20,tipo);
		//Cliente cliente00001=new Cliente("1223456","Jose", "M","Lima",tipo);
		
		ArrayListEquipo prueba =new ArrayListEquipo();
		
		for (int a=0;a<prueba.aniosExDirector().size();a++) {
			System.out.println(prueba.aniosExDirector().get(a).toString());
		}
		
		
	}

}
