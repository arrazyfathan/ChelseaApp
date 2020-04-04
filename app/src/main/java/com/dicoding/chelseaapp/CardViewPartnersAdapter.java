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

public class CardViewPartnersAdapter extends RecyclerView.Adapter<CardViewPartnersAdapter.CardViewPartnersHolder> {
    private ArrayList<Partners> listPartners;


    public CardViewPartnersAdapter(ArrayList<Partners> list){
        this.listPartners = list;
    }

    @NonNull
    @Override
    public CardViewPartnersHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_partners, parent, false);
        return new CardViewPartnersHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewPartnersHolder holder, int position) {
        Partners partners = listPartners.get(position);

        Glide.with(holder.itemView.getContext())
                .load(partners.getImg_partners())
                .apply(new RequestOptions().override(100,100))
                .into(holder.imgPartners);

        holder.tvPartners.setText(partners.getName_partners());
    }

    @Override
    public int getItemCount() {
        return listPartners.size();
    }

    public class CardViewPartnersHolder extends RecyclerView.ViewHolder {
        ImageView imgPartners;
        TextView tvPartners;

        public CardViewPartnersHolder(@NonNull View itemView) {
            super(itemView);
            imgPartners = itemView.findViewById(R.id.img_item_partners);
            tvPartners = itemView.findViewById(R.id.partners_name);

        }
    }
}
