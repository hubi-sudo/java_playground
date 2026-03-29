import java.util.Scanner;

public class Logical_operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double temp = 20;
//        boolean isSunny = false;
//
//
//        if(temp <= 30 && temp >= 0 && isSunny){
//            System.out.println("the weather is good");
//            System.out.println("It is sunny outside ");
//        }
//        else if (temp <= 30 && temp >= 0 && !isSunny){
//            System.out.println("The weather is good");
//            System.out.println("It is cloudy outside");
//        }
//        else if (temp > 30 || temp < 0){
//            System.out.println("the weather is bad");
//        }


        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;
        System.out.println("Enter your username: ");
        username = scanner.nextLine();


        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username cannot contain spaces or underscores");
        }
        else{
            System.out.println("welcome " + username);
        }





        scanner.close();
    }
}
