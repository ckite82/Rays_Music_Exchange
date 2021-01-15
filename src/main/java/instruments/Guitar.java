package instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    //    TODO: Not used String type from sub-class in plan Chris!

    public Guitar(String type, String material, String colour, double sellingPrice, double buyingPrice){
        super (type, material, colour, sellingPrice, buyingPrice);
        this.numberOfStrings = numberOfStrings;
    }
}
