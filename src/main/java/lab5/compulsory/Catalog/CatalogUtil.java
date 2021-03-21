package lab5.compulsory.Catalog;

import lab5.compulsory.Items.Item;
import lombok.var;

import javax.swing.text.Document;
import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class CatalogUtil {
    /**
     * The CatalogUtil class, which has the load, save, play, and list methods
     * that are the commands of managing the catalogue
     */

    public static void save(Catalog catalog)
            throws IOException {
        try (var oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }

    public static Catalog load(String path)
            throws InvalidCatalogException, IOException, ClassNotFoundException {
        Catalog catalog = new Catalog("temp", path);
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            catalog = (Catalog) ois.readObject();
        } catch (IOException ioe) {
            System.out.println("Error reading file");
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error loading treats");
            cnfe.printStackTrace();
        }
        return catalog;
    }

    public static void play(Item item) throws URISyntaxException, IOException {
        Desktop desktop = Desktop.getDesktop();
        URI uri = new URI(item.getLocation());
        desktop.browse(uri);
    }

    public static void list(Catalog catalog) {
        for (var i : catalog.getItems()) {
            System.out.println(i);
        }
    }


}
