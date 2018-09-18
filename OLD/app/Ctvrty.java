/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */
/*******************************************************************************
 * Třída {@code Ctvrty} je hlavní třídou projektu,
 * který ukazuje, jak fungují metody
 *
 * @author    Jan Rodák
 * @version   8. 11. 2016
 */
import java.util.Scanner;  // importujeme třídu pro vstup od uživatele

public class Ctvrty
{
    // hlavní metoda celé aplikace, tou vše začíná i končí 
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in); // objekt pro vstup z klávesnice
        int a, b, vysledek, pocetCisel;   // deklarace proměnných
        int[] cisla;  // deklarace pole (velikost zatím není dána)
        
        /**********************************************************************
        * První příklad na funkce/metody = součet 2 čísel
        * zadám 2 celá čísla z klávesnice 
        * funkci předávám jen hodnotu těchto 2 čísel
        * funkce si uloží jen hodnoty do svých proměnných               
        */         
        System.out.print("Zadej a: ");
        a = vstup.nextInt();
        System.out.print("Zadej b: ");
        b = vstup.nextInt(); 
        
        //vysledek = soucet(a, b);  mohu funkci zavolat a to, co mi vrátí uložit do pomocné proměnné
        // nebo mohu funkci zavolat to, co mi vrátí, rovnou vypsat:
        System.out.println("Soucet je: " + soucet(a, b)); 
        
        /**********************************************************************
        * Druhý příklad na funkce/metody = součet všech čísel v libovolném poli čísel
        * funkce se může jmenovat také soucet, stačí, když bude mít jiné argumenty      
        * všechna čísla zadáme postupně z klávesnice 
        */ 
        System.out.print("Zadej počet čísel: ");
        pocetCisel = vstup.nextInt();
        cisla = new int[pocetCisel]; //definice pole o určité délce
        
        for (int i = 0; i < pocetCisel;i++) {            
            System.out.print("zadej cislo: ");
            cisla[i] = vstup.nextInt();       
        }
        
        // volání 2. funkce a vypsání výsledku
        System.out.println("Soucet cisel je: "+soucet(cisla));
        
        /**********************************************************************
        * Třetí příklad na funkce/metody = vynásobení všech prvků pole číslem kolikrat
        * ukazuje, že když předám funkci pole (složitý datový typ), chová se to jinak 
        * než když ji předám např. celé číslo (primitivní datový typ)        
        * je to tím, že funkci předávám přímo odkaz do paměti = adresu pole
        */
        nasobit(cisla, 10);
        
        // vypíšu, jak vypadá původní pole po projití funkcí
        for (int i = 0; i < cisla.length; i++) {            
            System.out.println(i + "-" + cisla[i]);                   
        }
    } 
    
    // 1. definice fce soucet
    public static int soucet(int x, int y) {
        int soucet = x + y;
        return soucet;
    }
    
    // 2. definice přetížené fce soucet - stejný název, jiné argumenty=pole, jiné tělo fce
    public static int soucet(int[] data) {
        int delkaPole = data.length;
        int soucet = 0;
        
        for (int i = 0;i < delkaPole; i++) {
            soucet += data[i];
        }         
        return soucet;
    }
    
    // 3. definice fce, která pozmění hodnotu původních dat=pole
    public static void nasobit(int [] data, int kolikrat) {
        for (int i = 0;i < data.length; i++) {
            data[i] *= kolikrat;
        }
    }
}
