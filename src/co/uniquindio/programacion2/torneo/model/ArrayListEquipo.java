package co.uniquindio.programacion2.torneo.model;

import java.util.ArrayList;

public class ArrayListEquipo {
	private ArrayList<Equipo> listaEquipos;
	private DirectorTecnico directortec;
	
	public ArrayListEquipo() {
		listaEquipos=new ArrayList<Equipo>();
		Equipo equipo01=new Equipo("Nacional");
		Equipo equipo02=new Equipo("biNacional");
		Equipo equipo03=new Equipo("Gillonarios");
		
		//Primer equipo
		listaEquipos.add(equipo01);
		EstadisticaEquipo estadistica01=new EstadisticaEquipo();
		
		estadistica01.setPartidosJugados(6);
		estadistica01.setPartidosGanados(5);
		estadistica01.setPartidosEmpatados(3);
		estadistica01.setPartidosPerdidos(4);
		estadistica01.setGolesAFavor(5);
		estadistica01.setGolesEnContra(8);
		estadistica01.setPuntosTotales(50);
		directortec=new DirectorTecnico();
		directortec.setNombre("Juan");
		directortec.setAniosExperienci(5);
		listaEquipos.get(0).setDirectortec(directortec);
		listaEquipos.get(0).setEstadistica(estadistica01);
		
		
		//2do equipo
		listaEquipos.add(equipo02);
		EstadisticaEquipo estadistica02=new EstadisticaEquipo();
		estadistica02.setPartidosJugados(1);
		estadistica02.setPartidosGanados(5);
		estadistica02.setPartidosEmpatados(3);
		estadistica02.setPartidosPerdidos(4);
		estadistica02.setGolesAFavor(5);
		estadistica02.setGolesEnContra(8);
		estadistica02.setPuntosTotales(60);
		
		DirectorTecnico directortec02=new DirectorTecnico();
		directortec02.setNombre("Manuel");
		directortec02.setAniosExperienci(1);
		listaEquipos.get(1).setDirectortec(directortec02);
		listaEquipos.get(1).setEstadistica(estadistica02);
		
		//3er equipo
		listaEquipos.add(equipo03);
		EstadisticaEquipo estadistica03=new EstadisticaEquipo();
		
		estadistica03.setPartidosJugados(10);
		estadistica03.setPartidosGanados(5);
		estadistica03.setPartidosEmpatados(3);
		estadistica03.setPartidosPerdidos(4);
		estadistica03.setGolesAFavor(5);
		estadistica03.setGolesEnContra(8);
		estadistica03.setPuntosTotales(9);
		DirectorTecnico directortec03=new DirectorTecnico();
		directortec03.setNombre("Efra");
		directortec03.setAniosExperienci(4);
		listaEquipos.get(2).setDirectortec(directortec03);
		listaEquipos.get(2).setEstadistica(estadistica03);
	}
	
	public Equipo obtener(int pos) {
		return listaEquipos.get(pos);
	}
	
	public int tamanio() {
		return listaEquipos.size();
	}
	
	public ArrayList<Equipo> aniosExDirector() {
		ArrayList<Equipo> listaDirector=new ArrayList<Equipo>();
		for (int i=0;i<tamanio() ;i++) {
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
	
	/*
	 * String [] [] animals = {
                {"DanaDog", "WallyDog", "JessieDog", "AlexisDog", "LuckyDog"},
                {"BibsCat", "DoodleCat", "MillieCat", "SimonCat"},
                {"ElyFish", "CloieFish", "GoldieFish", "OscarFish", "ZippyFish", "TedFish"}
                };
	 * */
	public String[][] estadisticaTorneo(){

		String [] [] estadisticaTotal =new String[listaEquipos.size()][8];
		
		for (int i=0;i<estadisticaTotal.length;i++) {
			estadisticaTotal[i][0]=obtener(i).getNombre();
			estadisticaTotal[i][1]=obtener(i).getEstadistica().getPartidosJugados()+"";
			estadisticaTotal[i][2]=obtener(i).getEstadistica().getPartidosGanados()+"";
			estadisticaTotal[i][3]=obtener(i).getEstadistica().getPartidosEmpatados()+"";
			estadisticaTotal[i][4]=obtener(i).getEstadistica().getPartidosPerdidos()+"";
			estadisticaTotal[i][5]=obtener(i).getEstadistica().getGolesAFavor()+"";
			estadisticaTotal[i][6]=obtener(i).getEstadistica().getGolesEnContra()+"";
			estadisticaTotal[i][7]=obtener(i).getEstadistica().getPuntosTotales()+"";
		}
		return estadisticaTotal;
	}
	
	public String[][] estadisticasEquipoMayorPuntaje(){
		String [] [] estadisticaTotal =new String[2][2];
		int puntajeMayor=Integer.parseInt(estadisticaTorneo()[0][7]);
		String nombreEquipo=estadisticaTorneo()[0][0];
		for (int i=0;i<tamanio();i++) {
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
