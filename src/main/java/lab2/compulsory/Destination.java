package lab2.compulsory;

public class Destination {
    /**
     * The Destination class
     **/
    private String name;

    public Destination(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Destination ->" + name ;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Destination)) {
            return false;
        }
        Destination other = (Destination) obj;
        return name.equals(other.name);
    }

}
