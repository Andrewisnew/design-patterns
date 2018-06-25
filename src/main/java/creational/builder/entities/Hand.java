package creational.builder.entities;

import creational.builder.Material;

public class Hand {
    private Material material;

    public Hand(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Hand{" +
            "material=" + material +
            '}';
    }
}
