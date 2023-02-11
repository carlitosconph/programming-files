public class Complemento {
  public static void main(String[] args) {
    int[] conjunto = {1,2,3,34,5};

    int[] complemento = new int[101 - conjunto.length];
    int indexComplemento = 0;
    boolean auxiliar = false;
    int indexUniverso;

    //! for para detectar si que elementos del conjunto no se agregan
    for (indexUniverso = 0; indexUniverso < 101; indexUniverso++) {
      for (int indexConjunto = 0; indexConjunto < conjunto.length; indexConjunto++) {
        if (indexUniverso != conjunto[indexConjunto]){
          auxiliar = true;
        } else {
          auxiliar = false;
          break;
        }
      }
      if(auxiliar){
        complemento[indexComplemento] = indexUniverso;
        indexComplemento++;
      }
    }

    for (int i : complemento) {
      System.out.println(i);
    }
  }

  
  
}
