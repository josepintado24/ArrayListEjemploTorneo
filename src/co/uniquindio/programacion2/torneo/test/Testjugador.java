package co.uniquindio.programacion2.torneo.test;

import co.uniquindio.programacion2.torneo.model.*;

public class Testjugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Posicion tipo=Posicion.VOLANTE;	
		//Jugador jugador01=new Jugador("001", "Luis", 20,tipo);
		//Cliente cliente00001=new Cliente("1223456","Jose", "M","Lima",tipo);
		ArrayListEquipo prueba =new ArrayListEquipo();
		/*
		 * 2.	Realizar las operaciones necesarias para retornar un listado de equipos (ArrayList) con los equipos que tengan un director técnico que cuente con más de 3 años de experiencia y su nombre (el del técnico) empiece y termine en vocal, asimismo que haya ganado (el equipo) más de tres partidos en el torneo.
		 
		
		
		for (int a=0;a<prueba.aniosExDirector().size();a++) {
			System.out.println(prueba.aniosExDirector().get(a).toString());
		}*/
		
		/*3.	Realizar las operaciones necesarias para retornar una matriz con las estadísticas de cada equipo del torneo, cada fila representa un equipo y las columnas representa los datos de las estadísticas del equipo.
		System.out.print("Equipo\t\tPJ\tPG\tPE\tPP\tGF\tGE\tPT\n");
		for (int i=0;i<prueba.estadisticaTorneo().length;i++) {
			System.out.print("\n");
			for (int j=0;j<8;j++) {
				
				
				System.out.print(prueba.estadisticaTorneo()[i][j]+"\t");
			}
		}*/
		
		
		/*
		 4.	Realizar las operaciones necesarias para consultar el nombre del equipo que tiene mayor puntaje en el torneo, se debe usar la funcionalidad del punto 3, buscando en la matriz de estadísticas el equipo con mayor puntaje.
		 */
				System.out.print("Equipo\t\tPT\n");
				System.out.print(
						prueba.estadisticasEquipoMayorPuntaje()[0][0]+"\t"+
						prueba.estadisticasEquipoMayorPuntaje()[0][1]
								);
	}

}
