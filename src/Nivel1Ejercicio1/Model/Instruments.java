package Nivel1Ejercicio1.Model;

public abstract class Instruments {
    protected String name;
    protected double price;

    public Instruments(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public double getPrice() {

        return price;
    }

  /*public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }*/

    public abstract String playInstrument();

}
