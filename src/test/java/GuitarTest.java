import Items.Instruments.Guitar;
import Items.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(375, 500, "Fender", "mahogany", "mahogany", 6);
    }

    @Test
    public void canGetName() {
        assertEquals("Fender", guitar.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(375, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(500, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("mahogany", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("mahogany", guitar.getColour());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(125, guitar.calculateMarkUp(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Strum, strum, strum", guitar.play());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRINGS, guitar.getInstrumentType());
    }
}
