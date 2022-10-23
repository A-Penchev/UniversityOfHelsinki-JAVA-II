
package FlightControl;

public class Flight {

    private Airplane airplane;
    private String departureAirport;
    private String targetAirport;

    public Flight(Airplane airplane, String departureAirport, String targetAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public String getDeparturePlace() {
        return this.departureAirport;
    }

    public String getTargetPlace() {
        return this.targetAirport;
    }

    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirport + "-" + this.targetAirport + ")";
    }
}