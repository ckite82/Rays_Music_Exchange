package instruments;

import behaviours.IPlay;

public class Percussion extends Instrument implements IPlay {

    private int drumSizeInches;
    private String drumType;

    public Percussion(int itemNumber, String make, String model, boolean saleItem, double costPrice, double retailPrice, int drumSizeInches, String drumType){
        super (itemNumber, make, model, saleItem, costPrice, retailPrice);
        this.drumSizeInches = drumSizeInches;
        this.drumType = drumType;
    }

    public int getDrumSizeInches() {
        return drumSizeInches;
    }

    public String getDrumType() {
        return drumType;
    }

    public void playInstrument(String sound) {
        this.soundMade = sound;
    }

    public double calculateMarkup(double retailPrice, double costPrice){
        return this.retailPrice - this.costPrice;

    }
}
