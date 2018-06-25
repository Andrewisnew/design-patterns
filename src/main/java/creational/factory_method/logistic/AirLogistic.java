package creational.factory_method.logistic;

import creational.factory_method.entities.Plane;
import creational.factory_method.entities.api.Transport;
import creational.factory_method.logistic.api.Logistic;

public class AirLogistic extends Logistic {

    public Transport createTransport() {
        return new Plane();
    }

    public Transport createTransport(String name) {
        return new Plane(name);
    }
}
