class Memento {
    private StringBuilder state;

    public Memento(StringBuilder state) {
        this.state = new StringBuilder(state);
    }

    public StringBuilder getState() {
        return state;
    }
}