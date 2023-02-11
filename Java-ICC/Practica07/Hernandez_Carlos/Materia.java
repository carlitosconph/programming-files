import java.util.ArrayList;

public class Materia {

  //! ATTRIBUTES

  String courseName;
  String courseKey;
  int courseSemester;
  int found;
  static ArrayList<Materia> coursesList = new ArrayList<Materia>();

  //! CONSTRUCTOR
  public Materia(String courseName,  String courseKey, int courseSemester ){
    this.courseName = courseName;
    this.courseKey = courseKey;
    this.courseSemester = courseSemester;
    found = 0;

  }

  //! GETTERS AND SETTERS
  public void setCourseName(String courseName) { this.courseName = courseName;}
  public String getCourseName(){return courseName;}

  public void setCourseKey(String courseKey) { this.courseKey = courseKey;}
  public String getCourseKey(){return courseKey;}

  public void setCourseSemester(int courseSemester) { this.courseSemester = courseSemester;}
  public int getCourseSemester(){return courseSemester;}

  //! toString
  public String toString(){
    return "Materia: " + courseName + ", Clave: " + courseKey + ", Semestre: " + courseSemester;
  }

  public void coursesList(){
    Materia course1 = new Materia("ICC", "123456", 1);
    Materia course2= new Materia("Estructuras Discretas", "654321", 1);
    Materia course3 = new Materia("Algebra superior I", "999999", 1);
    Materia course4 = new Materia("Matematicas I", "101010", 1);
    Materia course5 = new Materia("Ingles I", "000000", 1);
    Materia course6 = new Materia("Estructura de Datos", "919191", 2);
    Materia course7 = new Materia("Algebra superor II", "123875", 2);
    Materia course8 = new Materia("Graficas y juegos", "871350", 2);
    Materia course9 = new Materia("Matematicas I", "011100", 2);
    Materia course10 = new Materia("Ingles II", "777666", 2);
    Materia course11 = new Materia("Analisis de Algoritmos", "010203", 5);
    Materia course13 = new Materia("Computacion distribuida", "050433", 5);
    Materia course14 = new Materia("Lenguajes de programacion", "657832", 5);
    Materia course15 = new Materia("Ingles V", "232323", 5);
    Materia course16 = new Materia("Inteligencia artifical", "777777", 6);
    Materia course17 = new Materia("Ingenieria de software", "431000", 6);
    Materia course18 = new Materia("Sistemas operativos", "103538", 6);
    Materia course19 = new Materia("Fisica", "554544", 1);
    Materia course20 = new Materia("Quimica", "324785", 1);
    Materia course12 = new Materia("Sistemaca I", "541111", 2);

    coursesList.add(course1);
    coursesList.add(course2);
    coursesList.add(course3);
    coursesList.add(course4);
    coursesList.add(course5);
    coursesList.add(course6);
    coursesList.add(course7);
    coursesList.add(course8);
    coursesList.add(course9);
    coursesList.add(course10);
    coursesList.add(course11);
    coursesList.add(course12);
    coursesList.add(course13);
    coursesList.add(course14);
    coursesList.add(course15);
    coursesList.add(course16);
    coursesList.add(course17);
    coursesList.add(course18);
    coursesList.add(course19);
    coursesList.add(course20);
  }
  
}
