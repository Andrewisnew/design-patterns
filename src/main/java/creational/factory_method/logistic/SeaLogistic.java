package creational.factory_method.logistic;

import creational.factory_method.logistic.api.Logistic;
import creational.factory_method.entities.Ship;
import creational.factory_method.entities.api.Transport;

public class SeaLogistic extends Logistic {

    public Transport createTransport() {
        return new Ship();
    }

    public Transport createTransport(String name) {
        return new Ship(name);
    }
}
