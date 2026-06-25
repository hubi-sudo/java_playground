package Collections;

public class ArrayList {
    static void main(String[] args) {

        java.util.ArrayList<String> people = new java.util.ArrayList<>();

        int[] array = new int[100];

        people.add("John");
        people.add("Dave");
        people.add("Jake");

        people.remove("John");

        if (people.contains("John")) {
            System.out.println("John is in the list");
        } else {
            System.out.println("John is not in the list");
        }


        if (people.isEmpty()) {
            System.out.println("That array is empty");
        } else {
            System.out.println("That array is not empty");
        }

        people.clear();

        System.out.println(people);


    }
}
