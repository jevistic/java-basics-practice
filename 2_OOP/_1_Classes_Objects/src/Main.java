//This is our main class with main method
public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Classes and Objects!");

        // Create two different Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on
        // those objects
        bike1.changePrice(5000);
        bike1.speedUp(10);
        bike1.changeGear(2);

        bike2.changePrice(9000);
        bike2.speedUp(20);
        bike2.changeGear(3);

        System.out.println();
        bike2.printStates();
        bike1.printStates();


        //Create two different Car objects
        Car myCar = new Car();

        //can't access directly now with encapsulation
//        myCar.make = "Toyota";
//        myCar.model = "Camry";
//        myCar.year = 2022;
        myCar.setMake("Toyota");
        myCar.setModel("Camry");
        myCar.setYear(2022);

        Car anotherCar = new Car();

        //can't access directly now
//        anotherCar.make = "Ford";
//        anotherCar.model = "Mustang";
//        anotherCar.year = 2023;
        anotherCar.setMake("Ford");
        anotherCar.setModel("Mustang");
        anotherCar.setYear(2023);

        //Accessing methods and properties
        System.out.println();
        myCar.start(); // Output: Car is starting...
        System.out.println("Car make: " + myCar.getMake()); // Output: Car make: Toyota




        //constructors example
        Employee emp = new Employee("Ahmed", 1001);
        System.out.println();
        emp.displayInfo();
        System.out.println();


        Manager manager = new Manager("Ali", 2001, "HR");
        manager.displayInfo();
        System.out.println();

        Developer developer = new Developer("John", 3001, "Java");
        developer.displayInfo();
    }
}

