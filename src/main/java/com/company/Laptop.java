package com.company;

public class Laptop extends Computer {
    private final String manufacturer;
    private final double monitorSizeInches;
    private boolean isOpen = false;

    public Laptop(String OS, int storage, int memory, String manufacturer, double monitorSizeInches) {
        super(OS, storage, memory);
        this.manufacturer = manufacturer;
        this.monitorSizeInches = monitorSizeInches;
    }

    public void openLaptop() {
        isOpen = !isOpen;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getMonitorSizeInches() {
        return monitorSizeInches;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
