package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Keyboard extends Instrument implements IPlay, ISell {

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

    public void playInstrument(String sound) {
        this.soundMade = sound;
    }

    public void calculateMarkup(double retailPrice, double costPrice) {
        this.markUp = retailPrice - costPrice;
    }
}