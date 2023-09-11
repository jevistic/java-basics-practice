public class Main {
    public static void main(String[] args) {


        //Bitwise Operators  (&, |, ^, ~)
        System.out.println();
        System.out.println("Bitwise Operators");

        int num1 = 23;
        int num2 = 15;

        System.out.println("num1: ".concat(Integer.toBinaryString(num1)));
        System.out.println("num2: ".concat(Integer.toBinaryString(num2)));

        // Bitwise AND
        int andResult = num1 & num2;
        System.out.println("num1 & num2: ".concat(Integer.toBinaryString(andResult)));

        // Bitwise OR
        int orResult = num1 | num2;
        System.out.println("num1 | num2: ".concat(Integer.toBinaryString(orResult)));

        // Bitwise XOR
        int xorResult = num1 ^ num2;
        System.out.println("num1 ^ num2: ".concat(Integer.toBinaryString(xorResult)));

        // Bitwise NOT
        int notNum1 = ~num1;
        int notNum2 = ~num2;

        System.out.println("~num1: ".concat(Integer.toBinaryString(notNum1)));
        System.out.println("~num2: ".concat(Integer.toBinaryString(notNum2)));




        //BitShift Operators   (<<, >>, >>>)

        System.out.println();
        System.out.println("BitShift Operators");
        int value = -12;

        // Left shift
        int leftShiftResult = value << 2;

        // Right shift
        int rightShiftResult = value >> 2;

        int USrightShiftResult = value >>> 2;

        System.out.println("value: ".concat(Integer.toBinaryString(value)));
        System.out.println("value << 2: ".concat(Integer.toBinaryString(leftShiftResult)));
        System.out.println("value >> 2: ".concat(Integer.toBinaryString(rightShiftResult)));
        System.out.println("value >>> 2: ".concat(Integer.toBinaryString(USrightShiftResult)));

    }
}