import java.util.Random;

public class Torre {
  public static void main(String[] args) {

    Random aleatorios = new Random();

    int[][] tableroAjedrez = new int[8][8];

    for (int i = 0; i < tableroAjedrez.length; i++) {
      for (int j = 0; j < tableroAjedrez[i].length; j++) {

        if ((i + j) % 2 == 0) {
          System.out.print("#" + " ");
        } else {
          System.out.print("-" + " ");
        }

      }
      System.out.println();

    }

    System.out.println();
    System.out.println();

    // Posicion arbitraria la torre
    int ren = aleatorios.nextInt(8);
    int col = aleatorios.nextInt(8);

    tableroAjedrez[ren][col] = 1;

    // Tachar posiciones válidas de la torre
    // Cuadrante 1, el del valor esquina superior izq
    //! ren es arriba y col derecha
    int renC1 = ren - 1;
    int colC1 = col;

    while (renC1 >= 0 && colC1 >= 0) {
      tableroAjedrez[renC1][colC1] = 2;
      renC1--;
      //colC1--;
    }

    int renC2 = ren;
    int colC2 = col + 1;

    while (renC2 >= 0 && colC2 <= 7) {
      tableroAjedrez[renC2][colC2] = 2;
      //renC2--;
      colC2++;
    }

    int renC3 = ren;
    int colC3 = col - 1;

    while (renC3 <= 7 && colC3 >= 0) {
      tableroAjedrez[renC3][colC3] = 2;
      //renC3++;
      colC3--;
    }

    int renC4 = ren + 1;
    int colC4 = col;

    while (renC4 <= 7 && colC4 <= 7) {
      tableroAjedrez[renC4][colC4] = 2;
      renC4++;
      //colC4++;
    }

    System.out.println("Tablero de 1's, 0s, 2s");

    for (int i = 0; i < tableroAjedrez.length; i++) {
      for (int j = 0; j < tableroAjedrez[i].length; j++) {
        System.out.print(tableroAjedrez[i][j]);
      }
      System.out.println();

    }

    System.out.println();
    System.out.println();

    for (int i = 0; i < tableroAjedrez.length; i++) {
      for (int j = 0; j < tableroAjedrez[i].length; j++) {

        if (tableroAjedrez[i][j] == 1) {
          System.out.print('\u265C' + " ");
        } else if (tableroAjedrez[i][j] == 2) {
          System.out.print("*" + " ");
        } else {
          if ((i + j) % 2 == 0) {
            System.out.print("#" + " ");
          } else {
            System.out.print("-" + " ");
          }
        }
      }
      System.out.println();

    }
  }

}
