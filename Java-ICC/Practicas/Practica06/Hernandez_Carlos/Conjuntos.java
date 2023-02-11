public class Conjuntos {
  public static void main(String[] args) {

    // !CONJUNTOS
    int[] conjunto1 = { 1, 2, 3, 54 };
    int[] conjunto2 = { 2, 4, 5, 6, 7 };
    System.out.println("\nConjunto A: ");
    for (int i : conjunto1) {
      System.out.print(i + ", ");
    }
    
    System.out.println("\nConjunto B: ");
    for (int i : conjunto2) {
      System.out.print(i + ", ");
    }

    // | DIFERENCIA

    int contadorDiferencia = 0;
    boolean auxiliar = false;

    // ! FOR PARA SABER EL LARGO DE MI NUEVO ARREGLO
    for (int index1 = 0; index1 < conjunto1.length; index1++) {
      for (int index2 = 0; index2 < conjunto2.length; index2++) {

        if (conjunto1[index1] != conjunto2[index2]) {
          auxiliar = true;
        } else {
          auxiliar = false;
          break;
        }
      }
      if (auxiliar) {
        contadorDiferencia++;
      }
    }

    int[] diferencia = new int[contadorDiferencia];
    int indexDiferencia = 0;

    // ! FOR PARA AGREGAR LA DIFERENCIA AL NUEVO ARREGLO
    for (int index1 = 0; index1 < conjunto1.length; index1++) {
      for (int index2 = 0; index2 < conjunto2.length; index2++) {
        if (conjunto1[index1] != conjunto2[index2]) {
          auxiliar = true;
        } else {
          auxiliar = false;
          break;
        }
      }
      if (auxiliar) {
        diferencia[indexDiferencia] = conjunto1[index1];
        indexDiferencia++;
      }
    }

    // ! IMPRIME EL NUEVO ARREGLO (DIFERENCIA)
    System.out.println("\n\nDiferencia (A-B): ");
    for (int elemento : diferencia) {
      System.out.print(elemento + ", ");
    }

    // | DIFERENCIA SIMETRICA
    int contadorDiferenciaSim = 0;
    auxiliar = false;

    // ! FOR PARA SABER EL LARGO DE MI NUEVO ARREGLO
    for (int index1 = 0; index1 < conjunto1.length; index1++) {
      for (int index2 = 0; index2 < conjunto2.length; index2++) {

        if (conjunto1[index1] != conjunto2[index2]) {
          auxiliar = true;
        } else {
          auxiliar = false;
          break;
        }
      }
      if (auxiliar) {
        contadorDiferenciaSim++;
      }
    }

    // ! FOR PARA SABER EL LARGO DE MI NUEVO ARREGLO (VICEVERSA)
    for (int index2 = 0; index2 < conjunto2.length; index2++) {
      for (int index1 = 0; index1 < conjunto1.length; index1++) {

        if (conjunto2[index2] != conjunto1[index1]) {
          auxiliar = true;
        } else {
          auxiliar = false;
          break;
        }
      }
      if (auxiliar) {
        contadorDiferenciaSim++;
      }
    }

    int[] diferenciaSimetrica = new int[contadorDiferenciaSim];

    int indexDiferenciaSim = 0;

    // ! FOR PARA AGREGAR LOS ELEMENTOS DEL CONJUNTO 1
    for (int index1 = 0; index1 < conjunto1.length; index1++) {
      for (int index2 = 0; index2 < conjunto2.length; index2++) {
        if (conjunto1[index1] != conjunto2[index2]) {
          auxiliar = true;
        } else {
          auxiliar = false;
          break;
        }
      }
      if (auxiliar) {
        diferenciaSimetrica[indexDiferenciaSim] = conjunto1[index1];
        indexDiferenciaSim++;
      }
    }
    // ! FOR PARA AGREGAR LOS ELEMENTOS DEL CONJUNTO 2
    for (int index2 = 0; index2 < conjunto2.length; index2++) {
      for (int index1 = 0; index1 < conjunto1.length; index1++) {
        if (conjunto2[index2] != conjunto1[index1]) {
          auxiliar = true;
        } else {
          auxiliar = false;
          break;
        }
      }
      if (auxiliar) {
        diferenciaSimetrica[indexDiferenciaSim] = conjunto2[index2];
        indexDiferenciaSim++;
      }
    }

    // ! IMPRIME EL NUEVO ARREGLO (DIFERENCIA SIMETRICA)
    System.out.println("\n\nDiferencia simetrica (A△B): ");
    for (int i : diferenciaSimetrica) {
      System.out.print(i + ", ");
    }

    // | COMPLEMENTO
    int[] complemento = new int[101 - conjunto1.length];
    int indexComplemento = 0;
    auxiliar = false;
    int indexUniverso;

    // ! FOR PARA DETECTAR QUE ELEMENTOS DEL CONJUNTO NO SE AGREGAN
    for (indexUniverso = 0; indexUniverso < 101; indexUniverso++) {
      for (int indexConjunto = 0; indexConjunto < conjunto1.length; indexConjunto++) {
        if (indexUniverso != conjunto1[indexConjunto]) {
          auxiliar = true;
        } else {
          auxiliar = false;
          break;
        }
      }
      if (auxiliar) {
        complemento[indexComplemento] = indexUniverso;
        indexComplemento++;
      }
    }

    // ! IMPRIME EL NUEVO ARREGLO (COMPLEMENTO)
    System.out.println("\n\nComplemento del conjunto A (A’): ");
    for (int i : complemento) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }

}
