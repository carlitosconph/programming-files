
import java.util.Random;

public class Calificaciones {
	
	public static void main(String[] args) {
		

		int califEntera = 0;
		Random califRandom = new Random();
		String cali0 = "", cali1 = "", cali2 = "", cali3 = "", cali4 = "", cali5 = "", cali6 = "", cali7 = "", cali8 = "", cali9 = "", cali10 = "";

		//! for donde se generan las calificaciones aleatorias y se agregan los '8' a las variables 'caliN'

		for (int i = 1; i <= 20; i++){
			
			califEntera = califRandom.nextInt(11);
			System.out.println("Calificacion [" + i + "]: " + califEntera);

			if (califEntera == 10) {
				System.out.println("A");
			} else if (califEntera == 9) {
				System.out.println("B");
			} else if (califEntera == 8) {
				System.out.println("C");
			} else if (califEntera == 7) {
				System.out.println("D");
			} else if (califEntera == 6) {
				System.out.println("E");
			} else if (califEntera >= 0 && califEntera <= 5) {
				System.out.println("F");
			} else {
				System.out.println("Dato incorrecto");
			}

			//! if para modificar el valor de cada variable y contabilizar la cantidad de veces que sale una calificacion

			if(califEntera==10) {
			cali10 += "*";
		} else if (califEntera == 9) {
			cali9 += "*";
		} else if (califEntera == 8) {
			cali8 += "*";
		} else if (califEntera == 7) {
			cali7 += "*";
		} else if (califEntera == 6) {
			cali6 += "*";
		} else if (califEntera == 5) {
			cali5 += "*";
		} else if (califEntera == 4) {
			cali4 += "*";
		} else if (califEntera == 3) {
			cali3 += "*";
		} else if (califEntera == 2) {
			cali2 += "*";
		} else if (califEntera == 1) {
			cali1 += "*";
		} else if (califEntera == 0) {
			cali0 += "*";
		}

		//! Parte donde se imprimen todos los contadores con sus respectivos asteriscos

		}
		System.out.println("\n Contador de calificaciones: \n");
		System.out.println("0: " + cali0);
		System.out.println("1: " + cali1);
		System.out.println("2: " + cali2);
		System.out.println("3: " + cali3);
		System.out.println("4: " + cali4);
		System.out.println("5: " + cali5);
		System.out.println("6: " + cali6);
		System.out.println("7: " + cali7);
		System.out.println("8: " + cali8);
		System.out.println("9: " + cali9);
		System.out.println("10: " + cali10 + "\n");

		
	}
}



