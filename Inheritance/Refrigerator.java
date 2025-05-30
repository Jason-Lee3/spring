public class Refrigerator {
    protected boolean hasWorkToDo;

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("ordering food...");
            hasWorkToDo = false;
        }
    }
}
