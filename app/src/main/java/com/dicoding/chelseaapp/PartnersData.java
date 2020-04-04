package com.dicoding.chelseaapp;

import java.util.ArrayList;

public class PartnersData {
    private static String[] namePartners = {
            "Nike",
            "Yokohama",
            "Beats",
            "Carabao",
            "EA",
            "Hublot",
            "Hyundai",
            "Millenium",
            "MSC Cruise",
            "SINGHA",
            "Sure",
            "Vitality",
            "Fiserv"
    };

    private static int[] imgPartners = {
            R.drawable.nike,
            R.drawable.yokohama,
            R.drawable.beats,
            R.drawable.carabao,
            R.drawable.ea,
            R.drawable.hublot,
            R.drawable.hyundai,
            R.drawable.millenium,
            R.drawable.msc,
            R.drawable.singha,
            R.drawable.sure,
            R.drawable.vitality,
            R.drawable.fiserv
    };

    static ArrayList<Partners> getPartnerListData(){
        ArrayList<Partners> list = new ArrayList<>();
        for (int position = 0; position < namePartners.length; position++){
            Partners partners = new Partners();
            partners.setName_partners(namePartners[position]);
            partners.setImg_partners(imgPartners[position]);
            list.add(partners);
        }
        return list;
    }
}
