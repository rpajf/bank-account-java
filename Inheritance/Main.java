package ClassesFundamentals.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("generic", "Humongous", 400);
//        Animal animal = new Animal();
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Lab", 30, "Floppy", "Swimmer");

        doAnimalStuff(retriever, "medium");
        Dog wolf = new Dog("Wolf", 30, "Pointy", "Swimmer");
        doAnimalStuff(wolf, "slow");
        Fish golden = new Fish("goldfish", 30, 2, 6);
        doAnimalStuff(golden, "fast");

    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed)  ;
        System.out.println(animal);
        System.out.println("____");
    }
}
