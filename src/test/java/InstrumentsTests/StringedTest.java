package InstrumentsTests;

import instruments.Stringed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringedTest {

    Stringed electricGuitar;
    Stringed guitar;

    @Before
    public void setUp() {
        electricGuitar = new Stringed(100050, "Fender", "Stratocaster", false, 329,450.49, 6, "Electric");
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, electricGuitar.getStringQty());
    }

    @Test
    public void canGetGuitarType() {
        assertEquals("Electric", electricGuitar.getGuitarType());
    }

    @Test
    public void canPlaySound() {
        assertEquals("I am a stringed instrument and I can Strum Strum!", electricGuitar.play("Strum Strum!"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(121.49, electricGuitar.calculateMarkup(450.49, 329.00),0.01);
    }
}
