import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Kvadr> k= new ArrayList<Kvadr>();
        k.add(new Kvadr(10,20,19));
        k.add(new Kvadr(11,24,12));
        k.add(new Kvadr(12,25,16));
        k.add(new Kvadr(13,26,1));

        System.out.println("Original list: " +k);

        System.out.println("Sorted by Volume:");
        Collections.sort(k);
        System.out.println("Sorted list: "+k);
    }
}
