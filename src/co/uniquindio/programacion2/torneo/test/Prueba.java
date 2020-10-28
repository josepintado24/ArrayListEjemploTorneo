package co.uniquindio.programacion2.torneo.test;

import java.util.Random;

import co.uniquindio.programacion2.torneo.model.Equipo;
import co.uniquindio.programacion2.torneo.model.Equiposiguales;
import co.uniquindio.programacion2.torneo.model.Jugador;
import co.uniquindio.programacion2.torneo.model.Partido;
import co.uniquindio.programacion2.torneo.model.Torneo;
import co.uniquindio.programacion2.torneo.model.jugadorYaExiste;
import co.uniquindio.programacion2.torneo.model.noExisteEquipo;
import co.uniquindio.programacion2.torneo.model.noHayCupoEquipo;
import co.uniquindio.programacion2.torneo.model.partidoYaJugado;

public class Prueba {
	
	/*public static void main(String [] arg) throws Equiposiguales {
		int cantidadEquipos=4;
		Torneo torneo= new Torneo("torneo",  cantidadEquipos);
		crearEquipos(torneo, cantidadEquipos);
		//implementar metodo adicionarJugadorEquipo
		try {
			crearJugadores(torneo);

			crearPartidos(torneo);
		}catch (jugadorYaExiste e) {
			System.out.println("Error: " +e);
		}
		catch (noExisteEquipo e) {
			System.out.println("Error: " +e);
		}
		catch (partidoYaJugado e) {
			System.out.println("Error: " +e);
		}
		System.out.println(torneo.getListaPartidos());

	}
	
	public static void crearEquipos (Torneo torneo, int cantidadEquipos) {
		Equipo equipo;
		for (int i = 0; i < cantidadEquipos; i++) {
			equipo= new Equipo("equipo "+i);
			try {
				torneo.adicionarEquipo(equipo);
			} catch (noHayCupoEquipo e) {
				// TODO Auto-generated catch block
				System.out.println("error no hay cupo equipo");
			}
		}
		
	}
	
	public static void crearPartidos (Torneo torneo) throws partidoYaJugado, Equiposiguales {
		Partido partido;
		Equipo [] equiposTorneo = torneo.getEquiposParticipantes();
		Random aleatorio = new Random();
		for (int i = 0; i < equiposTorneo.length; i++) {
			for (int j = 0; j < equiposTorneo.length; j++) {
				if(i!=j) {
					int golesLocal = aleatorio.nextInt(10);
					int golesVisitante = aleatorio.nextInt(10);
					torneo.registrarPartido(equiposTorneo[i].getNombre(), equiposTorneo[j].getNombre(), 
							golesLocal, golesVisitante);
				}
			}
		}
		
	}
	
	/*crera metodo que cree 15 jugadores a cada equipo
	public static void crearJugadores(Torneo torneo) throws noExisteEquipo, jugadorYaExiste {
		Equipo [] equiposTorneo = torneo.getEquiposParticipantes();
		Random aleatorio = new Random();
		Jugador jugador;
		int auxiliar;
		for (int i = 0; i < equiposTorneo.length; i++) {
			for (int j = 0; j < 10; j++) {
				jugador = new Jugador(""+aleatorio.nextInt(10000), "Jugador "+j, aleatorio.nextInt(20)+15);
				torneo.adicionarJugadorEquipo(equiposTorneo[i].getNombre(), jugador);
			}
		}
	}*/



}
