public interface Subject {
    void subscribe(Subscriber sub);
    void unsubscirbe(Observer sub);
    void notifySubscriber();
    void upload(String title);
}
