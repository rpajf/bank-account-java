package ClassesFundamentals.challenges.MealOrder;

public class Meal {
    private Burger burger;
    private SideItem sideItem;
    private Double price;
    private Drink drink;

    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        this.price = 0.0;
        calculateTotalPrice();
    }
    public Meal(){

    }



    public double calculateTotalPrice() {
        double total = 0.0;

        if (burger != null) {
            total += burger.getBurgerPrice();
        }

        if (sideItem != null) {
            total += sideItem.getSideItemPrice();
        }

        if (drink != null) {
            total += drink.getPrice();
        }
        return total;
    }
    public void setDrinkSize(String size){
         switch (size.toUpperCase()){
            case "BIG" -> {
                drink.setPrice(drink.getPrice() + 4);
                drink.setSize("Big");
            }
            case "SMALL" ->  {
                drink.setPrice(drink.getPrice() - 2);
                drink.setSize("Small");
            }
            default ->  drink.setPrice(drink.getPrice());
        };
    }
    public void createDefaultMeal(){
        this.burger = new Burger("Basicao", 6);
        this.drink = new Drink("Agua mineral", 2);
        this.sideItem = new SideItem("batata frita", 7);
        calculateTotalPrice();
//        System.out.println("your basic meal is ");
//        this.toString();

    }
    @Override
    public String toString() {
        return "sua refeição : {" +
                "burger=" + burger +
                ", sideItem=" + sideItem +
                ", drink=" + drink + "} \n" +
                "custou " + calculateTotalPrice();
    }
}

class Salad extends Item {
    public Salad() {
        super("Salad");
    }
}
class Bacon extends Item {
    public Bacon() {
        super("Bacon");
    }
}
class OtherToppping extends Item {
    public OtherToppping(String type) {
        super(type);
    }
}