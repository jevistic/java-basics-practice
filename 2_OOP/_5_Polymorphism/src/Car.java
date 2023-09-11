class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting the car's engine.");
    }

    void drive() {
        System.out.println("Driving the car.");
    }
}