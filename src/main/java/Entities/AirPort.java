package Entities;

import java.util.Objects;

public class AirPort {
//Attributes

    
    private String airportName;
    private String city;
    private Country country;



//TODO Constructor

    public AirPort(String airportName, String city, Country country) {
        this.airportName = airportName;
        this.city = city;
        this.country = country;
    }


//TODO hacer de nuevo equals hashcode toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirPort)) return false;
        AirPort airPort = (AirPort) o;
        return Objects.equals(getAirportName(), airPort.getAirportName()) && Objects.equals(getCity(), airPort.getCity()) && Objects.equals(getCountry(), airPort.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAirportName(), getCity(), getCountry());
    }

    @Override
    public String toString() {
        return "Entities.AirPort{" +
                "airportName='" + airportName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
//Methods

    //1.1 Insert Airline

    //1.1 Insert Airline (FIXED)

    //1.2 Drop Airline by index

    //1.3 Drop Airline by name

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}


//TODO GETTERS & SETTERS



