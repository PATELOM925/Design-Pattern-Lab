abstract class Aircraft {
    protected Mediator mediator;
    protected String callsign;

    public Aircraft(Mediator mediator, String callsign) {
        this.mediator = mediator;
        this.callsign = callsign;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
