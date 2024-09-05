package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tablet extends Computer implements Portable, TouchScreen {
    protected boolean hasStylus;
    protected List<String> apps;

    public Tablet(String brand, double price, boolean isPortable, boolean hasStylus, Processor processor) {
        super(brand, price, isPortable, processor);
        this.hasStylus = hasStylus;
        this.apps = new ArrayList<>();
    }

    public void installApp(String app) {
        apps.add(app);
    }

    public List<String> getApps() {
        return apps;
    }

    @Override
    public void displayInfo() {
        System.out.println("Tablet: " + getBrand() + ", Price: $" + getPrice() +
                ", Has Stylus: " + hasStylus + ", Processor: " + processor.getModel() +
                ", Speed: " + processor.getSpeed() + " GHz");
    }

    @Override
    public void carry() {
        System.out.println("Carrying the tablet.");
    }

    @Override
    public void touchInput() {
        System.out.println("Using touch input.");
    }
}