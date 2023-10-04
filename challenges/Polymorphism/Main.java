package ClassesFundamentals.challenges.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("generic car");
        GasPoweredCar monza = new GasPoweredCar("Monza", 0);
//        Monza.startEngine();
//        Monza.addGas(30);
//        Monza.startEngine();
//        Monza.drive();
        runRace(car);
        runRace(monza);
        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale",
                16, 8, 8);
        runRace(ferrariHybrid);

        System.out.println(monza.toString());
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();

    }
}
