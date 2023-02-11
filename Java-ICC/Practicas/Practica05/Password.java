
import java.util.Random;

public class Password {

  // ! ATTRIBUTES
  private String sequence = "";
  private String securityLevel = "";

  // ! CONSTRUCTOR
  public Password(String sequence, String securityLevel) {
    this.sequence = sequence;
    this.securityLevel = securityLevel;
  }

  // ! toString
  public String toString() {
    return sequence + " : Seguridad " + securityLevel;
  }

  public static void main(String[] args) {

    Random random = new Random();
    Password arrayPasswords[] = new Password[10];
    char specialCharacters[] = { '*', '#', '$', '&', '+', '?', '%' };
    char lowerCase[] = { 'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
        'u', 'v', 'w', 'x', 'y', 'z' };

    // ! For principal
    for (int index = 0; index < arrayPasswords.length; index++) {
      String finalSequence = "";
      String finalPassword = "";
      String sequence = "";
      String securityLevelStr = "";

      int randomForNumberCC = random.nextInt(2);
      int randomForUppercaseCC = random.nextInt(2);

      // | ADD THE CHARACTERS TO THE SEQUENCE
      // = POSSIBLE OPTION = ADD A SINGLE NUMBER
      if (randomForNumberCC == 0) {
        int randomForNumbers = random.nextInt(10);
        sequence += Integer.valueOf(randomForNumbers);

        // = POSSIBLE OPTION = ADD TOW NUMBERS
      } else if (randomForNumberCC == 1) {
        // ? ONE NUMBER
        int randomForNumbers = random.nextInt(10);
        sequence += Integer.valueOf(randomForNumbers);

        // ? TWO NUMBERS
        randomForNumbers = random.nextInt(10);
        sequence += Integer.valueOf(randomForNumbers);
      }

      // = POSSIBLE OPTION = ADD A SINGLE UPPERCASE LETTER
      if (randomForUppercaseCC == 0) {
        String strUppercase = "";
        int randomForLetters = random.nextInt(25);
        strUppercase += lowerCase[randomForLetters];
        sequence += strUppercase.toUpperCase();

        // = POSSIBLE OPTION = ADD TWO UPPERCASE LETTERS
      } else if (randomForUppercaseCC == 1) {
        String strUppercase = "";

        // ? ONE UPPERCASE LETTER
        int randomForLetters = random.nextInt(25);
        strUppercase += lowerCase[randomForLetters];

        // ? TWO UPPERCASE LETTER
        randomForLetters = random.nextInt(25);
        strUppercase += lowerCase[randomForLetters];
        sequence += strUppercase.toUpperCase();
      }

      // | FOR TO DECIDE IF IT IS WEAK, MEDIUM OR HIGH (SECURITY LEVEL)
      if (randomForNumberCC == 0 && randomForUppercaseCC == 0) {
        securityLevelStr = "baja";
      } else if ((randomForNumberCC == 0 && randomForUppercaseCC == 1)
          || (randomForNumberCC == 1 && randomForUppercaseCC == 0)) {
        securityLevelStr = "media";
      } else if (randomForNumberCC == 1 && randomForUppercaseCC == 1) {
        securityLevelStr = "alta";
      }

      // | ADD THE SPECIAL CHARACTER
      int randomForSpecialCharacters = random.nextInt(7);
      sequence += specialCharacters[randomForSpecialCharacters];

      // | WHILE TO FILL WITH LOWERCASE LETTERS
      while (sequence.length() < 6) {
        int letterLowercase = random.nextInt(25);
        sequence += lowerCase[letterLowercase];
      }

      // | FROM STR -> ARRAY
      char arraySequence[] = new char[6];
      for (int indexStr = 0; indexStr < sequence.length(); indexStr++) {
        arraySequence[indexStr] = sequence.charAt(indexStr);
      }

      // | MIX THE ARRAY
      for (int i = 0; i < arraySequence.length; i++) {
        int randomIndexToSwap = random.nextInt(6);
        char temp = arraySequence[randomIndexToSwap];
        arraySequence[randomIndexToSwap] = arraySequence[i];
        arraySequence[i] = temp;
      }

      // | FROM ARRAY -> STR
      for (int indexToStr = 0; indexToStr < sequence.length(); indexToStr++) {
        finalSequence += arraySequence[indexToStr];
      }

      // | ADD LETTER AT THE BEGINNING AND AT THE END OF THE STRING
      int beginLetter = random.nextInt(25);
      int endLetter = random.nextInt(25);
      finalPassword = lowerCase[beginLetter] + finalSequence + lowerCase[endLetter];

      // | ADD THE GENERATED PASSWORD TO THE FINAL ARRAY
      arrayPasswords[index] = new Password(finalPassword, securityLevelStr);
    }

    // ! PRINT ALL PASSWORDS WITH THEI SECURITY LEVEL
    for (int indexFinal = 0; indexFinal < arrayPasswords.length; indexFinal++) {
      System.out.println(arrayPasswords[indexFinal]);
    }

    /*las contrasenas son objetos con dos atributos: la secuencia y el nivel de seguridad
    System.out.println(arrayPasswords[0].sequence);
    System.out.println(arrayPasswords[0].securityLevel);*/
  }
}
