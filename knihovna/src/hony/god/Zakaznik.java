package hony.god;

import java.util.ArrayList;

public class Zakaznik {


    private ArrayList<Kniha> pujceneKnihy;
    private ArrayList<Casopis> pujceneCaspisy;
    private String jmeno;
    private String primeni;

    public Zakaznik(String jmeno, String primeni){
        this.pujceneCaspisy=new ArrayList<Casopis>();
        this.pujceneKnihy=new ArrayList<Kniha>();
        this.jmeno=jmeno;
        this.primeni=primeni;
    }
    public Casopis getCaspis(int ID) {
        for (Casopis casopis : this.pujceneCaspisy) {
            if (casopis.getID()==ID) {
                this.pujceneCaspisy.remove(casopis);
                return casopis;
            }
        }
        return null;
    }

    public Kniha getKniha(int ID) {
        for (Kniha kniha : this.pujceneKnihy) {
            if (kniha.getID()==ID) {
                this.pujceneKnihy.remove(kniha);
                return kniha;
            }
        }
        return null;
    }

    public void addCaspisy(Casopis item) {
        this.pujceneCaspisy.add(item);
    }

    public void addKnihy(Kniha item) {
        this.pujceneKnihy.add(item);
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrimeni() {
        return primeni;
    }

    public String toString() {
        String output = "Zakaynik=[ Jmeno: "+this.jmeno+" Prijmeni: "+ this.primeni+" ";
        for (Casopis casopis : this.pujceneCaspisy) {
            output += casopis.toString();
        }
        for (Kniha kniha : this.pujceneKnihy) {
            output += kniha.toString();
        }
        output+="]";
        return output;
    }
}
