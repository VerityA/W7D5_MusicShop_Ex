import Items.Instruments.Drum;
import Items.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before() {
        drum = new Drum(310, 450, "Ludwig", "aluminium", "red", 10);
    }

    @Test
    public void canGetName() {
        assertEquals("Ludwig", drum.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(310, drum.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(450, drum.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("aluminium", drum.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("red", drum.getColour());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(10, drum.getDiameter());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(140, drum.calculateMarkUp(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Bang, bang, bang", drum.play());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.PERCUSSION, drum.getInstrumentType());
    }
}
