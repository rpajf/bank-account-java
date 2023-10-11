package ClassesFundamentals.challenges.MealOrder;

public class Main {

    public static void main(String[] args) {

        Meal defaultMeal = new Meal();
        defaultMeal.createDefaultMeal();
        Item item = new Item("Item");
        Burger burger =  new Burger("smash", 10);
        burger.addTopping("bacon");

        Drink drink2 = new Drink("agua", 20);
        SideItem sideItem2 = new SideItem("batata", 20);
        System.out.println( burger);
        Meal meal2 = new Meal(burger, drink2, sideItem2);
        meal2.setDrinkSize("Big");

        System.out.println(meal2);

    }
    public static void getBurguerInfo(Burger burger){
        System.out.println(burger);

    }
}
