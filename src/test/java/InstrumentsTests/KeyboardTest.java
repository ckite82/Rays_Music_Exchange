package InstrumentsTests;

import instruments.Keyboard;
import instruments.Percussion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard grandPiano;
    Keyboard keyboard;

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

    @Test
    public void canPlaySound() {
        assertEquals("I am a keyboard instrument and I can Ting-A-Ling-A-Ling",grandPiano.play("Ting-A-Ling-A-Ling"));
    }
}


