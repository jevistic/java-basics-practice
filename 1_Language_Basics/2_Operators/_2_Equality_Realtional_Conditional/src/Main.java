import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Equality & Realtional Operators");

        //Equality & Relational Operators

        int value1 = 1;
        int value2 = 2;

        if(value1 == value2)
            System.out.println("value1 == value2");

        if(value1 != value2)
            System.out.println("value1 != value2");

        if(value1 > value2)
            System.out.println("value1 > value2");

        if(value1 < value2)
            System.out.println("value1 < value2");

        if(value1 <= value2)
            System.out.println("value1 <= value2");


        //Age Comparator
        int person1Age = 45;
        int person2Age = 55;

        if (person1Age == person2Age) {
            System.out.println("Person 1 and Person 2 are of the same age.");
        }
        else if (person1Age > person2Age) {
            System.out.println("Person 1 is older than Person 2.");
        }
        else {
            System.out.println("Person 2 is older than Person 1.");
        }




        // Conditional Operators

        System.out.println();
        System.out.println("Conditional Operators");

        value1 = 1;
        value2 = 2;

        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");


        //grade Calculator
        int score = 79;
        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is: ".concat(String.valueOf(grade)));



    }
}