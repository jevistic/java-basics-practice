import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("For Loop ");

        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }

        //infinite
//        for ( ; ; ) {
//            System.out.println("This will be executed infinitely!");
//        }

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("item is: " + item);
        }


        //example   display multiplication table

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }


    }
}