package org.example;

import java.util.List;
import java.util.ArrayList;

public abstract class Computer implements NetworkEnabled, Upgradable, SecureDevice {
    private String brand;
    private double price;
    private boolean isPortable;
    protected Processor processor;
    protected List<String> softwareList;

    public Computer(String brand, double price, boolean isPortable, Processor processor) {
        this.brand = brand;
        this.price = price;
        this.isPortable = isPortable;
        this.processor = processor;
        this.softwareList = new ArrayList<>();
    }

    public Computer() {

    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void addSoftware(String software) {
        softwareList.add(software);
    }

    public List<String> getSoftwareList() {
        return softwareList;
    }

    public abstract void displayInfo();

    @Override
    public void connectToNetwork() {
        System.out.println("Connecting to network...");
    }

    @Override
    public void upgradeHardware() {
        System.out.println("Upgrading hardware...");
    }

    @Override
    public void encryptData() {
        System.out.println("Encrypting data...");
    }
}