public class Main {

    public static void main(String[] args) {
        numToBinary(150);
    }
    public static void numToBinary(int num){
        if (num>1){
            numToBinary(num/2);
        }
        System.out.print(num%2);
    }
}
