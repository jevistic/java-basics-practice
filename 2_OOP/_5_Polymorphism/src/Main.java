public class Main {
    public static void main(String[] args) {
        System.out.println("Polymorphsim");


        // Create objects of the Animal class and its subclasses
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Calling makeSound() method
        animal1.makeSound(); // The dog barks
        animal2.makeSound(); // The cat meows





        //Overriding
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Motorcycle();

        vehicle1.startEngine(); //Starting the car's engine.
        vehicle2.startEngine(); //Starting the motorcycle's engine.

        // It will give compilation errors because the methods drive() and ride() are not part of the Vehicle class.
        // vehicle1.drive();
        // vehicle2.ride();

        // We can still access those methods by casting to the appropriate type:
        ((Car) vehicle1).drive();
        ((Motorcycle) vehicle2).ride();





        Bicycle bike1, bike2, bike3;

        bike1 = new Bicycle(20, 10, 1);
        bike2 = new MountainBike(20, 10, 5, "Dual");
        bike3 = new RoadBike(40, 20, 8, 23);

        bike1.printDescription();
        bike2.printDescription();
        bike3.printDescription();

    }
}