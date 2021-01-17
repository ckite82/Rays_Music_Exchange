package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Brass extends Instrument implements IPlay, ISell {

    private int numberOfValves;
    private String mouthPieceSize;

    public Brass(int itemNumber, String make, String model, boolean saleItem, double costPrice, double retailPrice, int numberOfValves, String mouthPieceSize){
        super (itemNumber, make, model, saleItem, costPrice, retailPrice);
        this.numberOfValves = numberOfValves;
        this.mouthPieceSize = mouthPieceSize;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String getMouthPieceSize() {
        return mouthPieceSize;
    }

    public void playInstrument(String sound) {
        this.soundMade = sound;
    }

    public void calculateMarkup(double retailPrice, double costPrice) {
        this.markUp = retailPrice - costPrice;
    }
}
