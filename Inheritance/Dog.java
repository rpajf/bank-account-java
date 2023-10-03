package ClassesFundamentals.Inheritance;

public class Dog extends  Animal  {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }
//    public String getType(){
//        return super()
//    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
         // -> calls constructor with 4 params
         // then calls superclass constructor
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35) ? "medium" : "large" , weight);
        // an expression can be passed in the args list
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
        // this super is different from
        // super(); inside the subclass constructor
    }

    @Override
    public void makeNoise(){
        // this overrides the makeNoise method on superClass
        if (type == "Wolf"){
            System.out.println("Ow woooo! ");
        }

        bark();
        System.out.println();

    }

    @Override
    public void move(String speed) {
        super.move(speed); // extend the behavior of super class move
        if (speed == "slow"){
            walk();
            wagTail();
        }
        else {
            run();
            bark();
        }
        System.out.println();

    }
    private void bark(){
        System.out.println("dog barking");

    }
    private void wagTail(){
        System.out.println("dog wagging tail");
    }
    private void run(){
        System.out.println(type + " running");
    }
    private void walk(){
        System.out.println(type + " walking");
    }
}
