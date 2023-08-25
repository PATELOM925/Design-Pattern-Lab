package Afactory;

public class Iphone extends Device{
    private String ram;
    private String Processor;

    public Iphone(String ramsize, String processortype){
        this.ram=ramsize;
        this.Processor = processortype;
    }

    public String getDetails(){
        return "Iphone's configuration, ram size = "+this.ram+" processor type = "+this.Processor;
    }

    public String toString(){
        return "Iphone's ram: " +ram+" processor: "+Processor;
    }
}

