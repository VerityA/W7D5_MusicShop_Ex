import Items.Instruments.InstrumentType;
import Items.Instruments.Piano;
import Items.Instruments.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(1530, 2000, "Yamaha", "wood", "brown", PianoType.ACOUSTIC);
    }

    @Test
    public void canGetName() {
        assertEquals("Yamaha", piano.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(1530, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(2000, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("brown", piano.getColour());
    }

    @Test
    public void canGetNumberOfValves() {
        assertEquals(PianoType.ACOUSTIC, piano.getPianoType());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(470, piano.calculateMarkUp(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Plonk, plonk, plonk" , piano.play());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.KEYBOARDS, piano.getInstrumentType());
    }
}
