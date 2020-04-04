package com.dicoding.chelseaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MenuPartners extends AppCompatActivity {

    private RecyclerView rvPartners;
    private ArrayList<Partners> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_partners);
        rvPartners = findViewById(R.id.rv_partners);
        rvPartners.setHasFixedSize(true);

        list.addAll(PartnersData.getPartnerListData());
        showPartnersData();


    }

    private void showPartnersData() {
        rvPartners.setLayoutManager(new GridLayoutManager(this,2));
        CardViewPartnersAdapter cardViewPartnersAdapter = new CardViewPartnersAdapter(list);
        rvPartners.setAdapter(cardViewPartnersAdapter);
    }
}
