package Nivel1Ejercicio2.Model;

public class Car {
    private static final String BRAND = "MiCoche";
    private static String model;
    private final int power;

    public Car(String model, int power) {
        Car.model = model;
        this.power = power;
    }

    public static String getBrand() {
        return BRAND;
    }

    public static String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public static void setModel(String model) {
        Car.model = model;
    }
    public static void brake (){
        System.out.println("El coche está frenando");
    }
    public void accelerate (){
        System.out.println("El coche está acelerando");
    }
}
