
public class Controller {
    public static void main(String[] args) {
        AirTrafficControl atc = new AirTrafficControl();
        Aircraft boeing = new Boeing737(atc, "Boeing 737");
        Aircraft airbus = new AirbusA320(atc, "Airbus A320");

        atc.addAircraft(boeing);
        atc.addAircraft(airbus);

        boeing.send("Airbus A320, this is Boeing 737, over.");
        airbus.send("Boeing 737, this is Airbus A320, roger.");
    }
}