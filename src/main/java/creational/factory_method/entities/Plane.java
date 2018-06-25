package creational.factory_method.entities;

import creational.factory_method.entities.api.Transport;

public class Plane implements Transport {

    private String name = "Unknown";

    public Plane() {
    }

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void deliver() {
        System.out.println("Air deliver by " + this);
    }

    @Override
    public String toString() {
        return "Plane{" +
            "name='" + name + '\'' +
            '}';
    }
}
