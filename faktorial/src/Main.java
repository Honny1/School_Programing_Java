public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(faktorial(5));
    }
    public static double faktorial(double num){
        if (num==1){
            return 1;
        }
        return num * faktorial(num-1);
    }
}
