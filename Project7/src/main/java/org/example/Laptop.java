package org.example;

import java.util.HashSet;
import java.util.Set;

public class Laptop extends Computer implements Portable {
    protected double weight;
    protected Set<String> connectedDevices;

    public Laptop(String brand, double price, boolean isPortable, double weight, Processor processor) {
        super(brand, price, isPortable, processor);
        this.weight = weight;
        this.connectedDevices = new HashSet<>();
    }

    public void addDevice(String device) {
        connectedDevices.add(device);
    }

    public Set<String> getConnectedDevices() {
        return connectedDevices;
    }

    @Override
    public void displayInfo() {
        System.out.println("Laptop: " + getBrand() + ", Price: $" + getPrice() +
                ", Weight: " + weight + " kg, Processor: " + processor.getModel() +
                ", Speed: " + processor.getSpeed() + " GHz");
    }

    @Override
    public void carry() {
        System.out.println("Carrying the laptop.");
    }
}