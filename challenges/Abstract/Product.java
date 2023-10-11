package ClassesFundamentals.challenges.Abstract;

import java.util.ArrayList;

abstract public class Product {

    private double price;
    private String description;

    private String type;

    public Product(double price, String description, String type) {
        this.price = price;
        this.description = description;
        this.type = type;
    }
    public Product( String description, String type) {
        this.description = description;
        this.type = type;
    }

    public double getSalesPrice(int quantity){
        if (quantity < 0){
            System.out.println("please inform a correct quantity");
        }
        return quantity * price;


    };



    public void pricedLineItem(int quantity, Product product){
        int amountOfproducts = quantity;

        System.out.println("order " + quantity + "of "+ product.getType());

    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    abstract String showDetails();



}
