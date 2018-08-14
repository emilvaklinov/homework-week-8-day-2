package models;

import javax.persistence.*;

@Entity
@Table(name = "file")
public class File {

    private int id;
    private String name;
    private String extension;
    private double size;
    private Folder folder;

    public File(){}

    public File(String name, String extension, double size, Folder folder) {
        this.id = id;
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
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

    @Column(name = "extension")
    public String getExtention() {
        return extension;
    }

    public void setExtention(String extention) {
        this.extension = extention;
    }

    @Column(name = "size")
    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
