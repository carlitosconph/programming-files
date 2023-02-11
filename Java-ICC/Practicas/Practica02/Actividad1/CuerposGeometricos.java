
import java.util.Scanner;

public class CuerposGeometricos{
  public static void main(String[] args) {

    double altura, radio, volumen;
    Scanner lector = new Scanner(System.in);

    //! Print para preguntar que figura desea

    System.out.println("De que figura deseas sacar el volumen? [1-Cono / 2-Esfera / 3-Hemisfera]: ");
    int eleccion = lector.nextInt();

    //! If para entrar a cada caso (cono, esfera o hemisfera)

    if ( eleccion == 1 ){

      System.out.println("\n Dame la altura del cono: ");
      altura = lector.nextInt();

      System.out.println("\n Dame el radio del cono: ");
      radio = lector.nextInt();

      volumen = ((Math.PI * (Math.pow(radio, 2))) * altura) / 3;

      System.out.println("\n El volumen de tu circulo de " + radio + " de radio es de: " + volumen);

    }else if ( eleccion == 2 ){

      System.out.println("\n Dame el radio de la esfera: ");
      radio = lector.nextInt();

      volumen = (( Math.PI * (Math.pow(radio, 3)) )/ 3) * 4;

      System.out.println("\n El volumen de tu esfera de " + radio + " de radio es de: " + volumen);

    }else if ( eleccion == 3 ){

      System.out.println("\n Dame el radio de la hemisfera: ");
      radio = lector.nextInt();

      volumen = (( Math.PI * (Math.pow(radio, 3)) )/ 3) * 2;

      System.out.println("\n El volumen de tu hemisfera de " + radio + " de radio es de: " + volumen);

    }else{
      System.out.println("\n Ese numero no es valido. ");
    }

    lector.close();
  }
}