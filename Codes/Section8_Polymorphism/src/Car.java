public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public String startEngine() {
        String instanceType = this.getClass().getSimpleName();
        return instanceType+" -> startEngine()";
    }
    public String accelerate() {
        String instanceType = this.getClass().getSimpleName();
        return instanceType+" -> accelerate()";
    }
    public String brake() {
        String instanceType = this.getClass().getSimpleName();
        return instanceType+" -> brake()";
    }
    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        String instanceType = this.getClass().getSimpleName();
        return instanceType+" -> startEngine()";
    }
    @Override
    public String accelerate() {
        String instanceType = this.getClass().getSimpleName();
        return instanceType+" -> accelerate()";
    }
    @Override
    public String brake() {
        String instanceType = this.getClass().getSimpleName();
        return instanceType+" -> brake()";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name){
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        String instanceType = this.getClass().getSimpleName();
        return instanceType+" -> startEngine()";
    }
    @Override
    public String accelerate() {
        String instanceType = this.getClass().getSimpleName();
        return instanceType+" -> accelerate()";
    }
    @Override
    public String brake() {
        String instanceType = this.getClass().getSimpleName();
        return instanceType+" -> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name){
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        String instanceType = this.getClass().getSimpleName();
        return instanceType+" -> startEngine()";
    }
    @Override
    public String accelerate() {
        String instanceType = this.getClass().getSimpleName();
        return instanceType+" -> accelerate()";
    }
    @Override
    public String brake() {
        String instanceType = this.getClass().getSimpleName();
        return instanceType+" -> brake()";
    }
}
