package lab5.compulsory;

import lab5.compulsory.Catalog.Catalog;
import lab5.compulsory.Catalog.CatalogUtil;
import lab5.compulsory.Catalog.InvalidCatalogException;
import lab5.compulsory.Items.Book;
import lab5.compulsory.Items.Song;
import lombok.var;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    /**
     * The Main class instantiates the objects and searches for the specified song and book,
     * also playing the selected song, in this case
     * */
    public static void main(String[] args)  throws URISyntaxException, IOException, InvalidCatalogException, ClassNotFoundException {
        Main app = new Main();
        app.testCreateSave();
        app.testLoadView();
    }

    private void testCreateSave() throws IOException{
        Catalog catalog = new Catalog("My Books", "B:/facultate/PA/media/catalog.ser");
        var song = new Song("song1", "B:/facultate/PA/media/songs/song1.mp3" );
        var book = new Book("book1", "B:/facultate/PA/media/books/book.txt" );
        catalog.add(song);
        catalog.add(book);

        CatalogUtil.save(catalog);
    }

    private void testLoadView() throws InvalidCatalogException, IOException, ClassNotFoundException, URISyntaxException {
        Catalog catalog = CatalogUtil.load("B:/facultate/PA/media/catalog.ser");
        CatalogUtil.play(catalog.findByName("song1"));
    }

}
