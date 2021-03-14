package lab4.compulsory;


import lombok.Data;
import lombok.NonNull;

public @Data

class School implements Comparable<School> {
    /**
     *  The School class
     **/
    @NonNull
    private String name;
    private int capacity;

    @Override
    public int compareTo(School o) {
        if (this.name == null) {
            return 0;
        }
        return this.name.compareTo(o.getName());
    }
}