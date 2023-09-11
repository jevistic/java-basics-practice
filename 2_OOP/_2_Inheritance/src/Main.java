public class Main {
    public static void main(String[] args) {

        System.out.println("Inheritance");
        System.out.println();

        Car myCar = new Car("Toyota", "Camry", 2022);
        myCar.displayInfo();
        myCar.staticMethod();

        System.out.println();

        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", true);
        myMotorcycle.displayInfo();



        //Casting Objects
        //1. implicit (Upcasting)
        //2. explicit (downcasting)

        Vehicle obj = new Motorcycle("Yamaha", "YBR", true);  //implicit casting (Upcasting)

        System.out.println();
        obj.displayInfo();  //Motorcycle's method will be invoked
        obj.onlyVehicleMethod();  //onlyMotorcycle method is not accessible here.

//        Motorcycle c = new Vehicle("Kawasaki", "H2");  //It's not allowed

//        Motorcycle moto = obj;  //Compile time error

        Motorcycle moto;

        //instanceof operator is used to be safe from ClassCastException.
        if(obj instanceof Motorcycle){
            //It will only downcast if obj is instance of Motocycle class
            moto = (Motorcycle) obj;  //expilict casting  (Downcasting)
            moto.onlyMotocycleMethods();
        }

    }
}