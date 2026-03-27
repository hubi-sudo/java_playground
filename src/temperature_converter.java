import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args) {

        double temp;
        String unit;
        double newTemp;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to Celsius or Farenheit? (C or F): ");
        unit = scanner.nextLine();
        System.out.println(" ");


        newTemp = (unit.equals("C")) ? (temp * 1.8) + 32 : (temp - 32) * 1.8;

        System.out.print("The temperature in " + unit + " is " + newTemp);

        scanner.close();

    }
}

