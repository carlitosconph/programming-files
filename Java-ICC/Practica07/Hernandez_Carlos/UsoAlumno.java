import java.util.ArrayList;

public class UsoAlumno {
  public static void main(String[] args) {
    Alumno student1 = new Alumno(320325775, "Carlos Hernadez", "Ciencias de la computacion", 1);
    Alumno student2 = new Alumno(320354215 , "Camila Figueroa", "Ciencias de la computacion", 1);
    Alumno student3 = new Alumno(320546322, "Valeria Mares", "Biologia", 5);
    Alumno student4 = new Alumno(320320329, "Karla Gonzales", "Fisica", 7);

    Materia course1 = new Materia("ICC", "123456", 1);
    Materia course2= new Materia("Estructuras Discretas", "654321", 1);
    Materia course3 = new Materia("Algebra superior I", "999999", 1);
    Materia course4 = new Materia("Matematicas I", "101010", 1);
    Materia course5 = new Materia("Biologia III", "111111", 3);
    Materia course6 = new Materia("Biologia V", "011101", 7);
    Materia course7 = new Materia("Sistemas operativos", "103538", 6);
    Materia course8 = new Materia("Ingles I", "000000", 1);

    course1.coursesList();

    
    //= INSCRIBIENDO MATERIAS STUDENT1
    System.out.println("\nEl estudiante " + student1.fullName + " (semestre: " + student1.semester + ") quiere inscribir materias: ");
    System.out.println(student1.inscribirMateria(course1));
    System.out.println(student1.inscribirMateria(course2));
    System.out.println(student1.inscribirMateria(course3));
    System.out.println(student1.inscribirMateria(course4));
    System.out.println(student1.inscribirMateria(course7));
    System.out.println(student1.inscribirMateria(course8));
    System.out.println(student1.inscribirMateria(course1));

    //= INSCRIBIENDO MATERIAS STUDENT2
    System.out.println("\nLa estudiante " + student2.fullName + " (semestre: " + student2.semester + ") quiere inscribir materias: ");
    System.out.println(student2.inscribirMateria(course4));
    System.out.println(student2.inscribirMateria(course1));
    System.out.println(student2.inscribirMateria(course2));
    System.out.println(student2.inscribirMateria(course5));

    //= INSCRIBIENDO MATERIAS STUDENT3
    System.out.println("\nLa estudiante " + student3.fullName + " (semestre: " + student3.semester + ") quiere inscribir materias: ");
    System.out.println(student3.inscribirMateria(course5));
    System.out.println(student3.inscribirMateria(course4));
    
    //= INSCRIBIENDO MATERIAS STUDENT4
    System.out.println("\nLa estudiante " + student4.fullName + " (semestre: " + student4.semester + ") quiere inscribir materias: ");
    System.out.println(student4.inscribirMateria(course4));
    System.out.println(student4.inscribirMateria(course1));
    System.out.println(student4.inscribirMateria(course6));
    System.out.println(student4.inscribirMateria(course2)); 

    //= IMPRIMIR LA TIRA DE MATERIAS DE LOS ESTUDIANTES
    System.out.println("\nTira de materias de:");
    student1.imprimirTiraMaterias();
    System.out.println("\nTira de materias de:");
    student2.imprimirTiraMaterias();

    //= DAR DE ALTA MATERIA EN EL LISTADO DE MATERIAS DISPONIBLES
    System.out.println("\nDar de alta una materia en las materias disponibles: ");
    student1.darDeAltaMateria(course5);

    //= BUSCAR METERIRAS SIMILARES
    student1.buscarCompaneros(student1, student2);
    student1.buscarCompaneros(student3, student2);

    //= DAR DE BAJA MATERIAS
    System.out.println("\nDar de baja materias a " + student1.fullName);
    System.out.println(student1.darDeBajaMateria(course7));
    System.out.println(student1.darDeBajaMateria(course1));
    
    //= MATERIA MAS POPULAR
    System.out.println("\nBuscar la meteria mas popular entre los alumnos inscritos: ");

    //? arraylist con los alumnos inscritos
    ArrayList<Alumno> studentsList = new ArrayList<Alumno>();
    studentsList.add(student1);
    studentsList.add(student2);
    studentsList.add(student3);
    studentsList.add(student4);
    student1.concerMateriaMasPopular(studentsList, Materia.coursesList);

    //= AYUDANTE
    System.out.println("\nAyudante: ");
    AlumnoAyudante ayudante1 = new AlumnoAyudante(123456789, "Maria Velazquez", "Fisica", 7, "ICC");
    System.out.println(ayudante1);

    //= INSCRIBIENDO MATERIAS DEL AYUDANTE1
    System.out.println("\nEl ayudante " + ayudante1.fullName + " (semestre: " + ayudante1.semester + ") quiere inscribir materias: ");
    System.out.println(ayudante1.inscribirMateria(course1));
    System.out.println(ayudante1.inscribirMateria(course2));
    System.out.println(ayudante1.inscribirMateria(course3));
    System.out.println(ayudante1.inscribirMateria(course4));
    System.out.println(ayudante1.inscribirMateria(course7));
    System.out.println(ayudante1.inscribirMateria(course8));
    System.out.println(ayudante1.inscribirMateria(course1));

    //= IMPRIMIR LA TIRA DE MATERIAS DEL AYUDANTE
    System.out.println("\nTira de materias de:");
    ayudante1.imprimirTiraMaterias();

    //= DAR DE BAJA MATERIAS DEL AYUDANTE
    System.out.println("\nDar de baja materias a " + ayudante1.fullName);
    System.out.println(ayudante1.darDeBajaMateria(course7));
    System.out.println(ayudante1.darDeBajaMateria(course3));
  }

  
}
