import java.util.Random;
import java.util.Scanner;

public class number_guessing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("This is a guessing game, enter your maximum number: ");
        int max = scanner.nextInt();
        System.out.println("Enter you minimum number: ");
        int min = scanner.nextInt();

        int guess;
        int attempts = 1;
        int randomNumber = random.nextInt(min,max);


        //System.out.println("The number is: " + randomNumber);

        System.out.println("This is a guessing game, enter your number between " + min + " and "+ max +": ");
        guess = scanner.nextInt();

        while(guess != randomNumber){
            if(guess < randomNumber){
                System.out.println("Too low!");
            }
            else {
                System.out.println("Too high!");
            }
        System.out.println("Try again: ");
        guess = scanner.nextInt();
        attempts += 1;
        }
        System.out.println("you won with " + attempts + " attempts");

    }
}
