
/**
 * Write a description of class App here.
 * 
 * @author Jan Rodák  
 * @version 18. 10. 2016
 */
import java.util.Scanner;
public class App
{
    public static void main (String[] args) {
        
        int rokNarození,vek;
        String jmeno;
        Scanner vstup = new Scanner (System.in);
        
        System.out.println("Ahoj");
        System.out.println("Zadej svoje jméno: ");
        jmeno = vstup.next(); 
        System.out.println("Zadej svůj rok narození: ");
        rokNarození = vstup.nextInt();
        
        System.out.println("Tvoje jméno: " + jmeno + ", rok narození" + rokNarození);
        vek = 2016 - rokNarození;
        if (vek>= 18) {
           System.out.println("Dej si pivo"); 
        }
        else {
            System.out.println("Dej si kofolu");
        }
    }
}
