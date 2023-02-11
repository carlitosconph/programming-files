public class DiferenciaSimetrica {
  public static void main(String[] args) {
    int[] conjunto1 = {1,2,3,54};
    int[] conjunto2 = {2,4,5,6,7};

    int contadorDiferenciaSim = 0 ;
    boolean auxiliar = false;

    //! for para chechar el largo de mi nuevo arreglo
    for (int index1 = 0; index1 < conjunto1.length; index1++) {
      for (int index2 = 0; index2 < conjunto2.length; index2++) {

        if (conjunto1[index1] != conjunto2[index2]){
          auxiliar = true;
        } else {
          auxiliar = false;
          break;
        }
      }
      if (auxiliar){
        contadorDiferenciaSim++;
      }
    }

    //! mismo for pero ahora comprobando en el arreglo restante
    for (int index2 = 0; index2 < conjunto2.length; index2++) {
      for (int index1 = 0; index1 < conjunto1.length; index1++ ) {

        if (conjunto2[index2] != conjunto1[index1]){
          auxiliar = true;
        } else {
          auxiliar = false;
          break;
        }
      }
      if (auxiliar){
        contadorDiferenciaSim++;
      }
    }

    int[] diferenciaSimetrica = new int[contadorDiferenciaSim];

    int indexDiferenciaSim = 0;

    //! for para agregar los elementos del conjunto 1
    for (int index1 = 0; index1 < conjunto1.length; index1++) {
      for (int index2 = 0; index2 < conjunto2.length; index2++) {
        if (conjunto1[index1] != conjunto2[index2]){
          auxiliar = true;
        } else {
          auxiliar = false;
          break;
        }
      }
      if (auxiliar){
        diferenciaSimetrica[indexDiferenciaSim] = conjunto1[index1];
        indexDiferenciaSim++;
      }
    }
    //! mismo for pero agregando los elementos del conjunto 2
    for (int index2 = 0; index2 < conjunto2.length; index2++) {
      for (int index1 = 0; index1 < conjunto1.length; index1++) {
        if (conjunto2[index2] != conjunto1[index1]){
          auxiliar = true;
        } else {
          auxiliar = false;
          break;
        }
      }
      if (auxiliar){
        diferenciaSimetrica[indexDiferenciaSim] = conjunto2[index2];
        indexDiferenciaSim++;
      }
    }


    for (int i : diferenciaSimetrica) {
      System.out.println(i);
    }

  }
  
}
