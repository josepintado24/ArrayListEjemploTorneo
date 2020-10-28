package co.uniquindio.programacion2.torneo.model;

/*
 * Clase que representa las estadisticas de un equipo
 * */
public class EstadisticaEquipo {
	
	private int partidosJugados;
	private int partidosGanados;
	private int partidosEmpatados;
	private int partidosPerdidos;
	private int golesAFavor;
	private int golesEnContra;
	private int puntosTotales;
	/**
	 * @param partidosJugados
	 * @param partidosGanados
	 * @param partidosEmpatados
	 * @param partidosPerdidos
	 * @param golesAFavor
	 * @param golesEnContra
	 * @param puntosTotales
	 */
	public EstadisticaEquipo() {
		this.partidosJugados = 0;
		this.partidosGanados = 0;
		this.partidosEmpatados = 0;
		this.partidosPerdidos = 0;
		this.golesAFavor = 0;
		this.golesEnContra = 0;
		this.puntosTotales = 0;
	}
	/**
	 * @return the partidosJugados
	 */
	public int getPartidosJugados() {
		return partidosJugados;
	}
	/**
	 * @param partidosJugados the partidosJugados to set
	 */
	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	/**
	 * @return the partidosGanados
	 */
	public int getPartidosGanados() {
		return partidosGanados;
	}
	/**
	 * @param partidosGanados the partidosGanados to set
	 */
	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
	/**
	 * @return the partidosEmpatados
	 */
	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}
	/**
	 * @param partidosEmpatados the partidosEmpatados to set
	 */
	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}
	/**
	 * @return the partidosPerdidos
	 */
	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}
	/**
	 * @param partidosPerdidos the partidosPerdidos to set
	 */
	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}
	/**
	 * @return the golesAFavor
	 */
	public int getGolesAFavor() {
		return golesAFavor;
	}
	/**
	 * @param golesAFavor the golesAFavor to set
	 */
	public void setGolesAFavor(int golesAFavor) {
		this.golesAFavor = golesAFavor;
	}
	/**
	 * @return the golesEnContra
	 */
	public int getGolesEnContra() {
		return golesEnContra;
	}
	/**
	 * @param golesEnContra the golesEnContra to set
	 */
	public void setGolesEnContra(int golesEnContra) {
		this.golesEnContra = golesEnContra;
	}
	
	/**
	 * @return the puntosTotales
	 */
	public int getPuntosTotales() {
		return puntosTotales;
	}
	/**
	 * @param puntosTotales the puntosTotales to set
	 */
	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}
	
	
	/*
	 * realice un metodo que permita calcular el promedio de goles por partido anotados por el equipo
	 * */
	public double calcularPromedioGolesXPartido() {
		double promedio=0;
		
		return promedio;
	}
	@Override
	public String toString() {
		return "EstadisticaEquipo [partidosJugados=" + partidosJugados + "\n partidosGanados=" + partidosGanados
				+ "\n partidosEmpatados=" + partidosEmpatados + "\n partidosPerdidos=" + partidosPerdidos
				+ "\n golesAFavor=" + golesAFavor + "\n golesEnContra=" + golesEnContra + "\n puntosTotales="
				+ puntosTotales + "]";
	}
	
	

}
