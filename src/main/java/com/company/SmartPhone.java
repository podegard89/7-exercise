package com.company;

public class SmartPhone extends Computer {
    private boolean isCalling = false;

    public SmartPhone(String OS, int storage, int memory) {
        super(OS, storage, memory);
    }

    public void makeCall() {
        isCalling = !isCalling;
    }

    public void takePhoto(String asciiArt) {
        System.out.println(asciiArt);
    }

    public boolean isCalling() {
        return isCalling;
    }
}
