public class Car1 {
    private String description;

    public Car1(String description) {
        this.description = description;
    }
    public void startEngine(){
        System.out.println("Car1 -> startEngine");
    }

    protected void runEngine(){
        System.out.println("Car1 -> runEngine");
    }

    public void drive(){
        System.out.println("Car1 -> driving, type is "+getClass().getSimpleName());
    }
}
class GasPoweredCar1 extends Car1 {
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar1(String description, double avgKmPerLiter, int cylinders) {
        super(description);
    }

    public GasPoweredCar1(String description, int cylinders, double avgKmPerLiter) {
        super(description);
        this.cylinders = cylinders;
        this.avgKmPerLiter = avgKmPerLiter;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready! %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("gas -> usage exceed the average: %.2f %n", avgKmPerLiter);
    }
}
class ElectricCar extends Car1 {
    private double avgKmPerCharge;
    private int battery = 6;

    public ElectricCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
    }

    public ElectricCar(String description, int cylinders, double avgKmPerLiter) {
        super(description);
        this.battery = cylinders;
        this.avgKmPerCharge = avgKmPerLiter;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", battery);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average : %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car1 {
    private double avgKmPerLiter;
    private int cylinders = 6;
    private int battery;

    public HybridCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
    }

    public HybridCar(String description, int cylinders, double avgKmPerLiter,int battery) {
        super(description);
        this.cylinders = cylinders;
        this.avgKmPerLiter = avgKmPerLiter;
        this.battery = battery;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready! %n", cylinders);
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", battery);
    }

    @Override
    protected void runEngine() {
        System.out.printf("gas -> usage exceed the average: %.2f %n", avgKmPerLiter);
    }
}