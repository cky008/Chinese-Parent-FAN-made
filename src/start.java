import model.activity;
import model.essentialFactor;
import view.mainDialogue;

public class start {
    public static void main(String[] ars) {

        String[] stuActs = {"英语听说","算盘算术","古诗词","中国历史","初级物理","初级化学"};
        String[][] Attr = {{"4","1","2","4","1","3"}, {"60","100","200","140","50","80"}};
//        activity acc = new activity(stuActs, Attr);
        activity acc = new activity();
        essentialFactor ef = new essentialFactor(100,300,64,100,100,67,300,45,50,78,89,78,34,78,23,56,23,78,4, 3);
        new mainDialogue(ef, acc);
    }
}
