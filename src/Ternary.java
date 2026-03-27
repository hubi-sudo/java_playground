public class Ternary {
    public static void main(String[] args) {

        int score = 75;
        int number = 10;
        int hours = 13;
        int income = 60000;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        String timeOfDay = (hours < 12) ? "A.M." : "P.M";
        double taxRate = (income > 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);
    }
}
