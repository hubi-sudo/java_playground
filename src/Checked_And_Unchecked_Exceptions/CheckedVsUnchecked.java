package Checked_And_Unchecked_Exceptions;

import java.io.FileReader;

public class CheckedVsUnchecked {
    public static void main(String[] args) {

    readFile("myFile.txt")

    }

    private static void readFile(String fileName) {
        FileReader reader = new FileReader(fileName);
    }

}
