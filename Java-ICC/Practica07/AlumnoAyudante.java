
public class AlumnoAyudante extends Alumno {
  String courseTaught;

  public AlumnoAyudante(int accountNumber, String fullName, String career, int semester, String courseTaught){
    super(accountNumber, fullName, career, semester);
    this.courseTaught = courseTaught;
  }
  // ! toString
  public String toString(){
    return "Ayudante: " + super.fullName + ", Numero de cuenta: " + super.accountNumber + ", Carrera: " + super.career + ", Semestre: " + super.semester + ", Materia que imparte: " + courseTaught;
  }
}
