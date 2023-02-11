import java.util.Random;
import java.util.Scanner;

public class Proyecto01 {
  public static void main(String[] args) {

    // *VARIABLES GENERALES
    Scanner entrada = new Scanner(System.in);
    Random aleatorios = new Random();

    // *USER/PASSWORD
    String user, password;

    // *ELECCIONES PRINCIPALES
    int eleccionMiguel, eleccionCalculadora;

    // *VARIABLE PARA EL TURNO DE MIGUEL Y PARA JUGAR
    int jugandoCanicasINT = 0;
    boolean jugandoCanicas = true;

    // *VARIABLE PARA LA CALCULADORA
    int seguirCalc = 0;
    boolean calculando = true;

    // ! USER AND PASSWORD
    System.out.println("===== Usuario y Contrasena =====\n");
    System.out.println("Dime tu usuario: ");
    user = entrada.nextLine();

    System.out.println("\nDime tu contrasena: ");
    password = entrada.nextLine();

    // ! ENTRADA A DIFERENTES USUARIOS

    if (user.equals("Miguel") && password.equals("yomero")) {

      // ? While para cuando la eleccion Miguel no esa 1 o 2
      boolean eligiendo = true;
      while (eligiendo) {

        System.out.println("\nHola Miguel, que deseas abrir [1/2]: ");
        System.out.println("1. Jugar a las canicas. ");
        System.out.println("2. Calculadora. ");
        eleccionMiguel = entrada.nextInt();

        // ! OPCIONES PARA MIGUEL
        if (eleccionMiguel == 1) {

          // !whila para jugar despues de ganar o perder
          while (jugandoCanicas) {

            // *VARIABLES PARA EL JUEGO DE CANICAS
            int canicasMiguel = 10, canicasPC = 10, canicasApostarMigue = 0, canicasApostarPC = 0;
            int eleccionMParImpar = 0, eleccionPCParImpar = 0;
            boolean turnoM = true;

            eligiendo = false;
            System.out.println("\nPerfecto, juguemos a las canicas :)\n");

            System.out.println("Inicia el juego, cada uno cuenta con 10 canicas");

            // ? while para que el juego siga
            while (canicasMiguel != 0 && canicasPC != 0) {

              // ? Aqui se apuestan las canicas
              boolean apostando = true;
              while (apostando) {

                System.out.println("\nCuantas canicas quieres apostar, Miguel? ");
                canicasApostarMigue = entrada.nextInt();

                if (canicasApostarMigue > canicasMiguel) {
                  System.out.println("\nNo puedes apostar mas canicas de las que tienes[" + canicasMiguel + "]");
                } else if (canicasApostarMigue < 0) {
                  System.out.println("\nNo puedes apostar cantidades negativas. ");
                } else {
                  apostando = false;
                }

              }

              // | canicas a apostar por parte de la computadora
              canicasApostarPC = aleatorios.nextInt(canicasPC) + 1;

              // ? Aqui se pregunta si es par o impar por parte de Miguel y PC
              boolean parImpar = true;
              while (parImpar) {
                if (turnoM) {

                  System.out
                      .println("\nMiguel, la cantidad de canicas que la PC decidio apostar es par [0] o impar [1]? ");
                  eleccionMParImpar = entrada.nextInt();

                  if (eleccionMParImpar == 0 || eleccionMParImpar == 1) {

                    parImpar = false;

                    // ? Aqui se valida, dependiendo de la eleccion de Miguel, si adivino el ser par
                    // o no
                    if (eleccionMParImpar == (canicasApostarPC % 2)) {

                      System.out.println("Adivinaste, ganaste " + canicasApostarPC + " canicas.");
                      canicasMiguel += canicasApostarPC;
                      canicasPC -= canicasApostarPC;

                    } else {
                      System.out.println("Lo siento, acabas de perder " + canicasApostarMigue + " canicas. ");
                      canicasPC += canicasApostarMigue;
                      canicasMiguel -= canicasApostarMigue;

                    }

                    turnoM = false;
                    apostando = true;

                  } else {
                    System.out.println("\nNumero invalido, solo se acepta [1/2]");
                  }
                } else {

                  parImpar = false;
                  System.out
                      .println("Turno de la PC, eligira si la cantidad de canicas que apostaste es par o impar. ");

                  eleccionMParImpar = aleatorios.nextInt(2);

                  if (eleccionPCParImpar == (canicasApostarMigue % 2)) {

                    System.out.println("Adivino, gano " + canicasApostarMigue + " canicas.");
                    canicasPC += canicasApostarMigue;
                    canicasMiguel -= canicasApostarMigue;

                  } else {

                    System.out.println("La PC acaba de perder " + canicasApostarPC + " canicas. ");
                    canicasMiguel += canicasApostarPC;
                    canicasPC -= canicasApostarPC;

                  }

                  turnoM = true;

                }

              }

            }
            if (canicasMiguel == 0) {

              System.out.println("\nMiguel, no te quedan mas canicas y la PC tiene 20, perdiste!!!");
              System.out.println("Quires seguir jugando?[SI = 1 / NO = 0]");
              jugandoCanicasINT = entrada.nextInt();

              if (jugandoCanicasINT == 1) {
                jugandoCanicas = true;
              } else if (jugandoCanicasINT == 0) {
                jugandoCanicas = false;
                System.out.println("\nNos vemos, Miguel :)\n");
              } else {
                System.out.println("Opcion invalida. ");
              }

            } else if (canicasPC == 0) {
              System.out.println("\nLa PC se quedo sin canicas y tu tienes 20, por lo tanto, Ganaste Miguel");
              System.out.println("Quires seguir jugando?[SI = 1 / NO = 0]");
              jugandoCanicasINT = entrada.nextInt();

              if (jugandoCanicasINT == 1) {
                jugandoCanicas = true;
              } else if (jugandoCanicasINT == 0) {
                System.out.println("\nNos vemos, Miguel :)\n");
                jugandoCanicas = false;
              } else {
                System.out.println("Opcion invalida. ");
              }

            }
          }

          // ? Calculadora
        } else if (eleccionMiguel == 2) {

          while (calculando) {

            // *VARIABLES PARA LA CALCULADORA [GENERALES]
            int decimalOriginal, copia, temporal = 0;
            String resultado = "";
            String revResultado = "";

            int binarioOriginal;
            double p;
            int resultadoDec = 0;
            Boolean sepude = true;

            eligiendo = false;
            System.out.println("\nBien, estamos en la calculadora :)");
            System.out.println("Que cambio de base deseas realizar [1-12]?\n ");

            System.out.println("1. DECIMAL A BINARIO ");
            System.out.println("2. DECIMAL A OCTAL ");
            System.out.println("3. DECIMAL A HEXADECIMAL ");
            System.out.println("4. BINARIO A DECIMAL ");
            System.out.println("5. BINARIO A OCTAL ");
            System.out.println("6. BINARIO A HEXADECIMAL ");
            System.out.println("7. OCTAL A DECIMAL ");
            System.out.println("8. OCTAL A BINARIO ");
            System.out.println("9. OCTAL A HEXADECIMAL ");
            System.out.println("10. HEXADECIMAL A DECIMAL ");
            System.out.println("11. HEXADECIMAL A BINARIO ");
            System.out.println("12. HEXADECIMAL A OCTAL \n");

            eleccionCalculadora = entrada.nextInt();

            switch (eleccionCalculadora) {

              case 1: // ? DECIMAL A BINARIO ###
                System.out.println("\nDECIMAL A BINARIO\n");

                System.out.println("Introduce un numero en decimal: ");
                decimalOriginal = entrada.nextInt();

                copia = decimalOriginal;

                // ! for para obtener el modulo de copia (numero original) y anadirlo a una
                for (int i = 0; copia > 0; i++) {
                  temporal = copia % 2;
                  resultado += Integer.toString(temporal);
                  copia /= 2;
                }

                // ! for para sacar la reversa de 'resultado'
                for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                  revResultado += resultado.charAt(i);
                }

                System.out.println("El numero decimal (" + decimalOriginal + ") es en binario: " + revResultado);

                break;
              case 2: // ? DECIMAL A OCTAL ###

                System.out.println("\nDECIMAL A OCTAL\n");

                System.out.println("Introduce un numero en decimal: ");
                decimalOriginal = entrada.nextInt();

                copia = decimalOriginal;

                // ! for para obtener el modulo de copia (numero original) y anadirlo a una
                for (int i = 0; copia > 0; i++) {
                  temporal = copia % 8;
                  resultado += Integer.toString(temporal);
                  copia /= 8;
                }

                // ! for para sacar la reversa de 'resultado'
                for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                  revResultado += resultado.charAt(i);
                }

                System.out.println("El numero decimal (" + decimalOriginal + ") es en octal: " + revResultado);

                break;
              case 3: // ? DECIMAL A HEXADECIMAL ###

                System.out.println("\nDECIMAL A HEXADECIMAL\n");

                System.out.println("Introduce un numero en decimal: ");
                decimalOriginal = entrada.nextInt();

                copia = decimalOriginal;

                // ! for para obtener el modulo de copia (numero original) y anadirlo a una
                for (int i = 0; copia > 0; i++) {
                  temporal = copia % 16;

                  // ! evaluar cuando un resto sea mayor a 9
                  if (temporal == 10) {
                    resultado += "A";
                  } else if (temporal == 11) {
                    resultado += "B";
                  } else if (temporal == 12) {
                    resultado += "C";
                  } else if (temporal == 13) {
                    resultado += "D";
                  } else if (temporal == 14) {
                    resultado += "E";
                  } else if (temporal == 15) {
                    resultado += "F";
                  } else {
                    resultado += Integer.toString(temporal);
                  }
                  copia /= 16;
                }

                // ! for para sacar la reversa de 'resultado'
                for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                  revResultado += resultado.charAt(i);
                }

                System.out.println("El numero decimal (" + decimalOriginal + ") es en hexadecimal: " + revResultado);

                break;
              case 4: // ? BINARIO A DECIMAL ###

                System.out.println("\nBINARIO A DECIMAL\n");

                System.out.println("Introduce un numero en binario: ");
                binarioOriginal = entrada.nextInt();

                copia = binarioOriginal;

                for (int i = 0; copia > 0; i++) {

                  temporal = copia % 10;

                  if (temporal > 1) {
                    sepude = false;
                  }

                  // ! Exponente adecuado.
                  p = Math.pow(2, i);

                  // ! Multiplicar y agregarlo al resultado.
                  resultadoDec += (temporal * p);
                  copia = copia / 10;

                }
                if (sepude) {
                  System.out.println("El número binario (" + binarioOriginal + ") es en decimal: " + resultadoDec);
                } else {
                  System.out.println("El numero que ingresas no es binario.");
                }

                // ! PRIMERO PASAR DE BINARIO A DECIMAL

                break;
              case 5: // ? BINARIO A OCTAL ###

                System.out.println("\nBINARIO A OCTAL\n");

                System.out.println("Introduce un numero en binario: ");
                binarioOriginal = entrada.nextInt();

                copia = binarioOriginal;

                for (int i = 0; copia > 0; i++) {

                  temporal = copia % 10;

                  if (temporal > 1) {
                    sepude = false;
                  }

                  p = Math.pow(2, i);

                  resultadoDec += (temporal * p);
                  copia = copia / 10;

                }
                if (sepude) { // ! aqui pasa a decimal a octal

                  copia = resultadoDec;

                  // ! for para obtener el modulo de copia (numero original) y anadirlo a una
                  for (int i = 0; copia > 0; i++) {
                    temporal = copia % 8;
                    resultado += Integer.toString(temporal);
                    copia /= 8;
                  }

                  // ! for para sacar la reversa de 'resultado'
                  for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                    revResultado += resultado.charAt(i);
                  }

                  System.out.println("El numero binario (" + binarioOriginal + ") es en octal:  " + revResultado);
                } else {
                  System.out.println("El numero que ingresas no es binario.");
                }
                break;
              case 6: // ? BINARIO A HEXADECIMAL ###

                System.out.println("\nBINARIO A HEXADECIMAL\n");

                System.out.println("Introduce un numero en binario: ");
                binarioOriginal = entrada.nextInt();

                copia = binarioOriginal;

                for (int i = 0; copia > 0; i++) {

                  temporal = copia % 10;

                  if (temporal > 1) {
                    sepude = false;
                  }

                  // ! Exponente adecuado.
                  p = Math.pow(2, i);

                  // ! Multiplicar y agregarlo al resultado.
                  resultadoDec += (temporal * p);
                  copia = copia / 10;

                }
                if (sepude) {
                  copia = resultadoDec;

                  // ! for para obtener el modulo de copia (numero original) y anadirlo a una
                  for (int i = 0; copia > 0; i++) {
                    temporal = copia % 16;

                    // ! evaluar cuando un resto sea mayor a 9
                    if (temporal == 10) {
                      resultado += "A";
                    } else if (temporal == 11) {
                      resultado += "B";
                    } else if (temporal == 12) {
                      resultado += "C";
                    } else if (temporal == 13) {
                      resultado += "D";
                    } else if (temporal == 14) {
                      resultado += "E";
                    } else if (temporal == 15) {
                      resultado += "F";
                    } else {
                      resultado += Integer.toString(temporal);
                    }
                    copia /= 16;
                  }

                  // ! for para sacar la reversa de 'resultado'
                  for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                    revResultado += resultado.charAt(i);
                  }

                  System.out.println("El numero binario (" + binarioOriginal + ") es en hexadecimal:  " + revResultado);
                } else {
                  System.out.println("El numero que ingresas no es binario.");
                }

                break;

              case 7: // ? OCTAL A DECIMAL ###
                System.out.println("\nOCTAL A DECIMAL\n");

                System.out.println("Introduce un numero en octal: ");
                binarioOriginal = entrada.nextInt();

                copia = binarioOriginal;

                for (int i = 0; copia > 0; i++) {

                  temporal = copia % 10;

                  // ! se comprueba si es un numero valido
                  if (temporal > 7) {
                    sepude = false;
                  }

                  // ! Exponente adecuado.
                  p = Math.pow(8, i);

                  // ! Multiplicar y agregarlo al resultado.
                  resultadoDec += (temporal * p);
                  copia = copia / 10;

                }
                if (sepude) {
                  System.out.println("El número octal (" + binarioOriginal + ") es en decimal: " + resultadoDec);
                } else {
                  System.out.println("El numero que ingresas no es octal.");
                }

                break;
              case 8: // ? OCTAL A BINARIO ###
                System.out.println("\nOCTAL A BINARIO\n");

                System.out.println("Introduce un numero en octal: ");
                binarioOriginal = entrada.nextInt();

                copia = binarioOriginal;

                for (int i = 0; copia > 0; i++) {

                  temporal = copia % 10;

                  // ! se comprueba si es un numero valido
                  if (temporal > 7) {
                    sepude = false;
                  }

                  // ! Exponente adecuado.
                  p = Math.pow(8, i);

                  // ! Multiplicar y agregarlo al resultado.
                  resultadoDec += (temporal * p);
                  copia = copia / 10;

                }
                if (sepude) {
                  copia = resultadoDec;

                  // ! for para obtener el modulo de copia (numero original) y anadirlo a una
                  for (int i = 0; copia > 0; i++) {
                    temporal = copia % 2;
                    resultado += Integer.toString(temporal);
                    copia /= 2;
                  }

                  // ! for para sacar la reversa de 'resultado'
                  for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                    revResultado += resultado.charAt(i);
                  }

                  System.out.println("El numero octal (" + binarioOriginal + ") es en binario: " + revResultado);
                } else {
                  System.out.println("El numero que ingresas no es octal.");
                }
                break;
              case 9: // ? OCTAL A HEXADECIMAL ###
                System.out.println("\nOCTAL A HEXADECIMAL\n");

                System.out.println("Introduce un numero en octal: ");
                binarioOriginal = entrada.nextInt();

                copia = binarioOriginal;

                for (int i = 0; copia > 0; i++) {

                  temporal = copia % 10;

                  // ! se comprueba si es un numero valido
                  if (temporal > 7) {
                    sepude = false;
                  }

                  // ! Exponente adecuado.
                  p = Math.pow(8, i);

                  // ! Multiplicar y agregarlo al resultado.
                  resultadoDec += (temporal * p);
                  copia = copia / 10;

                }
                if (sepude) {
                  copia = resultadoDec;

                  // ! for para obtener el modulo de copia (numero original) y anadirlo a una
                  for (int i = 0; copia > 0; i++) {
                    temporal = copia % 16;

                    // ! evaluar cuando un resto sea mayor a 9
                    if (temporal == 10) {
                      resultado += "A";
                    } else if (temporal == 11) {
                      resultado += "B";
                    } else if (temporal == 12) {
                      resultado += "C";
                    } else if (temporal == 13) {
                      resultado += "D";
                    } else if (temporal == 14) {
                      resultado += "E";
                    } else if (temporal == 15) {
                      resultado += "F";
                    } else {
                      resultado += Integer.toString(temporal);
                    }
                    copia /= 16;
                  }

                  // ! for para sacar la reversa de 'resultado'
                  for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                    revResultado += resultado.charAt(i);
                  }

                  System.out.println("El número octal (" + binarioOriginal + ") es en hexadecimal: " + revResultado);

                } else {
                  System.out.println("El numero que ingresas no es octal.");
                }
                break;
              case 10: // ? HEXADECIMAL A DECIMAL

                System.out.println("\nHEXADECIMAL A DECIMAL\n");
                Scanner lector;
                String originalHex, copiaHex = "";
                int resultadoHex;

                lector = new Scanner(System.in);

                System.out.print("Dame el número en hexadecimal: ");
                originalHex = lector.nextLine();

                resultadoHex = 0;

                // ! for para sacar la reversa de 'resultado'
                for (int i = originalHex.length() - 1; originalHex.length() != copiaHex.length(); i--) {
                  copiaHex += originalHex.charAt(i);
                }
                for (int i = copiaHex.length() - 1; i >= 0; i--) {

                  // ! evaluar cuando un resto sea mayor a 9
                  if (copiaHex.charAt(i) == 'A') {
                    temporal = 10;
                  } else if (copiaHex.charAt(i) == 'B') {
                    temporal = 11;
                  } else if (copiaHex.charAt(i) == 'C') {
                    temporal = 12;
                  } else if (copiaHex.charAt(i) == 'D') {
                    temporal = 13;
                  } else if (copiaHex.charAt(i) == 'E') {
                    temporal = 14;
                  } else if (copiaHex.charAt(i) == 'F') {
                    temporal = 15;
                  } else if (copiaHex.charAt(i) == '1') {
                    temporal = 1;
                  } else if (copiaHex.charAt(i) == '2') {
                    temporal = 2;
                  } else if (copiaHex.charAt(i) == '3') {
                    temporal = 3;
                  } else if (copiaHex.charAt(i) == '4') {
                    temporal = 4;
                  } else if (copiaHex.charAt(i) == '5') {
                    temporal = 5;
                  } else if (copiaHex.charAt(i) == '6') {
                    temporal = 6;
                  } else if (copiaHex.charAt(i) == '7') {
                    temporal = 7;
                  } else if (copiaHex.charAt(i) == '8') {
                    temporal = 8;
                  } else if (copiaHex.charAt(i) == '9') {
                    temporal = 9;
                  } else {
                    sepude = false;
                  }

                  p = Math.pow(16, i);

                  resultadoHex += (temporal * p);
                }
                if (sepude) {
                  System.out.println("El número hexadecimal (" + originalHex + ") es en decimal: " + resultadoHex);
                } else {
                  System.out.println("El numero que ingresas no es hexadecimal.");
                }

                break;
              case 11: // ? HEXADECIMAL A BINARIO
                System.out.println("\nHEXADECIMAL A BINARIO\n");
                originalHex = "";
                copiaHex = "";
                resultadoHex = 0;

                lector = new Scanner(System.in);

                System.out.print("Dame el número en hexadecimal: ");
                originalHex = lector.nextLine();

                resultadoHex = 0;

                // ! for para sacar la reversa de 'resultado'
                for (int i = originalHex.length() - 1; originalHex.length() != copiaHex.length(); i--) {
                  copiaHex += originalHex.charAt(i);
                }
                for (int i = copiaHex.length() - 1; i >= 0; i--) {

                  // ! evaluar cuando un resto sea mayor a 9
                  if (copiaHex.charAt(i) == 'A') {
                    temporal = 10;
                  } else if (copiaHex.charAt(i) == 'B') {
                    temporal = 11;
                  } else if (copiaHex.charAt(i) == 'C') {
                    temporal = 12;
                  } else if (copiaHex.charAt(i) == 'D') {
                    temporal = 13;
                  } else if (copiaHex.charAt(i) == 'E') {
                    temporal = 14;
                  } else if (copiaHex.charAt(i) == 'F') {
                    temporal = 15;
                  } else if (copiaHex.charAt(i) == '1') {
                    temporal = 1;
                  } else if (copiaHex.charAt(i) == '2') {
                    temporal = 2;
                  } else if (copiaHex.charAt(i) == '3') {
                    temporal = 3;
                  } else if (copiaHex.charAt(i) == '4') {
                    temporal = 4;
                  } else if (copiaHex.charAt(i) == '5') {
                    temporal = 5;
                  } else if (copiaHex.charAt(i) == '6') {
                    temporal = 6;
                  } else if (copiaHex.charAt(i) == '7') {
                    temporal = 7;
                  } else if (copiaHex.charAt(i) == '8') {
                    temporal = 8;
                  } else if (copiaHex.charAt(i) == '9') {
                    temporal = 9;
                  } else {
                    sepude = false;
                  }

                  p = Math.pow(16, i);

                  resultadoHex += (temporal * p);
                }
                if (sepude) {
                  copia = resultadoHex;

                  // ! for para obtener el modulo de copia (numero original) y anadirlo a una
                  for (int i = 0; copia > 0; i++) {
                    temporal = copia % 2;
                    resultado += Integer.toString(temporal);
                    copia /= 2;
                  }

                  // ! for para sacar la reversa de 'resultado'
                  for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                    revResultado += resultado.charAt(i);
                  }

                  System.out.println("El número hexadecimal (" + originalHex + ") es en binario: " + revResultado);
                } else {
                  System.out.println("El numero que ingresas no es hexadecimal.");
                }

                break;
              case 12: // ? HEXADECIMAL A OCTAL

                System.out.println("\nHEXADECIMAL A OCTAL\n");
                originalHex = "";
                copiaHex = "";
                resultadoHex = 0;

                lector = new Scanner(System.in);

                System.out.print("Dame el número en hexadecimal: ");
                originalHex = lector.nextLine();

                resultadoHex = 0;

                // ! for para sacar la reversa de 'resultado'
                for (int i = originalHex.length() - 1; originalHex.length() != copiaHex.length(); i--) {
                  copiaHex += originalHex.charAt(i);
                }
                for (int i = copiaHex.length() - 1; i >= 0; i--) {

                  // ! evaluar cuando un resto sea mayor a 9
                  if (copiaHex.charAt(i) == 'A') {
                    temporal = 10;
                  } else if (copiaHex.charAt(i) == 'B') {
                    temporal = 11;
                  } else if (copiaHex.charAt(i) == 'C') {
                    temporal = 12;
                  } else if (copiaHex.charAt(i) == 'D') {
                    temporal = 13;
                  } else if (copiaHex.charAt(i) == 'E') {
                    temporal = 14;
                  } else if (copiaHex.charAt(i) == 'F') {
                    temporal = 15;
                  } else if (copiaHex.charAt(i) == '1') {
                    temporal = 1;
                  } else if (copiaHex.charAt(i) == '2') {
                    temporal = 2;
                  } else if (copiaHex.charAt(i) == '3') {
                    temporal = 3;
                  } else if (copiaHex.charAt(i) == '4') {
                    temporal = 4;
                  } else if (copiaHex.charAt(i) == '5') {
                    temporal = 5;
                  } else if (copiaHex.charAt(i) == '6') {
                    temporal = 6;
                  } else if (copiaHex.charAt(i) == '7') {
                    temporal = 7;
                  } else if (copiaHex.charAt(i) == '8') {
                    temporal = 8;
                  } else if (copiaHex.charAt(i) == '9') {
                    temporal = 9;
                  } else {
                    sepude = false;
                  }

                  p = Math.pow(16, i);

                  resultadoHex += (temporal * p);
                }
                if (sepude) {
                  copia = resultadoHex;

                  // ! for para obtener el modulo de copia (numero original) y anadirlo a una
                  for (int i = 0; copia > 0; i++) {
                    temporal = copia % 8;
                    resultado += Integer.toString(temporal);
                    copia /= 8;
                  }

                  // ! for para sacar la reversa de 'resultado'
                  for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                    revResultado += resultado.charAt(i);
                  }

                  System.out.println("El número binario (" + originalHex + ") es en octal: " + revResultado);
                } else {
                  System.out.println("El numero que ingresas no es hexadecimal.");
                }
                break;
              default:
                System.out.println("Opcion invalida, prueba de nuevo. ");
            }

            System.out.println();
            System.out.println("Quieres hacer otra conversion? SI[1] / NO[0]");
            seguirCalc = entrada.nextInt();

            if (seguirCalc == 0) {
              calculando = false;
              System.out.println("\nHasta luego :)\n");
            }

          }

        } else {
          System.out.println("\nEse no es un numero valido\n");
        }
      }

      // ! OPCIONES PARA EL PROFESOR
    } else if (user.equals("icc") && password.equals("profesor")) {

      while (calculando) {

        // *VARIABLES PARA LA CALCULADORA [GENERALES]
        int decimalOriginal, copia, temporal = 0;
        String resultado = "";
        String revResultado = "";

        int binarioOriginal;
        double p;
        int resultadoDec = 0;
        Boolean sepude = true;

        System.out.println("\nHola profesora, estamos en la calculadora :)");
        System.out.println("Que cambio de base desea realizar [1-12]?\n ");

        System.out.println("1. DECIMAL A BINARIO ");
        System.out.println("2. DECIMAL A OCTAL ");
        System.out.println("3. DECIMAL A HEXADECIMAL ");
        System.out.println("4. BINARIO A DECIMAL ");
        System.out.println("5. BINARIO A OCTAL ");
        System.out.println("6. BINARIO A HEXADECIMAL ");
        System.out.println("7. OCTAL A DECIMAL ");
        System.out.println("8. OCTAL A BINARIO ");
        System.out.println("9. OCTAL A HEXADECIMAL ");
        System.out.println("10. HEXADECIMAL A DECIMAL ");
        System.out.println("11. HEXADECIMAL A BINARIO ");
        System.out.println("12. HEXADECIMAL A OCTAL \n");

        eleccionCalculadora = entrada.nextInt();

        switch (eleccionCalculadora) {

          case 1: // ? DECIMAL A BINARIO ###
            System.out.println("\nDECIMAL A BINARIO\n");

            System.out.println("Introduce un numero en decimal: ");
            decimalOriginal = entrada.nextInt();

            copia = decimalOriginal;

            // ! for para obtener el modulo de copia (numero original) y anadirlo a una
            for (int i = 0; copia > 0; i++) {
              temporal = copia % 2;
              resultado += Integer.toString(temporal);
              copia /= 2;
            }

            // ! for para sacar la reversa de 'resultado'
            for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
              revResultado += resultado.charAt(i);
            }

            System.out.println("El numero decimal (" + decimalOriginal + ") es en binario: " + revResultado);

            break;
          case 2: // ? DECIMAL A OCTAL ###

            System.out.println("\nDECIMAL A OCTAL\n");

            System.out.println("Introduce un numero en decimal: ");
            decimalOriginal = entrada.nextInt();

            copia = decimalOriginal;

            // ! for para obtener el modulo de copia (numero original) y anadirlo a una
            for (int i = 0; copia > 0; i++) {
              temporal = copia % 8;
              resultado += Integer.toString(temporal);
              copia /= 8;
            }

            // ! for para sacar la reversa de 'resultado'
            for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
              revResultado += resultado.charAt(i);
            }

            System.out.println("El numero decimal (" + decimalOriginal + ") es en octal: " + revResultado);

            break;
          case 3: // ? DECIMAL A HEXADECIMAL ###

            System.out.println("\nDECIMAL A HEXADECIMAL\n");

            System.out.println("Introduce un numero en decimal: ");
            decimalOriginal = entrada.nextInt();

            copia = decimalOriginal;

            // ! for para obtener el modulo de copia (numero original) y anadirlo a una
            for (int i = 0; copia > 0; i++) {
              temporal = copia % 16;

              // ! evaluar cuando un resto sea mayor a 9
              if (temporal == 10) {
                resultado += "A";
              } else if (temporal == 11) {
                resultado += "B";
              } else if (temporal == 12) {
                resultado += "C";
              } else if (temporal == 13) {
                resultado += "D";
              } else if (temporal == 14) {
                resultado += "E";
              } else if (temporal == 15) {
                resultado += "F";
              } else {
                resultado += Integer.toString(temporal);
              }
              copia /= 16;
            }

            // ! for para sacar la reversa de 'resultado'
            for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
              revResultado += resultado.charAt(i);
            }

            System.out.println("El numero decimal (" + decimalOriginal + ") es en hexadecimal: " + revResultado);

            break;
          case 4: // ? BINARIO A DECIMAL ###

            System.out.println("\nBINARIO A DECIMAL\n");

            System.out.println("Introduce un numero en binario: ");
            binarioOriginal = entrada.nextInt();

            copia = binarioOriginal;

            for (int i = 0; copia > 0; i++) {

              temporal = copia % 10;

              if (temporal > 1) {
                sepude = false;
              }

              // ! Exponente adecuado.
              p = Math.pow(2, i);

              // ! Multiplicar y agregarlo al resultado.
              resultadoDec += (temporal * p);
              copia = copia / 10;

            }
            if (sepude) {
              System.out.println("El número binario (" + binarioOriginal + ") es en decimal: " + resultadoDec);
            } else {
              System.out.println("El numero que ingresas no es binario.");
            }

            // ! PRIMERO PASAR DE BINARIO A DECIMAL

            break;
          case 5: // ? BINARIO A OCTAL ###

            System.out.println("\nBINARIO A OCTAL\n");

            System.out.println("Introduce un numero en binario: ");
            binarioOriginal = entrada.nextInt();

            copia = binarioOriginal;

            for (int i = 0; copia > 0; i++) {

              temporal = copia % 10;

              if (temporal > 1) {
                sepude = false;
              }

              p = Math.pow(2, i);

              resultadoDec += (temporal * p);
              copia = copia / 10;

            }
            if (sepude) { // ! aqui pasa a decimal a octal

              copia = resultadoDec;

              // ! for para obtener el modulo de copia (numero original) y anadirlo a una
              for (int i = 0; copia > 0; i++) {
                temporal = copia % 8;
                resultado += Integer.toString(temporal);
                copia /= 8;
              }

              // ! for para sacar la reversa de 'resultado'
              for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                revResultado += resultado.charAt(i);
              }

              System.out.println("El numero binario (" + binarioOriginal + ") es en octal:  " + revResultado);
            } else {
              System.out.println("El numero que ingresas no es binario.");
            }
            break;
          case 6: // ? BINARIO A HEXADECIMAL ###

            System.out.println("\nBINARIO A HEXADECIMAL\n");

            System.out.println("Introduce un numero en binario: ");
            binarioOriginal = entrada.nextInt();

            copia = binarioOriginal;

            for (int i = 0; copia > 0; i++) {

              temporal = copia % 10;

              if (temporal > 1) {
                sepude = false;
              }

              // ! Exponente adecuado.
              p = Math.pow(2, i);

              // ! Multiplicar y agregarlo al resultado.
              resultadoDec += (temporal * p);
              copia = copia / 10;

            }
            if (sepude) {
              copia = resultadoDec;

              // ! for para obtener el modulo de copia (numero original) y anadirlo a una
              for (int i = 0; copia > 0; i++) {
                temporal = copia % 16;

                // ! evaluar cuando un resto sea mayor a 9
                if (temporal == 10) {
                  resultado += "A";
                } else if (temporal == 11) {
                  resultado += "B";
                } else if (temporal == 12) {
                  resultado += "C";
                } else if (temporal == 13) {
                  resultado += "D";
                } else if (temporal == 14) {
                  resultado += "E";
                } else if (temporal == 15) {
                  resultado += "F";
                } else {
                  resultado += Integer.toString(temporal);
                }
                copia /= 16;
              }

              // ! for para sacar la reversa de 'resultado'
              for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                revResultado += resultado.charAt(i);
              }

              System.out.println("El numero binario (" + binarioOriginal + ") es en hexadecimal:  " + revResultado);
            } else {
              System.out.println("El numero que ingresas no es binario.");
            }

            break;

          case 7: // ? OCTAL A DECIMAL ###
            System.out.println("\nOCTAL A DECIMAL\n");

            System.out.println("Introduce un numero en octal: ");
            binarioOriginal = entrada.nextInt();

            copia = binarioOriginal;

            for (int i = 0; copia > 0; i++) {

              temporal = copia % 10;

              // ! se comprueba si es un numero valido
              if (temporal > 7) {
                sepude = false;
              }

              // ! Exponente adecuado.
              p = Math.pow(8, i);

              // ! Multiplicar y agregarlo al resultado.
              resultadoDec += (temporal * p);
              copia = copia / 10;

            }
            if (sepude) {
              System.out.println("El número octal (" + binarioOriginal + ") es en decimal: " + resultadoDec);
            } else {
              System.out.println("El numero que ingresas no es octal.");
            }

            break;
          case 8: // ? OCTAL A BINARIO ###
            System.out.println("\nOCTAL A BINARIO\n");

            System.out.println("Introduce un numero en octal: ");
            binarioOriginal = entrada.nextInt();

            copia = binarioOriginal;

            for (int i = 0; copia > 0; i++) {

              temporal = copia % 10;

              // ! se comprueba si es un numero valido
              if (temporal > 7) {
                sepude = false;
              }

              // ! Exponente adecuado.
              p = Math.pow(8, i);

              // ! Multiplicar y agregarlo al resultado.
              resultadoDec += (temporal * p);
              copia = copia / 10;

            }
            if (sepude) {
              copia = resultadoDec;

              // ! for para obtener el modulo de copia (numero original) y anadirlo a una
              for (int i = 0; copia > 0; i++) {
                temporal = copia % 2;
                resultado += Integer.toString(temporal);
                copia /= 2;
              }

              // ! for para sacar la reversa de 'resultado'
              for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                revResultado += resultado.charAt(i);
              }

              System.out.println("El numero octal (" + binarioOriginal + ") es en binario: " + revResultado);
            } else {
              System.out.println("El numero que ingresas no es octal.");
            }
            break;
          case 9: // ? OCTAL A HEXADECIMAL ###
            System.out.println("\nOCTAL A HEXADECIMAL\n");

            System.out.println("Introduce un numero en octal: ");
            binarioOriginal = entrada.nextInt();

            copia = binarioOriginal;

            for (int i = 0; copia > 0; i++) {

              temporal = copia % 10;

              // ! se comprueba si es un numero valido
              if (temporal > 7) {
                sepude = false;
              }

              // ! Exponente adecuado.
              p = Math.pow(8, i);

              // ! Multiplicar y agregarlo al resultado.
              resultadoDec += (temporal * p);
              copia = copia / 10;

            }
            if (sepude) {
              copia = resultadoDec;

              // ! for para obtener el modulo de copia (numero original) y anadirlo a una
              for (int i = 0; copia > 0; i++) {
                temporal = copia % 16;

                // ! evaluar cuando un resto sea mayor a 9
                if (temporal == 10) {
                  resultado += "A";
                } else if (temporal == 11) {
                  resultado += "B";
                } else if (temporal == 12) {
                  resultado += "C";
                } else if (temporal == 13) {
                  resultado += "D";
                } else if (temporal == 14) {
                  resultado += "E";
                } else if (temporal == 15) {
                  resultado += "F";
                } else {
                  resultado += Integer.toString(temporal);
                }
                copia /= 16;
              }

              // ! for para sacar la reversa de 'resultado'
              for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                revResultado += resultado.charAt(i);
              }

              System.out.println("El número octal (" + binarioOriginal + ") es en hexadecimal: " + revResultado);

            } else {
              System.out.println("El numero que ingresas no es octal.");
            }
            break;
          case 10: // ? HEXADECIMAL A DECIMAL

            System.out.println("\nHEXADECIMAL A DECIMAL\n");
            Scanner lector;
            String originalHex, copiaHex = "";
            int resultadoHex;

            lector = new Scanner(System.in);

            System.out.print("Dame el número en hexadecimal: ");
            originalHex = lector.nextLine();

            resultadoHex = 0;

            // ! for para sacar la reversa de 'resultado'
            for (int i = originalHex.length() - 1; originalHex.length() != copiaHex.length(); i--) {
              copiaHex += originalHex.charAt(i);
            }
            for (int i = copiaHex.length() - 1; i >= 0; i--) {

              // ! evaluar cuando un resto sea mayor a 9
              if (copiaHex.charAt(i) == 'A') {
                temporal = 10;
              } else if (copiaHex.charAt(i) == 'B') {
                temporal = 11;
              } else if (copiaHex.charAt(i) == 'C') {
                temporal = 12;
              } else if (copiaHex.charAt(i) == 'D') {
                temporal = 13;
              } else if (copiaHex.charAt(i) == 'E') {
                temporal = 14;
              } else if (copiaHex.charAt(i) == 'F') {
                temporal = 15;
              } else if (copiaHex.charAt(i) == '1') {
                temporal = 1;
              } else if (copiaHex.charAt(i) == '2') {
                temporal = 2;
              } else if (copiaHex.charAt(i) == '3') {
                temporal = 3;
              } else if (copiaHex.charAt(i) == '4') {
                temporal = 4;
              } else if (copiaHex.charAt(i) == '5') {
                temporal = 5;
              } else if (copiaHex.charAt(i) == '6') {
                temporal = 6;
              } else if (copiaHex.charAt(i) == '7') {
                temporal = 7;
              } else if (copiaHex.charAt(i) == '8') {
                temporal = 8;
              } else if (copiaHex.charAt(i) == '9') {
                temporal = 9;
              } else {
                sepude = false;
              }

              p = Math.pow(16, i);

              resultadoHex += (temporal * p);
            }
            if (sepude) {
              System.out.println("El número hexadecimal (" + originalHex + ") es en decimal: " + resultadoHex);
            } else {
              System.out.println("El numero que ingresas no es hexadecimal.");
            }

            break;
          case 11: // ? HEXADECIMAL A BINARIO
            System.out.println("\nHEXADECIMAL A BINARIO\n");
            originalHex = "";
            copiaHex = "";
            resultadoHex = 0;

            lector = new Scanner(System.in);

            System.out.print("Dame el número en hexadecimal: ");
            originalHex = lector.nextLine();

            resultadoHex = 0;

            // ! for para sacar la reversa de 'resultado'
            for (int i = originalHex.length() - 1; originalHex.length() != copiaHex.length(); i--) {
              copiaHex += originalHex.charAt(i);
            }
            for (int i = copiaHex.length() - 1; i >= 0; i--) {

              // ! evaluar cuando un resto sea mayor a 9
              if (copiaHex.charAt(i) == 'A') {
                temporal = 10;
              } else if (copiaHex.charAt(i) == 'B') {
                temporal = 11;
              } else if (copiaHex.charAt(i) == 'C') {
                temporal = 12;
              } else if (copiaHex.charAt(i) == 'D') {
                temporal = 13;
              } else if (copiaHex.charAt(i) == 'E') {
                temporal = 14;
              } else if (copiaHex.charAt(i) == 'F') {
                temporal = 15;
              } else if (copiaHex.charAt(i) == '1') {
                temporal = 1;
              } else if (copiaHex.charAt(i) == '2') {
                temporal = 2;
              } else if (copiaHex.charAt(i) == '3') {
                temporal = 3;
              } else if (copiaHex.charAt(i) == '4') {
                temporal = 4;
              } else if (copiaHex.charAt(i) == '5') {
                temporal = 5;
              } else if (copiaHex.charAt(i) == '6') {
                temporal = 6;
              } else if (copiaHex.charAt(i) == '7') {
                temporal = 7;
              } else if (copiaHex.charAt(i) == '8') {
                temporal = 8;
              } else if (copiaHex.charAt(i) == '9') {
                temporal = 9;
              } else {
                sepude = false;
              }

              p = Math.pow(16, i);

              resultadoHex += (temporal * p);
            }
            if (sepude) {
              copia = resultadoHex;

              // ! for para obtener el modulo de copia (numero original) y anadirlo a una
              for (int i = 0; copia > 0; i++) {
                temporal = copia % 2;
                resultado += Integer.toString(temporal);
                copia /= 2;
              }

              // ! for para sacar la reversa de 'resultado'
              for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                revResultado += resultado.charAt(i);
              }

              System.out.println("El número hexadecimal (" + originalHex + ") es en binario: " + revResultado);
            } else {
              System.out.println("El numero que ingresas no es hexadecimal.");
            }

            break;
          case 12: // ? HEXADECIMAL A OCTAL

            System.out.println("\nHEXADECIMAL A OCTAL\n");
            originalHex = "";
            copiaHex = "";
            resultadoHex = 0;

            lector = new Scanner(System.in);

            System.out.print("Dame el número en hexadecimal: ");
            originalHex = lector.nextLine();

            resultadoHex = 0;

            // ! for para sacar la reversa de 'resultado'
            for (int i = originalHex.length() - 1; originalHex.length() != copiaHex.length(); i--) {
              copiaHex += originalHex.charAt(i);
            }
            for (int i = copiaHex.length() - 1; i >= 0; i--) {

              // ! evaluar cuando un resto sea mayor a 9
              if (copiaHex.charAt(i) == 'A') {
                temporal = 10;
              } else if (copiaHex.charAt(i) == 'B') {
                temporal = 11;
              } else if (copiaHex.charAt(i) == 'C') {
                temporal = 12;
              } else if (copiaHex.charAt(i) == 'D') {
                temporal = 13;
              } else if (copiaHex.charAt(i) == 'E') {
                temporal = 14;
              } else if (copiaHex.charAt(i) == 'F') {
                temporal = 15;
              } else if (copiaHex.charAt(i) == '1') {
                temporal = 1;
              } else if (copiaHex.charAt(i) == '2') {
                temporal = 2;
              } else if (copiaHex.charAt(i) == '3') {
                temporal = 3;
              } else if (copiaHex.charAt(i) == '4') {
                temporal = 4;
              } else if (copiaHex.charAt(i) == '5') {
                temporal = 5;
              } else if (copiaHex.charAt(i) == '6') {
                temporal = 6;
              } else if (copiaHex.charAt(i) == '7') {
                temporal = 7;
              } else if (copiaHex.charAt(i) == '8') {
                temporal = 8;
              } else if (copiaHex.charAt(i) == '9') {
                temporal = 9;
              } else {
                sepude = false;
              }

              p = Math.pow(16, i);

              resultadoHex += (temporal * p);
            }
            if (sepude) {
              copia = resultadoHex;

              // ! for para obtener el modulo de copia (numero original) y anadirlo a una
              for (int i = 0; copia > 0; i++) {
                temporal = copia % 8;
                resultado += Integer.toString(temporal);
                copia /= 8;
              }

              // ! for para sacar la reversa de 'resultado'
              for (int i = resultado.length() - 1; resultado.length() != revResultado.length(); i--) {
                revResultado += resultado.charAt(i);
              }

              System.out.println("El número binario (" + originalHex + ") es en octal: " + revResultado);
            } else {
              System.out.println("El numero que ingresas no es hexadecimal.");
            }
            break;
          default:
            System.out.println("Opcion invalida, prueba de nuevo. ");
        }

        System.out.println();
        System.out.println("Quiere hacer otra conversion? SI[1] / NO[0]");
        seguirCalc = entrada.nextInt();

        if (seguirCalc == 0) {
          calculando = false;
          System.out.println("\nHasta luego :)\n");
        }

      }
    } else { // ! OPCION PARA USUARIO Y CONTRASENA NO VALIDOS
      System.out.println("\nEse usario y contrasena no son validos. ");
    }

    entrada.close();
  }
}