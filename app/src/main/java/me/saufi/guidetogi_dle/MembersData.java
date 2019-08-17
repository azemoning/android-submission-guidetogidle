package me.saufi.guidetogi_dle;

import java.util.ArrayList;

public class MembersData {
    public static String[][] data = new String[][]{
            {"Soyeon","Leader, Main Rapper, Lead Dancer, Vocalist, Center","https://vignette.wikia.nocookie.net/g-idle/images/1/18/Uh-Oh_Concept_Photo_Soyeon.jpg"},
            {"Miyeon","Main Vocalist","https://vignette.wikia.nocookie.net/g-idle/images/4/41/Uh-Oh_Concept_Photo_Miyeon.jpg"},
            {"Minnie","Main Vocalist","https://vignette.wikia.nocookie.net/g-idle/images/9/94/IMG_20190618_144306.jpg"},
            {"Soojin","Main Dancer, Lead Rapper, Vocalist","https://vignette.wikia.nocookie.net/g-idle/images/a/a2/Uh-Oh_Concept_Photo_Soojin.jpg"},
            {"Yuqi","Lead Vocalist, Lead Dancer, Face of the Group","https://vignette.wikia.nocookie.net/g-idle/images/d/d4/Uh-Oh_Concept_Photo_Yuqi.jpg"},
            {"Shuhua","Vocalist, Visual, Maknae","https://vignette.wikia.nocookie.net/g-idle/images/6/6a/Uh-Oh_Concept_Photo_Shuhua.jpg"},
            {"2Mi","2Mi (Mi/yeon and Mi/nnie) is the friendship pairing between Miyeon and Minnie.","https://vignette.wikia.nocookie.net/g-idle/images/a/a7/2Mi.jpg"},
            {"Tom & Jerry","Tom & Jerry is the bickering pairing between Miyeon (Tom) and Shuhua (Jerry).","https://vignette.wikia.nocookie.net/g-idle/images/0/0f/Mihua.jpg"},
            {"Mijin","Mijin (Mi/yeon and Soo/jin) is the friendship pairing between Miyeon and Soojin.","https://vignette.wikia.nocookie.net/g-idle/images/1/1b/Mijin.jpg"},
            {"Shuqi","Shuqi (Shu/hua and Yu/qi) is the friendship pairing between Yuqi and Shuhua.","https://vignette.wikia.nocookie.net/g-idle/images/b/b4/Shuqi.jpg"},
            {"Shuyeon","Shuyeon (Shu/hua and So/yeon) is the friendship pairing between Soyeon and Shuhua.","https://vignette.wikia.nocookie.net/g-idle/images/0/07/Shuyeon.jpg"},
            {"Sooqi","Sooqi (Soo/jin and Yu/qi) is the friendship pairing between Soojin and Yuqi.","https://vignette.wikia.nocookie.net/g-idle/images/9/9d/Sooqi.jpg"},
            {"Yunnie","Yunnie (Yu/qi and Mi/nnie) is the friendship pairing between Minnie and Yuqi.","https://vignette.wikia.nocookie.net/g-idle/images/3/39/Yunnie.jpg"},
            {"Yuqeon","Yuqeon (Yuq/i and Soy/eon) is the friendship pairing between Soyeon and Yuqi.","https://vignette.wikia.nocookie.net/g-idle/images/1/1f/Yuqeon1.jpg"}
    };

    public static ArrayList<Members> getListData(){
        ArrayList<Members> list = new ArrayList<>();
        for (String[] aData : data) {
            Members dataMembers = new Members();
            dataMembers.setName(aData[0]);
            dataMembers.setPosition(aData[1]);
            dataMembers.setPhoto(aData[2]);

            list.add(dataMembers);
        }

        return list;
    }
}
