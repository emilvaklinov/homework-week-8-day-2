package models;

public class File {

    private int id;
    private String name;
    private String extension;
    private int size;
    private Folder folder;

    public File(){}

    public File(int id, String name, String extension, int size, Folder folder) {
        this.id = id;
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtention() {
        return extension;
    }

    public void setExtention(String extention) {
        this.extension = extention;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
