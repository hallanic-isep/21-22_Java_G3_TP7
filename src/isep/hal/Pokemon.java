package isep.hal;

public enum Pokemon {
    TORTIPOUSS,
    TIPLOUF,
    OUISTICRAM,
    ARCKO,
    POUSSIFEU,
    GOBOU,
    BULBIZARRE,
    SALAMECHE,
    CARAPUCE;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String surname;

    @Override
    public String toString() {
        return surname == null ? this.name() : this.name() + "(" + this.surname + ")";
    }
}
