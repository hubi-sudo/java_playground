package Checked_And_Unchecked_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {
    public static void main(String[] args) throws FileNotFoundException {

    readFile("myFile.txt");

    }

    private static void readFile(String fileName) throws FileNotFoundException {

        FileReader reader = new FileReader(fileName);

    }



}
