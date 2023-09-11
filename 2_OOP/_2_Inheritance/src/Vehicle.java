public class Vehicle {
    private String price;
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public void onlyVehicleMethod(){
        System.out.println("This method is only member on Vehicle");
    }

    public static void staticMethod(){
        System.out.println("This is the static method of Vehicle class");
    }

}