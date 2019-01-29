public class Kvadr implements Comparable<Kvadr> {
    private  int a;
    private  int b;
    private  int c;

    public Kvadr(int a,int b,int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

    public int getVolume(){
        return this.getA()*this.getB()*this.getC();
    }
    @Override
    public String toString() {
        String out= String.format("Kvádr :{a= %d, b= %d, c= %d, volume= %d }", this.getA(), this.getB(), this.getC(),this.getVolume());
        return out;
    }

    @Override
    public int compareTo(Kvadr o) {
        if  (this.getVolume() == o.getVolume())
            return 0;
        if (this.getVolume() > o.getVolume())
            return 1;
        return -1;
    }
}
