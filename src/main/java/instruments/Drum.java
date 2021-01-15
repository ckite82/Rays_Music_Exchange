package instruments;

public class Drum extends Instrument{

    private int drumSizeInches;
    private String drumType;

    public Drum (String make, String model, boolean saleItem, double costPrice, double retailPrice){
        super (make, model, saleItem, costPrice, retailPrice);
        this.drumSizeInches = drumSizeInches;
        this.drumType = drumType;
    }
}
