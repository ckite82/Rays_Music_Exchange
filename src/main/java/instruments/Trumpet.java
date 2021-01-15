package instruments;

public class Trumpet extends Instrument{

    private int numberOfValves;

    //    TODO: Not used String type from sub-class in plan Chris!

    public Trumpet(String type, String material, String colour, double sellingPrice, double buyingPrice){
        super (type, material, colour, sellingPrice, buyingPrice);
        this.numberOfValves = numberOfValves;
    }
}
