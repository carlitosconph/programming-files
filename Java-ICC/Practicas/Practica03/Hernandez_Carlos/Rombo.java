

import java.util.Scanner;

public class Rombo {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int cont = 1;
    int cont1 = 1;
    int maximo = 0;
    boolean controlando = true;

    System.out.println("Dame el numero maximo para tu rombo: ");
    maximo = teclado.nextInt();

    while (maximo >= cont) {

      while (cont1 <= cont) {

        //! if para controlar la impresion de espacios vacios y de esa forma lograr la forma triangular 
        
        if (controlando) {

        // ! for para imprimer espacios vacios

          for (int i = 0; i < (maximo - cont); i++) {

            System.out.print(" ");

          }

        }

        controlando = false;
        System.out.print("* ");
        cont1++;

      }

    controlando = true;
      cont1 = 1;
      System.out.println("");
      cont++;

    }
    
    cont = maximo - 1;

    while (cont > 0) {
      
      while (cont1 <= cont) {
        
        //! if para controlar la impresion de espacios vacios y de esa forma lograr la forma triangular 

        if (controlando) {

        // ! for para imprimer espacios vacios

          for (int i = 0; i < (maximo - cont); i++) {

            System.out.print(" ");

          }

        }

        controlando = false;
        System.out.print("* ");
        cont1++;

      }

      controlando = true;
      cont1 = 1;
      System.out.println("");
      cont--;

    }

    teclado.close();
  }
}
