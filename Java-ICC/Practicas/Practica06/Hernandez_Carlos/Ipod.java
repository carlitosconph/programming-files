import java.util.Scanner;

public class Ipod {
  Cancion[] iPod = new Cancion[15];

  // ! SEE ALL SONGS
  public void allSongs() {
    int counter = 0;
    for (int i = 0; i < iPod.length; i++) {
      if (iPod[i] != null) {
        counter++;
      }
    }

    if (counter != 0) {
      System.out.println("Estas son todas tus canciones: ");
      for (int index = 0; index < iPod.length; index++) {
        if (iPod[index] != null) {
          System.out.println(iPod[index]);
        }
      }
    } else {
      System.out.println("No tienes canciones. ");
    }

  }

  // ! ADD SONG
  public void addSong() {

    // | CHECK FOR SPACE (15 SONGS OR 1000 SECONDS)
    boolean save = true;
    int counter = 0;
    int maxSeconds = 0;

    for (int index = 0; index < iPod.length; index++) {
      if (iPod[index] != null) {
        maxSeconds += iPod[index].secondsDuration;
      }
      if (iPod[index] == null) {
        counter++;
      }
    }

    if (counter != 0 && maxSeconds <= 1000) {
      save = true;
    } else {
      save = false;
    }

    // | ADD THE SONG IF THERE IS SPACE

    if (save) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Escribe el titulo de la cancion: ");
      String newTitle = scanner.nextLine();
      System.out.println("Escribe el interprete de la cancion: ");
      String newAuthor = scanner.nextLine();
      System.out.println("Escribe la duracion de la cancion en segundos: ");
      Scanner scannerInt = new Scanner(System.in);
      int newSecondsDuration = scannerInt.nextInt();

      if (newSecondsDuration <= (1000 - maxSeconds)) {
        Cancion newSong = new Cancion(newAuthor, newTitle, newSecondsDuration);

        for (int index = 0; index < iPod.length; index++) {
          if (iPod[index] == null) {
            iPod[index] = newSong;
            break;
          }
        }
      } else {
        System.out.println("La cancion que quieres guardar dura mas de la duracion que te queda:(");
      }
    } else {
      System.out.println(
          "Solo puedes guardar 15 canciones en tu iPod, ya esta lleno o tienes guardado 1000 segundos en musica. ");
    }
  }

  // ! FOUND SONG
  public void foundSong() {
    Scanner scanner = new Scanner(System.in);
    int aux = 2;

    while (aux != 1 && aux != 0) {
      System.out.println("Quieres encontrar la cancion por interprete o por titulo?[1 = titulo / 0 = interprete] ");
      aux = scanner.nextInt();
    }

    if (aux == 0) {
      Scanner scannerAuthor = new Scanner(System.in);
      System.out.println("Escribe el interprete de la cancion que deseas encontrar: ");
      String newAuthor = scannerAuthor.nextLine();

      boolean found = false;

      for (int index = 0; index < iPod.length; index++) {
        if (iPod[index] != null) {
          String currentAuthor = iPod[index].author;
          if (currentAuthor.equals(newAuthor)) {
            System.out.println("Se ha encontrado con exito la cancion. ");
            System.out.println(iPod[index]);
            found = true;
            break;
          }
        }
      }
      if (!found) {
        System.out.println("No se ha encontrado esa cancion. ");
      }

    } else if (aux == 1) {
      Scanner scannerTitle = new Scanner(System.in);
      System.out.println("Escribe el titulo de la cancion que deseas encontrar: ");
      String newTitle = scannerTitle.nextLine();

      boolean found = false;

      for (int index = 0; index < iPod.length; index++) {
        if (iPod[index] != null) {
          String currentTitle = iPod[index].title;
          if (currentTitle.equals(newTitle)) {
            System.out.println("Se ha encontrado con exito la cancion. ");
            System.out.println(iPod[index]);
            found = true;
            break;
          }
        }
      }
      if (!found) {
        System.out.println("No se ha encontrado esa cancion. ");
      }
    }
  }

  // ! DELETE SONG BY TITLE
  public void deleteSong() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escribe el titulo de la cancion que deseas borrar: ");
    String title = scanner.nextLine();

    boolean found = false;

    for (int index = 0; index < iPod.length; index++) {
      if (iPod[index] != null) {
        String currentTitle = iPod[index].title;
        if (currentTitle.equals(title)) {
          iPod[index] = null;
          System.out.println("Se ha borrado con exito la cancion. ");
          found = true;
          break;
        }
      }
    }
    if (!found) {
      System.out.println("No se ha encontrado esa cancion. ");
    }
  }

  // ! DELETE ALL SONGS
  public void deleteAllSongs() {
    for (int index = 0; index < iPod.length; index++) {
      iPod[index] = null;
    }
    System.out.println("Se ha borrado todo, ya no tienes ninguna cancion. ");
  }

  // ! SORT SONGS BY DURATION
  public void sortSongs() {
    Cancion[] auxIpod = new Cancion[iPod.length];
    int counter = 0;

    // | KNOW HOW MANY SONGS THERE ARE IN THE IPOD
    for (int currentIndex = 0; currentIndex < iPod.length; currentIndex++) {
      if (iPod[currentIndex] != null) {
        counter++;
      }
    }

    // | ADD SONG DURATIONS TO AN ARRAY
    
    int[] shortSecondsDuration = new int[counter];

    for (int i = 0; i < shortSecondsDuration.length; i++) {
      for (int currentIndex = 0; currentIndex < iPod.length; currentIndex++) {
        if (iPod[currentIndex] != null) {
          shortSecondsDuration[i] = iPod[currentIndex].secondsDuration;
          auxIpod[currentIndex] = iPod[currentIndex];
          iPod[currentIndex] = null;
          break;
        }
      }
    }

    // | SORT THE ARRAY OF DURATIONS
    for (int i = 0; i < (shortSecondsDuration.length - 1); i++) {
      for (int j = i + 1; j < shortSecondsDuration.length; j++) {
        if (shortSecondsDuration[i] > shortSecondsDuration[j]) {
          int auxVariable = shortSecondsDuration[i];
          shortSecondsDuration[i] = shortSecondsDuration[j];
          shortSecondsDuration[j] = auxVariable;
        }
      }
    }

    // | ADD THE SORTED SONGS TO THE ORIGINAL ARRAY
    for (int indexSec = 0; indexSec < shortSecondsDuration.length; indexSec++) { // 3
      for (int indexIpod = 0; indexIpod < auxIpod.length; indexIpod++) { // 15

        if (auxIpod[indexIpod] != null) {
          if (auxIpod[indexIpod].secondsDuration == shortSecondsDuration[indexSec]) {
            iPod[indexSec] = auxIpod[indexIpod];
            auxIpod[indexIpod] = null;
            break;
          }

        } else {
          continue;
        }
      }
    }
    System.out.println("Tus canciones han sido ordenadas por duracion (ascendentemente). ");
  }

}
