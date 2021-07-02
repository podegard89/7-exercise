package com.company;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Laptop macbookPro = new Laptop("macOS", 512, 16, "Apple", 15.6);
        SmartPhone iPhone = new SmartPhone("iOS", 32, 4);
        iPhone.takePhoto("(┛ಠ_ಠ)┛彡ǝɔɹɐǝd");
        iPhone.takePhoto("(ノಠ益ಠ)ノ彡┻━┻");

        ArrayList<Computer> computerList = new ArrayList<>();
        computerList.add(macbookPro);
        computerList.add(iPhone);

        for(Computer c : computerList) {
            System.out.println(c.getOperatingSystem());
        }
    }
}
