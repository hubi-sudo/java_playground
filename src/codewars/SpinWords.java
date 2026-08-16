package codewars;

public class SpinWords {

    public String spinWords(String sentence) {

        String regex = " ";
        String[] Array = sentence.split(regex);
        String result = " ";

        for (String s : Array) {
            if (s.length() >= 5) {
                for (int i = 0; i < s.length(); i++)
                    result += (s.charAt(s.length() - 1 - i));
                result += " ";
            } else {
                result += s;
                result += " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        SpinWords app = new SpinWords();

        System.out.println(app.spinWords("Hey fellow warriors")); // Oczekiwane: "Hey wollef sroirraw"
        System.out.println(app.spinWords("This is a test"));        // Oczekiwane: "This is a test"
        System.out.println(app.spinWords("This is another test")); // Oczekiwane: "This is rehtona test"
    }
}