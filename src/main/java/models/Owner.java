package models;

import java.util.List;

public class Owner {
    private int id;
    private String name;
    private String username;
    private List<Folder>Folders;

    public Owner(){}

    public Owner(int id, String name, String username, List<Folder> folders) {
        this.id = id;
        this.name = name;
        this.username = username;
        Folders = folders;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Folder> getFolders() {
        return Folders;
    }

    public void setFolders(List<Folder> folders) {
        Folders = folders;
    }
}
