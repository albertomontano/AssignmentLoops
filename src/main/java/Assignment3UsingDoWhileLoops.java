import java.util.Scanner;

public class Assignment3UsingDoWhileLoops {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        do{
            System.out.println("Welcome to the calculator");
             System.out.println("Please select a number");
             System.out.println("1. Addition");
             System.out.println("2. Subtraction");
             System.out.println("3. Multiplication");
             System.out.println("4. Division");
             System.out.println("5. Exit");

             System.out.println("Enter your choice");
             int choice = scanner.nextInt();

            switch(choice){
                case 1: System.out.println("Enter first number");
                    int num1 = scanner.nextInt();
                    System.out.println("Enter second number");
                    int num2 = scanner.nextInt();
                    System.out.println("Result of "+num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2: System.out.println("Enter first number");
                    int num3 = scanner.nextInt();
                    System.out.println("Enter second number");
                    int num4 = scanner.nextInt();
                    System.out.println("Result of "+num3 + " - " + num4 + " = " + (num3 - num4));
                    break;
                case 3: System.out.println("Enter first number");
                    int num5 = scanner.nextInt();
                    System.out.println("Enter second number");
                    int num6 = scanner.nextInt();
                    System.out.println("Result of "+num5 + " * " + num6 + " = " + (num5 * num6));
                    break;
                case 4: System.out.println("Enter first number");
                    int num7 = scanner.nextInt();
                    System.out.println("Enter second number");
                    int num8 = scanner.nextInt();
                    System.out.println("Result of "+num7 + " / " + num8 + " = " + (num7 / num8));
                    break;

                    case 5:
                        keepRunning = false;
                        System.out.println("Program ended");
                        break;

                        default:
                            System.out.println("Invalid choice, just number from 1 to 5");
            }


        } while(keepRunning);

        scanner.close();


    }


}
