package Nivel2Ejercicio1.Main;

import Nivel2Ejercicio1.Model.Smartphone;

public class Main {
    public static void main(String[] args) {

        Smartphone mySmartphone = new Smartphone("Pepe", "2025");
        System.out.println("El tlf " + mySmartphone.getBrand() + " modelo " +
                mySmartphone.getModel());
        mySmartphone.toPhotograph();
        mySmartphone.alarm();
        mySmartphone.call("123456789");
    }
}