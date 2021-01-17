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
        grandPiano = new Keyboard(100050, "Premier", "Pro Beat", false, 1500, 2000, 77, "Grand");
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
    public void hasMadeNoSoundToStart() {
        assertEquals("", grandPiano.getSoundMade());
    }

    @Test
    public void canPlaySound() {
        grandPiano.playInstrument("Dun-dun-dun-dun");
        assertEquals("Dun-dun-dun-dun", grandPiano.getSoundMade());
    }


}


