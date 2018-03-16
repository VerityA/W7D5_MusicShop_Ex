package Items.Instruments;

public class Piano extends Instrument {

    private PianoType pianoType;

    public Piano(double buyPrice, double sellPrice, String name, String material, String colour, PianoType pianoType) {
        super(buyPrice, sellPrice, name, material, colour, InstrumentType.KEYBOARDS);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    @Override
    public String play() {
        return "Plonk, plonk, plonk";
    }
}
