import java.util.Scanner;
public class Enhanced_switch {
    public static void main(String[] args) {
        String day;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        day = scanner.nextLine().toLowerCase();



        switch (day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("It is a weekday");
            case "saturday", "sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " is not a day");
    }
    }
}
