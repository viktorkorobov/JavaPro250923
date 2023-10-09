public class Car {
    public void start(){
        Car.startCommand();
        Car.startElectricity();
        Car.startFuelSystem();
        System.out.println("System working correct");
    }
    private static void  startElectricity(){
        System.out.println("Electricity was started");
    }
    private static void  startCommand(){
        System.out.println("Command on start system");
    }
    private static void  startFuelSystem(){
        System.out.println("Start fuel system");
    }

}
