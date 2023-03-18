//package SeminarOOP4_1403_HW2;

import java.util.Objects;

public class People implements Comparable<People>{
    private String name;
    private int height;
    
    public People(String name, int height) {
        this.name = name;
        this.height = height;
    }
    
    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return String.format(
            "%s: %d", 
            this.getName(), this.getHeight()
        );
    }

    @Override
    public int compareTo(People another) {
        if (this.height > another.height) {
            return 1;
        } else if (this.height < another.height) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof People)) {
            return false;
        }
        People people = (People) o;
        return this.name == people.name && this.height == people.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }
    
}
