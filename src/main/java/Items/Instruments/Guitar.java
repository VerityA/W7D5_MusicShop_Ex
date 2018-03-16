package Items.Instruments;

public class Guitar extends Instrument {

    private int noOfStrings;

    public Guitar(double buyPrice, double sellPrice, String name, String material, String colour, int noOfStrings) {
        super(buyPrice, sellPrice, name, material, colour, InstrumentType.STRINGS);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    @Override
    public String play() {
        return "Strum, strum, strum";
    }
}
