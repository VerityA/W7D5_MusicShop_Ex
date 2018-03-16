package Items.Instruments;

public class Violin extends Instrument {

    private ViolinSize violinSize;

    public Violin(double buyPrice, double sellPrice, String name, String material, String colour, ViolinSize violinSize) {
        super(buyPrice, sellPrice, name, material, colour, InstrumentType.STRINGS);
        this.violinSize = violinSize;
    }

    public ViolinSize getViolinSize() {
        return violinSize;
    }

    @Override
    public String play() {
        return "Screech, screech, screech";
    }
}
