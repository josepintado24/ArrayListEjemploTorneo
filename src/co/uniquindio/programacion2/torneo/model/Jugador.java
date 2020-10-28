package co.uniquindio.programacion2.torneo.model;



/*
 * Clase que representa al jugador del Equipo
 * */
public class Jugador {
	private String id;
	private String nombre; 
	private int edad;
	private Posicion tipoPosicion;
	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	public Jugador(String id01, String nombre01, int edad01,Posicion tipoPosicion01 ) {
		id = id01;
		nombre = nombre01;
		edad = edad01;
		tipoPosicion=tipoPosicion01;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", tipoPosicion=" + tipoPosicion + "]";
	}

	public Posicion getPosicion() {
		return tipoPosicion;
	}

	public void setPosicion(Posicion tipoPosicion) {
		this.tipoPosicion = tipoPosicion;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	} 
	
	
	
}
