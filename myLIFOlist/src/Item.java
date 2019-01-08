public class Item <E> {

    private Item<E> previous;
    private E value;

    public Item(E value){
        this.value=value;
        this.previous=null;
    }

    public Item<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Item<E> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
