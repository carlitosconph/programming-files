
import java.util.Scanner;

public class SignoZodiacal {
  public static void main(String[] args) {

    Scanner lector = new Scanner(System.in);
    int dia;
    int mes;

    System.out.println("Dime tu dia de nacimiento: ");
    dia = lector.nextInt();

    //? condicion para validar el dia, debe ser menor o igual a 31

    if (dia <= 31) {

      System.out.println("Dime tu mes de nacimiento [en numero]: ");
      mes = lector.nextInt();
    
    //? condicion para validar el mes, debe ser menor o igual a 12

      if (mes <= 12) {

        //! condicion para Aries

        if ((dia >= 21 && mes == 3) || (mes == 4 && dia <= 20)){
          System.out.println("Tu signo es Aries, tu simbolo es el carnero y tu elemento es el fuego. ");
        }

                //! condicion para Tauro

        else if (((dia >= 21 && dia <= 30) && mes == 4) || (mes == 5 && dia <= 21)){
          System.out.println("Tu signo es Tauro, tu simbolo es el toro y tu elemento es la tierra. ");
        }

                //! condicion para Geminis

        else if ((dia >= 22 && mes == 5) || (mes == 6 && dia <= 23)){
          System.out.println("Tu signo es Geminis, tu simbolo son los gemelos y tu elemento es el aire. ");
        }

                //! condicion para Cancer

        else if (((dia >= 24 && dia <= 30) && mes == 6) || (mes == 7 && dia <= 23)){
          System.out.println("Tu signo es Cancer, tu simbolo es el cangrejo y tu elemento es el agua. ");
        }

                //! condicion para Leo

        else if ((dia >= 24 && mes == 7) || (mes == 8 && dia <= 22)){
          System.out.println("Tu signo es Leo, tu simbolo es el leon y tu elemento es el fuego. ");
        }

                //! condicion para Virgo

        else if ((dia >= 23 && mes == 8) || (mes == 9 && dia <= 22)){
          System.out.println("Tu signo es Virgo, tu simbolo es la virgen y tu elemento es ela tierra. ");
        }

                //! condicion para Libra

        else if (((dia >= 23 && dia <= 30) && mes == 9) || (mes == 10 && dia <= 23)){
          System.out.println("Tu signo es Libra, tu simbolo es la balanza y tu elemento es el aire. ");
        }

                //! condicion para Escorpio

        else if ((dia >= 24 && mes == 10) || (mes == 11 && dia <= 22)){
          System.out.println("Tu signo es Escorpio, tu simbolo es el escorpion y tu elemento es el agua. ");
        }

                //! condicion para Sagitario

        else if (((dia >= 23 && dia <= 30) && mes == 11) || (mes == 12 && dia <= 21)){
          System.out.println("Tu signo es Sagitario, tu simbolo es el centauro y tu elemento es el fuego. ");
        }

                //! condicion para Capricornio

        else if ((dia >= 22 && mes == 12) || (mes == 1 && dia <= 20)){
          System.out.println("Tu signo es Capricornio, tu simbolo es la cabra de mar y tu elemento es el tierra. ");
        }

                //! condicion para Acuario

        else if ((dia >= 21 && mes == 1) || (mes == 2 && dia <= 21)){
          System.out.println("Tu signo es Acuario, tu simbolo es el portador de agua y tu elemento es el aire. ");
        }

                //! condicion para Piscis

        else if (((dia >= 20 && dia <=28) && mes == 2) || (mes == 3 && dia <= 20)){
          System.out.println("Tu signo es Piscis, tu simbolo son los peces y tu elemento es el agua. ");
        }
        
        //* else para datos invalidos

        else{
          System.out.println("Ingresaste una fecha invalida. ");
        }
      }else {
      System.out.println("Ese mes es invalido");
      }
    }else {
      System.out.println("Ese dia es invalido");
    }

    lector.close();
  }
}



