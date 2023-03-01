package Seminat2802_HW;

public class Notebook {
    private int id;
    private int hdd;
    private int ram;
    private int display;
    private String system;
    private String color;
    private String brand;

public Notebook(int id, int hdd, int ram, int display, String system, String color,
            String brand) {
        this.id = id;
        this.hdd = hdd;
        this.ram = ram;
        this.display = display;
        this.system = system.toLowerCase();
        this.color = color.toLowerCase();
        this.brand = brand.toLowerCase();
    }
    
@Override
public int hashCode() {
    int prime = 11;
    int prime1 = 17;
    int prime2 = 19;
    int hc = 1;
    hc = prime * hc + ((brand == null) ? 0 : brand.hashCode());
    hc = prime * hc + ((color == null) ? 0 : color.hashCode());
    hc = prime1 * hc + ((system == null) ? 0 : system.hashCode());
    hc = prime1 * hc + display;
    hc = prime1 * hc + hdd;
    hc = prime2 * hc + id;
    hc = prime2 * hc + ram;
    return hc;
}


@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (!(obj instanceof Notebook)) {
        return false;
    }    
    if (getClass() != obj.getClass())
        return false;
    Notebook field = (Notebook) obj;
    if (this.id == field.id && this.hdd == field.hdd && this.ram == field.ram &&
        this.brand.equals(field.color) && this.color.equals(field.color) && 
        this.display == field.display) {
            return true;
        } else {
            return false;
        }
}

public int getId() {
    return id;
}

public int getHDD() {
    return hdd;
}

public int getRAM() {
    return ram;
}

public int getDisplay() {
    return display;
}

public String getBrand() {
    return brand;
}

public String getColor() {
    return color;
}


public String getOS() {
    return system;
}

@Override
public String toString() {
    return "{id=" + id + ",  brand=" + brand + ", color=" + color + ", display=" + display + ", hdd="
            + hdd + ",  ram=" + ram + ",  os=" + system + "}";
} 
}
