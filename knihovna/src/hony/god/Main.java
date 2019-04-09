package hony.god;

public class Main {

    public static void main(String[] args) {
        Kniha kniha1=new Kniha("Ja a zivot",350,2000,"Jan","Rodak");
        Kniha kniha2=new Kniha("Originalni nazev",999,2006,"Pawel","Mikes");

        System.out.println(kniha1);
        System.out.println(kniha2);

        Casopis casopis1 = new Casopis("ABC",64,2006,"Mladafronta dnes",5);
        Casopis casopis2 = new Casopis("Merrien",100,2016,"to fakt nwm",9);

        System.out.println(casopis1);
        System.out.println(casopis2);

        Knihovna knihovna= new Knihovna();
        knihovna.addCaspisy(casopis1);
        knihovna.addCaspisy(casopis2);
        knihovna.addKnihy(kniha1);
        knihovna.addKnihy(kniha2);

        System.out.println(knihovna);

        Zakaznik zakaznik = new Zakaznik("Honza","Nahl9k");

        System.out.println(zakaznik);

        pujcitKnihu(250,zakaznik,knihovna);
        System.out.println(zakaznik);
        vratitKnihu(250,zakaznik,knihovna);
        System.out.println(zakaznik);



    }

    public static void pujcitKnihu(int ID, Zakaznik zakaznik,Knihovna knihovna){
        zakaznik.addKnihy(knihovna.getKniha(ID));
    }


    public static void vratitKnihu(int ID, Zakaznik zakaznik,Knihovna knihovna){
        knihovna.addKnihy(zakaznik.getKniha(ID));
    }
}
