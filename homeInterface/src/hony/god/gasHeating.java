package hony.god;

public class gasHeating implements IOnOff, ITempControl {
    public int temp;
    public boolean termostatStatus;

    public gasHeating(int temp){
        this.temp=temp;
        this.termostatStatus=false;
    };
    @Override
    public void tempChange(int degree){
        System.out.println("tempUpBy: "+degree);
        this.temp=degree;
    }
    @Override
    public void on(){
        System.out.println("START termostat");
        this.termostatStatus=true;
    }
    @Override
    public void off(){
        System.out.println("END  termostat");
        this.termostatStatus=true;
    }

    public String toString(){
        return "GasHeating: {temp: "+ this.temp+" termostat: "+this.termostatStatus+"}";
    }
}
