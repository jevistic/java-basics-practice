public class Main {
    public static void main(String[] args) {

        // 1. Byte  8-bit

        byte marks; // 0 is default value

//        byte marks = 89; // doesn't allow redeclaration

        marks = 127;  // range is -128 to 127

//        marks = 128;  // doesn't allow values out of it's range


        System.out.println("Byte Marks: ".concat(String.valueOf(marks)));





        // 2. Short  16-bit

        short salary;  // 0 is default value

        salary = 32_767;  // range is -32,768 to 32,767

//        salary = 32_768;  // doesn't allow values out of it's range

        System.out.println();
        System.out.println("Short Salary: ".concat(String.valueOf(salary)));

        byte exampleByte = 111;
        short testShort;
        testShort = exampleByte;  // can store byte variable to short
        System.out.println(testShort);

        testShort = 10;
//        exampleByte = testShort;  //can't convert  short to byte
        System.out.println(exampleByte);





        // 3. Int   32-bit

        int income;  // 0 is default value;

        int tax = 75_237;

        income = 763;

        int result = income - tax;

        System.out.println();
        System.out.println("Int result: ".concat(String.valueOf(result)));

        //integer literals
        int dec = 26;  // 26 in decimal
        System.out.println(dec);

        int hex = 0x1a;  // 26 in hexadecimal  0x shows hexadecimal value
        System.out.println(hex);

        int bin = 0b11010;  // 26 in binary   0b shows binary value
        System.out.println(bin);


        //Usage of Underscore in numeric literals

//        int example = _34654;   // Can't use at the start
//        example = 52_;  // Can't use at the end
//        float pi1 = 3_.1415F;   // Can't use adjacent to the decimal point
//        pi1 = 3._1415F;  // Can't use adjacent to the decimal point
//        long number1 = 999_99_9999_L;  // Can't use prior to an L suffix
//        int x4 = 0_x52;  //Can't use between radix prefix





        // 4. Long     64-bit

        long phone;   // 0L is default value;

//        phone = 923000000000; // requires L or l at the end of number to consider it Long

        phone = 923000000000L;

        System.out.println();
        System.out.println("Long phone: ".concat(String.valueOf(phone)));

        int testInt = 5_646;
        long testLong = testInt;  // allows converting int to Long

//        testInt = testLong;  // doesn't allow converting Long into int








        // 5. Float    32-bit

        float gpa;   // 0.0f is default value;

//        gpa = 3.51;  // requires F or f at the end of number to consider it Float

        gpa = 3.51F;

        System.out.println();
        System.out.println("Float gpa: ".concat(String.valueOf(gpa)));

        float testFloat = testInt;  //allows converting int to float
        System.out.println(testFloat);

//        testInt = testFloat;  // doesn't allow converting float to int

        //Floating-Point Literals
        double d1 = 123.4;  //simple double value
        System.out.println(d1);

        double d2 = 1.234e2;  // same value as d1 but in scientific notation
        System.out.println(d2);

        float f1  = 123.4f;  // same value as d1, but in scientific notation
        System.out.println(f1);






        // 6. Double    64-bit

        double amount;  // 0.0d is default value;

        amount = 4_323_561;  // doesn't require d or D at end of number\

        float interetsRate = 0.5f;

        double finalAmount = amount * interetsRate;

        System.out.println();
        System.out.println("Double amount: ".concat(String.valueOf(finalAmount)));

        double testDouble = testFloat;   // allows converting float to double

//        testFloat = testDouble;   // doesn't allow converting double to float





        // 7. Char   16-bit

        char a;   //default value is \u0000

        a = 'A';
//        a = 'Aa';  //does not allow more than one characters

        System.out.println();
        System.out.println("Char a: ".concat(String.valueOf(a)));
        a = (char) (a+1);
        System.out.println("Char a: ".concat(String.valueOf(a)));

        //Special characters
        System.out.println("Special Characters:");
        char test = '\u0108';
        System.out.println("Ĉ: ".concat(String.valueOf(test)));

        test = '\b';  //bakspace
        System.out.println("Backspace: ".concat(String.valueOf(test)));

        test = '\t';  //tab
        System.out.println("tab: ".concat(String.valueOf(test)));

        test = '\n';  //line feed
        System.out.println("line feed: ".concat(String.valueOf(test)));

        test = '\f'; //form feed
        System.out.println("form feed: ".concat(String.valueOf(test)));

        test = '\r'; //carriage return
        System.out.println("Carriage return: ".concat(String.valueOf(test)));

        test = '\"'; //double qoute
        System.out.println("Double qoute: ".concat(String.valueOf(test)));

        test = '\''; //single qoute
        System.out.println("Single qoute: ".concat(String.valueOf(test)));

        test = '\\'; //backslash
        System.out.println("Backslash: ".concat(String.valueOf(test)));






        // 8. boolean    8-bit

        boolean flag;   //default value is false;

        flag = true;
        flag = !flag;

//        flag = (boolean) (1);  //doesn't allow converting int to boolean;

        System.out.println();
        System.out.println("Boolean flag: ".concat(String.valueOf(flag)));
        System.out.println(3<7);





    }
}