import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String name =  "";
//
//        while(name.isEmpty()){
//            System.out.println("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);

//        String response ="";
//        System.out.println("Type your letter: ");
//        response = scanner.nextLine();
//
//        while(!response.equals("q")){
//            System.out.println("Wrong");
//            System.out.println("Type your letter: ");
//            response = scanner.nextLine();
//
//        }
//        System.out.println("you did it");

//        int age = 0;
//
//        System.out.println("Enter your age: ");
//        age = scanner.nextInt();
//        while(age <= 0){
//            System.out.println("Enter your age: ");
//            age = scanner.nextInt();
//        }
//
//
//        System.out.println("You are " + age);


        int number = 0;
        do{
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);
        System.out.println("you picked: " + number);





        scanner.close();


    }
}
