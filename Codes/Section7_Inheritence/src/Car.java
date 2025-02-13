public class Car {
    private String make ="Tesla";
    private String model = "Model X";
    private String color ="Grey";
    private int doors = 2;
    private boolean convertible = true;
    public boolean isConvertible() {
        return convertible;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowerCase = make.toLowerCase();
        switch (lowerCase){
            case "tesla","bently","tata" ->this.make =make;
            default -> this.make ="Unsupported";
        }
    }

    public void describeCar(){
            System.out.println(doors+" Doors"+
                    color + " "+
                    make +" "+
                    model+ " "+
                    (convertible ? "Convertible" : " "));
        }
}
