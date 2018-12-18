public class MyStack<E> {
    private Item<E> top;

    public MyStack(){
        this.top=null;
    }

    public void push(E value){
        Item<E> newItem=new Item<>(value);
        //newItem.Previous(this.top);
        this.top=newItem;
    }
}
