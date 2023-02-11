
//! Scanner para controlar el momento en que se tiran los dados, el usuario decide cuando tirarlos

import java.util.Scanner;
import java.util.Random;

public class Dados {

  public static void main(String[] args) {

    Scanner tirando = new Scanner(System.in);
    int dado1 = 0, dado2 = 0;
    int puntoJugador = 0;
    Random puntosNegros = new Random();
    String enter = "";

    dado1 = puntosNegros.nextInt(6) + 1;
    dado2 = puntosNegros.nextInt(6) + 1;

    //? Reglas del juego

    System.out.println("=====JUEGO DE LOS DADOS=====");
    System.out.println("Reglas:\n");
    System.out.println("1. Si la suma de tus dados es 7 u 11 (en tu primer tiro), has ganado.");
    System.out.println("2. Si la suma es de 2, 3 o 12 (en tu primer tiro), pierdes.");
    System.out.println("3. Si la suma es de 4, 5, 6, 8, 9 o 10 (en tu primer tiro), se convierte en tu 'punto'. Para ganar debes tirar los dados y obtener nuevamente tu punto.");
    System.out.println("pero si obtienes un 7 antes de volver a llegar a tu punto, piedes!\n");

    //! Aqui es donde el usuario decide el momento en que tira los dados. Para esto uso el Scanner.

    System.out.println("Pulsa ENTER para tirar los dados: ");
    enter = tirando.nextLine();

    System.out.println("Tu dado 1 tiene el valor de " + dado1 + ", mientas que tu dado 2 tiene el valor de " + dado2);
    System.out.println("La suma de tus dados es: " + (dado1 + dado2));

    //* Condiciones para el primer tiro

    if (dado1 + dado2 == 7 || dado1 + dado2 == 11) {

      System.out.println("\nHas ganado!!!");

    } else if (dado1 + dado2 == 2 || dado1 + dado2 == 3 || dado1 + dado2 == 12) {

      System.out.println("\nHas perdido!!!");
      System.out.println("La casa siempre gana :p");

      //* Else if para cuando la suma es 4, 5, 6, 8, 9 o 10

    } else if (dado1 + dado2 == 4 || dado1 + dado2 == 5 || dado1 + dado2 == 6 || dado1 + dado2 == 8
        || dado1 + dado2 == 9 || dado1 + dado2 == 10) {

      puntoJugador = dado1 + dado2;

      //* While para seguir jugando hasta que se obtenga, nuevamente, el punto (ganar) o se obtenga un 7 (perder)

      while (true) {

        System.out.println("El valor de tu punto es: " + puntoJugador);
        System.out.println("Para ganar debes obtener tu punto en la suma de ambos dados.\n");
        System.out.println("Pulsa ENTER para tirar los dados: ");
        enter = tirando.nextLine();

        dado1 = puntosNegros.nextInt(6) + 1;
        dado2 = puntosNegros.nextInt(6) + 1;

        System.out.println("Tu dado 1 tiene el valor de " + dado1 + ", mientas que tu dado 2 tiene el valor de " + dado2);
        System.out.println("La suma de tus dados es: " + (dado1 + dado2));

        if (dado1 + dado2 == puntoJugador) {

          System.out.println("\nLa suma de tus dados es " + (dado1 + dado2) + " el valor de tu punto es " + puntoJugador);
          System.out.println("Has ganado!!!");
          break;

        } else if (dado1 + dado2 == 7) {

          System.out.println("\nHas perdido!!!");
          System.out.println("La casa siempre gana :p");
          break;

        }
      }
    }
    tirando.close();
    System.out.println(enter); //! print para que una extension no marque que no uso una varible, no afecta en nada
  }
  
}