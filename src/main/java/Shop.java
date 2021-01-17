import accessories.Accessory;
import behaviours.ISell;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop {

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
}