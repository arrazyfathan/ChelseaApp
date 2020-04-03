package com.dicoding.chelseaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPlayerAdapter extends RecyclerView.Adapter<ListPlayerAdapter.ListViewHolder> {
    private ArrayList<Player> listPlayer;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListPlayerAdapter(ArrayList<Player> list) {
        this.listPlayer = list;
    }


    @NonNull
    @Override
    public ListPlayerAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_player, parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListPlayerAdapter.ListViewHolder holder, int position) {
        Player player = listPlayer.get(position);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions = requestOptions.transform(new RoundedCorners(20));
        Glide.with(holder.itemView.getContext())
                .load(player.getAvatar())
                .apply(requestOptions)
                .into(holder.avaPlayer);

        holder.tvName.setText(player.getName());
        holder.tvPosition.setText(player.getPosition());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listPlayer.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPlayer.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView avaPlayer;
        TextView tvName, tvPosition;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            avaPlayer = itemView.findViewById(R.id.ava_list_player);
            tvName = itemView.findViewById(R.id.tv_player_name);
            tvPosition = itemView.findViewById(R.id.tv_player_position);

        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Player data);
    }
}
