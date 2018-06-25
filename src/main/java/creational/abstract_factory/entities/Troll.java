package creational.abstract_factory.entities;

import creational.abstract_factory.entities.api.Gunner;

public class Troll implements Gunner {

    private static int counter = 0;
    private final int id = counter++;

    public void shoot() {
        System.out.println(this + " shoot!");
    }

    @Override
    public String toString() {
        return "Troll{" +
            "id=" + id +
            '}';
    }
}
