import java.util.Scanner;

public class Conversiones {
  public static void main(String[] args) {

    // Declaración de variables.
    int original, resultado, copia, temp;
    double p;
    Scanner lector;

    // Creamos el Scanner.
    lector = new Scanner(System.in);

    // Mensaje para que el usuario ingrese un número.
    System.out.print("Dame el número en octal: ");

    // Guardamos el número original evaluar.
    original = lector.nextInt();

    // Initialize resultado variable to 0.
    resultado = 0;

    // Copiamos el entero ingresado.
    copia = original;

    for (int i = 0; copia > 0; i++) {

      // Toma el último dígito.
      temp = copia % 10;
      System.out.println("tempo" +temp);

      // Exponente adecuado.
      p = Math.pow(8, i);
      System.out.println("p" +p);

      // Multiplicar y agregarlo al resultado.
      resultado += (temp * p);
      copia = copia / 10;
      System.out.println("resultado" +resultado);
      System.out.println("copia" +copia);
    }

    System.out.print("El número octal (" + original + ") es en decimal: " + resultado);

    lector.close();
  }
}
