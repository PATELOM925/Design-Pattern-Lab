package Prototype;

public abstract class Pharma extends StartupIndia{

    public Pharma(){
      Sector = "Healthcare/Pharma";
    }

    String seedfund() {
        int a=3;
      System.out.println("Pharma startup would receive seed fund of 20lac & assistance from AIIMS");
        return String.valueOf(a);
    }
    abstract void subSector();
  }

