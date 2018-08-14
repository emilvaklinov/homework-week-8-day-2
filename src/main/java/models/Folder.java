package models;

import java.util.List;

public class Folder {

    private int id;
    private String title;
    private List<File> files;
    private Owner owner;

    public Folder(){ }

    public Folder(int id, String title, List<File> files, Owner owner) {
        this.id = id;
        this.title = title;
        this.files = files;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
