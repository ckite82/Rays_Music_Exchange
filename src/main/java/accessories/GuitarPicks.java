package accessories;

import behaviours.ISell;

public class GuitarPicks extends Accessory implements ISell {
    public GuitarPicks(String name, double buyingPrice, double sellingPrice) {
        super(name, buyingPrice, sellingPrice);
    }

    public void calculateMarkup(double sellingPrice, double buyingPrice){
        this.markUp = sellingPrice - buyingPrice;
    }
}