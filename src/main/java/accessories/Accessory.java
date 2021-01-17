package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    protected double markUp;

    private String name;
    public double buyingPrice;
    public double sellingPrice;

    public Accessory(String name, double buyingPrice, double sellingPrice) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.markUp = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getProfitMade() {
        return markUp;
    }
}