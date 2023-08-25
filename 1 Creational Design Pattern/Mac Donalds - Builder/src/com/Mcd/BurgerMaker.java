package com.Mcd;

public class BurgerMaker {
    private String Patty;
    private String type;
    private String Veggies;
    private int CheeseSlice;
    private double Sauce; // in grams

    public BurgerMaker setPatty(String p1){
        this.Patty = p1;
        return this;
    }
    public BurgerMaker setType(String veg){
        this.type = veg;
        return this;
    }
    public BurgerMaker addVeggies(String v1){
        this.Veggies = v1;
        return this;
    }
    public BurgerMaker addCheese(int c1){
        this.CheeseSlice = c1;
        return this;
    }
    public BurgerMaker addSauce(double s1){
        this.Sauce = s1;
        return this;
    }

    public Burger getBurger(){
        return new Burger(Patty,type,Veggies,CheeseSlice,Sauce);
    }

}
