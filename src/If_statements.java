import java.util.Scanner;

public class If_statements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age = 0;
        boolean isStudent;


        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are u a student");
        isStudent  = scanner.nextBoolean();

        //

        if (name.isEmpty()) {
            System.out.println("You didnt enter your name");
        }
        else{
            System.out.println("Hello " + name);
        }
        //
        if(age>= 65){
            System.out.println("Youre a senior");
        }
        else if(age >= 18){
            System.out.println("You are an adult");
        }
        else if (age < 0) {
            System.out.println("You havent been born yet");
        }
        else if (age == 0 ) {
            System.out.println("Youre a baby");
        }
        else{
            System.out.println("Youre a child");

        }

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }
    }
}


