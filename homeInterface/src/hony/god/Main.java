package hony.god;

public class Main {

    public static void main(String[] args) {
	    /*gasHeating ghl = new gasHeating(22);
	    System.out.print(ghl);
	    ghl.tempChange(60);
	    ghl.on();
	    System.out.print(ghl);

        */
	    IOnOff[] devices = new IOnOff[5];
	    devices[0]= new gasHeating(22);
        devices[1]= new television();
        devices[2]= new television();

        for (int i = 0; i<devices.length;i++){
            //devices[i] != null
            if (devices[i] instanceof IOnOff){
                //polimorfizmus = vola se i metoda pro instance ruznych trid
                devices[i].on();
                if (devices[i] instanceof gasHeating){
                    //downcast petipovani smerem dolu
                    ((gasHeating)devices[i]).tempChange(54);
                }
            }

            System.out.println(devices[i]);
        }

    }
}
