import accessories.Accessory;
import accessories.DrumSticks;
import instruments.Instrument;
import instruments.Percussion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {


    private Shop shop;
    private Instrument instrument;
    private Instrument snare;
    private Instrument instrument2;
    private Instrument instrument3;
    private Accessory accessory;
    private DrumSticks drumSticks;
    private Accessory accessory2;
    private Accessory accessory3;
    @Before
    public void setUp(){
        shop = new Shop("Rays Music Exchange", 2000.00, instrument, accessory);
        snare = new Percussion(100070, "Ludwig", "SQ1 Series", false, 200, 300, 20, "Snare");
        drumSticks = new DrumSticks("Premier", 5, 10);
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
    
    @Test
    public void canGetInstrument(){
        assertEquals(instrument, shop.getInstrument());
    }

    @Test
    public void canGetAccessory(){
        assertEquals(accessory, shop.getAccessory());
    }

    @Test
    public void canAddInstrumentToStock(){
        shop.addItem(snare);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canAddAccessoryToStock(){
        shop.addItem(drumSticks);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canAddAllToStock(){
        shop.addItem(snare);
        shop.addItem(drumSticks);
        assertEquals(2, shop.getStock());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addItem(snare);
        shop.addItem(drumSticks);
        shop.removeItem(snare);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canCalculateProfitOfStockItems(){
        shop.addItem(snare);
        shop.addItem(drumSticks);
        assertEquals(105.00, shop.getProfit(), 0.01);
    }

}
