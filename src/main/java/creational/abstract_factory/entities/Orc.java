package creational.abstract_factory.entities;

import creational.abstract_factory.entities.api.Warrior;


public class Orc implements Warrior {

    private static int counter = 0;
    private final int id = counter++;

    public void hit() {
        System.out.println(this + " hit!");
    }

    @Override
    public String toString() {
        return "Orc{" +
            "id=" + id +
            '}';
    }
}
