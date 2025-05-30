public class CoffeeMaker {
    protected boolean hasWorkToDo;

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("brewing coffee...");
            hasWorkToDo = false;
        }
    }

}
