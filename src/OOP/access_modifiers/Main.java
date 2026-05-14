package OOP.access_modifiers;

public class Main {
    public static void main(String[] args) {

        Uzytkownik mariusz = new Uzytkownik(20, "Mariusz");

        if (mariusz.czyMozeLegalnieKupicAlkohol()) {
            System.out.println("Może kupic alkohol");
        } else {
            System.out.println("Nie moze kupic");
        }
    }
}
