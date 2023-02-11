

public class UsoPersonasHerencia {
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Andrea", 22);
		Veterinario v1 = new Veterinario("Adolfo", 33, "1teu878");

		/*System.out.println(p1);
		System.out.println(v1);

		System.out.println(v1.getNombre());
		System.out.println(v1.getSaludo());

		System.out.println(v1.duplicaValorPersona());*/


		p1.getFechaCumpleanios();
		v1.getFechaCumpleanios();


	}


}


