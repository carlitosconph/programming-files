import java.util.Random;


public class Ajedrez {
	
	public static void main(String[] args) {

		Random aleatorios = new Random();
		int[][] tableroAjedrez = new int[8][8];

		System.out.println("Posiciones del alfil: ");
		System.out.println();

		/* for(int i=0; i<tableroAjedrez.length; i++) {
			for(int j=0; j<tableroAjedrez[i].length; j++) {

				if((i+j)%2==0) {
					System.out.print("#" + " ");
				} else {
					System.out.print("-" + " ");
				}
				
			}
			System.out.println();

		} */


		//Posicion arbitraria del alfil
		int ren = aleatorios.nextInt(8);
		int col = aleatorios.nextInt(8);

		tableroAjedrez[ren][col] = 1;

		//Tachar posiciones válidas del alfil
		//Cuadrante 1, el del valor esquina superior izq
		int renC1 = ren-1;
		int colC1 = col-1;

		while(renC1>=0 && colC1>=0) {
			tableroAjedrez[renC1][colC1]=2;
			renC1--;
			colC1--;
		}

		int renC2 = ren-1;
		int colC2 = col+1;

		while(renC2>=0 && colC2<=7) {
			tableroAjedrez[renC2][colC2]=2;
			renC2--;
			colC2++;
		}


		int renC3 = ren+1;
		int colC3 = col-1;

		while(renC3<=7 && colC3>=0) {
			tableroAjedrez[renC3][colC3]=2;
			renC3++;
			colC3--;
		}


		int renC4 = ren+1;
		int colC4 = col+1;

		while(renC4<=7 && colC4<=7) {
			tableroAjedrez[renC4][colC4]=2;
			renC4++;
			colC4++;
		}




		System.out.println("Tablero de 1's, 0s, 2s");

		for(int i=0; i<tableroAjedrez.length; i++) {
			for(int j=0; j<tableroAjedrez[i].length; j++) {
				System.out.print(tableroAjedrez[i][j]);
			}
			System.out.println();

		}


		System.out.println();
		System.out.println();

		for(int i=0; i<tableroAjedrez.length; i++) {
			for(int j=0; j<tableroAjedrez[i].length; j++) {

				if(tableroAjedrez[i][j]==1) {
					System.out.print('\u265D' + " ");
				} else if(tableroAjedrez[i][j]==2) {
					System.out.print("*" + " ");
				} else {
					if((i+j)%2==0) {
						System.out.print("#" + " ");
					} else {
						System.out.print("-" + " ");
					}
				}
			}
			System.out.println();

		}


		System.out.println("\nPosiciones de la torre: ");

    int[][] tableroAjedrezTorre = new int[8][8];

    /* for (int i = 0; i < tableroAjedrezTorre.length; i++) {
      for (int j = 0; j < tableroAjedrezTorre[i].length; j++) {

        if ((i + j) % 2 == 0) {
          System.out.print("#" + " ");
        } else {
          System.out.print("-" + " ");
        }

      }
      System.out.println();

    } */

    System.out.println();

    // Posicion arbitraria la torre
    ren = aleatorios.nextInt(8);
    col = aleatorios.nextInt(8);

    tableroAjedrezTorre[ren][col] = 1;

    // Tachar posiciones válidas de la torre
    // Cuadrante 1, el del valor esquina superior izq
    //! ren es arriba y col derecha
    renC1 = ren - 1;
    colC1 = col;

    while (renC1 >= 0 && colC1 >= 0) {
      tableroAjedrezTorre[renC1][colC1] = 2;
      renC1--;
      //colC1--;
    }

    renC2 = ren;
    colC2 = col + 1;

    while (renC2 >= 0 && colC2 <= 7) {
      tableroAjedrezTorre[renC2][colC2] = 2;
      //renC2--;
      colC2++;
    }

    renC3 = ren;
    colC3 = col - 1;

    while (renC3 <= 7 && colC3 >= 0) {
      tableroAjedrezTorre[renC3][colC3] = 2;
      //renC3++;
      colC3--;
    }

    renC4 = ren + 1;
    colC4 = col;

    while (renC4 <= 7 && colC4 <= 7) {
      tableroAjedrezTorre[renC4][colC4] = 2;
      renC4++;
      //colC4++;
    }

    System.out.println("Tablero de 1's, 0s, 2s");

    for (int i = 0; i < tableroAjedrezTorre.length; i++) {
      for (int j = 0; j < tableroAjedrezTorre[i].length; j++) {
        System.out.print(tableroAjedrezTorre[i][j]);
      }
      System.out.println();

    }

    System.out.println();
    System.out.println();

    for (int i = 0; i < tableroAjedrezTorre.length; i++) {
      for (int j = 0; j < tableroAjedrezTorre[i].length; j++) {

        if (tableroAjedrezTorre[i][j] == 1) {
          System.out.print('\u265C' + " ");
        } else if (tableroAjedrezTorre[i][j] == 2) {
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


		System.out.println("\nPosicion del caballo: ");	
		int[][] tableroAjedrezCaballo = new int[8][8];

    /* for (int i = 0; i < tableroAjedrezCaballo.length; i++) {
      for (int j = 0; j < tableroAjedrezCaballo[i].length; j++) {

        if ((i + j) % 2 == 0) {
          System.out.print("#" + " ");
        } else {
          System.out.print("-" + " ");
        }

      }
      System.out.println();

    } */

    System.out.println();

    // Posicion arbitraria del caballo
    ren = aleatorios.nextInt(8);
    col = aleatorios.nextInt(8);

    tableroAjedrezCaballo[ren][col] = 1;

    // Tachar posiciones válidas del caballo
    // Cuadrante 1, el del valor esquina superior izq
    // ! ren es arriba y col derecha
    renC1 = ren - 1;
    colC1 = col - 2;

    if ((renC1 <= 7 && renC1 >= 0) && (colC1 <= 7 && colC1 >= 0)) {
      tableroAjedrezCaballo[renC1][colC1] = 2;
    }
    renC1--;
    colC1++;
    if ((renC1 <= 7 && renC1 >= 0) && (colC1 <= 7 && colC1 >= 0)) {
      tableroAjedrezCaballo[renC1][colC1] = 2;
    }

    renC2 = ren - 1;
    colC2 = col + 2;

    if ((renC2 <= 7 && renC2 >= 0) && (colC2 >= 0 && colC2 <= 7)) {
      tableroAjedrezCaballo[renC2][colC2] = 2;
    }
    renC2--;
    colC2--;
    if ((renC2 <= 7 && renC2 >= 0) && (colC2 >= 0 && colC2 <= 7)) {
      tableroAjedrezCaballo[renC2][colC2] = 2;
    }

    renC3 = ren + 1;
    colC3 = col + 2;

    if ((renC3 >= 0 && renC3 <= 7) && (colC3 <= 7 && colC3 >= 0)) {
      tableroAjedrezCaballo[renC3][colC3] = 2;
    }
    renC3++;
    colC3--;
    if ((renC3 >= 0 && renC3 <= 7) && (colC3 <= 7 && colC3 >= 0)) {
      tableroAjedrezCaballo[renC3][colC3] = 2;
    }

    renC4 = ren + 1;
    colC4 = col - 2;

    if ((renC4 >= 0 && renC4 <= 7) && (colC4 >= 0 && colC4 <= 7)) {
      tableroAjedrezCaballo[renC4][colC4] = 2;
    }
    renC4++;
    colC4++;
    if ((renC4 >= 0 && renC4 <= 7) && (colC4 >= 0 && colC4 <= 7)) {
      tableroAjedrezCaballo[renC4][colC4] = 2;
    }

    System.out.println("Tablero de 1's, 0s, 2s");

    for (int i = 0; i < tableroAjedrezCaballo.length; i++) {
      for (int j = 0; j < tableroAjedrezCaballo[i].length; j++) {
        System.out.print(tableroAjedrezCaballo[i][j]);
      }
      System.out.println();

    }

    System.out.println();
    System.out.println();

    for (int i = 0; i < tableroAjedrezCaballo.length; i++) {
      for (int j = 0; j < tableroAjedrezCaballo[i].length; j++) {

        if (tableroAjedrezCaballo[i][j] == 1) {
          System.out.print('\u265E' + " ");
        } else if (tableroAjedrezCaballo[i][j] == 2) {
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

