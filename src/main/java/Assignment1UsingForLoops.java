import java.util.Scanner;

public class Assignment1UsingForLoops {

    public static void main(String[] args){

        //Write a for loop that prints the numbers from 1 to 10.
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        //Write a for loop that calculates the sum of the first 10 positive integers and prints the result.
        System.out.println("Sum of the first 10 positive integers:");
        for(int i=1; i<=10; i++){
            System.out.println(i+(i+1));
        }

        //Write a for loop that prints the multiplication table of a number provided by the user (from 1 to 10).
        System.out.println("Put a number to get its multiplication table");
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(userNumber + "* "+ i +" = "+ i * userNumber);
        }

    }


}
