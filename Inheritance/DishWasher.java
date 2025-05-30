public class DishWasher {
    protected boolean hasWorkToDo;

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("doing dishes...");
            hasWorkToDo = false;
        }
    }
}
