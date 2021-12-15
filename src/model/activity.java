package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class activity {
    List<String> ac,attr,attrV;

    public activity() {
        ac = new ArrayList<>();
        attr = new ArrayList<>();
        attrV = new ArrayList<>();
    }

//    public activity(String[] ac, String[][] attr) {
//        this.ac = Arrays.asList(ac);
//        this.attr = Arrays.asList(attr[0]);
//        this.attrV = Arrays.asList(attr[1]);
//    }

    public List getAc() {
        return ac;
    }

    public List getAttr() {
        return attr;
    }

    public List getAttrV() {
        return attrV;
    }

    public String[] getAcArr() {
        return this.ac.toArray(new String[ac.size()]);
    }

    public String[] getAttrArr() {
        return this.attr.toArray(new String[attr.size()]);
    }

    public String[] getAttrVArr() {
        return this.attrV.toArray(new String[attrV.size()]);
    }

    public String[] getAttrArrC() {
        int size = attr.size();
        String[] tempAttrArr = this.attr.toArray(new String[size]);
        String[] tempCArr = new String[size];
        for(int i = 0;i< size;i++){
            tempCArr[i] = attr2C(tempAttrArr[i]);
        }
        return tempCArr;
    }

    private String attr2C(String s) {
        switch (s) {
            case "1" -> {
                return("智商");
            }
            case "2" -> {
                return("情商");
            }
            case "3" -> {
                return("想象力");
            }
            case "4" -> {
                return("记忆力");
            }
            case "5" -> {
                return("体魄");
            }
            case "6" -> {
                return("智商/轮");
            }
            case "7" -> {
                return("情商/轮");
            }
            case "8" -> {
                return("想象力/轮");
            }
            case "9" -> {
                return("记忆力/轮");
            }
            case "10" -> {
                return("体魄/轮");
            }
            case "11" -> {
                return("悟性");
            }
            case "12" -> {
                return("行动力");
            }
        }
        return "";
    }

    public String[] getActivity(int i) {
        String[] tempArr = new String[3];
        tempArr[0] = this.ac.get(i);
//        System.out.println(tempArr[0]);
        tempArr[1] = this.attr.get(i);
//        System.out.println(tempArr[1]);
        tempArr[2] = this.attrV.get(i);
//        System.out.println(tempArr[2]);
//        System.out.println(tempArr);
        return tempArr;
    }

    public void addActivity(String ac, String attr, String attrV) {
        this.ac.add(ac);
        this.attr.add(attr);
        this.attrV.add(attrV);
    }


}
