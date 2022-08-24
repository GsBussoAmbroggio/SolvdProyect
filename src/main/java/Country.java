public enum Country {
    ARGENTINA ("Ezeiza"),
    BRASIL ("xx"),
    URUGUAY("ss"),
    ;

    private String Country;


    Country() {
    }

    Country(String country) {
        Country = country;
    }

    public String getCountry() {
        return Country;
    }
}
