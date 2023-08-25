package com.Mcd;

import java.lang.reflect.Type;

public class Burger{
  private String Patty;
  private String type;
  private String Veggies;
  private int CheeseSlice;
  private double Sauce; // in grams

  public Burger(String Patty, String Type,String AddVeggies,
                int NoOfCheeseSlices,  double Sauce){
      this.Patty = Patty;
      this.type = Type;
      this.Veggies = AddVeggies;
      this.CheeseSlice = NoOfCheeseSlices;
      this.Sauce = Sauce;

  }

  public String toString() {
      return " Your Burger is ready Sir !! \nPatty = " +Patty
              + ",\n type = " + type + ", \n Veggies added = "
              +Veggies + ",\n No . of cheese slices = " +CheeseSlice+
              ",\n Amount of sauce(in gram) = " + Sauce ;
  }

}