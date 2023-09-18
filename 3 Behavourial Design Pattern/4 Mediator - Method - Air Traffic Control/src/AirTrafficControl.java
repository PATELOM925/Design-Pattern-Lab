import java.util.ArrayList;
import java.util.List;
class AirTrafficControl implements Mediator {
    private List<Aircraft> aircrafts;

    public AirTrafficControl() {
        aircrafts = new ArrayList<>();
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    @Override
    public void sendMessage(String message, Aircraft sender) {
        for (Aircraft aircraft : aircrafts) {
            if (aircraft != sender) {
                aircraft.receive(message);
            }
        }
    }
}
