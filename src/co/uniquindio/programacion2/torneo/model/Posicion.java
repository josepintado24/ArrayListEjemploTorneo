package co.uniquindio.programacion2.torneo.model;

/*
b.	Agregar a la clase Jugador un atributo llamado posición de tipo 
enumeración con los siguientes literales: ARQUERO, DEFENSA,VOLANTE,
DELANTERO (la clase enum y lo que se modificó de la clase jugador,
 constructor, get , set)
*/

public enum Posicion{

	ARQUERO(0), DEFENSA(1), VOLANTE(2), DELANTERO(3);
		
	private int codigo; 
	
	private Posicion(int codigoDoc){
		this.codigo = codigoDoc;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}	
	
	
	public Posicion getPosicion (int index)
	{		
		//ARQUERO(0), DEFENSA(1), VOLANTE(2), DELANTERO(3);
		
		switch(index)
		{
			case 0: return Posicion.ARQUERO;
				
			case 1: return Posicion.DEFENSA;
				
			case 2: return Posicion.VOLANTE;

			case 3: return Posicion.DELANTERO;
			
			default: return null;
		}
			
	}
	
	
}
