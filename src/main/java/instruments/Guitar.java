package instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    //    TODO: Not used String type from sub-class in plan Chris!

    public Guitar(String make, String model, boolean saleItem, double costPrice, double retailPrice){
        super (make, model, saleItem, costPrice, retailPrice);
        this.numberOfStrings = numberOfStrings;
    }
}
