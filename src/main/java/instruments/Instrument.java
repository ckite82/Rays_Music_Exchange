package instruments;

public abstract class Instrument {

    private String type;
    private String material;
    private String colour;
    private double sellingPrice;
    private double buyingPrice;

    public Instrument(String type, String material, String colour, double sellingPrice, double buyingPrice){
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }
}
