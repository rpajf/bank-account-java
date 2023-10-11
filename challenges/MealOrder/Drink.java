package ClassesFundamentals.challenges.MealOrder;


class Drink  {
    private String type;
    private double price;

    private String size;

    public Drink(String type, double price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }
    public Drink(String type, double price) {
        this.type = type;
        this.price = price;
        this.size = "Medium";
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



    public void setPrice(double price) {
        this.price = price;
    }

}