import java.util.ArrayList;
public class Channel implements Subject{
   public ArrayList<Subscriber> subs = new ArrayList<Subscriber>();
    public String title;
    public void subscribe(Subscriber sub){
        subs.add(sub);
    }

    @Override
    public void unsubscirbe(Observer sub) {
        subs.remove(sub);
    }

    @Override
    public void notifySubscriber() {
        for (Observer sub:subs){
            sub.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscriber();
    }
}
