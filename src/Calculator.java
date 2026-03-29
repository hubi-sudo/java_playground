import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        double first_number;
        String sign;
        double second_number;


        System.out.print("Insert first number: ");
        first_number = scanner.nextDouble();
        System.out.print("What would you like to do (*, /, +, -, ^): ") ;
        scanner.nextLine();
        sign = scanner.nextLine();
        System.out.print("Enter second number: ");
        second_number = scanner.nextDouble();


        if (sign.equals("/")){
            if (second_number == 0){
                System.out.println("You cannot divide by zero");
            }
            else{
                switch (sign){
                    case "*"  -> System.out.println("The answer is: " + (first_number * second_number));
                    case "+"  -> System.out.println("The answer is: " + (first_number + second_number));
                    case "-"  -> System.out.println("The answer is: " + (first_number - second_number));
                    case "/"  -> System.out.println("The answer is: " + (first_number / second_number));
                    case "^"  -> System.out.println("The answer is: " + Math.pow(first_number, second_number));
                }

            }
        }
        else{
            switch (sign){
                case "*"  -> System.out.println("The answer is: " + (first_number * second_number));
                case "+"  -> System.out.println("The answer is: " + (first_number + second_number));
                case "-"  -> System.out.println("The answer is: " + (first_number - second_number));
                case "/"  -> System.out.println("The answer is: " + (first_number / second_number));
                case "^"  -> System.out.println("The answer is: " + Math.pow(first_number, second_number));
            }

        }


        scanner.close();


    }
}
