import Items.Accessories.Genre;
import Items.Accessories.MusicType;
import Items.Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(7.5, 15, "Greatest Classics for Violin", Genre.CLASSICAL, MusicType.VIOLIN);
    }

    @Test
    public void canGetName() {
        assertEquals("Greatest Classics for Violin", sheetMusic.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(7.5, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(15, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canGetGenre() {
        assertEquals(Genre.CLASSICAL, sheetMusic.getGenre());
    }

    @Test
    public void canGetMusicType() {
        assertEquals(MusicType.VIOLIN, sheetMusic.getMusicType());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(7.5, sheetMusic.calculateMarkUp(), 0.01);
    }
}
