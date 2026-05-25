import java.util.Scanner;

public class SimpleCalculator{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean run = true;

        while (run){
            System.out.print("Welcome to my Arithmetic Calculator!");
            System.out.print("\nEnter two numbers: ");

            System.out.print("\nEnter number 1: ");
            double num1 = input.nextDouble();

            System.out.print("Enter number 2: ");
            double num2 = input.nextDouble();

            System.out.print("Enter Operator (+, -, *, /): ");
            char operator = input.next().charAt(0);
    
            if (operator == '+'){
                double addition = add(num1, num2);
                System.out.println("Answer: " + addition);
            } else if (operator == '-'){
                double subtraction = subtract(num1, num2);
                System.out.println("Answer: " + subtraction);
            } else if (operator == '*'){
                double multiplication = multiply(num1, num2);
                System.out.println("Answer: " + multiplication);
            } else if (operator == '/'){
                if (num2 == 0){
                    System.out.println("Divisor cannot be 0, please restart the program.");
                } else{
                    double division = divide(num1, num2);
                    System.out.println("Answer: " + division);
                }
            } else {
                System.out.println("Invalid Operator. ");
            }

            System.out.print("Do you want to keep using the calculator? (yes/no): "); input.nextLine();
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("no")){
                run = false;
                System.out.println("Program closing.");
                break;
            }
        } 
    }
    public static double add(double num1, double num2){
        return num1 + num2;

    }
    public static double subtract(double num1, double num2){
        return num1 - num2;

    }
    public static double multiply(double num1, double num2){
        return num1 * num2;

    }
    public static double divide(double num1, double num2){
        return num1 / num2;
    }
}