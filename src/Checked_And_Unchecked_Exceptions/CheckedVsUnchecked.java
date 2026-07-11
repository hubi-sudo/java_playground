package Checked_And_Unchecked_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {
    public static void main(String[] args) {

    readFile("myFile.txt");

    }

    private static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        }
        catch (FileNotFoundException fnfe){
            System.out.println("That file doesnt exist");
        }
    }



}
