package Nivel1Ejercicio1.Model;

public class WindInstrument extends Instruments {
    public WindInstrument(String name, double price) {
        super(name, price);
    }

    public String playInstrument() {
        return "Está tocando un instrumento de viento llamado " + getName() + " con un precio de "
                + getPrice() + " € y que suena tal que así 'turututu turututu'";
    }
}