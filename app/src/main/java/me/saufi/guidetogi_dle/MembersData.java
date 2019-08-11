package me.saufi.guidetogi_dle;

import java.util.ArrayList;

public class MembersData {
    public static String[][] data = new String[][]{
            {"Soyeon","Leader, Main Rapper, Lead Dancer, Vocalist, Center","https://vignette.wikia.nocookie.net/g-idle/images/1/18/Uh-Oh_Concept_Photo_Soyeon.jpg"},
            {"Miyeon","Main Vocalist","https://vignette.wikia.nocookie.net/g-idle/images/4/41/Uh-Oh_Concept_Photo_Miyeon.jpg"},
            {"Minnie","Main Vocalist","https://vignette.wikia.nocookie.net/g-idle/images/9/94/IMG_20190618_144306.jpg"},
            {"Soojin","Main Dancer, Lead Rapper, Vocalist","https://vignette.wikia.nocookie.net/g-idle/images/a/a2/Uh-Oh_Concept_Photo_Soojin.jpg"},
            {"Yuqi","Lead Vocalist, Lead Dancer, Face of the Group","https://vignette.wikia.nocookie.net/g-idle/images/d/d4/Uh-Oh_Concept_Photo_Yuqi.jpg"},
            {"Shuhua","Vocalist, Visual, Maknae","https://vignette.wikia.nocookie.net/g-idle/images/6/6a/Uh-Oh_Concept_Photo_Shuhua.jpg"}
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
