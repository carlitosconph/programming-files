package tarea;

public class Veterinario extends Persona {
	

	String cedulaProfesional;

	public Veterinario(String n, int e, String cp) {
		super(n, e);
		cedulaProfesional = cp;
	}


	public String getSaludo() {
		/*String cad="";
		int i=0;
		if(i==0) {
			cad = "Hola";
		}
		return cad;*/
		return "Soy un veterinario";
	}

	
	public int regresaAleatorio() {
		return 100;
	}
	


	public int duplicaValorPersona() {
		int num = super.regresaAleatorio() * 2;
		return num;
	}



	public String toString() {
		return super.nombre + " Veterinario, cédula " + cedulaProfesional;

	}





}