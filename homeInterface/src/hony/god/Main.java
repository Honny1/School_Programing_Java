package hony.god;

public class Main {

    public static void main(String[] args) {
	gasHeating ghl = new gasHeating(22);
	System.out.print(ghl);
	ghl.tempChange(60);
	ghl.on();
	System.out.print(ghl);
    }
}
