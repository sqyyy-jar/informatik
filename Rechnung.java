import java.util.Date;

public class Rechnung {
    private int rechnungsNummer;
    private int kundenNummer;
    private String kennzeichen;
    private Date mietStart;
    private Date mietEnde;
    private Date rechnungsbegleichung;
    private double startKm;
    private double endKm;
    private double km;
    private int tage;
    private double betrag;
    private double enthalteneMehrwertsteuer;

    public Rechnung(int rechnungsNummer, int kundenNummer, String kennzeichen, Date mietStart, Date mietEnde,
                    Date rechnungsbegleichung, double startKm, double endKm, double km, int tage, double betrag,
                    double enthalteneMehrwertsteuer) {
        this.rechnungsNummer = rechnungsNummer;
        this.kundenNummer = kundenNummer;
        this.kennzeichen = kennzeichen;
        this.mietStart = mietStart;
        this.mietEnde = mietEnde;
        this.rechnungsbegleichung = rechnungsbegleichung;
        this.startKm = startKm;
        this.endKm = endKm;
        this.km = km;
        this.tage = tage;
        this.betrag = betrag;
        this.enthalteneMehrwertsteuer = enthalteneMehrwertsteuer;
    }

    public int getRechnungsNummer() {
        return rechnungsNummer;
    }

    public void setRechnungsNummer(int rechnungsNummer) {
        this.rechnungsNummer = rechnungsNummer;
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public Date getMietStart() {
        return mietStart;
    }

    public void setMietStart(Date mietStart) {
        this.mietStart = mietStart;
    }

    public Date getMietEnde() {
        return mietEnde;
    }

    public void setMietEnde(Date mietEnde) {
        this.mietEnde = mietEnde;
    }

    public Date getRechnungsbegleichung() {
        return rechnungsbegleichung;
    }

    public void setRechnungsbegleichung(Date rechnungsbegleichung) {
        this.rechnungsbegleichung = rechnungsbegleichung;
    }

    public double getStartKm() {
        return startKm;
    }

    public void setStartKm(double startKm) {
        this.startKm = startKm;
    }

    public double getEndKm() {
        return endKm;
    }

    public void setEndKm(double endKm) {
        this.endKm = endKm;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public int getTage() {
        return tage;
    }

    public void setTage(int tage) {
        this.tage = tage;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public double getEnthalteneMehrwertsteuer() {
        return enthalteneMehrwertsteuer;
    }

    public void setEnthalteneMehrwertsteuer(double enthalteneMehrwertsteuer) {
        this.enthalteneMehrwertsteuer = enthalteneMehrwertsteuer;
    }
}