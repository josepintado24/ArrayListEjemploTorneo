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
		estadistica01.setPartidosGanados(5);
		
		directortec=new DirectorTecnico();
		directortec.setNombre("Juan");
		directortec.setAniosExperienci(5);
		listaEquipos.get(0).setDirectortec(directortec);
		listaEquipos.get(0).setEstadistica(estadistica01);
		
		
		//2do equipo
		listaEquipos.add(equipo02);
		EstadisticaEquipo estadistica02=new EstadisticaEquipo();
		estadistica02.setPartidosGanados(1);
		DirectorTecnico directortec02=new DirectorTecnico();
		directortec02.setNombre("Manuel");
		directortec02.setAniosExperienci(1);
		listaEquipos.get(1).setDirectortec(directortec02);
		listaEquipos.get(1).setEstadistica(estadistica02);
		
		//3er equipo
		listaEquipos.add(equipo03);
		EstadisticaEquipo estadistica03=new EstadisticaEquipo();
		estadistica03.setPartidosGanados(5);
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
	
	public String se() {
		ArrayList<Equipo> listaDirector=new ArrayList<Equipo>();
		String salida ="";
		for (int i=0;i<tamanio() ;i++) {
			if (listaEquipos.get(i).getDirectortec().getAniosExperienci()>3) {
				String nombreDirec=listaEquipos.get(i).getDirectortec().getNombre();
				String primeravocal=nombreDirec.charAt(0)+"";
				String ultimogmeravocal=nombreDirec.charAt(nombreDirec.length()-1)+"";
				if ("A".equals(primeravocal) ||"E".equals(primeravocal) || "I".equals(primeravocal) || "O".equals(primeravocal) || "U".equals(primeravocal)){
					if ("a".equals(ultimogmeravocal)|| "e".equals(ultimogmeravocal)|| "i".equals(ultimogmeravocal) || "o".equals(ultimogmeravocal) ||"u".equals(ultimogmeravocal)){
						//listaDirector.add(listaEquipos.get(i));
						salida=primeravocal;
					}
				}
				
				
			}
		}
		return salida;
		
	}
	
}
