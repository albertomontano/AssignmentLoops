import java.util.Scanner;

public class Assignment2UsingWhileLoops {

    public static void main(String[] args) {
        /*
        Write a Java program that prompts the user to enter a positive integer.
        Use a Scanner object to read user input.
        Use a while loop to calculate the sum of the digits of the entered number.
        Continuously extract the last digit of the number and add it to a running total.
        Remove the last digit from the number using integer division.
        Once the sum of the digits has been calculated, print the result to the user.
        Add input validation to ensure the user enters a positive integer.
        Allow the user to enter multiple numbers and calculate the sum of the digits for each one until they choose to exit.
        */
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.print("Enter a positive integer: ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a valid number. Try again.");
                sc.next();
                System.out.print("Enter a positive integer: ");
            }
            int number = sc.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
                continue;
            }
            int sum = 0;
            int temp = number;
            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            System.out.println("The sum of the digits is: " + sum);
            System.out.print("Do you want to enter another number? (yes/no): ");
            sc.nextLine();
            String answer = sc.nextLine().trim().toLowerCase();
            if (!answer.equals("yes")) {
                keepRunning = false;
            }
        }
        System.out.println("Program ended. Goodbye!");
        sc.close();
    }




}
