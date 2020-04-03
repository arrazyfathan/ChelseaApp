package com.dicoding.chelseaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuPlayer extends AppCompatActivity {

    private RecyclerView rvPlayer;
    private ArrayList<Player> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_player);

        rvPlayer = findViewById(R.id.rv_player);
        rvPlayer.setHasFixedSize(true);

        list.addAll(PlayerData.getListData());
        showPlayerData();


    }

    private void showPlayerData() {
        rvPlayer.setLayoutManager(new LinearLayoutManager(this));
        ListPlayerAdapter listPlayerAdapter = new ListPlayerAdapter(list);
        rvPlayer.setAdapter(listPlayerAdapter);

        listPlayerAdapter.setOnItemClickCallback(new ListPlayerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Player data) {
                showSelectedPlayer(data);
            }
        });
    }

    private void showSelectedPlayer(Player player) {
//        Toast.makeText(this, "Kamu Pilih " + player.getName() +
//                "Age" + player.getAge() +
//                "photo" + player.getPhoto(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MenuPlayer.this, PlayerDetail.class);
        intent.putExtra(PlayerDetail.EXTRA_NAME, player.getName());
        intent.putExtra(PlayerDetail.EXTRA_AGE, player.getAge());
        intent.putExtra(PlayerDetail.EXTRA_BIO, player.getBiography());
        intent.putExtra(PlayerDetail.EXTRA_NUMBER, player.getNoPemain());
        intent.putExtra(PlayerDetail.EXTRA_WEIGHT, player.getWeight());
        intent.putExtra(PlayerDetail.EXTRA_HEIGHT, player.getHeight());
        intent.putExtra(PlayerDetail.EXTRA_POS, player.getShortPosition());
        intent.putExtra(PlayerDetail.EXTRA_IMAGE, player.getPhoto());
        startActivity(intent);
    }
}
