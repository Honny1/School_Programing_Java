public class Main {

    public static void main(String[] args) {
        MyStack<Object> nums = new MyStack<>();
        for(int i =0 ; i<100;i++){
            nums.push(i);

        }
        nums.push("ahoj");
        System.out.print(nums);

    }
}
