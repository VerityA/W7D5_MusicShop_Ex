import Items.Accessories.DrumSticks;
import Items.Accessories.StickMaterial;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks(4.5, 10, "Pro-mark", StickMaterial.HICKORY);
    }

    @Test
    public void canGetName() {
        assertEquals("Pro-mark", drumSticks.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(4.5, drumSticks.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(10, drumSticks.getSellPrice(), 0.01);
    }

    @Test
    public void canGetStickMaterial() {
        assertEquals(StickMaterial.HICKORY, drumSticks.getStickMaterial());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(5.5, drumSticks.calculateMarkUp(), 0.01);
    }
}
