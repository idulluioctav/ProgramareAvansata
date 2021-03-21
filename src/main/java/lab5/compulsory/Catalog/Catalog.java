package lab5.compulsory.Catalog;

import lab5.compulsory.Items.Item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Catalog implements Serializable {
    /**
     * The Catalog class, which besides getters and setters, has the add() and findByName methods()
     * */
    private String name;
    private String path;
    private List<Item> items = new ArrayList<>();

    public Catalog() {
    }

    public Catalog(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void add(Item item) {
        items.add(item);
    }

    public Item findByName(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}