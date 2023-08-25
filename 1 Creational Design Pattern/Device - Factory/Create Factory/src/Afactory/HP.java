package Afactory;

public class HP extends Device{
    private String ram;
    private String processor;
    private String gpu;

    public HP(String ramsize,String processor, String gpu){
        this.ram=ramsize;
        this.processor=processor;
        this.gpu=gpu;
    }

    public String getDetails(){
        return "HP's configuration, ram size = "+this.ram+" processor type = "+this.processor+" Gpu is of "+this.gpu;
    }

    public String toString(){
        return "HP's ram: " +ram+" processor: "+processor+" gpu is: "+gpu;
    }
}


