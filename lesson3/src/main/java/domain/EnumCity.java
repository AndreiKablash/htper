package domain;

public enum EnumCity {
    PRAGUE("Prague"), MOSCOW("Moscow"), MINSK("Minsk"), BERLIN("Berlin");

    private String city;

    EnumCity() {
    }

    EnumCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
