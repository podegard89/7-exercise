package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LaptopTests {
    @Test
    public void testLaptopInheritsPowerButton() {
        Laptop macbook = new Laptop("macOS", 512, 16, "Apple", 15.6);
        macbook.powerButton();
        Assertions.assertTrue(macbook.isPowered());
    }

    @Test
    public void testLaptopOpenMethodFlipsIsOpen() {
        Laptop macbook = new Laptop("macOS", 512, 16, "Apple", 15.6);
        macbook.openLaptop();
        Assertions.assertTrue(macbook.isOpen());
    }
}
