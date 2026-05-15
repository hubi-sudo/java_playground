package OOP.projekt.file.musicfile;

import OOP.projekt.file.AbstractFile;
import OOP.projekt.file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile{
    protected String bandName;
    protected String title;

    protected AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name, size );
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }

}
