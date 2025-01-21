package Nivel2Ejercicio1.Model;

public class Phone {
    private String brand, model;

    public Phone (String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void call(String phoneNumber){
        System.out.println("Llamando al \n " + phoneNumber );
    }


}
