import Items.Accessories.StringType;
import Items.Accessories.Strings;
import Items.Instruments.Guitar;
import Items.Instruments.Violin;
import Items.Instruments.ViolinSize;
import MusicShop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Strings strings;
    Violin violin;


    @Before
    public void before() {
        guitar = new Guitar(375, 500, "Fender", "mahogany", "mahogany", 6);
        strings = new Strings(2.25, 5, "Ernie Ball", StringType.BASSGUITAR);
        violin = new Violin(165, 250, "Stradivari", "spruce", "orange", ViolinSize.FULL);
        shop = new Shop();

    }

    @Test
    public void canGetStock() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddItem() {
        shop.addItem(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveItem() {
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        shop.addItem(guitar);
        shop.addItem(strings);
        shop.addItem(violin);
        assertEquals(212.75, shop.totalPotentialProfit(), 0.01);
    }
}
