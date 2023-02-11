public class JarraDeAgua {
  int capacity;

  public JarraDeAgua(int capacity){
    if (capacity <= 10 && capacity > 0){
      this.capacity = capacity;
    }
  }

  public String depositaAgua(int numeroVasos) throws CapacidadSuperadaException{
    if (numeroVasos > 10 || (capacity + numeroVasos) > 10){
      throw new CapacidadSuperadaException("No puedes depositar mas de 10 vasos de agua en total. ");
    } else {
      capacity += numeroVasos;
      return "Se depositaron " + numeroVasos + " vasos de agua. ";
    }
  }

  public String retirarAgua(int numeroVasos) throws CapacidadInsuficienteException{
    if (numeroVasos > capacity){
      throw new CapacidadInsuficienteException("No puedes retirar mas agua de la que tienes en tu jarra.");
    } else {
      capacity -= numeroVasos;
      return "Se retiraron " + numeroVasos + " vasos de agua. ";
    }
  }
  
}
