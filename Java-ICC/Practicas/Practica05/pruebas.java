import java.util.Random;
public class pruebas {
  
  public static void main(String[] args) {
    char[] array = { '1', '2', '3', '4', '5', '6', '7' };
		char[] newArray = new char[7];

		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			char temp = array[randomIndexToSwap];
			newArray[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
    for (int i = 0; i < newArray.length; i++) {
      System.out.println(newArray[i]);
    }
  }
}
