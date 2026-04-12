import java.util.Scanner;

public class nestedloops {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the # of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the # of columns: ");
        int cols = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the symbol to use: ");
        char symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();

        }
        scanner.close();
    }
}