public class Stringmethods {
    public static void main(String[] args) {

        String name = "Hubert Wiktorowicz";
        // int length = name.length();
        // char letter = name.charAt(2);
        // int index = name.indexOf("b");
        // int lastindex = name.lastIndexOf("o");

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("o", "i");

        // System.out.printf("The length is %d",length);
        // System.out.println("");
        // System.out.printf("The letter is %c\n",letter);
        // System.out.println("\n" + index);
        // System.out.println("\n" + lastindex);
        // System.out.println(name.isEmpty());


        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.printf("Hello %s", name);
        }
        */
        /*
        if(name.contains(" ")){
            System.out.println("Your name contains a space");

        }
        else{
            System.out.println("Your name does not contain a space");
        }
        */

        if(name.equals("password")){
            System.out.println("Your name cant be a password");
        }
        else{
            System.out.println("Hello " + name);
        }

    }
}
