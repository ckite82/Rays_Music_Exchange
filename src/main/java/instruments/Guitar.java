package instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;
    private int guitarType;

    public Guitar(int itemNumber, String make, String model, boolean saleItem, double costPrice, double retailPrice){
        super (itemNumber, make, model, saleItem, costPrice, retailPrice);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }
}
