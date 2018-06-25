package creational.singleton;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class SingletonTest {

    @Test
    public void testAbstractFactory(){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertTrue(instance1 == instance2);
    }
}