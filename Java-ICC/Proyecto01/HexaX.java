import java.util.Scanner;

public class HexaX {
  public static void main(String[] args) {

    // Declaración de variables.
    int resultado, temporal = 0;
    double p;
    Scanner lector;
    String original, copia = "";

    // Creamos el Scanner.
    lector = new Scanner(System.in);

    // Mensaje para que el usuario ingrese un número.
    System.out.print("Dame el número en octal: ");

    // Guardamos el número original evaluar.
    original = lector.nextLine();

    // Initialize resultado variable to 0.
    resultado = 0;

    // Copiamos el entero ingresado.

    // ! for para sacar la reversa de 'resultado'
      for (int i = original.length() - 1; original.length() != copia.length(); i--) {
        copia += original.charAt(i);
      }
    for (int i = copia.length() - 1; i >= 0; i--) {

      // Toma el último dígito.
      // ! evaluar cuando un resto sea mayor a 9
      if (copia.charAt(i) == 'A') {
        temporal = 10;
      } else if (copia.charAt(i) == 'B') {
        temporal = 11;
      } else if (copia.charAt(i) == 'C') {
        temporal = 12;
      } else if (copia.charAt(i) == 'D') {
        temporal = 13;
      } else if (copia.charAt(i) == 'E') {
        temporal = 14;
      } else if (copia.charAt(i) == 'F') {
        temporal = 15;
      } else if (copia.charAt(i) == '1') {
        temporal = 1;
      } else if (copia.charAt(i) == '2') {
        temporal = 2;
      } else if (copia.charAt(i) == '3') {
        temporal = 3;
      } else if (copia.charAt(i) == '4') {
        temporal = 4;
      } else if (copia.charAt(i) == '5') {
        temporal = 5;
      } else if (copia.charAt(i) == '6') {
        temporal = 6;
      } else if (copia.charAt(i) == '7') {
        temporal = 7;
      } else if (copia.charAt(i) == '8') {
        temporal = 8;
      } else if (copia.charAt(i) == '9') {
        temporal = 9;
      }

      // Exponente adecuado.
        p = Math.pow(16, i);

      // Multiplicar y agregarlo al resultado.
      resultado += (temporal * p);
    }

    System.out.println("El número octal (" + original + ") es en decimal: " + resultado);

    lector.close();
  }

}
