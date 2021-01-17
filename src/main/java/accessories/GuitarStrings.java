package accessories;

import behaviours.ISell;

public class GuitarStrings extends Accessory implements ISell {

    public GuitarStrings(String name, double buyingPrice, double sellingPrice) {
        super(name, buyingPrice, sellingPrice);
    }

    public void calculateMarkup(double sellingPrice, double buyingPrice){
        this.markUp = sellingPrice - buyingPrice;
    }
}
