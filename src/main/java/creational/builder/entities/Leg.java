package creational.builder.entities;

import creational.builder.Material;

public class Leg {
    private Material material;

    public Leg(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Leg{" +
            "material=" + material +
            '}';
    }
}
