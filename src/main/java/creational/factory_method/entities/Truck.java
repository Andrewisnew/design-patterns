package creational.factory_method.entities;

import creational.factory_method.entities.api.Transport;

public class Truck implements Transport {

    private String name = "Unknown";

    public Truck() {

    }

    public Truck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void deliver() {
        System.out.println("Deliver by " + this);
    }

    @Override
    public String toString() {
        return "Truck{" +
            "name='" + name + '\'' +
            '}';
    }
}
