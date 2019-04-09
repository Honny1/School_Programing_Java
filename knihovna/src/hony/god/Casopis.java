package hony.god;

public class Casopis {
    private int cislo;
    private String nakladatelstvi;
    private String jmeno;
    private float cena;
    private int rokVydani;
    private int ID;
    public Casopis(String jmeno, float cena, int rokVydani, String nakladatelstvi, int cislo) {
        this.jmeno = jmeno;
        this.cena = cena;
        this.rokVydani = rokVydani;
        this.ID = (int) (rokVydani % cena);
        this.cislo=cislo;
        this.nakladatelstvi=nakladatelstvi;
        //System.out.println(this.ID+" "+ this.jmeno);
    }

    public int getCislo() {
        return cislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public int getID() {
        return ID;
    }

    public float getCena() {
        return cena;
    }

    public String getNakladatelstvi() {
        return nakladatelstvi;
    }

    public String toString() {
        return "Casopis {"+"ID = " + this.ID + "Name = " + this.jmeno
                + ", cena = " + this.cena + ", rok vydání = " + this.rokVydani +"cislo="+this.cislo+ "nakladatelství = "+this.nakladatelstvi
                +'}';
    }
}
