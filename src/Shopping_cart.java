import java.util.Scanner;

public class Shopping_cart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        Double price = 0.0;
        int amount = 0;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price  = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        amount = scanner.nextInt();

        double final_price = price * amount;

        System.out.println("You have bought " + amount + " " + item + "/s");
        System.out.println("Your total is: " + final_price);



    }
}
