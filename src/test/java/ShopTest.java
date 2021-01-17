import accessories.Accessory;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {


    Shop shop;
    Instrument instrument;
    Instrument instrument1;
    Instrument instrument2;
    Instrument instrument3;
    Accessory accessory;
    Accessory accessory1;
    Accessory accessory2;
    Accessory accessory3;

    @Before
    public void setUp(){
        shop = new Shop("Rays Music Exchange", 2000.00, instrument, accessory);
    }

    @Test
    public void canGetName(){
        assertEquals("Rays Music Exchange", shop.getName());
    }

    @Test
    public void canGetTill(){
        assertEquals(2000, shop.getTill(), 0.01);
    }

    @Test
    public void canGetStock(){
        assertEquals(0, shop.getStock());
    }

}
