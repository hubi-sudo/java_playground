package OOP.projekt.file.imagefile;

import OOP.projekt.file.AbstractFile;
import OOP.projekt.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
