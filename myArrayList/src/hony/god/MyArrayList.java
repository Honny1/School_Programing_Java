package hony.god;

public class MyArrayList<E> {
    private E[] array;
    private int useLen;

    public MyArrayList(){
        int counter_len = 5;
        this.useLen=0;
        this.array= (E[]) new Object[counter_len];
    }

    public int size(){
        return this.useLen;
    }

    public void add(E instance){
        if (this.useLen==this.array.length){
            boostArray();
        }
        this.array[this.useLen]=instance;
        this.useLen++;
    }

    private void boostArray() {
        E[] newArray= (E[])(new Object[this.array.length*2]);
        for(int i = 0; i < this.array.length; i++){
            newArray[i]=this.array[i];
        }
        this.array=newArray;
    }

    public E get(int index){
        return this.array[index];
    }

}