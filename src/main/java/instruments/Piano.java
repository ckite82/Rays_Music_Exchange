package instruments;

public class Piano extends Instrument{

    private int amountOfKeys;
    private String pianoType;

    public Piano(String make, String model, boolean saleItem, double costPrice, double retailPrice){
        super (make, model, saleItem, costPrice, retailPrice);
        this.amountOfKeys = amountOfKeys;
        this.pianoType = pianoType;

    }
}
