public class Schueler extends Person {
    private String schuelerId;

    public Schueler(String name, String nachname, java.util.Date geburtsdatum,
                    String schuelerId) {
        super(name, nachname, geburtsdatum);
        this.schuelerId = schuelerId;
    }

    // getter und setter
}