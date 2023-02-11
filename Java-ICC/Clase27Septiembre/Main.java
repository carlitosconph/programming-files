
public class Main {
	
	public static void main(String[] args) {
		
		
		Persona per = new Persona("Haydee", 20);
		Persona per2 = new Persona("Mario", 20);
		
		Perro p = new Perro("Moxi", "pug", 3, null, "macho", false);
		Perro pOtro = new Perro("Luna", "chihuahua", 3, per2, "hembra", false);

		System.out.println(p);
		System.out.println(pOtro);

		Perro cria = pOtro.cruzar(p);
		if(cria!=null) {
			System.out.println(cria);	
		} else {
			System.out.println("No existe el perrito");
		}
		
		

	}

}
