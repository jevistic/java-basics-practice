public class ElectricBicycle implements Bicycle{
    int speed = 0;
    int gear = 1;

    // The compiler will now require that methods
    // changeCadence, changeGear, speedUp, and applyBrakes
    // all be implemented. Compilation will fail if those
    // methods are missing from this class.

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" + speed + " gear:" + gear);

        //Calling default method of Bicycle
        defaultFunc();

        //Calling Static method of Bicycle
        Bicycle.staticFunc();
    }
}
