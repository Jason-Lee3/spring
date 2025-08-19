public class Refrigerator extends Product {
    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("ordering food...");
            hasWorkToDo = false;
        }
    }
}
