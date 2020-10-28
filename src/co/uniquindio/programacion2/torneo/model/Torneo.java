package co.uniquindio.programacion2.torneo.model;

import java.util.ArrayList;
import java.util.Arrays;

/*Clase que representa el torneo, es la principal del mundo*/
public class Torneo {
	private String nombre;
	// arreglo que representa los premios otorgados para los 4 primeros puestos
	private int [] premios;
	// arreglo de Equipos que almacena los Equipos que participan en el torneo
	private Equipo [] equiposParticipantes;
	//Lista de los partidos jugados
	private ArrayList < Partido > listaPartidos;
	/**
	 * Contructor de la clase
	 * @param nombre representa el torneo a crear
	 * @param cantidadEquipos  Representa la cantidad de equipos del torneo
	 */
	public Torneo(String nombre, int cantidadEquipos) {
		this.nombre = nombre;
		//instanciar el arraylist
		this.listaPartidos = new ArrayList<Partido>();
		//instanciar el arreglo
		this.equiposParticipantes = new Equipo[cantidadEquipos];
		this.premios= new int[4];
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the premios
	 */
	public int[] getPremios() {
		return premios;
	}
	/**
	 * @param premios the premios to set
	 */
	public void setPremios(int[] premios) {
		this.premios = premios;
	}
	/**
	 * @return the equiposParticipantes
	 */
	public Equipo[] getEquiposParticipantes() {
		return equiposParticipantes;
	}
	/**
	 * @param equiposParticipantes the equiposParticipantes to set
	 */
	public void setEquiposParticipantes(Equipo[] equiposParticipantes) {
		this.equiposParticipantes = equiposParticipantes;
	}
	/**
	 * @return the listaPartidos
	 */
	public ArrayList<Partido> getListaPartidos() {
		return listaPartidos;
	}
	/**
	 * @param listaPartidos the listaPartidos to set
	 */
	public void setListaPartidos(ArrayList<Partido> listaPartidos) {
		this.listaPartidos = listaPartidos;
	}
	
	/*
	 * adicionar un equipo validando que no exista uno con el mismo nombre
	 * */
	public void adicionarEquipo(Equipo equipoNuevo) throws noHayCupoEquipo {
	
			
		
	}
	/*Metodo que busca la primera posición vacia del arreglo de equipos
	 * */
	private int buscarPosicionLibreEquipo() {
		
	return 0;
	}
	/*
	 * adicionar un jugador a un equipo, dado el nombre del equipo y el objeto jugador
	 * @param nombreEquipo nombre del equipo a buscar
	 * @param nuevoJugador representa el objeto jugador a adicionar al equipo
	 * */
	public void adicionarJugadorEquipo(String nombreEquipo, Jugador nuevoJugador) throws noExisteEquipo, jugadorYaExiste {
	
	}
	
	/*
	 * metodo que busque el equipo cuyo nombre sea el especificado en el parametro
	 * @param nombreEquipo nombre del equipo a buscar
	 * @return equipo equipo encontrado
	 * */
	
	private Equipo buscarEquipoXNombre(String nombreEquipo) {
		int posicion=-1;
		for (int i = 0; i < equiposParticipantes.length && posicion==-1; i++) {
			if (equiposParticipantes[i].getNombre().equals(nombreEquipo)) {
				posicion=i;
			}
		}
		if(posicion!=-1) {
			return equiposParticipantes[posicion];
		}
		return null;
	}
	/*
	 * metodo que permita registrar un partido, debe validar que los equipos sean diferentes y que el partido
	 * ya no exista es decir que no exista registro duplicado del equipolocal vs el equipoVisitante 
	 * */
	
	public void registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, int golesLocal, 
									int golesVisitante) throws partidoYaJugado, Equiposiguales {
		
		
	}
	/*
	* metodo que busque un partido, retorne la posición o -1 en caso de no existir
	*/
	private int buscarPartido(Equipo equipoLocal, Equipo equipoVisitante) {
		// TODO Auto-generated method stub
		return 0;
	}
	/*
	 * metodo que dado el nombre del equipo retornar sus estadisticas
	 * @param nombre nombre del equipo a buscar sus estadisticas
	 * */
	public void obtenerEstadisticaEquipo(String nombre) {
		
	}
	
	/*Metodo que debe actualizar o calcular las estadisticas de todos los equipos del torneo*/
	public void actualizarEstadisticas() {
		
	}
	
	/*
	 * cree un metodo que dada la letra inicial de un jugador retorne un arrraylist con todos los jugadores 
	 * que incluye esa letra
	 * */
	/*
	 * public ArrayList<Jugador> obtenerJugadoresXInicial(char letra){
	 * 
	 * 
	 * }
	 */
	
	@Override
	public String toString() {
		return "Torneo [nombre=" + nombre + ", premios=" + Arrays.toString(premios) + ", equiposParticipantes="
				+ Arrays.toString(equiposParticipantes) + ", listaPartidos=" + listaPartidos + "]";
	}
	


}
