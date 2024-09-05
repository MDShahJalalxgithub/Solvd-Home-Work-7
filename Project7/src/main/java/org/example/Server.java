package org.example;

import java.util.Queue;
import java.util.LinkedList;

public class Server extends Computer {
    protected int rackUnits;
    protected Queue<String> taskQueue;

    public Server(String brand, double price, boolean isPortable, int rackUnits, Processor processor) {
        super(brand, price, isPortable, processor);
        this.rackUnits = rackUnits;
        this.taskQueue = new LinkedList<>();
    }

    public void addTask(String task) {
        taskQueue.offer(task);
    }

    public Queue<String> getTaskQueue() {
        return taskQueue;
    }

    @Override
    public void displayInfo() {
        System.out.println("Server: " + getBrand() + ", Price: $" + getPrice() +
                ", Rack Units: " + rackUnits + ", Processor: " + processor.getModel() +
                ", Speed: " + processor.getSpeed() + " GHz");
    }
}