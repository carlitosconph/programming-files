import java.io.Serializable;

public class Contacto implements Serializable {

	private String nombre_s;
	private String apellidos;
	private String correo;
	private String direccion;
	private int telefono;
	private Contacto anterior;
	private Contacto siguiente;

	/**
	 * Constructor
	 */
	public Contacto(String n, String aps, String c, String d, int tel) {
		nombre_s=n;
		apellidos=aps;
		correo=c;
		direccion=d;
		telefono=tel;
		anterior=null;
		siguiente=null;
	}

	/**
	* Método que define la forma de representar un contacto con una cadena de texto
	* @return la representacion de este ptoducto como cadena de texto
	*/
	public String toString(){
		return nombre_s+":\t"+apellidos+", \t"+ correo+ ", \t"+telefono+", \t"+direccion;
	}


	/**
	* Métodos set
	*/
	public void setNombres(String n) {
		nombre_s=n;
	}

	public void setApellidos(String aps) {
		apellidos=aps;
	}

	public void setCorreo(String c) {
		correo=c;
	}

	public void setDireccion(String d) {
		direccion=d;
	}

	public void setTelefono(int t) {
		telefono=t;
	}

	/**
	* Métodos get
	*/
	public String getNombre() {
		return nombre_s;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	/**
	* Método de acceso al atributo anterior
	* @return el Contacto anterior en la lista
	*/
	public Contacto getAnterior(){
		return anterior;
	}

	/**
	* Método de acceso al atributo siguiente
	* @return el Contacto siguiente en la lista
	*/
	public Contacto getSiguiente(){
		return siguiente;
	}

	/**
	* Método modificador para el atributo anterior
	* @param ant el nuevo Contacto anterior en la lista
	*/
	public void ponAnterior(Contacto ant){
		anterior=ant;
	}

	/**
	* Método modificador para el atributo siguiente
	* @param sig el nuevo Contacto siguiente en la lista
	*/
	public void ponSiguiente(Contacto sig){
		siguiente=sig;
	}
}