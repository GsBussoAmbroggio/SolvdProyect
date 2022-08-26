package Entities;

import java.util.Objects;

public class Flight {
//Attributes
    private String id;
    private String originCity;
    private String destinationCity;
    private double price;
    private final int numMaxPassenger = 366;

    private Passenger2 passenger;



//Constructor

    public Flight(String id, String originCity, String destinationCity, double price, Passenger2 passenger) {
        this.id = id;
        this.originCity = originCity;
        this.destinationCity = destinationCity;
        this.price = price;
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Entities.Flight{" +
                "id='" + id + '\'' +
                ", originCity='" + originCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", price=" + price +
                ", numMaxPassenger=" + numMaxPassenger +
                ", passenger=" + passenger +
                '}';
    }


    //TODO Hash code - to String -

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Double.compare(flight.getPrice(), getPrice()) == 0 && getNumMaxPassenger() == flight.getNumMaxPassenger() && Objects.equals(getId(), flight.getId()) && Objects.equals(getOriginCity(), flight.getOriginCity()) && Objects.equals(getDestinationCity(), flight.getDestinationCity()) && Objects.equals(passenger, flight.passenger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getOriginCity(), getDestinationCity(), getPrice(), getNumMaxPassenger(), passenger);
    }


//Methods
    //1.1

    //1.2

    //1.3 Check the passport


//Getters & Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public Passenger2 getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger2 passenger) {
        this.passenger = passenger;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumMaxPassenger() {
        return numMaxPassenger;
    }

 }
