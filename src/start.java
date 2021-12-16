import model.activity;
import model.essentialFactor;
import view.mainDialogue;

public class start {
    public static void main(String[] ars) {
        activity acc = new activity();
        essentialFactor ef = new essentialFactor(100,300,64,100,100,67,300,45,50,78,89,78,34,78,23,56,23,78,4, 3);
        new mainDialogue(ef, acc);
    }
}
