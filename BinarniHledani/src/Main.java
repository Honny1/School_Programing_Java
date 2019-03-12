import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 5;
        int result = BinarySearch(x, arr);
        System.out.println("Look for "+x+" in array "+ Arrays.toString(arr));
        if (result == -1){
            System.out.println("Element not present");
        }else {
            System.out.println("Element found at index " + result);
        }

    }

    public static int BinarySearch(int num, int[] nums){
        return helpBinarySearch(num,nums,0,nums.length-1);
    }

    public static int helpBinarySearch(int num, int[] nums,int start, int end){
        int index = (start+end)/2;
        if (nums[index] == num){
            return index;
        }

        if (start >= end){
            return -1;
        }

        if (nums[index] > num) {
            return helpBinarySearch(num, nums, start,index-1);
        } else {
            return helpBinarySearch(num, nums, index + 1,end);
        }
    }
}

