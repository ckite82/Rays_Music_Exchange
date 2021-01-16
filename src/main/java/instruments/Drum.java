package instruments;

public class Drum extends Instrument{

    private int drumSizeInches;
    private String drumType;

    public Drum (int itemNumber, String make, String model, boolean saleItem, double costPrice, double retailPrice){
        super (itemNumber, make, model, saleItem, costPrice, retailPrice);
        this.drumSizeInches = drumSizeInches;
        this.drumType = drumType;
    }
}
