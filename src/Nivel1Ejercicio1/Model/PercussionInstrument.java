package Nivel1Ejercicio1.Model;

public class PercussionInstrument extends Instruments {

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    public String playInstrument() {
        return "Está tocando un instrumento de percusión llamado " + getName() +
                " con un precio de " + getPrice() + " € y suena tal que así 'ba dum tss'";
    }
}

