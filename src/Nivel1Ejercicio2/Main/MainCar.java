package Nivel1Ejercicio2.Main;

import Nivel1Ejercicio2.Model.Car;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Tope Gama", 150);
        System.out.println("El coche 1, de la marca " + Car.getBrand() + " es el modelo " + Car.getModel() +
                " con una potencia de " + car1.getPower() + " cv");
        Car.brake();
        Car car2 = new Car("Media Gama", 120);
        System.out.println("El coche 2, de la marca " + Car.getBrand() + " es el modelo " + Car.getModel() +
                " con una potencia de " + car2.getPower() + " cv");
        Car.brake();
        Car car3 = new Car("Power Gama", 210);
        System.out.println("El coche 3, de la marca " + Car.getBrand() + " es el modelo " + Car.getModel() +
                " con una potencia de " + car3.getPower() + " cv");
        car3.accelerate();
        Car.setModel("Power Plus Gama");
        System.out.println("El coche 3, de la marca " + Car.getBrand() + " es el modelo " + Car.getModel() +
                " con una potencia de " + car3.getPower() + " cv");
        car1.accelerate();
    }
}