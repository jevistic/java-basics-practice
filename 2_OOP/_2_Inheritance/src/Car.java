public class Car extends Vehicle {

    //You can declare new fields in the subclass that are not in the superclass.
    private int year;

    //You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it
    protected String brand;

    public Car(String brand, String model, int year) {
        //You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.
        super(brand, model);

        this.brand = brand;
        this.year = year;
    }

    //You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
    @Override
    public void displayInfo() {
        //The inherited fields can be used directly, just like any other fields.
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

        //A subclass does not inherit the private members of its parent class. However, if the superclass has public or protected methods for accessing its private fields, these can also be used by the subclass.
        //System.out.println("Price: " + price);  //private member is not accessible here (Only with the help of setters and getters

        //The inherited methods can be used directly as they are.
        onlyVehicleMethod();
    }

    //You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
    public static void staticMethod(){
        System.out.println("This is the static method of Car class");
    }


    //You can declare new methods in the subclass that are not in the superclass.
    public void drift(){
        System.out.println("The car is drifting...");
    }

}