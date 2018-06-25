package creational.abstract_factory.entities;

import creational.abstract_factory.entities.api.Gunner;

public class Elf implements Gunner {

    private static int counter = 0;
    private final int id = counter++;

    public void shoot() {
        System.out.println(this + " shoot!");
    }

    @Override
    public String toString() {
        return "Elf{" +
            "id=" + id +
            '}';
    }
}
