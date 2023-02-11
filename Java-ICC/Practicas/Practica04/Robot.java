
import java.util.Random;
import java.util.Scanner;

public class Robot {
  // ! ATRIBUTOS
  boolean estado = true;
  int opcion = 0;

  // * VARIABLES GENERALES PARA LOS METODOS
  Random aleatorio = new Random();
  Scanner op_basicas = new Scanner(System.in);
  int calificacion_total = 0;
  int resultado = 0;
  int respuesta = 0;
  int valor1 = aleatorio.nextInt(9) + 1;
  int valor2 = aleatorio.nextInt(9) + 1;

  // ! CONSTRUCTOR
  public Robot(boolean estado, int opcion) {
    this.estado = estado;
    this.opcion = opcion;
  }

  // !GETTERS AND SETTERS
  public void setestado(boolean estado) {
    this.estado = estado;
  }

  public boolean getestado() {
    return estado;
  }

  public void setopcion(int opcion) {
    this.opcion = opcion;
  }

  public int getopcion() {
    return opcion;
  }

  // ! METODOS PARA LAS OPERACIONES
  // ! OPERACIONES BASICAS
  public void generarOperacionesBasicas() {

    if (estado == false) {
      System.out.println("El robot esta apagado, no se pueden realizar operaciones. ");
    } else {
      for (int i = 0; i < 10; i++) {
        valor1 = aleatorio.nextInt(9) + 1;
        valor2 = aleatorio.nextInt(9) + 1;
        int operador = aleatorio.nextInt(2);

        if (operador == 1) {

          resultado = valor1 + valor2;
          System.out.println(valor1 + " + " + valor2);
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respuesta :p\n");
          }

        } else {

          System.out.println(valor1 + " - " + valor2);
          resultado = valor1 - valor2;
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respusta :p\n");
          }

        }
      }
      op_basicas.close();
      if (calificacion_total >= 6) {
        System.out.println("Tu calificacion total es de: " + calificacion_total);
        System.out.println("APROBADO");
      } else {
        System.out.println("Tu calificacion total es de: " + calificacion_total);
        System.out.println("REPROBADO");
      }
    }
  }

  // ! OPERACIONES INTERMEDIAS
  public void generarOperacionesIntermedias() {

    if (estado == false) {
      System.out.println("El robot esta apagado, no se pueden realizar operaciones. ");
    } else {
      for (int i = 0; i < 10; i++) {
        int valor1_uno = aleatorio.nextInt(9) + 1;
        int valor2_uno = aleatorio.nextInt(10);

        int valor1_dos = aleatorio.nextInt(9) + 1;
        int valor2_dos = aleatorio.nextInt(10);

        int valor1_tres = aleatorio.nextInt(9) + 1;
        int valor2_tres = aleatorio.nextInt(10);

        String valor1 = "" + valor1_uno + valor2_uno;
        String valor2 = "" + valor1_dos + valor2_dos;
        String valor3 = "" + valor1_tres + valor2_tres;

        int operador = aleatorio.nextInt(3);
        int operador2 = aleatorio.nextInt(3);

        // ! SUMA
        if (operador == 0 && operador2 == 0) {

          resultado = Integer.valueOf(valor1) + Integer.valueOf(valor2) + Integer.valueOf(valor3);
          System.out.println(valor1 + " + " + valor2 + " + " + valor3);
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respuesta :p\n");
          }

        } else if (operador == 0 && operador2 == 1) {

          resultado = Integer.valueOf(valor1) + Integer.valueOf(valor2) - Integer.valueOf(valor3);
          System.out.println(valor1 + " + " + valor2 + " - " + valor3);
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respuesta :p\n");
          }

        } else if (operador == 0 && operador2 == 2) {
          resultado = Integer.valueOf(valor1) + Integer.valueOf(valor2) * Integer.valueOf(valor3);
          System.out.println(valor1 + " + " + "(" + valor2 + " * " + valor3 + ")");
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respuesta :p\n");
          }

        }
        // ! RESTA
        else if (operador == 1 && operador2 == 1) {

          System.out.println(valor1 + " - " + valor2 + " - " + valor3);
          resultado = Integer.valueOf(valor1) - Integer.valueOf(valor2) - Integer.valueOf(valor3);
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respusta :p\n");
          }
        } else if (operador == 1 && operador2 == 0) {
          resultado = Integer.valueOf(valor1) - Integer.valueOf(valor2) + Integer.valueOf(valor3);
          System.out.println(valor1 + " - " + valor2 + " + " + valor3);
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respuesta :p\n");
          }
        } else if (operador == 1 && operador2 == 2) {
          resultado = Integer.valueOf(valor1) - Integer.valueOf(valor2) * Integer.valueOf(valor3);
          System.out.println(valor1 + " - " + "(" + valor2 + " * " + valor3 + ")");
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respuesta :p\n");
          }
        }
        // ! MULTIPLICACION
        else if (operador == 2 && operador2 == 2) {

          System.out.println(valor1 + " * " + valor2 + " * " + valor3);
          resultado = Integer.valueOf(valor1) * Integer.valueOf(valor2) * Integer.valueOf(valor3);
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respusta :p\n");
          }
        } else if (operador == 2 && operador2 == 0) {
          resultado = Integer.valueOf(valor1) * Integer.valueOf(valor2) + Integer.valueOf(valor3);
          System.out.println("(" + valor1 + " * " + valor2 + ")" + " + " + valor3);
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respuesta :p\n");
          }
        } else if (operador == 2 && operador2 == 1) {
          resultado = Integer.valueOf(valor1) * Integer.valueOf(valor2) - Integer.valueOf(valor3);
          System.out.println("(" + valor1 + " * " + valor2 + ")" + " - " + valor3);
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respuesta :p\n");
          }
        }
      }
      op_basicas.close();
      if (calificacion_total >= 6) {
        System.out.println("Tu calificacion total es de: " + calificacion_total);
        System.out.println("APROBADO");
      } else {
        System.out.println("Tu calificacion total es de: " + calificacion_total);
        System.out.println("REPROBADO");
      }
    }

  }

  // ! OPERACIONES AVANZADAS
  public void generarOperacionesAvanzadas() {
    if (estado == false) {
      System.out.println("El robot esta apagado, no se pueden realizar operaciones. ");
    } else {
      for (int i = 0; i < 10; i++) {
        int valor1_uno = aleatorio.nextInt(9) + 1;
        int valor2_uno = aleatorio.nextInt(10);
        int valor3_uno = aleatorio.nextInt(10);

        int valor1_dos = aleatorio.nextInt(9) + 1;
        int valor2_dos = aleatorio.nextInt(10);
        int valor3_dos = aleatorio.nextInt(10);

        String valor1 = "" + valor1_uno + valor2_uno + valor3_uno;
        String valor2 = "" + valor1_dos + valor2_dos + valor3_dos;

        int operador = aleatorio.nextInt(4);

        if (operador == 0) {

          resultado = Integer.valueOf(valor1) + Integer.valueOf(valor2);
          System.out.println(valor1 + " + " + valor2);
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respuesta :p\n");
          }

        } else if (operador == 1) {

          System.out.println(valor1 + " - " + valor2);
          resultado = Integer.valueOf(valor1) - Integer.valueOf(valor2);
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respusta :p\n");
          }
        } else if (operador == 2) {

          System.out.println(valor1 + " * " + valor2);
          resultado = Integer.valueOf(valor1) * Integer.valueOf(valor2);
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respusta :p\n");
          }
        } else {
          while (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            valor1_uno = aleatorio.nextInt(9) + 1;
            valor2_uno = aleatorio.nextInt(10);
            valor3_uno = aleatorio.nextInt(10);

            valor1_dos = aleatorio.nextInt(9) + 1;
            valor2_dos = aleatorio.nextInt(10);
            valor3_dos = aleatorio.nextInt(10);

            valor1 = "" + valor1_uno + valor2_uno + valor3_uno;
            valor2 = "" + valor1_dos + valor2_dos + valor3_dos;
          }

          System.out.println(valor1 + " / " + valor2);
          resultado = Integer.valueOf(valor1) / Integer.valueOf(valor2);
          System.out.println("Dime tu respuesta: ");
          respuesta = op_basicas.nextInt();

          if (respuesta == resultado) {
            System.out.println("Correcto, esa es la respuesta!!!\n");
            calificacion_total++;
          } else {
            System.out.println("Esa no es la respusta :p\n");
          }
        }
      }
      op_basicas.close();
      if (calificacion_total >= 6) {
        System.out.println("Tu calificacion total es de: " + calificacion_total);
        System.out.println("APROBADO");
      } else {
        System.out.println("Tu calificacion total es de: " + calificacion_total);
        System.out.println("REPROBADO");
      }
    }

  }

  // ! MAIN
  public static void main(String[] args) {

    int operaciones = 0;
    int aux = 0;
    boolean estadoBase = true;
    Boolean apagado = true;
    Robot robot = new Robot(estadoBase, operaciones);
    Scanner entrada = new Scanner(System.in);

    System.out.println(
        "El robot esta encendido, quieres mantenerlo en este estado o apagarlo?[MANTENERLO = 1 / APAGAR = 0] ");
    aux = entrada.nextInt();

    if (aux == 1) {

      boolean decidiendo = true;
      while (decidiendo) {
        System.out.println("Que operaciones deseas hacer: ");
        System.out.println("1. Operaciones basicas. ");
        System.out.println("2. Operaciones intermedias. ");
        System.out.println("3. Operaciones avanzadas. ");

        operaciones = entrada.nextInt();
        if (operaciones > 3 || operaciones < 1) {
          System.out.println("Ese valor no es valido. Prueba de nuevo.\n ");
        } else {
          decidiendo = false;
          robot.setopcion(operaciones);
        }

      }
      if (operaciones == 1) {
        System.out.println();
        robot.generarOperacionesBasicas();
      } else if (operaciones == 2) {
        System.out.println();
        robot.generarOperacionesIntermedias();
      } else {
        System.out.println();
        robot.generarOperacionesAvanzadas();
      }

    }
    // ! EL ROBOT ESTA APAGADO Y PUEDE RECIBIR LA OPCION DE ENCENDERSE
    else if (aux == 0) {

      estadoBase = false;
      robot.setestado(estadoBase);

      System.out.println("Esta bien :)\n");

      while (apagado) {
        System.out.println("Si deseas encender el robot y hacer operaciones, presiona [1]: ");
        System.out.println("Si deseas salir del programa [0]: ");
        aux = entrada.nextInt();

        if (aux == 1) {
          apagado = false;
          estadoBase = true;

          robot.setestado(estadoBase);

          boolean decidiendo = true;
          while (decidiendo) {
            System.out.println("Que operaciones deseas hacer: ");
            System.out.println("1. Operaciones basicas. ");
            System.out.println("2. Operaciones intermedias. ");
            System.out.println("3. Operaciones avanzadas. ");

            operaciones = entrada.nextInt();
            if (operaciones > 3 || operaciones < 1) {
              System.out.println("Ese valor no es valido. Prueba de nuevo.\n ");
            } else {
              decidiendo = false;
              robot.setopcion(operaciones);
            }

          }
          if (operaciones == 1) {
            System.out.println();
            robot.generarOperacionesBasicas();
          } else if (operaciones == 2) {
            System.out.println();
            robot.generarOperacionesBasicas();
          } else {
            System.out.println();
            robot.generarOperacionesBasicas();
          }
        } else if (aux == 0) {
          break;
        }
      }
    }
    entrada.close();
  }
}