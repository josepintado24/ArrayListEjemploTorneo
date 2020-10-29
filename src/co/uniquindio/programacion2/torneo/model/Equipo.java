package co.uniquindio.programacion2.torneo.model;

import java.util.ArrayList;

import javax.naming.directory.DirContext;

/*
 * Clase que representa un equipo de futbol.
 * */
public class Equipo {
	private String nombre;
	private ArrayList<Jugador> listaJugadores;
	private EstadisticaEquipo estadistica;
	private DirectorTecnico directortec;
	private String formacionTecnica;
	
	public String getFormacionTecnica() {
		return formacionTecnica;
	}
	public void setFormacionTecnica(String formacionTecnica) {
		this.formacionTecnica = formacionTecnica;
	}
	/**
	 * @param nombre nombre del equipo
	 */
	public Equipo(String nombre) {
		this.nombre = nombre;
		listaJugadores = new ArrayList<Jugador>();
		estadistica = new EstadisticaEquipo();
		directortec=new DirectorTecnico();
	}
	public DirectorTecnico getDirectortec() {
		return directortec;
	}
	public void setDirectortec(DirectorTecnico directortec) {
		this.directortec = directortec;
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
	 * @return the listaJugadores
	 */
	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}
	/**
	 * @param listaJugadores the listaJugadores to set
	 */
	public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	/**
	 * @return the estadistica
	 */
	public EstadisticaEquipo getEstadistica() {
		return estadistica;
	}
	/**
	 * @param estadistica the estadistica to set
	 */
	public void setEstadistica(EstadisticaEquipo estadistica) {
		this.estadistica = estadistica;
	}
	
	/*
	 * Metodo que adiciona un jugador al equipo, debe verificar que el jugador ya no exista en el mismo equipo
	 * @param jugadorNuevo objeto del jugador a agregar al ArrayList
	 * */
	
	public void adicionarJugador (Jugador jugadorNuevo) throws jugadorYaExiste {
		//validar si ya existe

				
	}
	
	/*
	 * Metodo que elimine un jugador del equipo
	 * @param idJugador id del jugadort
	 * */
	
	public void eliminarJugador (String idJugador) {
	
	}
	
	
	/*
	 * Metodo que busca un jugador a traves de su id
	 * @param idJugador id del jugador a buscar
	 * @return posicion en la cual se encuentra el jugador dentro del arrayList o -1 en caso de no existir
	 * */
	public int buscarJugador(String idJugador) {
		return 0;
	
	}
	
	
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listaJugadores=" + listaJugadores + ", estadistica=" + estadistica
				+ ", directortec=" + directortec + ", formacionTecnica=" + formacionTecnica + "]";
	}
	public boolean sumaEquipo(int arquero, int defensas, int volantes, int delanteros) {
		boolean tiene11=false;
		if ((arquero+defensas+volantes+delanteros)==11) {
			tiene11=true;
		}
		return tiene11;
	}
	public String [][] retornarNomina(Equipo equipo, int arquero, int defensas, int volantes, int delanteros){
		String [] [] listatotalJugadores =new String[11][2];
		if (this.sumaEquipo(arquero, defensas, volantes, delanteros)) {
			equipo.setFormacionTecnica(arquero+"-"+defensas+"-"+volantes+"-"+delanteros);
			for(int i=0;i<equipo.getListaJugadores().size();i++) {
				listatotalJugadores[i][0]=equipo.getListaJugadores().get(i).getNombre();
			}
			
		}
		return listatotalJugadores;
	}
	/*Equipo*/

	
		

}
