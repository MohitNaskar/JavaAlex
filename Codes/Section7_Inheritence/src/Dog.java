public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt","Big",100);
    }

    public Dog(String type, int weight){
        this(type, weight ,"Perky","Curled");
    }
    public Dog(String type,  int weight, String earShape, String tailShape) {
        super(type, weight< 15 ? "small" :(weight < 35 ? "medium" : "large"),weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        bark();
    }
    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dog walk runs and wag their tail");
        if (speed == "slow"){
            walk();
            wagTail();
        }
        else{
            run();
            bark();
        }
        System.out.println();
    }
    private void bark(){
        System.out.println("Woof");
    }
    private void run(){
        System.out.println("Dog Running ");
    }
    private void walk(){
        System.out.println("Dog Walking ");
    }
    private void wagTail(){
        System.out.println("tail wagging");
    }
}
