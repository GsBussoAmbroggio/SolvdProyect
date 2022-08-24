import Interfaces.IPrivateHangar;

import java.util.ArrayList;
import java.util.Objects;

public class PrivateHangar extends AirPort implements IPrivateHangar {

//Attributes
    private int taxes;
    private int numAirline;

    private AirLine airLine;
//Constructor

    public PrivateHangar(String airportName, String city, Country country, int taxes, int numAirline, AirLine airLine) {
        super(airportName, city, country);
        this.taxes = taxes;
        this.numAirline = numAirline;
        this.airLine = airLine;
    }

    @Override
    public String toString() {
        return "PrivateHangar{" +
                "taxes=" + taxes +
                ", numAirline=" + numAirline +
                ", airLine=" + airLine +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrivateHangar)) return false;
        if (!super.equals(o)) return false;
        PrivateHangar that = (PrivateHangar) o;
        return getTaxes() == that.getTaxes() && getNumAirline() == that.getNumAirline() && Objects.equals(airLine, that.airLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTaxes(), getNumAirline(), airLine);
    }

    @Override
    public void InsertHangarP() {


    }

    //Getters & Setters

    public int getTaxes() {
        return taxes;
    }

    public void setTaxes(int taxes) {
        this.taxes = taxes;
    }

    public AirLine getAirLine() {
        return airLine;
    }

    public void setAirLine(AirLine airLine) {
        this.airLine = airLine;
    }

    public int getNumAirline() {
        return numAirline;
    }

    public void setNumAirline(int numAirline) {
        this.numAirline = numAirline;
    }

//Methods
    //1.1 If you want to insert multiple airlines

    //1.2 If you want to insert only one airline

}
