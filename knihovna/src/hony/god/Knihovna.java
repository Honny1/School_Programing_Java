package hony.god;

import java.util.ArrayList;

public class Knihovna {
    private ArrayList<Kniha> knihy;
    private ArrayList<Casopis> caspisy;

    public Knihovna(){
        this.caspisy=new ArrayList<Casopis>();
        this.knihy=new ArrayList<Kniha>();
    }

    public Casopis getCaspis(int ID) {
        for (Casopis casopis : this.caspisy) {
            if (casopis.getID()==ID) {
                this.caspisy.remove(casopis);
                return casopis;
            }
        }
        return null;
    }

    public Kniha getKniha(int ID) {
        for (Kniha kniha : this.knihy) {
            if (kniha.getID()==ID) {
                this.knihy.remove(kniha);
                return kniha;
            }
        }
        return null;
    }

    public void addCaspisy(Casopis item) {
         caspisy.add(item);
    }

    public void addKnihy(Kniha item) {
        knihy.add(item);
    }

    public void delkniha(int ID){
        for (Kniha kniha : this.knihy) {
            if (kniha.getID()==ID) {
                this.knihy.remove(kniha);
            }
        }
    }

    public void delcasopis(int ID){
        for (Casopis casopis : this.caspisy) {
            if (casopis.getID()==ID) {
                this.caspisy.remove(casopis);
            }
        }
    }

    @Override
    public String toString() {
        String output = "Knihovna=[";
        for (Casopis casopis : this.caspisy) {
                output += casopis.toString();
            }
        for (Kniha kniha : this.knihy) {
            output += kniha.toString();
        }
        output+="]";
        return output;
    }
}









