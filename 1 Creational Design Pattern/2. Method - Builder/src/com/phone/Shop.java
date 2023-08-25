package com.phone;

public class Shop {
    public static void main(String[] args) {
        Phonebuilder pb1 = new Phonebuilder();
        pb1.setOs("IOS");
        pb1.setProcessor("A15");
        pb1.setRam(16);
        pb1.setBattery(3750);
        pb1.setScreen(6.1);
        pb1.setCamera(48);
        Phone p = pb1.getPhone();
        System.out.println(p);
    }
}
