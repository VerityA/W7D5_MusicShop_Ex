import Items.Accessories.StickMaterial;
import Items.Instruments.InstrumentType;
import Items.Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;


    @Before
    public void before() {
        trumpet = new Trumpet(30, 55, "Cecilio Gold", "gold", "gold", 3);
    }

    @Test
    public void canGetName() {
        assertEquals("Cecilio Gold", trumpet.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(30, trumpet.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(55, trumpet.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("gold", trumpet.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("gold", trumpet.getColour());
    }

    @Test
    public void canGetNumberOfValves() {
        assertEquals(3, trumpet.getNoOfValves());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(25, trumpet.calculateMarkUp(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Blast, blast, blast", trumpet.play());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }
}
