package hony.god;

public class MyArrayList<E> {
    private final int counter_len;
    private E[] array;
    private  int useLen;

    public MyArrayList(){
        this.counter_len=5;
        this.useLen=0;
        this.array= (E[])(new Object[this.counter_len]);
    }

    public int size(){
        return this.useLen;
    }

    public void add(E instance){
        if (useLen<counter_len){
            this.array[useLen++]=instance;
        }else{
            boostArray();
        }
    }

    private void boostArray() {

        E[] newArray= (E[])(new Object[this.counter_len*2]);
        for(int i = 0; i < this.array.length; i++){
            newArray[i]=this.array[i];
        }
        this.array=newArray;

    }

}
