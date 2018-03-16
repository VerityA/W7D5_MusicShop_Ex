import Items.Instruments.InstrumentType;
import Items.Instruments.Violin;
import Items.Instruments.ViolinSize;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin(165, 250, "Stradivari", "spruce", "orange", ViolinSize.FULL);
    }

    @Test
    public void canGetName() {
        assertEquals("Stradivari", violin.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(165, violin.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(250, violin.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("spruce", violin.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("orange", violin.getColour());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(ViolinSize.FULL, violin.getViolinSize());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(85, violin.calculateMarkUp(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Screech, screech, screech", violin.play());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRINGS, violin.getInstrumentType());
    }
}
