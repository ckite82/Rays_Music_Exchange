package instruments;

public class Trumpet extends Instrument{

    private int numberOfValves;

    //    TODO: Not used String type from sub-class in plan Chris!

    public Trumpet(String make, String model, boolean saleItem, double costPrice, double retailPrice){
        super (make, model, saleItem, costPrice, retailPrice);
        this.numberOfValves = numberOfValves;
    }
}
