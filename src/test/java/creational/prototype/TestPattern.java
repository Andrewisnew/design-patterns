package creational.prototype;

import static org.junit.Assert.assertEquals;

import creational.prototype.config.Brand;
import creational.prototype.config.Color;
import creational.prototype.config.Size;
import creational.prototype.entities.Tshirt;
import java.util.Objects;
import org.junit.Test;

public class TestPattern {

    @Test
    public void testAbstractFactory(){
        Tshirt prototype = new Tshirt(Brand.ADIDAS, Color.BLUE, Size.XS);
        Tshirt tshirt = null;
        try {
            tshirt = (Tshirt) prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        assertEquals(prototype, Objects.requireNonNull(tshirt));
    }
}
