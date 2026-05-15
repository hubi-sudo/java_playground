package OOP.projekt.Drive;

import OOP.projekt.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);

}
