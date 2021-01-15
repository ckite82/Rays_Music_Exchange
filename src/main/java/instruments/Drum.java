package instruments;

public class Drum extends Instrument{

    private int numberOfDrums;
    //    TODO: Not used String type from sub-class in plan Chris!

    public Drum (String make, String model, boolean saleItem, double costPrice, double retailPrice){
        super (make, model, saleItem, costPrice, retailPrice);
        this.numberOfDrums = numberOfDrums;
    }
}
