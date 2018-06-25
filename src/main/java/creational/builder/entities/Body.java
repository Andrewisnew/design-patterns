package creational.builder.entities;

import creational.builder.Material;

public class Body {
    private Material material;

    public Body(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Body{" +
            "material=" + material +
            '}';
    }
}
