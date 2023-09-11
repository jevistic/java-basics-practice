import java.awt.*;

public class Main implements DoIt{
    public static void main(String[] args) {
        System.out.println("Interfaces");

        ElectricBicycle b = new ElectricBicycle();

        b.speedUp(10);
        b.changeGear(3);

        b.printStates();


        //example GUI Elements

        GUIElement button = new Button();
        GUIElement textField = new TextField();

        button.draw();
        button.onClick();
        button.onHover();

        textField.draw();
        textField.onClick();
        textField.onHover();


        //example relating objects

        Point p1 = new Point(3, 5);
        Point p2 = new Point(5, 9);

        RectanglePlus rectangle1 = new RectanglePlus(p1, 9, 6);
        RectanglePlus rectangle2 = new RectanglePlus(p2, 2, 5);

        //It checks according to area
        System.out.println(rectangle1.isLargerThan(rectangle2));  //1
        System.out.println(rectangle1.isLargerThan(rectangle1));  //0
        System.out.println(rectangle2.isLargerThan(rectangle1));  //-1


        //Interface Evolving
        //We can access default method here without implementing it.


        //Interface as a type
        GUIElement element = new Button();  //instance of a class that implements that interface
        ((Button) element).onMove();   //explicit cast needed to access specific method (onMove)

//        GUIElement element1 = new RectanglePlus();  // no possible.


    }
    public void doSomething(int i, double x){
        System.out.println("Implementing DoIt's method");
    }
    public int doSomethingElse(String s){
        System.out.println("Implementing DoIt's method");
        return 1;
    }
}