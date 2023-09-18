class AirbusA320 extends Aircraft {
    public AirbusA320(Mediator mediator, String callsign) {
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