import hony.god.IOnOff;

public class television implements IOnOff {
    public boolean tvStatus;

    public television(){
        this.tvStatus=false;
    };

    @Override
    public void on(){
        System.out.println("on tv");
        this.tvStatus=true;
    }
    @Override
    public void off(){
        System.out.println("off tv");
        this.tvStatus=true;
    }

    public String toString(){
        return "Television: {on: "+ this.tvStatus+"}";
    }
}
