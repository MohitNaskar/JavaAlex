public class CarMain {
    public static void main(String[] args) {
        Car1 car1 = new Car1("2022 Blue Ferrrari 296 GTS");
        //runRace(car1);

        Car1 ferrari = new ElectricCar("2022 Blue Ferrrari 296 GTS",15.4,6);
        runRace(ferrari);
    }
    public static void runRace(Car1 car1){
        car1.startEngine();
        car1.drive();
    }
}
