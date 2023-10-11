package ClassesFundamentals.challenges.MealOrder;


class Burger {
    private String burgerType;
    private double burgerPrice;

    private Item toppings;

    public Burger(String burgerType, double burgerPrice) {
        this.burgerType = burgerType;
        this.burgerPrice = burgerPrice;
        this.toppings = new Item("Sem adicional");  // set default value


    }

    public String getBurgerType() {
        return burgerType;
    }
    public void addTopping(String type){
        if(type.toUpperCase().charAt(0) == 'B'){
            this.toppings = new Bacon();
        }
        if(type.toUpperCase().charAt(0) == 'S'){
            this.toppings = new Salad();
        }
        double toppingPrice = toppings.setPriceBasedOnType();
        double currentPrice = getBurgerPrice();
        this.setBurgerPrice(currentPrice+ toppingPrice);

    }

    public void setBurgerType(String burgerType) {
        this.burgerType = burgerType;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }


    @Override
    public String toString() {
        return "Burger{" +
                "burgerType='" + burgerType + '\'' +
                ", burgerPrice=" + burgerPrice +
                ", toppings=" + toppings +
                '}';
    }

    public void setBurgerPrice(double burgerPrice) {
        this.burgerPrice = burgerPrice;
    }
}