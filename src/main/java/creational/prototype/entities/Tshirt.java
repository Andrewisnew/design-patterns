package creational.prototype.entities;


import creational.prototype.config.Brand;
import creational.prototype.config.Color;
import creational.prototype.config.Size;

public class Tshirt implements Cloneable {
    private Brand brand;
    private Color color;
    private Size size;

    public Tshirt(Brand brand, Color color, Size size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Tshirt tshirt = (Tshirt) o;

        if (!brand.equals(tshirt.brand)) {
            return false;
        }
        if (color != tshirt.color) {
            return false;
        }
        return size == tshirt.size;
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + size.hashCode();
        return result;
    }
}
