
public class Prueba {
	

public static void main(String[] args) {
	
	String cadena="HolaMundo";

	for (int i=0; i<cadena.length(); i++) {
		int j=i;
		int k=0;
			while(k<=j) {
				if(k%2==0) {
					System.out.print(cadena.charAt(i));	
				}				
				k++;
			}
			System.out.println();
		} 
	}
}
