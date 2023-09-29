package ClassesFundamentals;

public class Car {
    private String make = "nissan";
    private String model = "GTR";
    private String color = "Black";
    private int doors = 2;
    private boolean convertible = false;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake(){
        return make;
    }
    public void setMake(String make){
        if(make == null) make = "unkown";
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        // not static , because it is accessing the instance fields

        System.out.println(getDoors() + "-Door " +
                getColor() + " " +
                getMake() + " " +
                getModel() + " " +
                (isConvertible() ? "Convertible" : ""));
    }
}
