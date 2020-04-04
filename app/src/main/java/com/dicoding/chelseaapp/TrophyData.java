package com.dicoding.chelseaapp;

import java.util.ArrayList;

public class TrophyData {
    private static String[] throphyName = {
            "Premier League",
            "Champions League",
            "Europa League",
            "UEFA Cup",
            "FA Cup",
            "League Cup",
            "Super Cup",
            "Community Shield"
    };


    private static int[] trophyImg = {
            R.drawable.premier,
            R.drawable.champions,
            R.drawable.europa,
            R.drawable.uefacup,
            R.drawable.fa,
            R.drawable.englancup,
            R.drawable.superleague,
            R.drawable.cs
    };

    private static String[] trophyTotal = {
            "6",
            "1",
            "2",
            "2",
            "8",
            "5",
            "1",
            "4"
    };

    static ArrayList<Trophy> getListTrophy(){
        ArrayList<Trophy> list = new ArrayList<>();
        for (int position = 0; position < throphyName.length;position++){
            Trophy trophy = new Trophy();
            trophy.setNameTrophy(throphyName[position]);
            trophy.setImgThrophy(trophyImg[position]);
            trophy.setTotalTrophy(trophyTotal[position]);
            list.add(trophy);
        }
        return list;
    }
}
