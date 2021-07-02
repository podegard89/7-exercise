package com.company;

public abstract class Computer {
    private String operatingSystem;
    private int storageCapacityGB;
    private int memoryAmountGB;
    private boolean isPowered = false;
    private boolean isAppRunning = false;

    public Computer(String OS, int storage, int memory) {
        operatingSystem = OS;
        storageCapacityGB = storage;
        memoryAmountGB = memory;
    }

    public void powerButton() {
        isPowered = !isPowered;
    }

    public void runApp() {
        isAppRunning = !isAppRunning;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getStorageCapacityGB() {
        return storageCapacityGB;
    }

    public int getMemoryAmountGB() {
        return memoryAmountGB;
    }

    public boolean isPowered() {
        return isPowered;
    }

    public boolean isAppRunning() {
        return isAppRunning;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setStorageCapacityGB(int storageCapacityGB) {
        this.storageCapacityGB = storageCapacityGB;
    }

    public void setMemoryAmountGB(int memoryAmountGB) {
        this.memoryAmountGB = memoryAmountGB;
    }
}
