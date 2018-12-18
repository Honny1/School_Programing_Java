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
            this.boostArray();
        }
        this.array[this.useLen++]=instance;
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

    public String toString(){
        String output = "array=[";
        for (int i=0;i<this.size();i++){
            if(i==0){
                output += this.array[i].toString();
            }
            output += ", " + this.array[i].toString();
        }
        output+="]";
        return output;
    }

}