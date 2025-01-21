package Nivel2Ejercicio1;

public class Smartphone extends Phone implements Camera, Clock {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }
    public void toPhotograph(){
        System.out.println("Tomando fotografía");
    }
    public void alarm(){
        System.out.println("Sonando la alarma");
    }
}
