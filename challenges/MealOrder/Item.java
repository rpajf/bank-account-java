package ClassesFundamentals.challenges.MealOrder;

class Item {
    private double itemPrice;
    private String type;
    public Item() {
    }
    public Item(String type) {
        this.type = type;
        this.itemPrice = setPriceBasedOnType();
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemPrice=" + itemPrice +
                ", type='" + type + '\'' +
                '}';
    }

    public double setPriceBasedOnType(){

        if(this.getClass().getSimpleName().charAt(0) == 'B'){
            this.itemPrice = 4.50;
            System.out.println("Bacon added for " + getItemPrice());

        }
        else if(this.getClass().getSimpleName().charAt(0) == 'S'){
            this.itemPrice = 2.50;
            System.out.println("Salad added for " + getItemPrice());

        }
        else if(this.getClass().getSimpleName() != null){

            this.setItemPrice(getItemPrice());
            System.out.println("Salad added for " + getItemPrice());

        }

        return getItemPrice();

    }

    public void setType(String type) {
        this.type = type;
    }
}