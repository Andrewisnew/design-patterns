package creational.builder.entities;

import creational.builder.Material;

public class Head {
    private Material material;

    public Head(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Head{" +
            "material=" + material +
            '}';
    }
}
