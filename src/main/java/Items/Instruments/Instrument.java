package Items.Instruments;

import Items.IPlay;
import Items.Item;

public class Instrument extends Item implements IPlay {

    private String material;
    private String colour;
    private InstrumentType instrumentType;

    public Instrument(double buyPrice, double sellPrice, String name, String material, String colour, InstrumentType instrumentType) {
        super(buyPrice, sellPrice, name);
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String play() {
        return null;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
