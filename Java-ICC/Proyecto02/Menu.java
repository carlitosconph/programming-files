public class Menu {
  //! ATTRIBUTES
  int price;
  int menuNumber;
  String[] comida = {"platoPrincipal", "segundoPlato", "bebida"}; 
  String[] adicionales = {"0","ninguno", "0", "ninguno"};
  String[] adicionalesDos = {"0","ninguno", "0", "ninguno"};
  String[] aperitivosAdicionales = {"0", "ninguno", "0","ninguno"};
  int priceAdicionales = 0;

  //! CONSTRUCTOR
  public Menu(int price, int menuNumber){
    this.menuNumber = menuNumber;
    this.price = price;
  }

  //! GETTERS AND SETTERS
  public int getPrice(){return price;}
  public void setPrice(int price){this.price = price;}
  public int getMenuNumber(){return menuNumber;}
  public void setMenuNumber(int menuNumber){this.menuNumber = menuNumber;}
  public String[] getComida(){return comida;}
  public void setComida(String platoPrincipal, String segundoPlato, String bebida){
    this.comida[0] = platoPrincipal;
    this.comida[1] = segundoPlato;
    this.comida[2] = bebida;
  }
  public String[] getAdicionales(){return adicionales;}
  public void setAdicionales(String cantidadBebidaAdicional, String bebidaAdicional, String cantidadComidaAdicional, String comidaAdicional){
    this.adicionales[0] = cantidadBebidaAdicional;
    this.adicionales[1] = bebidaAdicional;
    this.adicionales[2] = cantidadComidaAdicional;
    this.adicionales[3] = comidaAdicional;
  }
  public String[] getAdicionalesDos(){return adicionales;}
  public void setAdicionalesDos(String cantidadBebidaAdicional, String bebidaAdicional, String cantidadComidaAdicional, String comidaAdicional){
    this.adicionalesDos[0] = cantidadBebidaAdicional;
    this.adicionalesDos[1] = bebidaAdicional;
    this.adicionalesDos[2] = cantidadComidaAdicional;
    this.adicionalesDos[3] = comidaAdicional;
  }
  public String[] getAperitivosAdicionales(){return aperitivosAdicionales;}
  public void setAperitivosAdicionales(String cantidadAdicionalesSeg, String adicionalesSegundoPlato, String cantidadAdicionalesBebida,String adicionalesBebida){
    this.aperitivosAdicionales[0] = cantidadAdicionalesSeg;
    this.aperitivosAdicionales[1] = adicionalesSegundoPlato;
    this.aperitivosAdicionales[2] = cantidadAdicionalesBebida;
    this.aperitivosAdicionales[3] = adicionalesBebida;
  }
  public int getPriceAdicionales(){return priceAdicionales;}
  public void setPriceAdicionales(int priceAdicionales){this.priceAdicionales += priceAdicionales;}

  public void printMenu(){
    boolean ningunoBool = true;

    System.out.println("------------------------------------------------" + "\n\tMenu " + menuNumber + " :\n\t" + comida[0] + "\n\t" + comida[1] + "\n\t" + comida[2] + "\n\tImporte: $"+ price + "\n-----------------------------------------------\n\tAdicionales: ");

    for (int i = 0; i < adicionales.length; i++) {
      if (adicionales[i].equals("ninguno") || adicionales[i].equals("0")){
        continue;
      } else{
        if(adicionales[i].length() == 1 && adicionales[i] != "0"){
          System.out.print("\t(" + adicionales[i] + ")");
          continue;
        }
        System.out.print(adicionales[i] + "\n");
        ningunoBool = false;
      }
    }
    for (int i = 0; i < adicionalesDos.length; i++) {
      if (adicionalesDos[i].equals("ninguno") || adicionalesDos[i].equals("0")){
        continue;
      } else{
        if(adicionalesDos[i].length() == 1 && adicionalesDos[i] != "0"){
          System.out.print("\t(" + adicionalesDos[i] + ")");
          continue;
        }
        System.out.print(adicionalesDos[i] + "\n");
        ningunoBool = false;
      }
    }
    for (int i = 0; i < aperitivosAdicionales.length; i++) {
      if (aperitivosAdicionales[i].equals("ninguno") || aperitivosAdicionales[i].equals("0")){
        continue;
      } else{
        if(aperitivosAdicionales[i].length() == 1 && aperitivosAdicionales[i] != "0"){
          System.out.print("\t(" + aperitivosAdicionales[i] + ")");
          continue;
        }
        System.out.print(aperitivosAdicionales[i] + "\n");
        ningunoBool = false;
      }
    }

    if(ningunoBool){
      System.out.println("\tNinguno");
    }
    System.out.println("\tImporte: $" + priceAdicionales + "\n" + "\tTotal a pagar: $" + (price + priceAdicionales));
  }

  //! toString
  public String toString(){
    if(adicionales[1] == "ninguno" && adicionales[3] == "ninguno" && aperitivosAdicionales[1] == "ninguno" && aperitivosAdicionales[3] == "ninguno" ){

      return "------------------------------------------------" + "\n\tMenu " + menuNumber + " :\n\t" + comida[0] + "\n\t" + comida[1] + "\n\t" + comida[2] + "\n\tImporte: $"+ price + "\n-----------------------------------------------\n\tAdicionales: " + "\n\tNinguno" + "\n\tImporte: $" + priceAdicionales + "\n" + "\tTotal a pagar: $" + (price + priceAdicionales);

    } else{
      return "------------------------------------------------" + "\n\tMenu " + menuNumber + " :\n\t" + comida[0] + "\n\t" + comida[1] + "\n\t" + comida[2] + "\n\tImporte: $"+ price + "\n-----------------------------------------------\n\tAdicionales: " + "\n\t(" + adicionales[0] +") " + adicionales[1] + "\n\t(" + adicionales[2] +") "+ adicionales[3] + "\n\t(" + adicionalesDos[0] +") " + adicionalesDos[1] + "\n\t(" + adicionalesDos[2] +") "+ adicionalesDos[3] + "\n\t(" + aperitivosAdicionales[0] +") " + aperitivosAdicionales[1] + "\n\t(" + aperitivosAdicionales[2] +") "+ aperitivosAdicionales[3] + "\n\tImporte: $" + priceAdicionales + "\n" + "\tTotal a pagar: $" + (price + priceAdicionales);
    }
  }
}
