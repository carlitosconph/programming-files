import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JFrame   {

   private String nombreArchivo="agenda.ser";
   ArrayList<Contacto> agenda = new ArrayList<Contacto>();
   JTabbedPane panelFichas = new JTabbedPane();


   public Menu() {
      super("Agenda ");
      agenda = leerContactos();
      //Pestañas de la agenda
      ponPestaniaAgregar();
      ponPestaniaVerTodo();
      ponPestaniaBusqueda();
      ponPestaniaBorrar();
      ponPestaniaSalir();
      add(panelFichas); // agrega objeto JTabbedPane al marco
   } // fin del constructor de MarcoJTabbedPane


   public void ponPestaniaAgregar() {

      Icon imagen = new ImageIcon( "agenda.jpg");
      JLabel estampa = new JLabel(imagen);

      //Etiquetas de los mensajes
      JLabel label0 = new JLabel("Agrega un contacto nuevo");
      JLabel label1 = new JLabel("Nombre(s)");
      JLabel label2 = new JLabel("Apellidos");
      JLabel label3 = new JLabel("Correo electrónico");
      JLabel label4 = new JLabel("Tel. Celular");
      JLabel label5 = new JLabel("Domicilio");

      //Áreas de texto
      JTextField nombre = new JTextField();
      JTextField apellidos = new JTextField();
      JTextField correo = new JTextField();
      JTextField celular = new JTextField();
      JTextField domicilio = new JTextField();

      //Botón de envío
      JButton boton_registro = new JButton("Aceptar");

      JPanel panel1 = new JPanel(new GridLayout(1,2));
      JPanel panel_1 = new JPanel(new GridLayout(7,2,0,20));

      panel_1.add(label0);
      panel_1.add(new JLabel(""));
      panel_1.add(label1);
      panel_1.add(nombre);
      panel_1.add(label2);
      panel_1.add(apellidos);
      panel_1.add(label3);
      panel_1.add(correo);
      panel_1.add(label4);
      panel_1.add(celular);
      panel_1.add(label5);
      panel_1.add(domicilio);
      panel_1.add(new JLabel(""));
      panel_1.add(boton_registro);

      panel1.add(panel_1);
      panel1.add(estampa);

      boton_registro.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evento) {
            String co=correo.getText();
            String nom=nombre.getText();
            String aps=apellidos.getText();
            String dom=domicilio.getText();
            int cel = Integer.parseInt(celular.getText());

            boolean se_pudo = agregaNuevoContacto(nom,aps,co,dom,cel);

            if(se_pudo) {
               JOptionPane.showMessageDialog(null, "Contacto agregado exitosamente ", "exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
               JOptionPane.showMessageDialog(null, "ocurrio un error ", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
         }
      });
      panelFichas.addTab("Agregar Contacto", panel1);
   }

   public void ponPestaniaVerTodo() {

      // PESTAÑA DE VER CONTACTOS
      JLabel todo = new JLabel();

      JPanel panel = new JPanel(new GridLayout(1,2));
      JPanel panel_interno = new JPanel(new GridLayout(6,5,10,10));

      Color c1 = new Color(64,224,208);
      panel_interno.setBackground(c1);
      Color blanco = new Color(255,255,255);
      panel.setBackground(blanco);

      Icon imagen1 = new ImageIcon("letras/A.jpg");
      JLabel letra_a = new JLabel(imagen1);
      Icon imagen2 = new ImageIcon("letras/B.jpg");
      JLabel letra_b = new JLabel(imagen2);
      Icon imagen3 = new ImageIcon("letras/C.jpg");
      JLabel letra_c = new JLabel(imagen3);
      Icon imagen4 = new ImageIcon("letras/D.jpg");
      JLabel letra_d = new JLabel(imagen4);
      Icon imagen5 = new ImageIcon("letras/E.jpg");
      JLabel letra_e = new JLabel(imagen5);
      Icon imagen6 = new ImageIcon("letras/F.jpg");
      JLabel letra_f = new JLabel(imagen6);
      Icon imagen7 = new ImageIcon("letras/G.jpg");
      JLabel letra_g = new JLabel(imagen7);
      Icon imagen8 = new ImageIcon("letras/H.jpg");
      JLabel letra_h = new JLabel(imagen8);
      Icon imagen9 = new ImageIcon("letras/I.jpg");
      JLabel letra_i = new JLabel(imagen9);
      Icon imagen10 = new ImageIcon("letras/J.jpg");
      JLabel letra_j = new JLabel(imagen10);
      Icon imagen11 = new ImageIcon("letras/K.jpg");
      JLabel letra_k = new JLabel(imagen11);
      Icon imagen12 = new ImageIcon("letras/L.jpg");
      JLabel letra_l = new JLabel(imagen12);
      Icon imagen13 = new ImageIcon("letras/M.jpg");
      JLabel letra_m = new JLabel(imagen13);
      Icon imagen14 = new ImageIcon("letras/N.jpg");
      JLabel letra_n = new JLabel(imagen14);
      Icon imagen15 = new ImageIcon("letras/O.jpg");
      JLabel letra_o = new JLabel(imagen15);
      Icon imagen16 = new ImageIcon("letras/P.jpg");
      JLabel letra_p = new JLabel(imagen16);
      Icon imagen17 = new ImageIcon("letras/Q.jpg");
      JLabel letra_q = new JLabel(imagen17);
      Icon imagen18 = new ImageIcon("letras/R.jpg");
      JLabel letra_r = new JLabel(imagen18);
      Icon imagen19 = new ImageIcon("letras/S.jpg");
      JLabel letra_s = new JLabel(imagen19);
      Icon imagen20 = new ImageIcon("letras/T.jpg");
      JLabel letra_t = new JLabel(imagen20);
      Icon imagen21 = new ImageIcon("letras/U.jpg");
      JLabel letra_u = new JLabel(imagen21);
      Icon imagen22 = new ImageIcon("letras/V.jpg");
      JLabel letra_v = new JLabel(imagen22);
      Icon imagen23 = new ImageIcon("letras/W.jpg");
      JLabel letra_w = new JLabel(imagen23);
      Icon imagen24 = new ImageIcon("letras/X.jpg");
      JLabel letra_x = new JLabel(imagen24);
      Icon imagen25 = new ImageIcon("letras/Y.jpg");
      JLabel letra_y = new JLabel(imagen25);
      Icon imagen26 = new ImageIcon("letras/Z.jpg");
      JLabel letra_z = new JLabel(imagen26);

      panel_interno.add(letra_a);
      panel_interno.add(letra_b);
      panel_interno.add(letra_c);
      panel_interno.add(letra_d);
      panel_interno.add(letra_e);
      panel_interno.add(letra_f);
      panel_interno.add(letra_g);
      panel_interno.add(letra_h);
      panel_interno.add(letra_i);
      panel_interno.add(letra_j);
      panel_interno.add(letra_k);
      panel_interno.add(letra_l);
      panel_interno.add(letra_m);
      panel_interno.add(letra_n);
      panel_interno.add(letra_o);
      panel_interno.add(letra_p);
      panel_interno.add(letra_q);
      panel_interno.add(letra_r);
      panel_interno.add(letra_s);
      panel_interno.add(letra_t);
      panel_interno.add(letra_u);
      panel_interno.add(letra_v);
      panel_interno.add(letra_w);
      panel_interno.add(letra_x);
      panel_interno.add(letra_y);
      panel_interno.add(letra_z);


      letra_a.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('A');
            todo.setText(resp);

         }
      });

      letra_b.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('B');
            todo.setText(resp);

         }
      });

      letra_c.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('C');
            todo.setText(resp);

         }
      });

      letra_d.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('D');
            todo.setText(resp);

         }
      });

      letra_e.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('E');
            todo.setText(resp);

         }
      });

      letra_f.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('F');
            todo.setText(resp);

         }
      });

      letra_g.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('G');
            todo.setText(resp);

         }
      });

      letra_h.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('H');
            todo.setText(resp);

         }
      });

      letra_i.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('I');
            todo.setText(resp);

         }
      });

      letra_j.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('J');
            todo.setText(resp);

         }
      });

      letra_k.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('K');
            todo.setText(resp);

         }
      });

      letra_l.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('L');
            todo.setText(resp);

         }
      });

      letra_m.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('M');
            todo.setText(resp);

         }
      });

      letra_n.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('N');
            todo.setText(resp);

         }
      });

      letra_o.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('O');
            todo.setText(resp);

         }
      });

      letra_p.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('P');
            todo.setText(resp);

         }
      });

      letra_q.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('Q');
            todo.setText(resp);

         }
      });

      letra_r.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('R');
            todo.setText(resp);

         }
      });

      letra_s.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('S');
            todo.setText(resp);

         }
      });

      letra_t.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('T');
            todo.setText(resp);

         }
      });

      letra_u.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('U');
            todo.setText(resp);

         }
      });

      letra_v.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('V');
            todo.setText(resp);

         }
      });

      letra_w.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('W');
            todo.setText(resp);

         }
      });

      letra_x.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('X');
            todo.setText(resp);

         }
      });

      letra_y.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('Y');
            todo.setText(resp);

         }
      });

      letra_z.addMouseListener(new MouseAdapter()  {
         public void mouseClicked(MouseEvent e)  {
            String resp=" ";
            resp = buscaContactoPorInicial('Z');
            todo.setText(resp);

         }
      });

      panel.add(panel_interno);
      panel.add(todo);
      panelFichas.addTab( "Ver contactos", null, panel);
   }

   public void ponPestaniaBusqueda() {

      // PESTAÑA DE BUSQUEDA
      Icon imagen = new ImageIcon("buscar.jpg");
      JLabel estampa = new JLabel(imagen);

      JPanel panel = new JPanel(new GridLayout(1,2));
      JPanel panel_1 = new JPanel(new GridLayout(3,2,-100,30));

      //Etiquetas de los mensajes
      JLabel label_b0 = new JLabel("Encuentra Contactos por nombre");
      JLabel label_b1 = new JLabel("Nombre del contacto");

      //Áreas de texto
      JTextField search = new JTextField();

      //botón
      JButton boton_busqueda = new JButton("Buscar");

      panel_1.add(label_b0);
      panel_1.add(new JLabel(""));
      panel_1.add(label_b1);
      panel_1.add(search);
      panel_1.add(new JLabel(""));
      panel_1.add(boton_busqueda);
      panel.add(panel_1 );
      panel.add(estampa);

      boton_busqueda.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evento) {
            String busqueda=search.getText();
            String respuesta=buscaContactos(busqueda);
            JOptionPane.showMessageDialog(null, respuesta, "exito", JOptionPane.INFORMATION_MESSAGE);

         }
      });

      panelFichas.addTab("Buscar contacto", panel);

   }

   public void ponPestaniaBorrar() {

      // PESTAÑA DE BORRADO
      Icon imagen = new ImageIcon("delete.jpg");
      JLabel estampa = new JLabel(imagen);

      JPanel panel = new JPanel(new GridLayout(1,2));
      JPanel panel_1 = new JPanel(new GridLayout(3,2,-80,30));
      Color mi_color = new Color(255,255,255);
      panel.setBackground(mi_color);

      //Etiquetas de los mensajes
      JLabel label_b0 = new JLabel("Borra un un contacto");
      JLabel label_b1 = new JLabel("Correo electrónico");

      //Áreas de texto
      JTextField borrar = new JTextField();

      //botón
      JButton boton_borrar = new JButton("Borrar");

      panel_1.add(label_b0);
      panel_1.add(new JLabel(""));
      panel_1.add(label_b1);
      panel_1.add(borrar);
      panel_1.add(new JLabel(""));
      panel_1.add(boton_borrar);
      panel.add(panel_1 );
      panel.add(estampa);

      boton_borrar.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evento) {
            String delete=borrar.getText();
            boolean borrado=borraContacto(delete);
            if(borrado) {
              JOptionPane.showMessageDialog(null,"Contacto borrado","exito", JOptionPane.INFORMATION_MESSAGE);
           } else {
               JOptionPane.showMessageDialog(null,"No se encontró ningún contacto con ese correo electrónico", "error", JOptionPane.ERROR_MESSAGE);
           }
         }
      });
      panelFichas.addTab( "Borrar contacto", panel);
   }

   public void ponPestaniaSalir() {
      // PESTAÑA DE SALIR
      Icon imagen = new ImageIcon( "salir.png" );
      JLabel estampa = new JLabel(imagen);
      JPanel panel = new JPanel(new GridLayout(1,2)); // crea el segundo panel
      JButton boton_salir = new JButton("Salir");
      panel.add(boton_salir);
      panel.add(estampa);
      boton_salir.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evento) {
           grabar();
           System.exit(1);
         }
      });
      panelFichas.addTab( "Cerrar sesión", panel);
   }


   /**
    * Este metodo muestra la ventana de inicio de sesion
    * y ajusta propiedades como sus dimesiones y
    * la funcion del boton que cierra la ventana
    */
   public static void muestraInterfaz() {
      Menu m = new Menu();
      m.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      m.setSize( 850, 400 );
      m.setVisible( true );
      m.setResizable(false);
   }

   public boolean agregaNuevoContacto(String n, String aps, String c, String dom, int t) {
      Contacto nuevo = new Contacto(n, aps, c, dom, t);
      agenda.add(nuevo);
      return true;
   }

   public String buscaContactos(String cadena) {
      String res="<html>";
      for(int i=0; i<agenda.size(); i++) {
         String cad=(agenda.get(i)).toString();
         if(cad.contains(cadena)) {
            res+="<br>"+cad;
         }
      }
      return res;
   }


   public boolean borraContacto(String correo) {
      boolean borrado=false;
      for(int i=0; i<agenda.size(); i++) {
        String cp=agenda.get(i).getCorreo();
        if(cp.equals(correo)) {
         agenda.remove(i);
         borrado=true;
        }
      }
      return borrado;
   }

   public String buscaContactoPorInicial(char c) {
      String respuesta="<html>";
      int cuenta=0;
      for(int i=0; i<agenda.size(); i++) {
         String nom = agenda.get(i).getNombre();
         char c2 = nom.charAt(0);
         if(c2 == c) {
            cuenta++;
            respuesta+="<br>"+agenda.get(i);
         }
      }
      if(cuenta==0) {
         respuesta+="<p>No se encontraron contactos con la incial " + c + "</p>";
      }
      respuesta+="</html>";
      return respuesta;
   }


   /**
    * Metodo leerContactos
    * abre el archivo si este existe y carga la informacion
    * a la agenda
    */
   public ArrayList leerContactos(){
      try{
         ObjectInputStream lector=new ObjectInputStream(new FileInputStream(nombreArchivo));
         ArrayList<Contacto> agenda = (ArrayList<Contacto>) lector.readObject();
         lector.close();
         this.agenda=agenda;
      }
      catch(IOException e){
         System.out.println("Lectura fallida: "+e);
      }
      catch(ClassNotFoundException e){
         System.out.println("Lectura fallida: "+e);
      }
      return agenda;
   }


   /**
    * Metodo grabar
    * envia a un archivo la informacion contenida en la agenda
    */
   public void grabar(){
      try{
         ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
         a.writeObject(agenda);
         a.close();
      }
      catch(NotSerializableException e){
         System.out.println("Error en la grabacion: "+e+"Objeto no serializable");
      }
      catch(IOException e){
         System.out.println("Error en la grabacion: "+e);
      }

   }

} // fin de la clase Menu