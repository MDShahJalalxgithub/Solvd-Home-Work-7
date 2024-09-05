package org.example;

import java.util.Map;
import java.util.HashMap;

public class Desktop extends Computer {
    protected String formFactor;
    protected Map<String, String> peripheralDevices;

    public Desktop(String brand, double price, boolean isPortable, String formFactor, Processor processor) {
        super(brand, price, isPortable, processor);
        this.formFactor = formFactor;
        this.peripheralDevices = new HashMap<>();
    }

    public void addPeripheral(String port, String device) {
        peripheralDevices.put(port, device);
    }

    public Map<String, String> getPeripheralDevices() {
        return peripheralDevices;
    }

    @Override
    public void displayInfo() {
        System.out.println("Desktop: " + getBrand() + ", Price: $" + getPrice() +
                ", Form Factor: " + formFactor + ", Processor: " + processor.getModel() +
                ", Speed: " + processor.getSpeed() + " GHz");
    }
}