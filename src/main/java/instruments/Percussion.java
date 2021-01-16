package instruments;

public class Percussion extends Instrument{

    private int drumSizeInches;
    private String drumType;

    public Percussion(int itemNumber, String make, String model, boolean saleItem, double costPrice, double retailPrice){
        super (itemNumber, make, model, saleItem, costPrice, retailPrice);
        this.drumSizeInches = drumSizeInches;
        this.drumType = drumType;
    }
}
