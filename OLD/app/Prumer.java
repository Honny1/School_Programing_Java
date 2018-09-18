/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */
 /*******************************************************************************
 * Třída {@code Du} je hlavní třídou projektu,
 * který ...
 *
 * @author    Rodák Jan
 * @version   0.00.000
 */
import java.util.Scanner;
public class Prumer
{
    public static void main(String[] args)
    { Scanner vstup = new Scanner(System.in);
      int a, b, vysledek, pocetCisel, p, max, x;
      int[] cisla;
      System.out.print("Zadej počet čísel: ");
        pocetCisel = vstup.nextInt();
        cisla = new int[pocetCisel];
        for (int i = 0; i < pocetCisel;i++) {            
            System.out.print("zadej cislo: ");
            cisla[i] = vstup.nextInt();       
        }
        
        System.out.println("Prumer cisel je: "+ p(cisla));
    
    }
    public static int p(int[] data) { // radeji prumer
        int delkaPole = data.length;
        int soucet = 0;
        int p;    // radeji prumer
        for (int i = 0;i < delkaPole; i++) {
            soucet += data[i];
        }         
        p = soucet/delkaPole;
        return p;
    }
    
}

