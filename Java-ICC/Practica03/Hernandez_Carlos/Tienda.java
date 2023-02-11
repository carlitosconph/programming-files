import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Tienda {

  Double finalPrice = 0.0;
  String fileName = "";
  String fileNamePrice = "";
  ArrayList<Producto> producList;
  ArrayList<Double> priceList;
  Scanner scanner = new Scanner(System.in);

  public Tienda() {
  }

  public Tienda(String fileName, String fileNamePrice) throws RuntimeException {
    this.fileName = fileName;
    File archivoProductos = new File(fileName);
    if (archivoProductos.exists()) {
      if (!archivoProductos.canRead()) {
        throw new RuntimeException("No se puede leer el archivo " + fileName);
      }
      if (!archivoProductos.canWrite()) {
        throw new RuntimeException("No se puede escribir en el archivo " + fileName);
      }
      producList = leerProductos();
    } else {
      producList = new ArrayList<Producto>();
    }

    this.fileNamePrice = fileNamePrice;
    File archivoProductosVentas = new File(fileNamePrice);
    if (archivoProductosVentas.exists()) {
      if (!archivoProductosVentas.canRead()) {
        throw new RuntimeException("No se puede leer el archivo " + fileNamePrice);
      }
      if (!archivoProductosVentas.canWrite()) {
        throw new RuntimeException("No se puede escribir en el archivo " + fileNamePrice);
      }
      priceList = leerProductosPrice();
    } else {
      priceList = new ArrayList<Double>();
    }
  }

  public void ejecutaPrograma() {

    Tienda tienda = new Tienda("productos.ser", "ventaProductos.ser");

    boolean menu = true;
    int option;

    while (menu) {
      System.out.println("\nQuieres acceder como administrador[0] o como cliente[1]? ");
      option = scanner.nextInt();

      // ! ADMINISTRADOR
      if (option == 0) {
        menu = false;
        Scanner scannerAdministrador = new Scanner(System.in);
        int optionAdministrador = 0;

        while (optionAdministrador != 8) {
          System.out.println("\nQue accion deseas realizar? ");
          System.out.println("1. Anadir producto nuevo");
          System.out.println("2. Actualizar producto");
          System.out.println("3. Quitar producto del stock");
          System.out.println("4. Ver todos los productos");
          System.out.println("5. Buscar producto");
          System.out.println("6. Surtir inventario");
          System.out.println("7. Ver ventas");
          System.out.println("8. Salir");
          optionAdministrador = scannerAdministrador.nextInt();

          switch (optionAdministrador) {
            case 1:
              try {
                tienda.anadirProductoNuevo();
                tienda.grabar();
              } catch (CodigoMalFormadoException CMFE) {
                System.out.println(CMFE);
              } catch (CodigoYaRegistradoException CYRE) {
                System.out.println(CYRE);
              }
              break;
            case 2:
              try {
                tienda.actualizarProducto();
                tienda.grabar();
              } catch (CodigoMalFormadoException CMFE) {
                System.out.println(CMFE);
              } catch (CodigoNoExistenteException CNEE) {
                System.out.println(CNEE);
              }
              break;
            case 3:
              try {
                tienda.quitarProductoStock();
                tienda.grabar();
              } catch (CodigoMalFormadoException CMFE) {
                System.out.println(CMFE);
              } catch (CodigoNoExistenteException CNEE) {
                System.out.println(CNEE);
              }
              break;
            case 4:
              tienda.verTodosLosProductos();
              break;
            case 5:
              tienda.buscarProducto();
              break;
            case 6:
              try {
                tienda.surtirInventario();
                tienda.grabar();
              } catch (CodigoMalFormadoException CMFE) {
                System.out.println(CMFE);
              } catch (CodigoNoExistenteException CNEE) {
                System.out.println(CNEE);
              }
              break;
            case 7:
              tienda.verVentas();
              break;
          }
        }

        // ! CLIENTE
      } else if (option == 1) {
        //menu = false;
        Boolean comprando = true;
        Scanner scannerCliente = new Scanner(System.in);
        int numberProduct = 0;
        int unitsBuy = 0;

        while (comprando) {
          tienda.mostrarProductosCliente();
          System.out.println("\nIngresa el numero del producto que deseas adquirir: ");
          System.out.println("Si deseas terminar tu compra, ingresa [-1].");
          numberProduct = scannerCliente.nextInt();

          if (numberProduct != -1) {
            System.out.println("Ingresa la cantidad que desas comprar: ");
            unitsBuy = scannerCliente.nextInt();
            finalPrice += tienda.comprarProductos(numberProduct, unitsBuy);
            tienda.grabarPrecios();
            tienda.grabar();
          } else {
            comprando = false;
            break;
          }
        }
        tienda.anadirPrecio(finalPrice);
        System.out.println("El precio por todos los articulos que adquiriste es: " + finalPrice);
        tienda.grabarPrecios();
        tienda.grabar();

      } else {
        System.out.println("Esa opcion no es valida. Intenta de nuevo. ");
      }
    }
    grabar();
    tienda.grabar();
    tienda.grabarPrecios();
  }

  // !METHODS

  // ! ADD NEW PRODUCT
  public void anadirProductoNuevo() throws CodigoMalFormadoException, CodigoYaRegistradoException {

    Scanner scannerNewProductoString = new Scanner(System.in);
    Scanner scannerNewProductoInt = new Scanner(System.in);
    boolean add = true;
    boolean valid = true;

    String barCode;
    String nameProduct;
    int units;
    double price;

    System.out.println("Dime el codigo de barras del producto a agregar: ");
    barCode = scannerNewProductoString.nextLine();
    String lettersBarCode = "";
    String numbersBarCode = "";

    for (int indexBarCode = 0; indexBarCode < barCode.length(); indexBarCode++) {

      if (indexBarCode != 5 && indexBarCode != 6) {
        lettersBarCode += barCode.charAt(indexBarCode);
      } else {
        numbersBarCode += barCode.charAt(indexBarCode);
      }
    }

    // | CODIGO DE BARRAS MAL FORMADO
    for (int indexLetters = 0; indexLetters < lettersBarCode.length(); indexLetters++) {
      char letter = lettersBarCode.charAt(indexLetters);
      if (!((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') || letter == ' ')) {
        valid = false;
      }
    }

    for (int indexNumbers = 0; indexNumbers < numbersBarCode.length(); indexNumbers++) {
      char numberChar = numbersBarCode.charAt(indexNumbers);
      if ((numberChar < '0' || numberChar > '9')) {
        valid = false;
      }
    }

    // | CODIGO DE BARRAS EXISTENTE
    for (Producto product : producList) {
      if (product.barCode.equals(barCode.toUpperCase())) {
        add = false;
        throw new CodigoYaRegistradoException(
            "El codigo de barras que ingresaste ya ha sido registrado. Por lo tanto no puedes anadir este producto.");
      }
    }

    if (!valid || barCode.length() != 7) {
      add = false;
      throw new CodigoMalFormadoException(
          "El codigo de barras esta mal formado. Por lo tanto no puedes anadir este producto. ");
    } else {
      System.out.println("Dime el nombre del producto a agregar: ");
      nameProduct = scannerNewProductoString.nextLine();

      System.out.println("Dime la cantidad de unidades del producto a agregar: ");
      units = scannerNewProductoInt.nextInt();

      System.out.println("Dime el precio del producto a agregar: ");
      price = scannerNewProductoString.nextFloat();

      if (add) {
        Producto newProducto = new Producto(barCode.toUpperCase(), nameProduct, units, price);
        producList.add(newProducto);
        System.out.println("El producto se anadio con exito.");
      }
    }
  }

  // ! UPDATE PRODUCT
  public void actualizarProducto() throws CodigoMalFormadoException, CodigoNoExistenteException {
    Scanner scannerBarCode = new Scanner(System.in);
    String barCode = "";
    boolean add = true;
    boolean valid = true;
    boolean update = false;

    System.out.println("Dime el codigo de barras del producto que deseas actualizar: ");
    barCode = scannerBarCode.nextLine();
    String lettersBarCode = "";
    String numbersBarCode = "";

    for (int indexBarCode = 0; indexBarCode < barCode.length(); indexBarCode++) {

      if (indexBarCode != 5 && indexBarCode != 6) {
        lettersBarCode += barCode.charAt(indexBarCode);
      } else {
        numbersBarCode += barCode.charAt(indexBarCode);
      }
    }

    // | CODIGO DE BARRAS MAL FORMADO
    for (int indexLetters = 0; indexLetters < lettersBarCode.length(); indexLetters++) {
      char letter = lettersBarCode.charAt(indexLetters);
      if (!((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') || letter == ' ')) {
        valid = false;
      }
    }

    for (int indexNumbers = 0; indexNumbers < numbersBarCode.length(); indexNumbers++) {
      char numberChar = numbersBarCode.charAt(indexNumbers);
      if ((numberChar < '0' || numberChar > '9')) {
        valid = false;
      }
    }

    if (!valid || barCode.length() != 7) {
      add = false;
      throw new CodigoMalFormadoException(
          "El codigo de barras esta mal formado. Por lo tanto no puedes actualizar este producto. ");
    } else {
      // | CODIGO DE BARRAS NO EXISTENTE
      for (Producto product : producList) {
        if ((product.barCode.equals(barCode.toUpperCase()))) {
          update = true;
        }
      }

      if (!update) {
        throw new CodigoNoExistenteException(
            "El codigo de barras que ingresaste no ha sido registrado. Por lo tanto no puedes actualizar este producto.");
      }
      if (add) {
        int optionUpdate;
        Scanner scannerPrice = new Scanner(System.in);
        Scanner scannerName = new Scanner(System.in);
        Boolean optionUpdateIf = true;

        while (optionUpdateIf) {

          System.out.println("\nDime que quieres actualizar, el nombre [0] o el precio [1]: ");
          optionUpdate = scannerPrice.nextInt();

          // ! UPDATE NAME
          if (optionUpdate == 0) {
            optionUpdateIf = false;
            System.out.println("Dime el nuevo nombre para el producto");
            String newName = scannerName.nextLine();

            for (Producto product : producList) {
              if (product.barCode.equals(barCode.toUpperCase())) {
                product.setNameProduct(newName);
              }
            }

            System.out.println("El nombre se actualizo correctamente. ");

            // ! UPDATE PRICE
          } else if (optionUpdate == 1) {
            optionUpdateIf = false;
            System.out.println("Dime el nuevo precio para el producto");
            Double newPrice = scannerPrice.nextDouble();

            for (Producto product : producList) {
              if (product.barCode.equals(barCode.toUpperCase())) {
                product.setPrice(newPrice);
              }
            }

            System.out.println("El precio se actualizo correctamente. ");

          } else {
            System.out.println("Esa option no es valida, prueba de nuevo. ");
          }
        }
      }
    }

  }

  // ! REMOVE PRODUCT
  public void quitarProductoStock() throws CodigoMalFormadoException, CodigoNoExistenteException {
    Scanner scannerBarCode = new Scanner(System.in);
    String barCode = "";
    boolean remove = true;
    boolean valid = true;
    boolean update = false;
    Producto productRemove = new Producto(null, null, 0, 0);

    System.out.println("Dime el codigo de barras del producto que deseas remover: ");
    barCode = scannerBarCode.nextLine();
    String lettersBarCode = "";
    String numbersBarCode = "";

    for (int indexBarCode = 0; indexBarCode < barCode.length(); indexBarCode++) {

      if (indexBarCode != 5 && indexBarCode != 6) {
        lettersBarCode += barCode.charAt(indexBarCode);
      } else {
        numbersBarCode += barCode.charAt(indexBarCode);
      }
    }

    // | CODIGO DE BARRAS MAL FORMADO
    for (int indexLetters = 0; indexLetters < lettersBarCode.length(); indexLetters++) {
      char letter = lettersBarCode.charAt(indexLetters);
      if (!((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') || letter == ' ')) {
        valid = false;
      }
    }

    for (int indexNumbers = 0; indexNumbers < numbersBarCode.length(); indexNumbers++) {
      char numberChar = numbersBarCode.charAt(indexNumbers);
      if ((numberChar < '0' || numberChar > '9')) {
        valid = false;
      }
    }

    if (!valid || barCode.length() != 7) {
      remove = false;
      throw new CodigoMalFormadoException(
          "El codigo de barras esta mal formado. Por lo tanto no puedes remover este producto. ");
    } else {
      // | CODIGO DE BARRAS NO EXISTENTE
      for (Producto product : producList) {
        if ((product.barCode.equals(barCode.toUpperCase()))) {
          update = true;
        }
      }

      if (!update) {
        throw new CodigoNoExistenteException(
            "El codigo de barras que ingresaste no ha sido registrado. Por lo tanto no puedes remover este producto.");
      }
      if (remove) {
        for (Producto product : producList) {
          if (product.barCode.equals(barCode.toUpperCase())) {
            productRemove = product;
          }

        }
        producList.remove(productRemove);
        System.out.println("Producto removido de forma exitosa. ");
      }
    }
  }

  // ! SEE ALL PRODUCTS
  public void verTodosLosProductos() {
    boolean productExists = true;

    System.out.println("Productos Disponibles: ");
    for (Producto product : producList) {
      System.out.println(product);
      productExists = false;
    }
    if(productExists){
      System.out.println("No hay productos en la tienda. ");
    }
  }

  // ! SEARCH PRODUCT
  public void buscarProducto() {
    Scanner scannerWord = new Scanner(System.in);
    String wordSearch = "";
    boolean found = false;

    System.out.println("Dime la palabra que quieras buscar: ");
    wordSearch = scannerWord.nextLine();

    System.out.println("Estos son los productos que coinciden con la palabra que ingresaste: ");
    for (Producto product : producList) {
      if (product.nameProduct.contains(wordSearch)) {
        found = true;
        System.out.println(product);
      }
    }

    if (!found) {
      System.out.println("No se encontraron coincidencias. ");
    }
  }

  // ! STOCKING INVENTORY
  public void surtirInventario() throws CodigoMalFormadoException, CodigoNoExistenteException {
    Scanner scannerBarCode = new Scanner(System.in);
    Scanner scannerUnits = new Scanner(System.in);
    int newUnits = 0;
    String barCode = "";
    boolean add = true;
    boolean valid = true;
    boolean update = false;
    Producto productRemove = new Producto(null, null, 0, 0);

    System.out.println("Dime el codigo de barras del producto que deseas actualizar: ");
    barCode = scannerBarCode.nextLine().toUpperCase();
    String lettersBarCode = "";
    String numbersBarCode = "";

    for (int indexBarCode = 0; indexBarCode < barCode.length(); indexBarCode++) {

      if (indexBarCode != 5 && indexBarCode != 6) {
        lettersBarCode += barCode.charAt(indexBarCode);
      } else {
        numbersBarCode += barCode.charAt(indexBarCode);
      }
    }

    // | CODIGO DE BARRAS MAL FORMADO
    for (int indexLetters = 0; indexLetters < lettersBarCode.length(); indexLetters++) {
      char letter = lettersBarCode.charAt(indexLetters);
      if (!((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') || letter == ' ')) {
        valid = false;
      }
    }

    for (int indexNumbers = 0; indexNumbers < numbersBarCode.length(); indexNumbers++) {
      char numberChar = numbersBarCode.charAt(indexNumbers);
      if ((numberChar < '0' || numberChar > '9')) {
        valid = false;
      }
    }

    if (!valid || barCode.length() != 7) {
      add = false;
      throw new CodigoMalFormadoException(
          "El codigo de barras esta mal formado. Por lo tanto no puedes actualizar este producto. ");
    } else {
      // | CODIGO DE BARRAS NO EXISTENTE
      for (Producto product : producList) {
        if ((product.barCode.equals(barCode))) {
          update = true;
        }
      }

      if (!update) {
        throw new CodigoNoExistenteException(
            "El codigo de barras que ingresaste no ha sido registrado. Por lo tanto no puedes actualizar este producto.");
      }
      if (add) {
        System.out.println("Dime la cantidad de unidades que deseas agregar: ");
        newUnits = scannerUnits.nextInt();

        for (Producto product : producList) {
          if (product.barCode.equals(barCode)) {
            product.units += newUnits;
          }

        }
      }
    }
  }

  // ! SEE SALES
  public void verVentas() {
    System.out.println();
    for (int i = 0; i < priceList.size(); i++) {
      System.out.println(i+1 + " - $" + priceList.get(i));
    }
  }

  // ! BUY
  public void mostrarProductosCliente() {
    for (int i = 0; i < producList.size(); i++) {
      System.out.println(i + 1 + ". " + producList.get(i));
    }
  }

  // ! UPDATE PRODUCT(BUY)
  public double comprarProductos(int numberProduct, int unitsBuy) {
    double finalPrice = 0.0;
    for (int i = 0; i < producList.size(); i++) {
      if (i == numberProduct - 1) {
        if (producList.get(i).units >= unitsBuy) {
          producList.get(i).units -= unitsBuy;
          finalPrice += unitsBuy * producList.get(i).price;
          System.out.println("Compra exitosa. ");
        } else {
          System.out.println("Compra fallida por falta de unidades. ");
        }
      }
    }
    return finalPrice;
  }

  //! ADD PRICE LIST
  public void anadirPrecio(double finalPrice){
    priceList.add(finalPrice);
  }

  // ! SAVE PRODUCTLIST
  public void grabar() {
    try {
      ObjectOutputStream tienda = new ObjectOutputStream(new FileOutputStream(fileName));
      tienda.writeObject(producList);
      tienda.close();
    } catch (NotSerializableException e) {
      System.out.println("Error de grabacion " + e + " Objeto no serializable");
    } catch (IOException e) {
      System.out.println();
    }
  }

  // ! SAVE PRODUCTLIST PRICE
  public void grabarPrecios() {
    try {
      ObjectOutputStream tienda = new ObjectOutputStream(new FileOutputStream(fileNamePrice));
      tienda.writeObject(priceList);
      tienda.close();
    } catch (NotSerializableException e) {
      System.out.println("Error de grabacion " + e + " Objeto no serializable");
    } catch (IOException e) {
      System.out.println();
    }
  }

  // ! READ FILE
  public ArrayList<Producto> leerProductos() {
    try {
      ObjectInputStream lector = new ObjectInputStream(new FileInputStream(fileName));
      ArrayList<Producto> producList = (ArrayList<Producto>) lector.readObject();
      lector.close();
      this.producList = producList;
    } catch (IOException e) {
      System.out.println("Lectura fallida " + e);
    } catch (ClassNotFoundException e) {
      System.out.println("Lectura faliida " + e);
    }

    return producList;
  }

  public ArrayList<Double> leerProductosPrice(){
    try{
      ObjectInputStream lector2 = new ObjectInputStream(new FileInputStream(fileNamePrice));
      ArrayList<Double> priceList = (ArrayList<Double>) lector2.readObject();
      lector2.close();
      this.priceList = priceList;
    } catch (IOException e) {
      System.out.println("Lectura fallida " + e);
    } catch (ClassNotFoundException e) {
      System.out.println("Lectura faliida " + e);
    }
    return priceList;
  }

}
