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
	

	/*
	 * TORNEO
	 * */
	/**
	 * Ejemplo02: 2.Realizar las operaciones necesarias para retornar un listado de equipos (ArrayList)
	 * con los equipos que tengan un director técnico que cuente con más de 3 años de experiencia y su 
	 * nombre (el del técnico) empiece y termine en vocal, asimismo que haya ganado (el equipo) más de
	 * tres partidos en el torneo
	 * 
	 * Retorna una lista de Equipo "ArrayList<Equipo>" director técnico que cuente con más de 3 años 
	 * de experiencia y su nombre (el del técnico) empiece y termine en vocal, asimismo que haya ganado
	 * (el equipo) más de tres partidos en el torneo.
	 * */
	private ArrayList<Equipo> listaEquipos; 
	private DirectorTecnico directortec;
	public ArrayList<Equipo> aniosExDirector() {
		ArrayList<Equipo> listaDirector=new ArrayList<Equipo>();
		for (int i=0;i< listaEquipos.size();i++) {
			if (listaEquipos.get(i).getDirectortec().getAniosExperienci()>3) {
				String nombreDirec=listaEquipos.get(i).getDirectortec().getNombre();
				String primeravocal=nombreDirec.charAt(0)+"";
				String ultimogmeravocal=nombreDirec.charAt(nombreDirec.length()-1)+"";
				if ("A".equals(primeravocal) ||"E".equals(primeravocal) || "I".equals(primeravocal) || "O".equals(primeravocal) || "U".equals(primeravocal)){
					if ("a".equals(ultimogmeravocal)|| "e".equals(ultimogmeravocal)|| "i".equals(ultimogmeravocal) || "o".equals(ultimogmeravocal) ||"u".equals(ultimogmeravocal)){
						if (listaEquipos.get(i).getEstadistica().getPartidosGanados()>3) {
							listaDirector.add(listaEquipos.get(i));
						}
						
						
						//salida=primeravocal;
					}
				}
				
				
			}
		}
		
		return listaDirector;
	}
	
	/**
	 * Ejemplo03: Realizar las operaciones necesarias para retornar una matriz con las estadísticas
	 * de cada equipo del torneo, cada fila representa un equipo y las columnas representa los datos 
	 * de las estadísticas del equipo. 
	 * 
	 * Retorna: Matriz de tipo String "String[][]" con las estadísticas de cada equipo del torneo
	 * */
	public String[][] estadisticaTorneo(){

		String [] [] estadisticaTotal =new String[listaEquipos.size()][8];
		
		for (int i=0;i<estadisticaTotal.length;i++) {
			estadisticaTotal[i][0]=listaEquipos.get(i).getNombre();
			estadisticaTotal[i][1]=listaEquipos.get(i).getEstadistica().getPartidosJugados()+"";
			estadisticaTotal[i][2]=listaEquipos.get(i).getEstadistica().getPartidosGanados()+"";
			estadisticaTotal[i][3]=listaEquipos.get(i).getEstadistica().getPartidosEmpatados()+"";
			estadisticaTotal[i][4]=listaEquipos.get(i).getEstadistica().getPartidosPerdidos()+"";
			estadisticaTotal[i][5]=listaEquipos.get(i).getEstadistica().getGolesAFavor()+"";
			estadisticaTotal[i][6]=listaEquipos.get(i).getEstadistica().getGolesEnContra()+"";
			estadisticaTotal[i][7]=listaEquipos.get(i).getEstadistica().getPuntosTotales()+"";
		}
		return estadisticaTotal;
	}
	
	/**
	 * Ejemplo04: Realizar las operaciones necesarias para consultar el nombre del equipo que tiene
	 * mayor puntaje en el torneo, se debe usar la funcionalidad del punto 3, buscando en la matriz
	 * de estadísticas el equipo con mayor puntaje.
	 * 
	 * Retorna: Matriz de tipo String "String[][] con nombre del equipo que tiene mayor puntaje en el torneo"
	 * */

	public String[][] estadisticasEquipoMayorPuntaje(){
		String [] [] estadisticaTotal =new String[2][2];
		int puntajeMayor=Integer.parseInt(estadisticaTorneo()[0][7]);
		String nombreEquipo=estadisticaTorneo()[0][0];
		for (int i=0;i<listaEquipos.size();i++) {
			int Puntaje =Integer.parseInt(estadisticaTorneo()[i][7]);
			if (Puntaje>puntajeMayor) {
				puntajeMayor=Puntaje;
				nombreEquipo=estadisticaTorneo()[i][0];
			}
		}
		estadisticaTotal[0][0]=nombreEquipo;
		estadisticaTotal[0][1]=puntajeMayor+"";
		return estadisticaTotal;
	}
}
