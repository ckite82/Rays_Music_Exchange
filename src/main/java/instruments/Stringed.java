package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Stringed extends Instrument implements IPlay, ISell {

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

    public void playInstrument(String sound) {
        this.soundMade = sound;
    }

    public void calculateMarkup(double retailPrice, double costPrice) {
        this.markUp = retailPrice - costPrice;
    }
}
