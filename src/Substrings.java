import java.util.Scanner;
public class Substrings{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String email;
        String domain;
        String username;
        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){

            domain = email.substring(email.indexOf("@") + 1);
            username = email.substring(0, email.indexOf("@"));

            System.out.println("Your username is: " + username);
            System.out.println("Your domain is: "+ domain);
        }
        else{
            System.out.println("You wrote your email wrong, '@' is missing.");
        }
    }
}