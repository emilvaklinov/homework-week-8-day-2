package models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "folder")
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


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @OneToMany (mappedBy = "file_id", fetch = FetchType.LAZY)
    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    @ManyToOne
    @JoinColumn (name = "owner_id", nullable = false)
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
