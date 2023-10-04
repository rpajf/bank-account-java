package ClassesFundamentals.challenges.Polymorphism;

public class Car {
    private String description;
    private double speed;
    public Car(String description) {
        this.speed = 0;
        this.description = description;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "description='" + description + '\'' +
                ", speed=" + speed +
                '}';
    }

    public void startEngine(){
//        String instanceType = this.getClass().getSimpleName();
        System.out.println("Car -> startEngine");

    }
    protected void runEngine(){
        System.out.println(this.description + "Engine is running");
    }
    public String getInstance(){
        String instanceType = this.getClass().getSimpleName();
        return instanceType;
    }
    public void drive(){
        runEngine();
        System.out.println("driving a " + getInstance() + ", a " +this.description);
    }
    public String getDescription() {
        return description;
    }
}
// all the subclasses have different way to start engine or drive
// depending on the engine type
// at least one method should print the type of runtime obj
class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinders;
    private double currentGas;

    public GasPoweredCar(String description, double currentGas) {
        super(description);
        this.avgKmPerLiter = 10;
        this.currentGas = currentGas;
        this.cylinders = 8;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public double getCurrentGas() {
        return currentGas;
    }



    public void setCurrentGas(double currentGas) {
        this.currentGas = currentGas;
    }

    public double addGas(double currentGas) {
        double gasAdded = currentGas;
        if(gasAdded > 120){
            setCurrentGas(100);
        }
        setCurrentGas(gasAdded);
        System.out.println("current gasoline on " + this.getInstance() + " " + getCurrentGas());


        return getCurrentGas();
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "avgKmPerLiter=" + avgKmPerLiter +
                ", cylinders=" + cylinders +
                ", currentGas=" + currentGas +
                "} " + super.toString();
    }

    @Override
    public void startEngine() {

        if(getCurrentGas() == 0){
            System.out.println(getDescription()  +" needs gasoline to start");
            return;
        }
        super.startEngine();

    }



    @Override
    public String getInstance() {
        return super.getInstance();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        setSpeed(30);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("driving  at " + getSpeed() + "km/hr");
        System.out.printf("usage bellow average %.2f %n",  avgKmPerLiter);

    }
}
class EletricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;
    public EletricCar(String description) {
        super(description);
        this.batterySize = 15;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }
}
class HybridCar extends Car {
    private double avgKmPerLiter;
    private int cylinders = 6;

    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders,
                     int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
    }
}