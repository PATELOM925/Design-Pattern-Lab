package Prototype;
import java.util.Hashtable;
import java.util.Map;


public class Portal {
    private static Hashtable<String,StartupIndia> Map = new Hashtable<String,StartupIndia>();

    public static StartupIndia getStartup(String No){
        StartupIndia Startup = Map.get(No);
        return (StartupIndia) Startup.clone();
    }

    public static void Showcase(){

        Tech tech = new Tech() {
            @Override
            void subSector() {
                System.out.println("Tech");
            }
        };
        tech.setS_id("1");
        Map.put(tech.getS_id(), tech);
        EdTech et = new EdTech();
        et.setS_id("1.1");
        Map.put(et.getS_id(),et);
        FinTech ft = new FinTech();
        ft.setS_id("1.2");
        Map.put(ft.getS_id(),ft);


        Pharma ph = new Pharma() {
            @Override
            void subSector() {
                System.out.println("Health Care");
            }
        };
        ph.setS_id("2");
        Map.put(ph.getS_id(),ph);
        Drug d = new Drug();
        d.setS_id("2.1");
        Map.put(d.getS_id(), d);



        Energy e = new Energy() {
            @Override
            void subSector() {
                System.out.println("Energy");
            }
        };
        e.setS_id("3");
        Map.put(e.getS_id(),e);
    }

}