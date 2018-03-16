package Items;

public abstract class Item implements ISell {

    private double buyPrice;
    private double sellPrice;
    private String name;

    public Item(double buyPrice, double sellPrice, String name) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.name = name;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getName() {
        return name;
    }

    public double calculateMarkUp() {
        return this.sellPrice - this.buyPrice;
    }
}
