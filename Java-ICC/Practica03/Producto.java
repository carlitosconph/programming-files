import java.io.Serializable;

public class Producto implements Serializable{

  //! ATTRIBUTES
  String barCode;
  String nameProduct;
  int units;
  double price;

  //! CONSTRUCTOR
  public Producto(String barCode, String nameProduct, int units, double price ){
    this.barCode = barCode;
    this.nameProduct = nameProduct;
    this.units = units;
    this.price = price;
  }

  //! SETTERS AND GETTERS
  public void setBarCode(String barCode){this.barCode = barCode;}
  public String getBarCode(){return barCode;}

  public void setNameProduct(String nameProduct){this.nameProduct = nameProduct;}
  public String getNameProduct(){return nameProduct;}

  public void setUnits(int units){this.units = units;}
  public int getUnits(){return units;}

  public void setPrice(Double price){this.price = price;}
  public double getPrice(){return price;}

  //! toString
  public String toString(){return barCode + " - " + nameProduct + ", " + units + " unidades $" + price + " c/u";}
}
