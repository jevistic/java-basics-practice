//Basic example of class
class Bicycle {

    int price = 0;
    int speed = 0;
    int gear = 1;

    void changePrice(int newValue) {
        price = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("price:" + price + " speed:" + speed + " gear:" + gear);
    }
}
