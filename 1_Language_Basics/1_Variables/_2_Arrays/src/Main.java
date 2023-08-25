import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] intArray; // array of integers

        //We can define arrays with other types in similar way
        byte[] ArrayOfBytes;
        short[] ArrayOfShorts;
        long[] ArrayOfLongs;
        float[] ArrayOfFloats;
        double[] ArrayOfDoubles;
        boolean[] ArrayOfBooleans;
        char[] ArrayOfChars;

        intArray = new int[10]; // memory allocation for 10 integers  **It initializes array of size 10 with 0

        intArray[0] = 100;  // initializing first element through index
        intArray[1] = 200;  // initialize second element

        System.out.println("Element at index 0: ".concat(String.valueOf(intArray[0])));  //Outputs 100

        System.out.println("Element at index 1: ".concat(String.valueOf(intArray[1])));  //Outputs 200

        System.out.println("Element at index 2: ".concat(String.valueOf(intArray[2])));  //Outputs 0 (default value)


//        int intArray2[];  //This form is okay but it is discouraged


        //We can also use this shortcut to define array if we know all the values of array
        int[] intArray2 = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };



        //Multidimentional Array

        //We can think of it as rows and columns (In this case it's 2x2) 2 rows and 2 columns
        String[][] names = {
                {"Mr. ", "Ms. "},
                {"Smith", "Jones"}
        };
        //In this case the size is automatically defined by the number of elements in rows and columns


        System.out.println(names[0][0] + names[1][0]);  // Outputs Mr. Smith

        System.out.println(names[0][1] + names[1][1]);  // Outputs Ms. Jones




        //Copying Arrays
        String[] array = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyOfArray = new String[9];

        //System class has built-in method to copy arrays
        System.arraycopy(array, 2, copyOfArray, 2, 7);


        //first two nulls will be printed because those are default values. We are starting from position 2
        for (String coffee : copyOfArray) {
            System.out.print(coffee + " - ");
        }


        //Another way of copying array with java.util.Array.copyOfRange method
        String[] copyOfArray2 = java.util.Arrays.copyOfRange(array, 0, 7);

        System.out.println();
        System.out.println();
        for(String coffee: copyOfArray2){
            System.out.print(coffee + " - ");
        }


        //java.util.Array provides different builtin method to work with arrays in java.

        //1. binarySearch used for searching specific value in array
        int[] arr = {6,5,3,7,8,9,2,3,1};

        int res = java.util.Arrays.binarySearch(arr, 3);
        if(res > 0){
            System.out.println();
            System.out.println("found!");
        }
        else{
            System.out.println();
            System.out.println("Not found!");
        }



        //2. equals used to check if 2 arrays are equal or not
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 1, 2, 3, 4, 5 };
        int[] array3 = { 5, 4, 3, 2, 1 };

        boolean areEqual1 = java.util.Arrays.equals(array1, array2);
        boolean areEqual2 = java.util.Arrays.equals(array1, array3);

        System.out.println("Are array1 and array2 equal? ".concat(String.valueOf(areEqual1))); // true
        System.out.println("Are array1 and array3 equal? " .concat(String.valueOf(areEqual2))); // false


        //3. fill used to fill specific value in array at each index
        int[] testArray = new int[5]; //defining array of length 5

        java.util.Arrays.fill(testArray, 42);  // Fill the array with the value 42 in each index

        // Display the array's contents
        System.out.println("Filled array: ".concat(java.util.Arrays.toString(testArray)));


        //4. sort used to sort array in ascending order

        int[] testArray2 = { 5, 2, 8, 1, 3 };

        // Sort the array in ascending order
        java.util.Arrays.sort(testArray2);

        // Display the sorted array's contents
        System.out.println("Sorted array: " + Arrays.toString(testArray2));






    }
}