
import java.io.*;
import java.util.Scanner;

public class Contestadora {
	
	String nombreArchivo="";
	Mensaje[] con;
	Scanner entrada = new Scanner(System.in);
	Scanner entrada2 = new Scanner(System.in);


	public Contestadora() {

	}


	public Contestadora ( String nombreArchivo ) throws RuntimeException {
		this.nombreArchivo=nombreArchivo ;
		File archivoMensajes = new File(nombreArchivo);
		if(archivoMensajes.exists()) {
			if(!archivoMensajes.canRead()) {
				throw new RuntimeException ("No se puede leer el archivo "+ nombreArchivo);
			}
			if(!archivoMensajes.canWrite()) {
				throw new RuntimeException ("No se puede escribir el archivo "+ nombreArchivo);
			}
			con = leerMensajes();
		} else {
			con = new Mensaje[50];
		}
	}


	public void ejecutaPrograma() {

		Contestadora contestadora = new Contestadora("Mensajes");

		int opcion=0;

		while(opcion != 5) {
			System.out.println("Escribe una opción");
			System.out.println("1. Guardar mensaje");
			System.out.println("2. Buscar mensaje por remitente");
			System.out.println("3. Leer todos los mensajes");
			System.out.println("4. Borrar todos los mensajes");
			System.out.println("5. Salir");
			opcion = entrada.nextInt();
			if(opcion==1) {
				String remitente;
				String mensaje;
				System.out.println("Escribe el nombre del remitente: ");
				remitente = entrada2.nextLine();
				System.out.println("Escribe el mensaje que quieres dejar: ");
				mensaje = entrada2.nextLine();
				contestadora.guardaMensaje(remitente, mensaje);
				contestadora.grabar();
			} else if(opcion==2) {
				String remitenteBuscado;
				System.out.println("Escribe el nombre del remitente al quieres buscar: ");
				remitenteBuscado = entrada2.nextLine();
				contestadora.buscaMensajes(remitenteBuscado);
			} else if(opcion==3) {
				contestadora.leerTodo();
			} else if(opcion==4) {
				contestadora.borrarTodo();
			}

		}
		grabar();
	}//termina ejecutarPrograma
	


	public void guardaMensaje(String r, String m) {
		int bandera=0;
		for(int i=0; i<con.length; i++) {
			if(con[i]==null) {
				Mensaje men = new Mensaje(r, m);
				con[i] = men;
				break;
			} else {
				bandera++;
			}
		}

		if(bandera==con.length) {
			System.out.println("El mensaje no se pudo guardar - MEMORIA LLENA");
		} else {
			System.out.println("Mensaje guardado exitosamente");
		}
	}

	public void buscaMensajes(String r) {

		boolean estuvo=false;

		for(int i=0; i<con.length; i++) {
			if( con[i] != null ) {

				String remi = con[i].getRemitente();
				if(remi.equals(r)) {
					estuvo = true;
					System.out.println(con[i]);
				}

			}
			
		}
		if(!estuvo) {
			System.out.println("No se encontraron mensaje de " + r);
		}

	}

	public void leerTodo() {
		System.out.println("ESTOS SON TODOS LOS MENSAJES DE TU CONTESTADORA");
		for(int i=0; i<con.length; i++) {
			if(con[i] != null) {
				System.out.println(con[i]);	
			}
			
		}
	}


	public void borrarTodo() {
		for(int i=0; i<con.length; i++) {
			con[i] = null;
		}
		System.out.println("TODOS LOS MENSAJES HAN SIDO BORRADOS");
	}

	public void grabar () {
		try {
			ObjectOutputStream contestadora = new ObjectOutputStream (new FileOutputStream ( nombreArchivo ) );
			contestadora.writeObject(con);
			contestadora.close( );
		} catch ( NotSerializableException e ) {
			System.out.println( "Error de grabación "+ e + "Objeto no serializable" ) ;
		} catch ( IOException e ) {
			System.out.println() ;
		}
	}


	public Mensaje[] leerMensajes( ) {
		try {
			ObjectInputStream lector = new ObjectInputStream ( new FileInputStream ( nombreArchivo ) ) ;
			Mensaje[] con = (Mensaje[]) lector.readObject();
			lector.close();
			this.con = con;
		} catch ( IOException e ) {
			System.out.println("Lectura fallida " + e) ;
		} catch ( ClassNotFoundException e ) {
			System.out.println( "Lectura fallida " + e ) ;
		}
		return con;
	}



}