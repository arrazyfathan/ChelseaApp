package com.dicoding.chelseaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewTrophyAdapter extends RecyclerView.Adapter<CardViewTrophyAdapter.CardViewTrophyHolder> {
    private ArrayList<Trophy> listTrophy;

    public CardViewTrophyAdapter(ArrayList<Trophy> list){
        this.listTrophy = list;
    }

    @NonNull
    @Override
    public CardViewTrophyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trophy, parent,false);
        return new CardViewTrophyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewTrophyHolder holder, int position) {
        Trophy trophy = listTrophy.get(position);

        Glide.with(holder.itemView.getContext())
                .load(trophy.getImgThrophy())
                .apply(new RequestOptions().override(110, 300))
                .into(holder.imgTrophy);

        holder.tvTotalTrophy.setText(trophy.getTotalTrophy());
        holder.tvNameTrophy.setText(trophy.getNameTrophy());
    }

    @Override
    public int getItemCount() {
        return listTrophy.size();
    }

    public class CardViewTrophyHolder extends RecyclerView.ViewHolder {
        ImageView imgTrophy;
        TextView tvNameTrophy;
        TextView tvTotalTrophy;

        public CardViewTrophyHolder(@NonNull View itemView) {
            super(itemView);
            imgTrophy = itemView.findViewById(R.id.img_item_trophy);
            tvNameTrophy = itemView.findViewById(R.id.trophy_name);
            tvTotalTrophy = itemView.findViewById(R.id.total_trophy);

        }
    }
}
