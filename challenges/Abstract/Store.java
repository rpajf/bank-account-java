package ClassesFundamentals.challenges.Abstract;


import java.util.ArrayList;

//record OrderType
public class Store {
    private static ArrayList<Product> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        Product1ForSale product1 = new Product1ForSale(23, "building ", "pipes" );
//        addProduct(product1);
        product1.showDetails();
        System.out.println(product1.showDetails());
        OrderItemType orderOfProd1 = new OrderItemType(10, product1);
        double order1Price = product1.getSalesPrice(orderOfProd1.quantity());
        System.out.println("price of order " + order1Price);
        product1.pricedLineItem(orderOfProd1.quantity(), orderOfProd1.product());

    }
//    public static void addProduct(OrderItemType order){
////        order.pricedLineItem(3, order);
//    }
    public static void listProducts() {

        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
}
