package instruments;

import behaviours.IPlay;

public class Brass extends Instrument implements IPlay {

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

    public String play(String playInstrument){
        return "I am a brass instrument and I can " + playInstrument;
    }

    public double calculateMarkup(double retailPrice, double costPrice){
        return this.retailPrice - this.costPrice;
    }
}
