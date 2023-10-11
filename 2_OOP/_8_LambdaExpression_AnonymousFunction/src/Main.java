import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Lamba expression!");


        //Using Functional Interface MyOperation
        MyOperation add = (x, y) -> x+y;
        System.out.println("Add: "+add.operation(3, 8));

        MyOperation subtract = (x, y) -> x-y;
        System.out.println("Subtract: "+subtract.operation(8, 3));

        // Creating an ArrayList
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        //printing list
        System.out.println("List elements:");
        arrL.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        System.out.println("Even elements:");
        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }
}