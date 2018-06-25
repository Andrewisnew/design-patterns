package creational.factory_method.logistic.api;

import creational.factory_method.entities.api.Transport;

public abstract class Logistic {
    public abstract Transport createTransport();
    public abstract Transport createTransport(String name);
    public void deliver(String fromCity, String toCity){
        Transport transport = createTransport();
        transport.deliver();
        System.out.println("From " + fromCity + " to " + toCity);
    }

}
