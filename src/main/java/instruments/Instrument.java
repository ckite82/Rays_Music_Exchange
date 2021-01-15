package instruments;

public abstract class Instrument {

    private String make;
    private String model;
    private boolean saleItem;
    private double costPrice;
    private double retailPrice;

    public Instrument(String make, String model, boolean saleItem, double costPrice, double retailPrice){
        this.make = make;
        this.model = model;
        this.saleItem = saleItem;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
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

}
