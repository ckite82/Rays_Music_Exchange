package instruments;

import behaviours.IPlay;

public class Keyboard extends Instrument implements IPlay {

    private int amountOfKeys;
    private String pianoType;

    public Keyboard(int itemNumber, String make, String model, boolean saleItem, double costPrice, double retailPrice, int amountOfKeys, String pianoType){
        super (itemNumber, make, model, saleItem, costPrice, retailPrice);
        this.amountOfKeys = amountOfKeys;
        this.pianoType = pianoType;

    }

    public int getAmountOfKeys() {
        return amountOfKeys;
    }

    public String getPianoType() {
        return pianoType;
    }

    public String play(String playInstrument){
        return "I am a keyboard instrument and I can " + playInstrument;
    }

    public double calculateMarkup(double retailPrice, double costPrice){
        return this.retailPrice - this.costPrice;
    }
}