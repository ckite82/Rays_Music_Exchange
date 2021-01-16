package AccessoriesTest;

import accessories.Amplifiers;
import accessories.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AmplifiersTest {

    Amplifiers amplifier;

    @Before
    public void setUp(){
        amplifier = new Amplifiers("Yamaha", 300.0, 400.0);
    }

    @Test
    public void canGetName(){
        assertEquals("Yamaha", amplifier.getName());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(300.0, amplifier.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(400.0, amplifier.getSellingPrice(), 0.01);
    }

}
