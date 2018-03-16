package MusicShop;

import Items.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public double totalPotentialProfit() {
        double potentialProfit = 0;
        for(ISell item: stock) {
            potentialProfit += item.calculateMarkUp();
        }
        return potentialProfit;
    }
}
