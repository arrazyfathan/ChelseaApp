package com.dicoding.chelseaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MenuTrophy extends AppCompatActivity {
    RecyclerView rvTrophy;
    private ArrayList<Trophy> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_trophy);

        rvTrophy = findViewById(R.id.rv_trophy);
        rvTrophy.setHasFixedSize(true);

        list.addAll(TrophyData.getListTrophy());
        showTrophyData();
    }

    private void showTrophyData(){
        rvTrophy.setLayoutManager(new GridLayoutManager(this, 2));
        CardViewTrophyAdapter cardViewTrophyAdapter = new CardViewTrophyAdapter(list);
        rvTrophy.setAdapter(cardViewTrophyAdapter);
    }
}
