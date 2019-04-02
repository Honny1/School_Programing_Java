import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> nums = new ArrayList<>();
        for(int i =0 ; i<100;i++){
            nums.add(getRandomNumberInRange(1, 100));
        }
        System.out.println(nums);
        nums = quickSort(nums);
        System.out.println(nums);
    }

    public static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();

    }

    public static ArrayList quickSort(ArrayList array ){
        ArrayList<Object> out = new ArrayList<>();
        out = sort(array);
        Collections.reverse(out);
        return out;
    }

    public static ArrayList sort(ArrayList array ){
        ArrayList<Object> less = new ArrayList<>();
        ArrayList<Object> equal = new ArrayList<>();
        ArrayList<Object> greater = new ArrayList<>();

        if  (array.size() > 1){
            int pivot = (int) array.get(0);
            for (Object anArray : array) {
                if (pivot < (int) anArray) {
                    less.add(anArray);
                }
                if (pivot == (int) anArray) {
                    equal.add(anArray);
                }
                if (pivot > (int) anArray) {
                    greater.add(anArray);
                }
            }

            //ADD part
            ArrayList<Object> out = new ArrayList<>();
            for (Object les : sort(less)) {
                out.add(les);
            }
            for (Object anEqual : equal) {
                out.add(anEqual);
            }
            for (Object aGreater : sort(greater)) {
                out.add(aGreater);
            }

            return out;

        }else{
            return array;
        }
    }
}
