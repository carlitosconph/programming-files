import java.util.InputMismatchException;
import java.util.Scanner;

public class MainJarraDeAgua {
  public static void main(String[] args) {
    // switch
    Scanner scanner = new Scanner(System.in);
    JarraDeAgua jarraDeAgua = new JarraDeAgua(3);
    System.out.println(jarraDeAgua.capacity);

    int option = 0;
    while (option != 3) {
      Scanner scanner2 = new Scanner(System.in);
      System.out.println("\nQue quieres hacer?");
      System.out.println("1. Depositar agua. ");
      System.out.println("2. Retirar agua. ");
      System.out.println("3. Salir. ");
      option = scanner.nextInt();

      switch (option) {
        case 1:
          try {
            System.out.println("Cuantos vasos de agua quieres depositar? ");
            int numeroLeidos = scanner2.nextInt();
            try {
              System.out.println(jarraDeAgua.depositaAgua(numeroLeidos));
            } catch (CapacidadSuperadaException exception) {
              System.out.println(exception);
            }
          } catch (InputMismatchException e) {
            System.out.println("\nEl valor ingresado debe ser entero. ");
          }
          break;
        case 2:
          try {
            System.out.println("Cuantos vasos de agua quieres retirar? ");
            int numeroLeidos = scanner2.nextInt();
            try {
              System.out.println(jarraDeAgua.retirarAgua(numeroLeidos));
            } catch (CapacidadInsuficienteException exception) {
              System.out.println(exception);
            }
          } catch (InputMismatchException e) {
            System.out.println("\nEl valor ingresado debe ser entero. ");
          }
          break;
        case 3:
          System.exit(1);
          break;
        default:
          System.out.println("Opcion invalida. ");
          break;
      }
    }
  }
}
