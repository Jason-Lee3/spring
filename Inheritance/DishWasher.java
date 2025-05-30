public class DishWasher extends Product {
    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("doing dishes...");
            hasWorkToDo = false;
        }
    }
}
