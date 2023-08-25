package Prototype;
import java.util.Hashtable;
import java.util.Map;
public class Portal {
    private static Hashtable<String,StartupIndia>
            Map = new Hashtable<String,StartupIndia>();
    public static StartupIndia getStartup(String No){
        StartupIndia Startup = Map.get(No);
        return (StartupIndia) Startup.clone();
    }
    public static void Showcase(){
        Tech tech = new Tech();
        tech.setS_id("1");
        Map.put(tech.getS_id(), tech);

        Pharma ph = new Pharma();
        ph.setS_id("2");
        Map.put(ph.getS_id(),ph);

        Energy e = new Energy();
        e.setS_id("3");
        Map.put(e.getS_id(),e); }}