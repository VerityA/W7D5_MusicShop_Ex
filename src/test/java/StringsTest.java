import Items.Accessories.StringType;
import Items.Accessories.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Strings strings;

    @Before
    public void before() {
        strings = new Strings(2.25, 5, "Ernie Ball", StringType.BASSGUITAR);
    }

    @Test
    public void canGetName() {
        assertEquals("Ernie Ball", strings.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(2.25, strings.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(5, strings.getSellPrice(), 0.01);
    }

    @Test
    public void canGetStickMaterial() {
        assertEquals(StringType.BASSGUITAR, strings.getStringType());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(2.75, strings.calculateMarkUp(), 0.01);
    }
}
