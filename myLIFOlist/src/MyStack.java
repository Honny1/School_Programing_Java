public class MyStack<E> {

    private Item<E> top;

    public MyStack(){
        this.top=null;
    }

    public void push(E value) {
        Item<E> newItem = new Item<>(value);
        newItem.setPrevious(this.top);
        this.top = newItem;
    }

    public E pop(){
        E item =this.top.getValue();
        this.top=this.top.getPrevious();
        return item;
    }

    public String toString(){
        String out = "Stack: { ";
        for (Item <E> pointer = this.top;pointer!=null;pointer=pointer.getPrevious()){
            out += pointer.toString() + " ";
        }
        out+= "}";
        return  out;
    }
}
