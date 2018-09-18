package com.Hony;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String jmeno;
        int rokNarozeni;
        float hmotnost;
        Scanner vstup = new Scanner(System.in);

        System.out.println("Ahoj");

        for (String text: args) {
            System.out.println(text);
        }
        System.out.print("Zadej jmeno:");
        jmeno = vstup.next();

        System.out.print("rok narozeni:");
        rokNarozeni = vstup.nextInt();


        System.out.print("Hmotnost:");
        hmotnost = vstup.nextFloat();

        System.out.println("Jmeno= "+jmeno+" Rok narozeni= "+rokNarozeni+" Hmotnost= "+hmotnost+" Věk= "+vratVek(2018,rokNarozeni));
        System.out.printf("Jmeno= %s, Rok narozeni= %d, Hmotnost= %.2f, Věk= %d\n",jmeno,rokNarozeni,hmotnost,vratVek(2020,rokNarozeni));

    }
    private static int vratVek(int aktualniRok, int narozeniRok) {
    return aktualniRok - narozeniRok;
    }
}
