package com.Mcd;
public class Shop {
    public static void main(String[] args) {
        BurgerMaker bm = new BurgerMaker();
        bm.setPatty("Paneer");
        bm.setType("Veg");
        bm.addVeggies("Lettuce");
        bm.addSauce(25.6);
        bm.addCheese(1);
        Burger b = bm.getBurger();
        System.out.println(b);} }
