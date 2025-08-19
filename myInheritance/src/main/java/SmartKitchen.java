public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public SmartKitchen(CoffeeMaker coffeeMaker, DishWasher dishWasher, Refrigerator refrigerator) {
        this.brewMaster = coffeeMaker;
        this.dishWasher = dishWasher;
        this.iceBox = refrigerator;
    }

    public void addWater() {
        brewMaster.hasWorkToDo = true;
    }

    public void pourMilk() {
        iceBox.hasWorkToDo = true;
    }

    public void loadDishwasher() {
        dishWasher.hasWorkToDo = true;
    }

    public void setKitchenState(boolean coffeeMakerHasWorkToDo, boolean refrigeratorHasWorkToDo, boolean dishWasherHasWorkToDo) {
        brewMaster.hasWorkToDo = coffeeMakerHasWorkToDo;
        iceBox.hasWorkToDo = refrigeratorHasWorkToDo;
        dishWasher.hasWorkToDo = dishWasherHasWorkToDo;
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }


}

class Main1 {
    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.setKitchenState(true, false, true);
        smartKitchen.doKitchenWork();
    }
}
