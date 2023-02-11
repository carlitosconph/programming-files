import java.util.Random;

public class Automovil {

  // ! ATRIBUTOS
  String compania = "";
  String marca = "";
  String color = "";
  double capTotalTanque = 0;
  double capActualTanque = 0;
  boolean encendido = false;

  // ! CONSTRUCTOR
  public Automovil(String compania, String marca, String color, double capTotalTanque, double capActualTanque,
      boolean encendido) {

    this.compania = compania;
    this.marca = marca;
    this.color = color;
    this.capTotalTanque = capTotalTanque;
    this.capActualTanque = capActualTanque;
    this.encendido = encendido;
  }

  // ! encenderAuto
  public void encenderAuto() {this.encendido = true;}

  // ! apagarAuto
  public void apagarAuto() {this.encendido = false;}

  // ! avanzar
  public void avanzar(int kilometros) {
    int kilometrosRecorridos = 0;
    int kilometrosTotales = kilometros;

    while (kilometros > 0) {
      kilometros -= 1;
      kilometrosRecorridos += 1;
      capActualTanque -= .3;

      if (capActualTanque <= 0 && kilometros > 0) {
        System.out.println("\nNos quedamos en el kilometro: " + ((kilometrosTotales - kilometros) - 1));
        System.out.println("No logramos completar el viaje y el auto debera apagarse");
        apagarAuto();
        break;
      } else if (capActualTanque > 0 && kilometros == 0) {
        System.out.println("\nKilometro " + kilometrosRecorridos +
            "\nGasolina actual de auto: " + capActualTanque);
        System.out.println("Hemos recorrido todos los kilometros (" + kilometrosTotales + ")");
      } else {
        System.out.println("\nKilometro " + kilometrosRecorridos +
            "\nGasolina actual de auto: " + capActualTanque);
      }
    }
  }

  // ! cargarGasolina
  public void cargarGasolina(double dinero) {

    double precioGasolina = 19.8;
    int litrosComprados = (int) (dinero / precioGasolina);
    double dineroGastado = litrosComprados * precioGasolina;
    double cambio = dinero - dineroGastado;
    capActualTanque += litrosComprados;

    if (dinero < precioGasolina) {
      System.out.println("No te alcanza ni para un litro de gasolina :p");
      capActualTanque -= litrosComprados;
    } else {
      if (capActualTanque > capTotalTanque) {
        System.out.println("Pediste mas gasolina de la que tu carro puede aceptar. ");
        System.out.println("Los litros que sobraron son: " + (capActualTanque - capTotalTanque));
        cambio = ((capActualTanque - capTotalTanque) * precioGasolina);
        System.out.println("Tu cambio es: " + cambio);
        capActualTanque = capTotalTanque;
      } else {
        System.out.println("Cargaste " + litrosComprados + " de gasolina.");
        System.out.println("Tu gasolina actual es de: " + capActualTanque);
        if (cambio > 0) {
          System.out.println("Tu cambio es: " + cambio);
        }
      }
    }
  }

  //! cargarTodoElTanque
  public void cargarTodoElTanque(){
    double precioGasolina = 19.8;
    double litrosComprados = capTotalTanque - capActualTanque;
    double dineroACobrar = litrosComprados * precioGasolina;
    if (capActualTanque == capTotalTanque){
      System.out.println("\nNo puedes cargar mas gasolina, el tanque esta lleno.");
    } else{
      System.out.println("Para llenar el tanque necesitas: " + litrosComprados);
      System.out.println("Debes pagar: " + dineroACobrar);
      capActualTanque = capTotalTanque;
    }
  }

  //! carreritas
  public void carreritas(Automovil av1, Automovil av2){

    Random confusion = new Random();
    int vueltasCarro1 = 0;
    int vueltasCarro2 = 0;
    boolean corriendo = true;

    System.out.println("\n\t Inicia la carrera!");
    while (corriendo){

      int probaConfusionCarro1 = confusion.nextInt(4);
      int probaConfusionCarro2= confusion.nextInt(4);

      if (probaConfusionCarro1 == 0){
        System.out.println("El " + av1.marca + " se detiene porque el conductor entra en confusion. ");
      } else {
        vueltasCarro1++;
        System.out.println("El " + av1.marca + " ha completado " + vueltasCarro1 + " vueltas. ");
      }
      if (probaConfusionCarro2== 0){
        System.out.println("El " + av2.marca + " se detiene porque el conductor entra en confusion. ");
      } else {
        vueltasCarro2++;
        System.out.println("El " + av2.marca + " ha completado " + vueltasCarro2 + " vueltas. ");
      }

      System.out.println("*************************************************************************");

      if (vueltasCarro1 == 10 || vueltasCarro2 == 10){
        corriendo = false;
        if (vueltasCarro1 == 10 && vueltasCarro2 == 10){
          System.out.println("Es un empate, ambos carros completaron las 10 vueltas al mismo tiempo. ");
        } else if(vueltasCarro1 == 10){
          System.out.println("El " + av1.marca + " ha completado " + vueltasCarro1 + " vueltas. ");
          System.out.println("El es el ganador");
        } else if (vueltasCarro2 == 10){
          System.out.println("El " + av2.marca + " ha completado " + vueltasCarro2 + " vueltas. ");
          System.out.println("El es el ganador");
        }
      }
    }
  }

  //! toString
  public String toString() { return "La marca del carro es: " + marca + "\nLa compania del carro es: " + compania + "\nEl color del carro es: " + color;}

  public static void main(String[] args) {

    Automovil carrito = new Automovil("Mercedes-Benz Group", "Mercedes-Benz", "pistache", 15, 2, true);
    Automovil carrito2 = new Automovil("Grupo Wolskwagen", "Audi", "Azul", 17, 13, true);

    //? Prueba del metodo toString
    System.out.println("toString: ");
    System.out.println(carrito);
    System.out.println();
    System.out.println(carrito2);

    //? Prueba del metodo apagarAuto
    System.out.println("\nApagando autos.");
    carrito.apagarAuto();
    carrito2.apagarAuto();
    
    //? Prueba del metodo encerderAuto
    System.out.println("\nEncendiendo autos.");
    carrito.encenderAuto();
    carrito2.encenderAuto();

    //? Pruba del metodo avanzar
    System.out.println("\nViajando: \n");
    
    //| Cuando el viaje no se puede completar por falta de gasolina
    System.out.println("Carro 1: ");
    carrito.avanzar(10);

    //| Cuando el viaje se completa con exito
    System.out.println("\nCarro 2: ");
    carrito2.avanzar(5);

    //? Prueba del metodo cargarGasolina
    System.out.println("\nCargando gasolina: \n");
    //| Cuando se pide menos gasolina de las que el tanque acepta
    System.out.println("Carro 1");
    carrito.cargarGasolina(100);

    //| Cuando se pide mas gasolina de las que el tanque acepta
    System.out.println("\nCarro 2");
    carrito2.cargarGasolina(297);

    //| Este metodo esta comentado para que se pueda evaluar por separado cuando el metodo anterior de es llamado
    //? Prueba del metodo cargarTodoElTanque
    System.out.println("\nCargando todo el tanque de gasolina: \n");
    System.out.println("Carro 1: ");
    carrito.cargarTodoElTanque();

    System.out.println("\nCarro 2: ");
    carrito2.cargarTodoElTanque();

    //| Cuando se intenta cargar todo el tanque esta lleno
    System.out.println("\nCargando todo el tanque: ");
    carrito2.cargarTodoElTanque();

    //? Prueba del metodo carreritas
    carrito.carreritas(carrito, carrito2);

  }
}
