import java.util.Scanner;


public class Mathclass {
    public static void main(String[] args) {

//        System.out.println(Math.PI);
//        System.out.println(Math.E);


//        double result;

//        result = Math.pow(67, 67);
//        result = Math.abs(-5);
//        result = Math.sqrt(9);
//        result = Math.round(3.14);
//        result = Math.ceil(3.14);
//        result = Math.floor(3.99);
//        result = Math.max(10,20);
//        result = Math.min(10,20);

//        System.out.println(result);

//        PRZECIWPROSTOKATNA

//         Scanner scanner = new Scanner(System.in);
//
//        double a;
//        double b;
//        double c;
//
//        System.out.println("Enter the lenght of side A");
//        a = scanner.nextDouble();
//
//        System.out.println("Enter the lenght of side B");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//
//        System.out.println("The lenght of the hypotenuse is: " + c);
//        scanner.close();


//        OBWOD
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4/3) * Math.PI * Math.pow(radius,3) ;
        System.out.printf("The circumference is: %.1f cm\n", circumference);
        System.out.printf("The area is: %.1f cm^2\n", area);
        System.out.printf("The volume is: %.1f cm^3\n", volume);




    }
}
