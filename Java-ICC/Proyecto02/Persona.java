public class Persona {

  //! ATTRIBUTES
  int age;
  String gender;
  String size;
  Menu menu;

  //! CONSTRUCTOR 
  public Persona(){}
  public Persona(int age, String gender, String size, Menu menu){
    this.age = age;
    this.gender = gender;
    this.size = size;
    this.menu = menu;
  }

  //! GETTERS AND SETTERS
  public int getAge(){return age;}
  public void setAge(int age){this.age = age;}
  public String getGender(){return gender;}
  public void setGender(String gender){this.gender = gender;}
  public String getSize(){return size;}
  public void setSize(String size){this.size = size;}
  public Menu getMenu(){return menu;}
  public void setMenu(Menu menu){this.menu = menu;}

  public String toString(){return gender + ", " + age + " años, " + size;}

}
