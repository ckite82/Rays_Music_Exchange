package instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;
    private int guitarType;

    public Guitar(String make, String model, boolean saleItem, double costPrice, double retailPrice){
        super (make, model, saleItem, costPrice, retailPrice);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }
}
