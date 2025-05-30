public class CoffeeMaker extends Product {
    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("brewing coffee...");
            hasWorkToDo = false;
        }
    }

}
