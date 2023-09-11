import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("If-Else statements");


        boolean isMoving = false;
        int currentSpeed = 30;
        if (isMoving) {
            currentSpeed-=20;
        } else {
            System.out.println("The bicycle has already stopped!");
        }



        // Time of the day Greeting

        Scanner sc = new Scanner(System.in);

        String Greetings = "";

        System.out.print("Enter the hour (0-23): ");
        int hour = sc.nextInt();

        if (hour >= 0 && hour < 12) {
            Greetings = "Good morning!";
        }
        else if (hour >= 12 && hour < 18) {
            Greetings = "Good afternoon!";

        } else if (hour >= 18 && hour <= 23) {
            Greetings = "Good evening!";
        }
        else {
            Greetings = "Invalid hour entered.";
        }

        System.out.println(Greetings);

    }
}