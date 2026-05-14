package OOP.projekt;

import OOP.projekt.Drive.HDDDrive;
import OOP.projekt.Drive.SSDDrive;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
//        HDDDrive drive = new HDDDrive();
        SSDDrive drive  = new SSDDrive();

        Computer computer = new Computer(monitor, drive);
        
        drive.addFile(new File("cos.jpg"));
        drive.listFiles();
    }

}
