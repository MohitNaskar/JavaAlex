
public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Tata");
        System.out.println("make: " + car.getMake());
        System.out.println("model: " + car.getModel());

        car.describeCar();
    }
}