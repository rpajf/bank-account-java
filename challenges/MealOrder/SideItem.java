package ClassesFundamentals.challenges.MealOrder;


class SideItem {
    private String type;
    private double itemPrice;

    public SideItem(String type, double itemPrice) {
        this.type = type;
        this.itemPrice = itemPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public double getSideItemPrice() {
        return itemPrice;
    }
    public void setSideItemPrice(double price) {
        this.itemPrice = price;
    }

    @Override
    public String toString() {
        return "SideItem{" +
                "type='" + type + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }

    public void setPrice(double price) {
        this.itemPrice = price;
    }
}
