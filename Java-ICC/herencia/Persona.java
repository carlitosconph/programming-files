import java.util.Random;

public class Persona {
	
	String nombre;
	int edad;


	//Constructor
	public Persona(String n, int e) {
		nombre = n;
		edad = e;
	}

	//SET's
	public void setNombre(String n) {
		nombre = n;

	}

	public void setEdad(int e) {
		edad = e;

	}

	public String getSaludo() {
		String cad = "Hola, soy una persona";
		return cad;
	}


	//GET's
	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	} 


	public int regresaAleatorio() {
		Random aleatorios = new Random();
		int valor = aleatorios.nextInt(5);
		return valor;

	}


	protected void getFechaCumpleanios() {
		System.out.println("Nací el:  15 de enero");
	}

	public void llamaGetFechaCumpleanios() {
		getFechaCumpleanios();
	}


	public String toString() {
		return "Persona " + nombre + ", edad: " + edad;
	}



}


