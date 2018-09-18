/*******************************************************************************
 * Třída {@code Calc} je hlavní třídou projektu,
 * který ...
 *
 * @author    Jan Rodák
 * @version   0.00.000
 */
import java.util.Scanner;
public class Calc
{
        public static void main(String[] args){
            float a, b, vys;
            String o;
            Scanner vstup = new Scanner(System.in);
            
            System.out.print("zadej a:");
            a = vstup.nextFloat();
            System.out.print("zadej b:");
            b = vstup.nextFloat();
            System.out.print("zadej operaci(+, -, *, /, ):");
            o = vstup.next();
            /**System.out.print("vstup:"+a+o+b);
            vys= spocitej(a, b, o);
            System.out.print("vysledek:"+vys);**/
            System.out.println(a+o+b+"="+spocitej(a, b, o));
    }
    public static float spocitej(float x, float y, String op){
        float v= 0;
        switch(op){
            case "+":
            v=x+y;
            break;
             
            case "-":
            v=x-y;
            break; 
            
            case "*":
            v=x*y;
            break; 
            
            case "/":
            v=x/y;
            break;
            
            default:
            System.out.println("error špatny operator");        
        }
        return v;
    
    }
}
