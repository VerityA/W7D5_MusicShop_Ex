package Items.Accessories;


import Items.Accessories.Genre;
import Items.Accessories.MusicType;
import Items.Item;

public class SheetMusic extends Item {

    private MusicType musicType;
    private Genre genre;


    public SheetMusic(double buyPrice, double sellPrice, String name, Genre genre, MusicType musicType) {
        super(buyPrice, sellPrice, name);
        this.genre = genre;
        this.musicType = musicType;
    }

    public Genre getGenre() {
        return genre;
    }

    public MusicType getMusicType() {
        return musicType;
    }
}
