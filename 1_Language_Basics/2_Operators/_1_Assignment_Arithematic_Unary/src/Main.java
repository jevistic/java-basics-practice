public class Main {
    public static void main(String[] args) {

        // 1. Assignment Operator ( = )

        // it simply assigns the value on its right to the operand on its left
        int speed = 0;
        int gear = 1;
        gear = 5;
        speed = gear;



        // 2. Arithematic Operators  ( + - * / % )

        System.out.println();
        System.out.println("Arithematic Opaerators");

        // +
        int result = 1 + 2;
        System.out.println("1 + 2 = ".concat(String.valueOf(result))); // result is now 3


        // -
        int original_result = result;
        result = result - 1;
        System.out.println("3 - 1 = ".concat(String.valueOf(result)));  // result is now 2


        // *
        original_result = result;
        result = result * 2;
        System.out.println("2 * 2 = ".concat(String.valueOf(result)));  // result is now 4


        // /
        original_result = result;
        result = result / 2;
        System.out.println("4 / 2 = ".concat(String.valueOf(result)));  // result is now 2
        original_result = result;


        // %
        result = result + 8;  // result is now 10
        original_result = result;
        result = result % 7;  // result is now 3
        System.out.println("10 % 7 = ".concat(String.valueOf(result)));


        // Compound assignments (arithematic operators with assignment operator)

        int x = 2;
        //both increment value of x by 1
        x+=1;
        x=x+1;
        System.out.println(x);

        //We can use compund assignments with each arithematic operator





        // 3. Unary Operator

        System.out.println();
        System.out.println("Unary operators");

        int result1 = +1;
        System.out.println(result1);

        result1--;  // result is now 0
        System.out.println(result1);

        result1++;  // result is now 1
        System.out.println(result1);

        result1 = -result1; // result is now -1
        System.out.println(result1);

        boolean success = false;
        System.out.println(success);
        System.out.println(!success);  //will print true


        // PrePost example
        int i = 3;
        i++;
        System.out.println(i); //prints 4

        ++i;
        System.out.println(i);  // prints 5

        System.out.println(++i); // prints 6

        System.out.println(i++); // prints 6 (Here it will increment the value after printing it)

        System.out.println(i);   // prints 7

        //Same goes for decrement

    }
}