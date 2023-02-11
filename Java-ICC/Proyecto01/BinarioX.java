import java.util.Scanner;

public class BinarioX {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int copia, temporal;
    String resultado = "";
    String revResultado = "";
    int binarioOriginal;
    double p;
    int resultadoDec = 0;
    Boolean sepude = true;

    System.out.println("Introduce un numero en binario a octal: ");
    binarioOriginal = entrada.nextInt();

    copia = binarioOriginal;

    for (int i = 0; copia > 0; i++) {

      temporal = copia % 10;

      if (temporal > 1) {
        sepude = false;
      }

      // Exponente adecuado.
      p = Math.pow(2, i);

      // Multiplicar y agregarlo al resultado.
      resultadoDec += (temporal * p);
      copia = copia / 10;

    }
    if (sepude) { //! aqui pasa a decimal a octal

      copia = resultadoDec;

      // ! for para obtener el modulo de copia (numero original) y anadirlo a una variable
      for (int i = 0; copia > 0; i++) {
        temporal = copia % 8;
        resultado += Integer.toString(temporal);
        copia /= 8;
      }

      // ! for para sacar la reversa de 'resultado'
      for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
        revResultado += resultado.charAt(i);
      }

      System.out.println("revResultado " + revResultado);
    } else {
      System.out.println("El numero que ingresas no es binario.");
    }

    entrada.close();
  }

}
