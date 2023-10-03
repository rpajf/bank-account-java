package ClassesFundamentals.challenges.Composition;

public class Main {

    public static void main(String[] args) {


        SmartKitchen myKitchen = new SmartKitchen();
        myKitchen.setKitchenState(true,false,true);
        myKitchen.doKitchenWork();
    }

}
