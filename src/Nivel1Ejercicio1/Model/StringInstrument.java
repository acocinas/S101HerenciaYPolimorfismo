package Nivel1Ejercicio1.Model;

public class StringInstrument extends Instruments {
    public StringInstrument(String name, double price) {
        super(name, price);
    }

    public String playInstrument() {
        return "Está tocando un instrumento de cuerda llamado " + getName() + " y que tiene un precio de "
                + getPrice() + " € y que suena tal que así 'twang twang twang' ";
    }

}
