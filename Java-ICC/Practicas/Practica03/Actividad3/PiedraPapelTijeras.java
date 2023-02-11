import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aleatorios = new Random();

		int manoComputadora = aleatorios.nextInt(3);
		int manoUsuario=0;

		int victoriasUser = 0;
		int victoriasPC = 0;

		while(victoriasPC < 2 && victoriasUser < 2) {

			System.out.println("\nPartida a 2 de 3");
			System.out.println("Selecciona una mano");
			System.out.println("0: Piedra");
			System.out.println("1: Papel");
			System.out.println("2: Tijeras");
			manoUsuario = entrada.nextInt();

			//! Empate ==

			if(manoUsuario == manoComputadora) {

				System.out.println("\nEmpate");
				System.out.println("PC " + manoComputadora);
				System.out.println("Usario " + manoUsuario);
				System.out.println("Victorias del usuario: " + victoriasUser);
				System.out.println("Victorias de la PC: " + victoriasPC);

				manoComputadora = aleatorios.nextInt(3);

			} else {

				if(manoUsuario==0) { //! Piedra

					if(manoComputadora==1) { //! Papel

						System.out.println("\nPerdimos");
						System.out.println("PC " + manoComputadora);
						System.out.println("Usario " + manoUsuario);
						victoriasPC++;
						System.out.println("\nVictorias del usuario: " + victoriasUser);
						System.out.println("Victorias de la PC: " + victoriasPC);

					} else if (manoComputadora == 2){ //! Tijeras

						System.out.println("\nGanamos");
						System.out.println("PC " + manoComputadora);
						System.out.println("Usario " + manoUsuario);
						victoriasUser++;
						System.out.println("\nVictorias del usuario: " + victoriasUser);
						System.out.println("Victorias de la PC: " + victoriasPC);

					}

				}  else if (manoUsuario==1) { //! Papel

					if(manoComputadora==0) { //! Piedra

						System.out.println("\nGanamos");
						System.out.println("PC " + manoComputadora);
						System.out.println("Usario " + manoUsuario);
						victoriasUser++;
						System.out.println("\nVictorias del usuario: " + victoriasUser);
						System.out.println("Victorias de la PC: " + victoriasPC);

					} else if (manoComputadora == 2) { //! Tijeras

						System.out.println("\nPerdimos");
						System.out.println("PC " + manoComputadora);
						System.out.println("Usario " + manoUsuario);
						victoriasPC++;
						System.out.println("\nVictorias del usuario: " + victoriasUser);
						System.out.println("Victorias de la PC: " + victoriasPC);

					}

				} else if (manoUsuario == 2) { //! Tijeras

					if(manoComputadora==0) { //! Piedra

						System.out.println("\nPerdimos");
						System.out.println("PC " + manoComputadora);
						System.out.println("Usario " + manoUsuario);
						victoriasPC++;
						System.out.println("\nVictorias del usuario: " + victoriasUser);
						System.out.println("Victorias de la PC: " + victoriasPC);

					} else if (manoComputadora == 1) { //! Papel

						System.out.println("\nGanamos");
						System.out.println("PC " + manoComputadora);
						System.out.println("Usario " + manoUsuario);
						victoriasUser++;
						System.out.println("\nVictorias del usuario: " + victoriasUser);
						System.out.println("Victorias de la PC: " + victoriasPC);

					}
				}
			}
		}

		if (victoriasPC == 2){

			System.out.println("\nLa partida era a 2 de 3, y la PC ha ganado.");

		}else if( victoriasUser == 2){

			System.out.println("\nLa partida era a 2 de 3, y el usuario ha ganado.");

		}

		entrada.close();
	}






}








