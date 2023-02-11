import java.util.Random;

public class Perro {
	
	String nombre;
	String raza;
	int edad;
	boolean estaVivo;
	String genero;
	boolean operado;


	//Composición
	Persona p;


	public Perro(String n, String r, int e, Persona p, String ge, boolean op) {
		nombre = n;
		raza = r;
		edad = e;
		this.p = p;
		estaVivo = true;
		genero = ge;
		operado = op;

	}

	//Set

	public void setOperado(boolean op) {
		operado = op;
	} 

	public void setDuenio(Persona p) {
		this.p = p;
	}

	public void setVivo(boolean v) {
		if( (this.getEstaVivo()==false && v==true) || (this.getEstaVivo()==true && v==false) ) {
			this.estaVivo = false;

			if(this.getDuenio()!=null) {
				this.setDuenio(null);
			}
		} 
	}



	//get
	public String getNombre() {
		return nombre;
	}


	public String getRaza() {
		return raza;
	}


	public int getEdad() {
		return edad;
	}

	public Persona getDuenio() {
		return p;
	}


	public boolean getEstaVivo() {
		return estaVivo;
	}

	public String getGenero() {
		return genero;
	}

	public boolean getOperado() {
		return operado;
	}


	public void adoptar(Persona p) {

		if(this.getEstaVivo()==true && p.getEstaVivo()==true) {


			if(this.getDuenio() != null) {
				System.out.println("Ya tengo dueño, no hablo con extraños");
			} else {

				if(p.getEdad()>=18) {
					this.setDuenio(p);
				} else {

					int regresar = 18 - p.getEdad();

					System.out.println("No puedes adoptar perritos, regresa en " + regresar + " años");
				}
			}


		} else {

			System.out.println("No es posible adoptar");
			if(this.getEstaVivo()==false) {
				System.out.println("El perrito ya está en el cielo de los perritos");
			}
			if(p.getEstaVivo()==false) {
				System.out.println("La persona ya está en el cielo");
			}

		}

	}



	public Perro cruzar(Perro p) {

		Random aleatorios = new Random();
		Perro pOtro=null;

		if(this.getGenero() != p.getGenero()) {

			if(this.getOperado()==false && p.getOperado()==false) {


				String generoNuevoCad="";
				int generoNuevo = aleatorios.nextInt(2);
				if(generoNuevo==0) {
					generoNuevoCad="macho";
				} else {
					generoNuevoCad="hembra";
				}

				Persona duenioNuevo=null;
				if(this.getDuenio()!=null && p.getDuenio()==null) {
					duenioNuevo = this.getDuenio();
				} else if(this.getDuenio()==null && p.getDuenio()!=null) {
					duenioNuevo = p.getDuenio();
				} else if(this.getDuenio()!=null && p.getDuenio()!=null) {

					int voladoParaGanarPerrito = aleatorios.nextInt(2);
					if(voladoParaGanarPerrito==0) {
						duenioNuevo = this.getDuenio();
					} else {
						duenioNuevo = p.getDuenio();
					}
				} 


				pOtro = new Perro("Perrito bebé", "mezcla", 0, duenioNuevo, generoNuevoCad, false);


			}

		}
		return pOtro;


	}




	public String toString() {

		String cad="";

		if(this.getDuenio() != null) {
			cad =  "Perro: " + nombre + " Raza: " + raza + " edad " + edad + " Guau guau " + "Genero: " + genero + " mi dueño es " + this.getDuenio().getNombre();
		} else {
			cad = "Perro: " + nombre + " Raza: " + raza + " edad " + edad + " Guau guau" + "Genero: " + genero;
		}
		return cad;

	}


}

