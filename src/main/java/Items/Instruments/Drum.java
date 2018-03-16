package Items.Instruments;

public class Drum extends Instrument {

    private int diameter;

    public Drum(double buyPrice, double sellPrice, String name, String material, String colour, int diameter) {
        super(buyPrice, sellPrice, name, material, colour, InstrumentType.PERCUSSION);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String play() {
        return "Bang, bang, bang";
    }
}
