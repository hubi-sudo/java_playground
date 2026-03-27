import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double final_amount;
        double principal;
        double interest_rate;
        double number_of_times;
        double lenght_of_time;
        double power;

        System.out.println("What is your principal?: ");
        principal = scanner.nextDouble();
        System.out.println("What is your interest rate? (in %): ");
        interest_rate = scanner.nextDouble() / 100;
        System.out.println("How many times do you want to compound through the year?: ");
        number_of_times = scanner.nextDouble();
        System.out.println("For how long do you plan to borrow, invest, or save?: ");
        lenght_of_time = scanner.nextDouble();


        power = number_of_times * lenght_of_time;
        final_amount = principal*(Math.pow(1.0 + (interest_rate/number_of_times),power));
        System.out.printf("Your final amount is %.2f dollars", final_amount);

        scanner.close();
    }
}
