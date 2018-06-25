package creational.factory_method.entities;

import creational.factory_method.entities.api.Transport;

public class Ship implements Transport {

    private String name = "Unknown";

    public Ship() {
    }

    public Ship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void deliver() {
        System.out.println("Water deliver by " + this);

    }

    @Override
    public String toString() {
        return "Ship{" +
            "name='" + name + '\'' +
            '}';
    }
}
