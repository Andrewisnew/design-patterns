package creational.abstract_factory;

import static org.junit.Assert.assertEquals;

import creational.abstract_factory.entities.Knight;
import creational.abstract_factory.factory.AllianceFactory;
import creational.abstract_factory.factory.api.AbstractFactory;
import org.junit.Test;

public class TestPattern {

    @Test
    public void testAbstractFactory(){
        AbstractFactory allianceFactory = new AllianceFactory();

        allianceFactory.createGunner().shoot();

        assertEquals(allianceFactory.createWarrior().getClass(), Knight.class);


    }
}
