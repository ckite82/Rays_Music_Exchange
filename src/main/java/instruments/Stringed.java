package instruments;

import behaviours.IPlay;

public class Stringed extends Instrument implements IPlay {

    private int numberOfStrings;
    private String guitarType;

    public Stringed(int itemNumber, String make, String model, boolean saleItem, double costPrice, double retailPrice, int numberOfStrings, String guitarType){
        super (itemNumber, make, model, saleItem, costPrice, retailPrice);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    public int getStringQty() {
        return this.numberOfStrings;
    }

    public String getGuitarType() {
        return this.guitarType;
    }

    public String play(String playInstrument){
        return "I am a stringed instrument and I can " + playInstrument;
    }

    public double calculateMarkup(double retailPrice, double costPrice){
        return this.retailPrice - this.costPrice;

    }
}
