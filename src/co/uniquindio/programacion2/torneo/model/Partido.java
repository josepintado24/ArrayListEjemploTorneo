package co.uniquindio.programacion2.torneo.model;


/*
 * Clase que representa un paritdo jugado en el torneo
 * */
public class Partido {
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesEquipoLocal;
	private int golesEquipoVisitante;
	/**
	 * @param equipoLocal
	 * @param equipoVisitante
	 * @param golesEquipoLocal
	 * @param golesEquipoVisitante
	 */
	public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesEquipoLocal, int golesEquipoVisitante) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesEquipoLocal = golesEquipoLocal;
		this.golesEquipoVisitante = golesEquipoVisitante;
	}
	/**
	 * @return the equipoLocal
	 */
	public Equipo getEquipoLocal() {
		return equipoLocal;
	}
	/**
	 * @param equipoLocal the equipoLocal to set
	 */
	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	/**
	 * @return the equipoVisitante
	 */
	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}
	/**
	 * @param equipoVisitante the equipoVisitante to set
	 */
	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	/**
	 * @return the golesEquipoLocal
	 */
	public int getGolesEquipoLocal() {
		return golesEquipoLocal;
	}
	/**
	 * @param golesEquipoLocal the golesEquipoLocal to set
	 */
	public void setGolesEquipoLocal(int golesEquipoLocal) {
		this.golesEquipoLocal = golesEquipoLocal;
	}
	/**
	 * @return the golesEquipoVisitante
	 */
	public int getGolesEquipoVisitante() {
		return golesEquipoVisitante;
	}
	/**
	 * @param golesEquipoVisitante the golesEquipoVisitante to set
	 */
	public void setGolesEquipoVisitante(int golesEquipoVisitante) {
		this.golesEquipoVisitante = golesEquipoVisitante;
	}
	
	/*
	 * este metodo debe retornar true si el equipoLocal fue el ganador
	 * de lo contrario retornar false.
	 * */
	public boolean validarGanadorPartido() {
		
		return true;
	}
	@Override
	public String toString() {
		return "Partido [equipoLocal=" + equipoLocal.getNombre() + ", equipoVisitante=" + equipoVisitante.getNombre() + 
				", golesEquipoLocal=" + golesEquipoLocal + ", golesEquipoVisitante=" + golesEquipoVisitante + "]";
	}
	
	
	
	
	
}
