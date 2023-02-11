import java.util.Scanner;

//todo organizar todas las varibales en el main
public class DecimalBinario {
  // Binario
  public static void main(String[] args) {

    // *VARIABLES
    Scanner entrada = new Scanner(System.in);
    int decimalOriginal, copia, temporal;
    String resultado = "";
    String revResultado = "";
    int eleccion = 0;

    System.out.println("hexa o dec");
    eleccion = entrada.nextInt();

    if (eleccion == 1 ) {

      System.out.println("Introduce un numero en hexa a dec: ");
      decimalOriginal = entrada.nextInt();

      copia = decimalOriginal;

      // ! for para obtener el modulo de copia (numero original) y anadirlo a una variable
      for (int i = 0; copia > 0; i++) {

        temporal = copia % 16;

        if (temporal == 10 ){
          resultado += "A";
        }else if (temporal == 11){
          resultado += "B";
        }else if (temporal == 12){
          resultado += "C";
        }else if (temporal == 13){
          resultado += "D";
        }else if (temporal == 14){
          resultado += "E";
      }else if (temporal == 15){
          resultado += "F";
        }else {
          resultado += Integer.toString(temporal);
        }
        
        copia /= 16;
      }

      // ! for para sacar la reversa de 'resultado'
      for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
        revResultado += resultado.charAt(i);
      }

      System.out.println("revResultado " + revResultado);

      entrada.close();

    } else {

      int binarioOriginal;
      double p;
      int resultadoDec = 0;
      Boolean sepude = true;

      System.out.println("Introduce un numero en binario: ");
      binarioOriginal = entrada.nextInt();

      copia = binarioOriginal;

      for (int i = 0; copia > 0; i++) {

        temporal = copia % 10;

        if( temporal > 1 ){
          sepude = false;
        }

      // Exponente adecuado.
      p = Math.pow(2, i);

      // Multiplicar y agregarlo al resultado.
      resultadoDec += (temporal * p);
      copia = copia / 10;

      }
      if(sepude){
      System.out.println("El número binario (" + binarioOriginal + ") es en decimal: " + resultadoDec);
      } else{
      System.out.println("El numero que ingresas no es binario.");
      }
    }

  }
}
