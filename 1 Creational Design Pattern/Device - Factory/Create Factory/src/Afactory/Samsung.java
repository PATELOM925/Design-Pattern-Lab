package Afactory;

public class Samsung extends Device{
    private String ram;
    private String Processor;

    public Samsung(String ramsize, String processortype){
        this.ram=ramsize;
        this.Processor = processortype;
    }

    public String getDetails(){
        return "Samsung's configuration, ram size = "+this.ram+" processor type = "+this.Processor;
    }

    public String toString(){
        return "Samsung's ram: " +ram+" processor: "+Processor;
    }
}

