package Entities;

import java.util.Objects;

public class PublicHangar extends AirPort {

//Attributes
    private double grant;

//Constructor

    public PublicHangar(String airportName, String city, Country country, double grant) {
        super(airportName, city, country);
        this.grant = grant;
    }

    @Override
    public String toString() {
        return "Entities.PublicHangar{" +
                "grant=" + grant +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PublicHangar)) return false;
        if (!super.equals(o)) return false;
        PublicHangar that = (PublicHangar) o;
        return Double.compare(that.getGrant(), getGrant()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGrant());
    }

    //Getters & Setters
    public double getGrant() {
        return grant;
    }
    public void setGrant(double grant) {
        this.grant = grant;
    }
}
