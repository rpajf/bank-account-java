package ClassesFundamentals.challenges;

public class Main {
    public static void main(String[] args) {
        ConstructorChallenge asdrubal = new ConstructorChallenge("asdrubal", 0000, "asdf@gmail.com");
        asdrubal.getInfo();
        ConstructorChallenge tim = new ConstructorChallenge();
        tim.getInfo();

        ConstructorChallenge client2 = new ConstructorChallenge("rafa", "rafa@gmail.com");
        client2.getInfo();

    }
}
