package Items.Accessories;


import Items.Item;

public class Strings extends Item {

    private StringType stringType;


    public Strings(double buyPrice, double sellPrice, String name, StringType stringType) {
        super(buyPrice, sellPrice, name);
        this.stringType = stringType;

    }

    public StringType getStringType() {
        return stringType;
    }


}
