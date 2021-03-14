package lab2.compulsory;

public class Source {
/**
 *  In this class there are the source types (warehouse and factory)
 **/
    public enum SourceType {
        WAREHOUSE, FACTORY;
    }
    private String name;
    private SourceType type;

    public Source() {
    }

    public Source(String name, SourceType type) {
        this.setName(name);
        this.setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SourceType getType() {
        return type;
    }

    public void setType(SourceType type) {
        this.type = type;
    }

    public String toString() {
        return name;
    }
}
