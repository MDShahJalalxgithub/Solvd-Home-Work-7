package org.example;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel i7", 3.5);

        Laptop laptop = new Laptop("Dell", 1500, true, 2.5, processor);
        laptop.addSoftware("Microsoft Office");
        laptop.addDevice("Mouse");
        laptop.displayInfo();

        Tablet tablet = new Tablet("iPad", 800, true, true, processor);
        tablet.installApp("Netflix");
        tablet.displayInfo();

        Desktop desktop = new Desktop("HP", 1000, false, "Tower", processor);
        desktop.addPeripheral("USB", "Keyboard");
        desktop.displayInfo();

        Server server = new Server("Lenovo", 3000, false, 4, processor);
        server.addTask("Data Backup");
        server.displayInfo();

        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("Node 1");
        list.add("Node 2");
        list.display();
    }
}