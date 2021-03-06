package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "owner")
public class Owner {
    private int id;
    private String name;
    private String username;
    private List<Folder>Folders;

    public Owner(){}

    public Owner(String name) {
        this.id = id;
        this.name = name;
        this.username = username;
        List<Folder> folders;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    public List<Folder> getFolders() {
        return Folders;
    }

    public void setFolders(List<Folder> folders) {
        Folders = folders;
    }
}
