import java.util.Scanner;

public class madlibs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter adjective1: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter noun1: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter adjective2: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter verb1: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter adjective3: ");
        adjective3 = scanner.nextLine();



        System.out.println("Today i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + ".");
        System.out.println("I was " + adjective3 + "!");



    }
}
