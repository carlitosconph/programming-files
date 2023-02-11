import java.util.Scanner;

public class Collatx {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    int numeroCollatz = 0;
    boolean calculando = true;


    System.out.println("Dame el numero para calcular la sucesion de Collatz: ");
    numeroCollatz = teclado.nextInt();
    System.out.println();

    System.out.println(numeroCollatz);

    while (calculando){

      if (numeroCollatz == 1){

        calculando = false; //! Sale del ciclo

      } else if (numeroCollatz % 2 == 1){

        numeroCollatz = (numeroCollatz * 3) + 1;
        System.out.println(numeroCollatz);
      
      } else if (numeroCollatz % 2 == 0){
        
        numeroCollatz = numeroCollatz / 2;
        System.out.println(numeroCollatz);

      }

    }
    teclado.close();
  }
  
}
