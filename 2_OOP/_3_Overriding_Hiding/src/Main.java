public class Main extends Horse implements Flyer, Mythical {
    public static void main(String[] args) {
        System.out.println("Overriding and Hiding!");

        Cat myCat = new Cat();
        Animal myAnimal = myCat;  //implicit casting

        myAnimal.testClassMethod();  //hiding   -static method
        myAnimal.testInstanceMethod();


        //interface methods

        //Instance methods are preferred over interface default methods.
        Main myApp = new Main();
        System.out.println(myApp.identifyMyself());

    }
}