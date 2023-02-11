import java.util.Scanner;
public class usoIpod {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    Ipod newIpod = new Ipod();

    int option = 0;
    while (option != 7) {
      System.out.println("\n¿Qué quieres hacer?");
      System.out.println("1. Ver todas las canciones del iPod");
      System.out.println("2. Guardar cancion");
      System.out.println("3. Borrar cancion por titulo");
      System.out.println("4. Buscar cancion por titulo o interprete");
      System.out.println("5. Borrar todas las canciones del iPod");
      System.out.println("6. Ordenar las canciones por duracion");
      System.out.println("7. Salir");
      option = scanner.nextInt();

      switch(option) {
			case 1:
      newIpod.allSongs();
			break;
      case 2:
      newIpod.addSong();
      break;
      case 3:
      newIpod.deleteSong();
      break;
      case 4:
      newIpod.foundSong();
      break;
      case 5:
      newIpod.deleteAllSongs();
      break;
      case 6:
      newIpod.sortSongs();
      break;
      case 7:
      System.exit(1);
			default:
			System.out.println("Opción inválida");
			break;
      }
    }
  }
}
