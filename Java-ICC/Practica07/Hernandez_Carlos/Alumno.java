import java.util.ArrayList;

public class Alumno {

  // ! ATTRIBUTES

  int accountNumber;
  String fullName;
  String career;
  ArrayList<Materia> courseStrip = new ArrayList<Materia>();
  int semester;

  // ! CONSTRUCTOR

  public Alumno() {
  }

  public Alumno(int accountNumber, String fullName, String career, int semester) {
    this.accountNumber = accountNumber;
    this.fullName = fullName;
    this.career = career;
    this.semester = semester;
  }

  // ! GETTERS AND SETTERS
  public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber;}
  public int getAcoountNumber(){return accountNumber;}

  public void setFullMame(String fullName){this.fullName = fullName;}
  public String getFullName(){return fullName;}

  public void setCareer(String career){this.career = career;}
  public String getCareer(){return career;}

  public void setSemester(int semester){this.semester = semester;}
  public int getSemester(){return semester;}

  // ! toString
  public String toString() {
    return "Nombre: " + fullName + ", Numero de cuenta: " + accountNumber + ", Carrera: " + career + ", Semestre: " + semester;
  }

  // ! METHODS

  // | INSCRIBIR MATERIA
  public String inscribirMateria(Materia course) {

    boolean esta = false;

    for (Materia materia : Materia.coursesList) {
      if (materia.courseKey.equals(course.courseKey)) {
        esta = true;
      }
    }

    if (esta) {
      // ? COMPROBAR SI EL SEMESTRE DE LA MATERIA COINCIDE CON EL SEMESTRE DEL ALUMNO
      if (!(course.courseSemester <= semester)) {
        return "No puedes incribir una materia de un semestre que no te corresponde (" + course + ").";
      }

      if(courseStrip.size() == 5){
        return "Solo puedes inscribir entre 1 y 5 materias, por lo tanto, no se puede inscribir (" + course + ").";
      }

      boolean add = courseStrip.contains(course);
      if (!add) {
        courseStrip.add(course);
        return "La materia se incribio de manera exitosa (" + course + ").";
      }
      return "No puedes inscribir una materia que ya inscribiste (" + course + ").";
    } else {
      return "La materia no esta disponible para inscribir (" + course + ").";
    }
  }

  // | BUSCAR COMPANEROS
  public void buscarCompaneros(Alumno student1, Alumno student2) {
    ArrayList<Materia> courseStripStudents = new ArrayList<Materia>();

    for (Materia course : student2.courseStrip) {
      if (student1.courseStrip.contains(course)) {
        courseStripStudents.add(course);
      }
    }

    System.out.println("\nEstas son las materias que comparten " + student1.fullName + " y " + student2.fullName + ": ");
    for (Materia course : courseStripStudents) {
      System.out.println(course.courseName);
    }

    if (courseStripStudents.size() == 0) {
      System.out.println("No comparten materias. ");
    }
  }

  // | IMPRIMIR TIRA DE MATERIAS
  public void imprimirTiraMaterias() {

    System.out.println(fullName);
    System.out.println("Materia | Clave");
    for (Materia course : courseStrip) {
      System.out.println(course.courseName + " / " + course.courseKey);
    }

    if (courseStrip.size() == 0) {
      System.out.println("No tienes materias inscritas, debes incribir por lo menos una. ");
    }
  }

  // | DAR DE ALTA UNA MATERIA
  public void darDeAltaMateria(Materia course) {
    Materia.coursesList.add(course);
    System.out.println("La materia se dio de alta de forma correcta (" + course + ").");
  }

  // | DAR DE BAJA UNA MATERIA
  public String darDeBajaMateria(Materia course) {
    boolean remove = courseStrip.remove(course);
    if (remove) {
      return "La meteria se dio de baja de forma exitosa (" + course + ").";
    }
    return "No puedes dar de baja una materia que no tienes (" + course + ").";
  }

  // | CONOCER LA MATERIA MAS POPULAR
  public void concerMateriaMasPopular(ArrayList<Alumno> studentslist, ArrayList<Materia> courseStrip) {
    int acc = 0;
    int auxAcc = 0;
    Materia auxCourse = new Materia(null, null, 0);
    ArrayList<Materia> mostPopular = new ArrayList<Materia>();

    for (Materia course : courseStrip) {
      for (Alumno student : studentslist) {
        for (Materia materia : student.courseStrip) {
          if (course.courseKey.equals(materia.courseKey)) {
            acc++;
            auxCourse = materia;
            auxCourse.found = acc;
          }
        }
      }
      if (acc >= auxAcc) {
        auxAcc = acc;
        acc = 0;
        mostPopular.add(auxCourse);
      }
      acc = 0;
    }
    Materia finall[] = new Materia[mostPopular.size()];
    Materia[] auxCourses = new Materia[mostPopular.size()];
    int[] shortFound = new int[mostPopular.size()];

    for (int i = 0; i < auxCourses.length; i++) {
      auxCourses[i] = mostPopular.get(i);
    }

    for (int i = 0; i < shortFound.length; i++) {
      for (int j = 0; j < mostPopular.size(); j++) {
        if (mostPopular.get(j) != null) {
          shortFound[i] = mostPopular.get(j).found;
          mostPopular.remove(j);
          break;
        }
      }
    }
    for (int i = 0; i < (shortFound.length - 1); i++) {
      for (int j = i + 1; j < shortFound.length; j++) {
        if (shortFound[i] > shortFound[j]) {
          int auxVar = shortFound[j];
          shortFound[i] = shortFound[j];
          shortFound[j] = auxVar;
        }
      }
    }

    for (int indexShort = 0; indexShort < shortFound.length; indexShort++) {
      for (int indexAux = 0; indexAux < auxCourses.length; indexAux++) {

        if (auxCourses[indexAux] != null) {
          if (auxCourses[indexAux].found == shortFound[indexShort]) {
            finall[indexShort] = auxCourses[indexAux];
            auxCourses[indexAux] = null;
            break;
          }
        } else {
          continue;
        }

      }
    }

    System.out.println("La/las materia mas popular es: ");

    for (Materia course : finall) {
      if (course.found >= finall[finall.length - 1].found) {
        System.out.println(course);
      }
    }
  }
}
