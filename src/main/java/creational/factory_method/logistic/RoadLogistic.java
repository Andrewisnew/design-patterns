package creational.factory_method.logistic;

import creational.factory_method.logistic.api.Logistic;
import creational.factory_method.entities.Truck;
import creational.factory_method.entities.api.Transport;

public class RoadLogistic extends Logistic {

    public Transport createTransport() {
        return new Truck();
    }

    public Transport createTransport(String name) {
        return new Truck(name);
    }
}
