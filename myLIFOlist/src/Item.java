public class Item <E> {

    private E value;
    private Item<E> previous;

    public Item(E value){
        this.value=value;
        this.previous=null;
    }
    /*
    public void Previous(E value){
        this.previous=value;
    }*/
    @Override
    public String toString() {
        return this.value.toString();
    }
}
