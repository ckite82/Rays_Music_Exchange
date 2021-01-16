package instruments;

public class Keyboard extends Instrument{

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
}
