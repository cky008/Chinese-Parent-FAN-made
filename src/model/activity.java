package model;

import java.util.ArrayList;
import java.util.List;

public class activity {
    List<String> ac,attr,attrV;

    public activity() {
        ac = new ArrayList<>();
        attr = new ArrayList<>();
        attrV = new ArrayList<>();
    }

    public List getAc() {
        return ac;
    }

    public List getAttr() {
        return attr;
    }

    public List getAttrV() {
        return attrV;
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
