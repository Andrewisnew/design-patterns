package creational.factory_method;


import static org.junit.Assert.assertEquals;

import creational.factory_method.entities.Plane;
import creational.factory_method.entities.Ship;
import creational.factory_method.entities.Truck;
import creational.factory_method.logistic.AirLogistic;
import creational.factory_method.logistic.RoadLogistic;
import creational.factory_method.logistic.SeaLogistic;
import creational.factory_method.logistic.api.Logistic;
import org.junit.Test;

public class TestPattern {

    @Test
    public void factoryMethod(){
        Logistic roadLogistic = new RoadLogistic();
        assertEquals(roadLogistic.createTransport().getClass(), Truck.class);
        Logistic seaLogistic = new SeaLogistic();
        assertEquals(seaLogistic.createTransport().getClass(), Ship.class);
        Logistic airLogistic = new AirLogistic();
        assertEquals(airLogistic.createTransport().getClass(), Plane.class);

        roadLogistic.deliver("Tokyo", "Sydney");
    }

}
