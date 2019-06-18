package hony.god;

public class Kniha {
    private String jmeno;
    private float cena;
    private int rokVydani;
    private int ID;
    private String autorJmeno;
    private String autorPrimeni;


    public Kniha(String jmeno, float cena, int rokVydani, String autorJmeno, String autorPrimeni) {
        this.jmeno = jmeno;
        this.cena = cena;
        this.rokVydani = rokVydani;
        this.ID = (int) (rokVydani % cena);
        this.autorJmeno=autorJmeno;
        this.autorPrimeni=autorPrimeni;
        //System.out.println(this.ID+" "+ this.jmeno);
    }

    @Override
    public String toString() {
        return "Kniha {"+"ID = " + this.ID + ", Name = " + this.jmeno
                + ", cena = " + this.cena + ", rok vydání = " + this.rokVydani + ", Jmeno Autora= "+this.autorJmeno
                +" "+this.autorPrimeni+'}';
    }

    public float getCena() {
        return cena;
    }

    public int getID() {
        return ID;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public String getAutorJmeno() {
        return autorJmeno;
    }

    public String getAutorPrimeni() {
        return autorPrimeni;
    }

    public String getJmeno() {
        return jmeno;
    }

}
