package ClassesFundamentals.Composition;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");
        PersonalComputer myPc = new PersonalComputer("Ryzen", "Huaweii", theMonitor,theMotherboard, theCase );

        myPc.powerUp();
//        System.out.println(myPc.getMonitor());
//        myPc.ge
        System.out.println(myPc);

    }
}
