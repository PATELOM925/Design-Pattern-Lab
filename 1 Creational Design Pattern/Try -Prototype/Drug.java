package Prototype;

import java.util.HashMap;
import java.util.Map;

  public class Drug extends Pharma{

    public Drug(){
      Sector = "Healthcare/Pharma";
    }

    void seedfund() {
      System.out.println("Pharma startup would receive seed fund of 20lac & assistance from AIIMS");

    }
     void subSector(){
       System.out.println("Startups related to Medicine/Drugs wil get assistance from Emcure");
     }
  }

