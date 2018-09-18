/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */




/*******************************************************************************
 * Třída {@code Zoo} je hlavní třídou projektu,
 * který ...
 *
 * @author    jméno autora
 * @version   0.00.000
 */
public class Zoo
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        Zvire zvire1=new Zvire("Slon", 2001, "PaWel", "uauauauaua", 45);
        Zvire zvire2=new Zvire("Kočka", 2005, "Oběd", "AKKAKAWOWI", 220);
        zvire1.ozviSe();
        zvire2.ozviSe();
        System.out.println(zvire1.getJmeno() +" "+ zvire1.vek(2016) + "let");
        System.out.println(zvire2.getJmeno() +" "+ zvire2.vek(2016) + "let");
    }
}
