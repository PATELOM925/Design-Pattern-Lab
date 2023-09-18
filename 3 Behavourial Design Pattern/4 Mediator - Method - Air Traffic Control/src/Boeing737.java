class Boeing737 extends Aircraft {
    public Boeing737(Mediator mediator, String callsign) {
        super(mediator, callsign);
    }

    @Override
    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(callsign + " received message: " + message);
    }
}