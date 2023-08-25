package Afactory;

public class Dell extends Device {
    private String ram;
    private String processor;
    private String gpu;

    public Dell(String ramsize,String processor, String gpu){
        this.ram=ramsize;
        this.processor=processor;
        this.gpu=gpu;
    }

    public String getDetails(){
        return "Dell's configuration, ram size = "+this.ram+" processor type = "+this.processor+" Gpu is of "+this.gpu;
    }

    public String toString(){
        return "Dell's ram: " +ram+" processor: "+processor+" gpu is: "+gpu;
    }
}
