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

    public Item<E> pop(){
        Item<E> item =this.top;
        this.top=item.getPrevious();
        return item;
    }

    public String toString(){
        String out = "Stack:{ ";
        while (this.top!=null){
            out += this.pop();
            out += ", ";
        }
        out+= "}";
        return  out;
    }
}
