public interface Bicycle {
    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);


    //We can have default methods in interfaces
    default void defaultFunc(){
        System.out.println("This is Default method in Bicycle Interface");
    }


    //We can have Static methods in interfaces
    static void staticFunc(){
        System.out.println("This is Static method in Bicycle Interface");
    }
}