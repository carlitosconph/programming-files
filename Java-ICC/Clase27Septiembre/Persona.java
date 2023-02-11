
public class Persona {
	
	String nombre;
	int edad;
	boolean estaVivo;

	public Persona(String n, int e) {
		nombre=n;
		edad=e;
		estaVivo = true;
	}




	//Set
	public void setVivo(boolean v, Perro p) {
		
		if( (this.getEstaVivo()==false && v==true) || (this.getEstaVivo()==true && v==false) ) {
			this.estaVivo = false;

			if(p.getDuenio() != null) {
				p.setDuenio(null);
			}

		} 
		
	}


	//GET
	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}

	public boolean getEstaVivo() {
		return estaVivo;
	}


	public String toString() {
		return "Hola soy: " + nombre + ", tengo " + edad + " añios";
	}


}

