/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */




/*******************************************************************************
 * Třída {@code Druhy} je hlavní třídou projektu,
 * který ...
 *
 * @author    Jan Rodak
 * @version   0.00.000
 */
import java.util.Scanner;

public class Druhy
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */

    public static void main(String[] args)
    { int cislo=1;
      int pocetCisel=0;
      int soucetCisel=0;
      float prumerCisel;
      Scanner vstup= new Scanner(System.in);
        while (cislo !=0){
            System.out.print("zadej cislo:");
            cislo=vstup.nextInt();
            pocetCisel++;
            soucetCisel+= cislo;
            //System.out.println("zadej jeste:"+ cislo);
    }
    pocetCisel--;
    prumerCisel=(float)soucetCisel/pocetCisel;
    System.out.println("pocet zadanych cisel:" +pocetCisel+"\n Soucet vsech zadanych cisel:"+soucetCisel+"\nprumer cisel:"+prumerCisel); 
}
}
