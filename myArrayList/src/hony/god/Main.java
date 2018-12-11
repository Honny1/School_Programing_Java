package hony.god;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyArrayList<Object> nums = new MyArrayList<>();
        for(int i =0 ; i<100;i++){
        nums.add(i);
        //System.out.println(nums.size());
        }
        nums.add("ahoj");
        for(int i =0 ; i<nums.size();i++){
            System.out.println(nums.get(i));
        }


    }
}
