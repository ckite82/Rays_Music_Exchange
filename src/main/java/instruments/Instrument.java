package instruments;

public abstract class Instrument {

    protected String soundMade;
    protected double markUp;

    private int itemNumber;
    private String make;
    private String model;
    private boolean saleItem;
    public double costPrice;
    public double retailPrice;

    public Instrument(int itemNumber, String make, String model, boolean saleItem, double costPrice, double retailPrice){
        this.itemNumber = itemNumber;
        this.make = make;
        this.model = model;
        this.saleItem = saleItem;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
        this.soundMade = "";
        this.markUp = 0.0;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getManufacturer() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public boolean getSaleStatus() {
        return this.saleItem;
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }

    public String getSoundMade() {
        return soundMade;
    }

    public double getProfitMade() {
        return markUp;
    }

}
