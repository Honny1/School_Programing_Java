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

public class Du
{
    public static void main(String[] args)
    { Scanner vstup = new Scanner(System.in);
      int a, b, vysledek, pocetCisel, max, nejbliysiPrumeru, nejbliysiPrumeru1; 
      float prumer;
      int[] cisla;
      System.out.print("Zadej počet čísel: ");
      pocetCisel = vstup.nextInt();
      cisla = new int[pocetCisel];
      for (int i = 0; i < pocetCisel;i++) {
           System.out.print("zadej cislo: ");
           cisla[i] = vstup.nextInt();       
        }
        prumer= prumer(cisla);
        System.out.println("Prumer cisel je: "+  prumer(cisla));
        System.out.println("nejvedsi ciselo je: "+ max(cisla));
        System.out.println("nejbližší půměru V1  je: "+  nejbliysiPrumeru1(prumer, cisla));
        System.out.println("nejbližší půměru  je: "+ nejbliysiPrumeru(cisla));
    }
    public static float  prumer(int[] data) { 
       int delkaPole = data.length;
       int soucet = 0;
        for (int i = 0;i < delkaPole; i++) {
        soucet += data[i];
       }
       float prumer = soucet / (float)delkaPole;
       return  prumer;
    }
    public static int max(int[] pole) {
        int delkaPole = pole.length;
        int max = pole[0] ;
        for (int i = 0;i < delkaPole; i++) {
            if (max< pole[i]){
            max = pole[i];
           }  
        }
        return max;
    }   
    public static int nejbliysiPrumeru(int[] pole){
       int delkaPole = pole.length;
       int x, b;  
       int soucet = 0;
        for (int i = 0;i < delkaPole; i++) {
            soucet += pole[i];
        }
       float prumer = soucet / (float)delkaPole;
       b=(int)prumer; 
       int nejPozice = 0;
       int nejVzdalenost = Math.abs(b - pole[nejPozice]);
       for (int i = 1; i <delkaPole; i++)
       {
           int vzdalenost = Math.abs(b - pole[i]);
           if (vzdalenost < nejVzdalenost)
           {
               nejPozice = i;
               nejVzdalenost = vzdalenost;
            }
        }
       int nejbliysiPrumeru = pole[nejPozice]; 
       return nejbliysiPrumeru;
    }
    public static int nejbliysiPrumeru1(float prumer, int[] pole){ //verze bez výpočtu pruměru 
       int delkaPole = pole.length;
       int x, b; 
       b=(int)prumer; 
       int nejPozice = 0;
       int nejVzdalenost = Math.abs(b - pole[nejPozice]);
       for (int i = 1; i <delkaPole; i++)
       {
           int vzdalenost = Math.abs(b - pole[i]);
           if (vzdalenost < nejVzdalenost)
           {
               nejPozice = i;
               nejVzdalenost = vzdalenost;
            }
        }
       int nejbliysiPrumeru1 = pole[nejPozice]; 
       return nejbliysiPrumeru1;
    }
}

