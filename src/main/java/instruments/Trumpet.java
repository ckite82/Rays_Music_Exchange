package instruments;

public class Trumpet extends Instrument{

    private int numberOfValves;

    private String mouthPieceSize;

    public Trumpet(int itemNumber, String make, String model, boolean saleItem, double costPrice, double retailPrice){
        super (itemNumber, make, model, saleItem, costPrice, retailPrice);
        this.numberOfValves = numberOfValves;
        this.mouthPieceSize = mouthPieceSize;
    }
}
