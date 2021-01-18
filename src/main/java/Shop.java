import accessories.Accessory;
import behaviours.ISell;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop implements ISell {

    public double markUp;
    private String name;
    private double till;
    private ArrayList<ISell> stock;
    Instrument instrument;
    Accessory accessory;


    public Shop(String name, double till, Instrument instrument, Accessory accessory) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<ISell>();
        this.instrument = instrument;
        this.accessory = accessory;
        this.markUp = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public int getStock() {
        return this.stock.size();
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public Accessory getAccessory() {
        return accessory;
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

//    public void calculateMarkup(double retailPrice, double costPrice) {
//        this.markUp = retailPrice - costPrice;
//    }

    private void calculateMarkup(ISell item) {
    }

    public double getProfit() {
        double total = 0;
        for (ISell item : this.stock) {
            calculateMarkup(item);
            total += markUp;
        }
        return total;
    }

    @Override
    public void calculateMarkup(double sellingPrice, double buyingPrice) {

    }
}