package ClassesFundamentals.challenges.Inheritance;

public class SuperThis {
    public void printMethod(){
        System.out.println("prined super");
    }
}
class SubClass extends SuperThis{
    @Override
    public void printMethod(){
        super.printMethod();
        System.out.println("prined super");
    }
}
class MainClass {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
    }
}