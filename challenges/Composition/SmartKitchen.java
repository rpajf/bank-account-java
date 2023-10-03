package ClassesFundamentals.challenges.Composition;




public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private  Refrigerator iceBox;

    public SmartKitchen() {
        // removes the requirement of create the items individually
        this.coffeeMaker = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }
    public Refrigerator getRefrigerator(){
        return iceBox;
    }
    public DishWasher getDishWasher(){
        return dishWasher;
    }
    public CoffeeMaker getCoffeeMaker(){
        return coffeeMaker;
    }

//    private void
    public void setKitchenState(boolean isCoffeeReady, boolean isDishesClean, boolean isFoodReady){
        coffeeMaker.setHasWorkToDo(isCoffeeReady);
        iceBox.setHasWorkToDo(isFoodReady);
        dishWasher.setHasWorkToDo(isDishesClean);
    }
    public void doKitchenWork(){
//        setKitchenState(isCoffeeReady, isDishesClean, isFoodReady);
        // delegates work to the parts, so the correct approach is:
        System.out.println("kitchen working...");
        System.out.println();
        iceBox.orderFood();
        coffeeMaker.brewCoffee();
        dishWasher.doDishes();
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator() {
        this.hasWorkToDo = false;
    }
    public void setHasWorkToDo (boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void orderFood(){
        if(hasWorkToDo){
            System.out.println("preparing food");
            this.hasWorkToDo = false;
        }

    }
}
class CoffeeMaker  {
    private boolean hasWorkToDo;

    public CoffeeMaker() {
        this.hasWorkToDo = false;
    }
    public void setHasWorkToDo (boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    protected void brewCoffee() {
        if(hasWorkToDo){
            System.out.println("brewing coffee");
            hasWorkToDo = false;
        }
    }
}
class DishWasher  {
    private boolean hasWorkToDo;
    public void setHasWorkToDo (boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public DishWasher() {
        this.hasWorkToDo = false;

    }

    protected void doDishes(){
        if(hasWorkToDo){
            System.out.println("washing the dishes");
            this.hasWorkToDo = false;
        }


    }
}