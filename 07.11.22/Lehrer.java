public class Lehrer extends Person {
    private int fortbildungen;
    private String fach1;
    private String fach2;

    public Lehrer(String name, String nachname, java.util.Date geburtsdatum,
                  int fortbildungen, String fach1, String fach2) {
        super(name, nachname, geburtsdatum);
        this.fortbildungen = fortbildungen;
        this.fach1 = fach1;
        this.fach2 = fach2;
    }

    // getter und setter
}