/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */




/*******************************************************************************
 * Třída {@code Treti} je hlavní třídou projektu,
 * který ...
 *
 * @author    Jan Rodak
 * @version   0.00.000
 */
import java.util.Scanner;

public class Treti
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */

    public static void main(String[] args)
    { 
      int[] cisla;
      int cislo=1;
      int pocetCisel;
      int soucetCisel=0;
      float prumerCisel;
      Scanner vstup= new Scanner(System.in);
      System.out.print("zadej pocet cislo:");
      pocetCisel=vstup.nextInt();
      cisla= new int [pocetCisel];
        for (int i=0;i<pocetCisel;i++){
            System.out.print("zadej cislo:");
            cisla[i]=vstup.nextInt();
            soucetCisel+= cisla[i];
            //System.out.println("zadej jeste:"+ cislo);
    }
    prumerCisel=(float)soucetCisel/pocetCisel;
    System.out.println("pocet zadanych cisel:" +pocetCisel+"\n Soucet vsech zadanych cisel:"+soucetCisel+"\nprumer cisel:"+prumerCisel); 
}
}

