public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, boolean hasSidecar) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    public Motorcycle(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }

    public void onlyMotocycleMethods(){
        System.out.println("This method is only member on Motorcycle");
    }


    //Nested Class
    class Engine {
        private String type;

        public Engine(String type) {
            this.type = type;
        }

        public void displayEngineInfo() {
            System.out.println("Engine Type: " + type);

            //A nested class has access to all the private members of its enclosing class—both fields and methods. Therefore, a public or protected nested class inherited by a subclass has indirect access to all of the private members of the superclass.
            System.out.println("Has sidecar: " + hasSidecar);
        }
    }
}