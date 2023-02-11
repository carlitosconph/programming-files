public class Cancion{

  //! ATTRIBUTES
  String author;
  String title;
  int secondsDuration;

  //! CONSTRUCTOR
  public Cancion(String author, String title, int secondsDuration){
    this.author = author;
    this.title = title;
    this.secondsDuration = secondsDuration;
  }

  //! SETTERS AND GETTERS
  public void setAuthor(String author){this.author = author;}
  public String getAuthor(){return author;}
  public void setTitle(String title){this.title = title;}
  public String getTitle(){return title;}
  public void setSecondsDuration(int secondsDuration){this.secondsDuration = secondsDuration;}
  public int getSecondsDuration(){return secondsDuration;}

  //! toString
  public String toString(){return "\nTitulo: " + title + "\nInterprete: " + author + "\nDuracion en segundos: " + secondsDuration;}

}