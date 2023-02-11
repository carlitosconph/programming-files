public class OrdenTresNumeros {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		int c = 43;


		//! Parte original del codigo (las 3 variables son distintas)

		//* a b c
		if(a<b && b<c) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);	

		//* a c b
		} else if(a<c && c<b) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);	

		//* b a c
		} else if(b<a && a<c) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);

		//* b c a
		} else if(b<c && c<a) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		//* c a b
		} else if(c<a && a<b) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);

		//* c b a
		} else if(c<b && b<a) {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}	

		//! Parte del codigo donde dos variables son iguales y una es distinta, pero las dos varibles iguales son mayores a la tercera
		//? c b a // c a b    a == b and a/b > c

		else if(a == b && b > c){
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
			System.out.println("**********");
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);

			//? b c a // b a c    a == c and a/c > b

		}else if(a == c && c > b){
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
			System.out.println("**********");
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);

			//? a b c // a c b    c == b and b/c > a

		}else if(c == b && b > a){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println("**********");
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}


		//! Parte del codigo donde dos variables son iguales y una es distinta, pero las dos variables iguales son menores a la tercera
		//? a b c // b a c    a == b and a/b < c

		else if(a == b && b < c){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println("**********");
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);

			//? a c b // c a b   a == c and a/c < b

		}else if(a == c && c < b){
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
			System.out.println("**********");
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);

			//? c b a // b c a    c == b and b/c < a

		}else if(c == b && b < a){
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
			System.out.println("**********");
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}

		//! Parte donde las tres variables son iguales
		//? Estas son todas las posibilidades cuando las variables son iguales

		else if(a == b && b == c){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println("**********");
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
			System.out.println("**********");
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
			System.out.println("**********");
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
			System.out.println("**********");
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
			System.out.println("**********");
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}
	}
}
