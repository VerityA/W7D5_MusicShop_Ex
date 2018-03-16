package Items.Accessories;

import Items.Item;

public class DrumSticks extends Item {

    private StickMaterial stickMaterial;

    public DrumSticks(double buyPrice, double sellPrice, String name, StickMaterial stickMaterial) {
        super(buyPrice, sellPrice, name);
        this.stickMaterial = stickMaterial;
    }

    public StickMaterial getStickMaterial() {
        return stickMaterial;
    }
}
