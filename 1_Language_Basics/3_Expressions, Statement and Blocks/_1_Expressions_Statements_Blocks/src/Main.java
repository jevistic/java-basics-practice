import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Expressions");


        int a = 1 * 2 * 3;  // It is Okay

//        int b  = a + 77 / 100;  // ambiguous  (Which operation first?)

        int b  = a + (77 / 100);  // unambiguous, recommended


        //Temperature Converter

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celcius: ");
        int celcius = sc.nextInt();

        int fahrenheit = (celcius * 9/5) + 32;

        System.out.println("The temperature in Fahrenheit: ".concat(String.valueOf(fahrenheit)));




        //Statements
            //1. expression statements
            //2. declaration statements
            //3. control flow statements

        System.out.println();
        System.out.println("statements");


        // declaration statement
        float aValue;
        int val = 45;


        // expression statements
        // assignment statement
        aValue = 8933.234f;

        // increment statement
        aValue++;

        // method invocation statement
        System.out.println(aValue);

        // object creation statement
//        Bicycle myBike = new Bicycle();



        //Blocks

        //factorial, absolute value and square root calculator
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            // Positive number: Calculate factorial
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of ".concat(String.valueOf(number )).concat(" is ").concat(String.valueOf(factorial)));
        }
        else if (number < 0) {
            // Negative number: Calculate absolute value and square root
            int absoluteValue = -number;
            double squareRoot = Math.sqrt(absoluteValue);
            System.out.println("Absolute value of ".concat(String.valueOf(number)).concat(" is ").concat(String.valueOf(absoluteValue)));
            System.out.println("Square root of absolute value is ".concat(String.valueOf(squareRoot)));
        }
        else {
            System.out.println("You entered zero.");
        }


    }
}