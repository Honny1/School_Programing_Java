package hony.god;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> al = new ArrayList<String>();
        al.add("prvni");
        al.add("druhy");
        al.add("prvni");
        System.out.println("\nArrayList: " + al);

        //HashSet
        HashSet<String> hs = new HashSet<String>();
        hs.add("prvni");
        hs.add("druhy");
        hs.add("prvni");
        System.out.println("\nHashSet: " + hs);

        //HashMap
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("prvni", 12);
        hm.put("druhy", 12);
        hm.put("prvni", 14);
        System.out.println("\nHashMap: " + hm);
    }
}
