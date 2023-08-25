package com.phone;

public class Phone{
  private String os;
  private String processor;
  private int ram;
  private int bat;
  private double screen;
  private double cam;

  public Phone(String os, String processor, int ram,
               int bat, double screen, double cam){
      this.os = os;
      this.processor = processor;
      this.ram = ram;
      this.bat = bat;
      this.screen = screen;
      this.cam = cam;

  }

  public String toString() {
      return "Phone ( os = " +os + ", processor =" +
              " " + processor + ", ram = " +ram + ", battery" +
              " = " +bat+ ", screen size = " + screen + ", " +
              "camera = " +cam + " ) ";
  }




}