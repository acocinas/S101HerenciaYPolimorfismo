package Nivel1Ejercicio1.Main;

import Nivel1Ejercicio1.Model.PercussionInstrument;
import Nivel1Ejercicio1.Model.StringInstrument;
import Nivel1Ejercicio1.Model.WindInstrument;

public class MainInstruments {
    public static void main(String[] args) {
        StringInstrument guitarra = new StringInstrument("Guitarra", 150.00);
        PercussionInstrument bateria = new PercussionInstrument("Batería", 80.00);
        WindInstrument flauta = new WindInstrument("Flauta", 60.00);

        // Usar el método playInstrument() para cada instrumento
        System.out.println(guitarra.playInstrument());
        System.out.println(bateria.playInstrument());
        System.out.println(flauta.playInstrument());
    }
}