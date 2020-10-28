package co.uniquindio.programacion2.torneo.model;

public class DirectorTecnico{
    /*
    a.	Crear una clase DirectorTecnico con un id, nombre y años de experiencia,
     cada equipo está asociado a un director técnico.
    */
    private String id;
    private String nombre;
    private int aniosExperienci;
    private Equipo equipo;
    
    
    
	/*public DirectorTecnico(String id, String nombre, int aniosExperienci, Equipo equipo) {
		
		this.id = id;
		this.nombre = nombre;
		this.aniosExperienci = aniosExperienci;
		this.equipo = equipo;
	}*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAniosExperienci() {
		return aniosExperienci;
	}
	public void setAniosExperienci(int aniosExperienci) {
		this.aniosExperienci = aniosExperienci;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	@Override
	public String toString() {
		return "DirectorTecnico [id=" + id + ", nombre=" + nombre + ", aniosExperienci=" + aniosExperienci + ", equipo="
				+ equipo + "]";
	}
    


}