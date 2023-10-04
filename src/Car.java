public class Car {
    public void start (){
        startElectricity ();
        startCommand();
        startFuelSystem ();
    }

    private void startElectricity (){
        System.out.println( "start electricity ");
    }
    private void startFuelSystem() {
        System.out.println("start Fuel system");
    }
    private void startCommand (){
        System.out.println("start command");
    }
}
