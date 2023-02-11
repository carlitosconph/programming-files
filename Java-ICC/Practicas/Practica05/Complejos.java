public class Complejos {

  double real;
  double imaginario;

  //! CONSTRUCTOR 
  public Complejos(){}
  public Complejos(double real, double imaginario){this.real = real; this.imaginario = imaginario;}

  //! GETERS AND SETTERS
  public double getReal(){return real;}
  public double getImaginario(){return imaginario;}
  public void setReal(double real){this.real = real;}
  public void setImaginario(double imaginario){this.imaginario = imaginario;}

  //! SUMA DE COMPLEJOS
  public Complejos sumar(Complejos y){
    double r = real + y.real;
    double i = imaginario + y.imaginario;
    return new Complejos(r, i);
  }

  //! RESTA DE COMPLEJOS
  public Complejos restar(Complejos y){
    double r = real - y.real;
    double i = imaginario - y.imaginario;
    return new Complejos(r, i);
  }

  //! MULTIPLICACION DE COMPLEJOS
  public Complejos multiplicacion(Complejos y){
    double r = real * y.real - imaginario * y.imaginario;
    double i = real * y.imaginario + imaginario * y.real;
    return new Complejos(r, i);
  }

  //! DIVISION DE COMPLEJOS
  public Complejos division(Complejos y){
    double r = (real * y.real + imaginario * y.imaginario) / (Math.pow(y.real, 2) + Math.pow(y.imaginario, 2));
    double i = (imaginario * y.real - real * y.imaginario) / (Math.pow(y.real, 2) + Math.pow(y.imaginario, 2));
    return new Complejos(r, i);
  }

  //! toString
  public String toString(){
    if (imaginario > 0){return real +" + "+ imaginario + " i";}
    return real +"  "+ imaginario + " i";
  }

  public static void main(String[] args) {

    Complejos z = new Complejos(9,5); 
    Complejos y = new Complejos(12, -12);

    //! LLAMADA A LOS METODOS
    System.out.println("Suma (" + z + ") + (" + y + "): ");
    System.out.println(z.sumar(y));
    System.out.println("\nResta (" + z + ") - (" + y + "): ");
    System.out.println(z.restar(y));
    System.out.println("\nMultiplicacion (" + z + ") * (" + y + "): ");
    System.out.println(z.multiplicacion(y));
    System.out.println("\nDivision (" + z + ") / (" + y + "): ");
    System.out.println(z.division(y));
  }
  
}
