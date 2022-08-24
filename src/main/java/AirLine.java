import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class AirLine {
//Attributes



    private String name;
    private int flightNumber=0;
    private Flight flight;

//Constructor

    public AirLine(String name, int flightNumber, Flight flight) {
        this.name = name;
        this.flightNumber = flightNumber;
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "name='" + name + '\'' +
                ", flightNumber=" + flightNumber +
                ", flight=" + flight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirLine)) return false;
        AirLine airLine = (AirLine) o;
        return getFlightNumber() == airLine.getFlightNumber() && Objects.equals(getName(), airLine.getName()) && Objects.equals(flight, airLine.flight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFlightNumber(), flight);
    }


//Methods
    //1.1 Insert flight

    //1.2 Drop a flight by index

    //1.3 Drop a flight by name


//Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
}
