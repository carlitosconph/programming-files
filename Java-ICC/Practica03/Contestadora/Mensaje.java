
import java.io.Serializable;

public class Mensaje implements Serializable {
	
	String remitente;
	String cuerpoMensaje;

	public Mensaje(String r, String c) {
		remitente = r;
		cuerpoMensaje = c;
	}

	public void setRemitente(String r) {
		remitente = r;
	}

	public void setCuerpoMensaje(String c) {
		cuerpoMensaje = c;
	}

	public String getRemitente() {
		return remitente;
	}

	public String getCuerpoMensaje() {
		return cuerpoMensaje;
	}


	public String toString() {
		return "Remitente: " + remitente + "\n" + cuerpoMensaje;
	}


}