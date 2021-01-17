package InstrumentsTests;

import instruments.Brass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassTest {

    Brass brass;
    Brass trumpet;

    @Before
    public void setUp() {
        brass = new Brass(500050, "John Packer", "JP051", false, 120.00, 169.99, 3, "JP601");


    }

    @Test
    public void canGetItemNumber() {
        assertEquals(500050, brass.getItemNumber());
    }

    @Test
    public void canGetMake() {
        assertEquals("John Packer", brass.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("JP051", brass.getModel());
    }

    @Test
    public void canCheckSaleItem__false() {
        assertEquals(false, brass.getSaleStatus());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(120.0, brass.getCostPrice(), 0.01);
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(169.99, brass.getRetailPrice(), 0.01);
    }

    @Test
    public void canGetNumberOfValves() {
        assertEquals(3, brass.getNumberOfValves());
    }

    @Test
    public void canGetMouthPieceSize() {
        assertEquals("JP601", brass.getMouthPieceSize());
    }

    @Test
    public void canPlaySound() {
        brass.playInstrument("Toot-toot-toot");
        assertEquals("Toot-toot-toot", brass.getSoundMade());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(49.99, brass.calculateMarkup(169.99, 120.00),0.01);
    }
}
