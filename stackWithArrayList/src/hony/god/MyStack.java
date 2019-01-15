package hony.god;

import java.util.ArrayList;

public class MyStack<E> {
    private ArrayList<E> list;


    public MyStack(){
        this.list=new ArrayList<E>();
    }

    public void push(E value) {
        this.list.add(value);
    }

    public E pop(){
        if (!this.list.isEmpty()){
        E item =this.list.get(this.list.size()-1);
        this.list.remove(this.list.size()-1);
        return item;
        }else {
            return null;
        }
    }

    public String toString() {
        String out = "Stack: { ";
        for (int i = this.list.size()-1; i > 0; i--) {
            out += this.list.get(i).toString() + ",";
        }
        out += "}";
        return out;
    }
}
