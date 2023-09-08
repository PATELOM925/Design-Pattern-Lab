public class Main {
    public static void main(String[] args) {
        Channel Design = new Channel();
        Subscriber s1 = new Subscriber("OM");
        Subscriber s2 = new Subscriber("Krishna");
        Subscriber s3 = new Subscriber("Dev");

        Design.subscribe(s1);
        Design.subscribe(s2);
        Design.subscribe(s3);

        s1.subscribeChannel(Design);
        s2.subscribeChannel(Design);
        s3.subscribeChannel(Design);

        Design.upload("OBSERVER DESIGN PATTERN");
        Design.unsubscirbe(s3);
        Design.upload("DBMS");
    }
}