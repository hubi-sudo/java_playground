package OOP.projekt.Drive;

import OOP.projekt.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);

}
