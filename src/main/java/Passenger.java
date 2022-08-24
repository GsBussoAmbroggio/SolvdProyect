import java.util.ArrayList;
import java.util.Objects;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Passenger extends Person{
//Attributes
    private String name;
    private String passport;
    private String Nationality;

//Constructor


    public Passenger(String name, String passport, String sex, int age, String nationality) {
        super(age, sex);
        this.name = name;
        this.passport = passport;
        Nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(getName(), passenger.getName()) && Objects.equals(getPassport(), passenger.getPassport()) && Objects.equals(getNationality(), passenger.getNationality());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPassport(), getNationality());
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", passport='" + passport + '\'' +
                ", Nationality='" + Nationality + '\'' +
                '}';
    }

    //Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassport() {
        return passport;
    }
    public void setPassport(String passport) {
        this.passport = passport;
    }
    public String getNationality() {
        return Nationality;
    }
    public void setNationality(String nationality) {
        Nationality = nationality;
    }
}
