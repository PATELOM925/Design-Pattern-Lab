public class Subscriber implements Observer{
    private String name;
    private Channel c1 = new Channel();
    public Subscriber(String name){
        this.name = name;
    }
    public void update() {
        System.out.println("HEY " + name + " Video Uploaded on : " + c1.title);
    }
    public void subscribeChannel(Channel c1) {
     Channel c2 = new Channel();
    }
}