package Prototype;

public abstract class StartupIndia implements Cloneable{

    private String S_id;
    protected String Sector;

    abstract String seedfund();
    public String getSector(){
      return Sector;
    }
    public String getS_id(){
      return S_id;
    }

    public String getseedfund(){
      return seedfund();
    }

    public void setS_id(String S_id){
      this.S_id=S_id;
    }

    public Object clone(){
      Object clone = null;
      try {
        clone = super.clone();
      }catch (CloneNotSupportedException e){
        e.printStackTrace();
      }
      return clone;
    }


  }