
import java.util.Scanner;


public class EjercicioRodrigo {


	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un valor en octal");
		String representacionOctal = entrada.next();
		
		int representacionDecimal=0;
		boolean sePudo=true;

		int n = representacionOctal.length()-1;

		for(int i=0; i<representacionOctal.length(); i++) {

			char c = representacionOctal.charAt(i);

			if(c=='8' || c=='9') {
				sePudo = false;
			}

			int var = Integer.parseInt(String.valueOf(c));
			representacionDecimal += var*Math.pow(8, n);

			System.out.println(n);
			n--;

		}

		if(sePudo) {
			System.out.println(representacionDecimal);
		} else {
			System.out.println("Ese número no es octal");
		}
		


		entrada.close();
	}


}
