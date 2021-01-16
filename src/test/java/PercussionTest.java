import instruments.Percussion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionTest {

    Percussion tomTom;
    Percussion bass;
    Percussion snare;

    private int drumSize = 18;

    @Before
    public void setUp(){
        tomTom = new Percussion(100050, "Premier", "Pro Beat", false, 100.50,199.99);
        bass = new Percussion(100060, "British Drum Co.","Legend Series", true, 100, 200);
        snare = new Percussion(100070, "Ludwig", "SQ1 Series", false, 200, 300);
    }

    @Test
    public void canGetItemNumber() {
        assertEquals(100050, tomTom.getItemNumber());
    }

    @Test
    public void canGetMake() {
        assertEquals("Premier", tomTom.getManufacturer());
    }

    @Test
    public void canGetModel() {
         assertEquals("Legend Series", bass.getModel());
    }

    @Test
    public void canCheckSaleItem__false() {
        assertEquals(false, tomTom.getSaleStatus());
    }

    @Test
    public void canCheckSaleItem__true() {
        assertEquals(true, bass.getSaleStatus());
    }

    @Test
    public void canGetcostPrice() {
        assertEquals(100.50, tomTom.getCostPrice(), 0.01);
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(199.99, tomTom.getRetailPrice(), 0.01);
    }
}
