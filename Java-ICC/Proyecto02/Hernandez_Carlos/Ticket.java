
public class Ticket {
  //! ATTRIBUTES
  Persona persona;
  Menu menu;
  int menuNumber;

  //! CONSTRUCTOR
  public Ticket(Persona persona, Menu menu, int menuNumber){
    this.persona = persona;
    this.menu = menu;
    this.menuNumber = menuNumber + 1;
  }

  //!GETTERS AND SETTERS
  public Persona getPersona(){return persona;}
  public void setPersona(Persona persona){this.persona = persona;}
  public Menu getMenu(){return menu;}
  public void setMenu(Menu menu){this.menu = menu;}
  public int getMenuNumber(){return menuNumber;}
  public void setMenuNumber(int menuNumber){this.menuNumber = menuNumber;}
  
  public void printTicket(){
    System.out.println("\n******************* TICKET " + menuNumber + " ********************" + "\n\t" + "Cliente atendido: " + "\n\t" + persona);
    menu.printMenu();
    System.out.println("*************************************************");
  }


  //! toString
  public String toString(){
    return "\n******************* TICKET " + menuNumber + " *******************" + "\n\t" + "Cliente atendido: " + "\n\t" + persona + "\n"  + menu + "\n***********************************************";
  }
}
