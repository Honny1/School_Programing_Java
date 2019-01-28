package hony.god;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList <Student> zaci= new ArrayList<Student>();
        zaci.add(new Student("Hony","Rodak",19));
        zaci.add(new Student("Anna","Janwm",17));
        zaci.add(new Student("Student","Studen",999));
        zaci.add(new Student("Zak","Zak",199));
        System.out.println("Original list: " +zaci);

        System.out.println("by AGE:");
        Collections.sort(zaci);
        System.out.println("Sorted list: "+zaci);
        Collections.sort(zaci, Collections.reverseOrder());
        System.out.println("Reversed List: " +zaci);

        System.out.println("by NAME:");
        Collections.sort(zaci, Student.StudentNameComparator);
        System.out.println("Sorted list: "+zaci);
        Collections.sort(zaci, Collections.reverseOrder());
        System.out.println("Reversed List: " +zaci);

    }
}
