package com.phone;

public class Phonebuilder {
    private String os;
    private String processor;
    private int ram;
    private int bat;
    private double screen;
    private double cam;

    public Phonebuilder setOs(String os1){
        this.os = os1;
        return this;
    }
    public Phonebuilder setProcessor(String p1){
        this.processor = p1;
        return this;
    }
    public Phonebuilder setRam(int r1){
        this.ram = r1;
        return this;
    }
    public Phonebuilder setBattery(int b1){
        this.bat = b1;
        return this;
    }
    public Phonebuilder setScreen(double s1){
        this.screen = s1;
        return this;
    }
    public Phonebuilder setCamera(double c1){
        this.cam = c1;
        return this;
    }
    public Phone getPhone(){
        return new Phone(os,processor
                ,ram,bat,screen,cam);
    }

}
