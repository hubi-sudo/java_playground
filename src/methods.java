public class methods {
    public static void main(String[] args) {

        int age = 20 ;
        String name = "Hubert";

        double result = square(3);
        System.out.println(result);
        System.out.println(cube(3));
        String fullName = getFullName("Hubert", "Wiktorowicz");
        System.out.println(fullName);
        boolean ifage = ageCheck(20);
        System.out.println(ifage);

        if(ifage){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are underage");
        }
    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
         return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age < 18){
            return false;
        }
        else{
            return true;
        }
    }


}
