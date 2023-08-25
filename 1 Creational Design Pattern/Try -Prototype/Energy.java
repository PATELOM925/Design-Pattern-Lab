package Prototype;

public abstract class Energy extends StartupIndia{

    public Energy(){
      Sector = "Energy";
    }

    String seedfund() {
        int a=2;
      System.out.println("Energy startup would receive seed fund of 2.5cr & Assistance from Adani power");
        return String.valueOf(a);
    }
    abstract void subSector();
}

