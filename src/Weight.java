import java.util.Scanner;
public class Weight{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int choise;
        double weight;
        double weight_after;

        System.out.println("Weight calculator");
        System.out.println("If you want to turn kgs into lbs, type 1");
        System.out.println("If you want to turn lbs into kbs, type 2");
        System.out.println("");
        choise = scanner.nextInt();

        if(choise == 1){
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            weight_after = weight * 2.20462;
            System.out.println("Your weight in lbs is: " + weight_after);

        }
        else if(choise == 2){
            System.out.println("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            weight_after = weight * 0.453592;
            System.out.println("Your weight in kgs is: " + weight_after);
        }
        else {
            System.out.println("You have to choose 1 or 2");

        }
        scanner.close();
    }
}
