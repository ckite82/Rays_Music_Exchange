package InstrumentsTests;

import instruments.Keyboard;
import instruments.Percussion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard grandPiano;

    @Before
    public void setUp() {
        grandPiano = new Keyboard(100050, "Premier", "Pro Beat", false, 100.50, 199.99, 77, "Grand");
    }

    @Test
    public void canGetKeysQty() {
        assertEquals(77, grandPiano.getAmountOfKeys());
    }

    @Test
    public void canGetPianoType() {
        assertEquals("Grand", grandPiano.getPianoType());
    }

}


