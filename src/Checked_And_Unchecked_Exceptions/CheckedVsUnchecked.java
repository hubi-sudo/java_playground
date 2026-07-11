package Checked_And_Unchecked_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {
    public static void main(String[] args) {

        String name = null;
        printLength(name);

    }

    private static void printLength (String myString){
        try {
            System.out.println(myString.length());
        } catch (NullPointerException npe) {
            System.out.println("String cannot be null");
        }
    }

}
