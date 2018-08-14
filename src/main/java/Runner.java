import db.DBFolder;
import db.DBHelper;
import db.DBOwner;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Owner owner = new Owner("Emil Vaklinov");
        DBHelper.save(owner);

        Folder folder1 = new Folder("File folder", owner);
        DBHelper.save(folder1);

        File file1 = new File("Exel", ".exl", 10, folder1);
        DBHelper.save(file1);

        File file2 = new File("Picture", ".jpg", 30, folder1);
        DBHelper.save(file2);


        List<File> files = DBHelper.getAll(File.class);

        File foundFile = DBHelper.find(File.class, file1.getId());

        List<File> filesInFolder = DBFolder.getFilesForFolder(folder1);
        List<Folder> foldersByOwner = DBOwner.getFoldersByOwner(owner);
    }
}
