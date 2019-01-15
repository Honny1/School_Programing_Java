package hony.god;

public class Main {

    public static void main(String[] args) {
        MyStack<Object> stack = new MyStack<>();
        for(int i =0 ; i<100;i++){
            stack.push(i);
        }
        stack.push("ahoj");
        System.out.println(stack);

        System.out.println("Odebrano: "+(String) stack.pop());
        System.out.println(stack);
    }
    }
}
