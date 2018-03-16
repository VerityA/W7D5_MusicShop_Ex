package Items.Instruments;

public class Trumpet extends Instrument {

    private int noOfValves;

    public Trumpet(double buyPrice, double sellPrice, String name, String material, String colour, int noOfValves) {
        super(buyPrice, sellPrice, name, material, colour, InstrumentType.BRASS);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    @Override
    public String play() {
        return "Blast, blast, blast";
    }
}
