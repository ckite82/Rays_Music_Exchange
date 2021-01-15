import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum tomTom;
    Drum bass;
    Drum snare;

    @Before
    public void setUp(){
        tomTom = new Drum("Premier", "something", false, 100.50,199.99);
        bass = new Drum("Tama","Something", true, 100, 200);
        snare = new Drum("Ludwig", "Something", false, 200, 300);
    }

    @Test
    public void canGetMake() {
        assertEquals("Premier", tomTom.getManufacturer());
    }

    @Test
    public void canGetModel() {
         assertEquals("Something", bass.getModel());
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
}
