package ClassesFundamentals.challenges.Abstract;

public class Product1ForSale extends Product{

    public Product1ForSale(double price, String description, String type) {
        super(price, description, type);
    }
    public Product1ForSale( String description, String type) {
        super(15, description, type);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public double getPrice() {

        return super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public String showDetails() {
        return "product summary " + getClass().getSimpleName() + " (" + getType()+  ") " +
                "\n" + "costs " + getPrice()  + "\n" + getDescription();
    }





}
