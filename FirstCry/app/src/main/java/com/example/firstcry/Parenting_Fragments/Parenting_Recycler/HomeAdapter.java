package com.example.firstcry.Parenting_Fragments.Parenting_Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstcry.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    ArrayList<HomeModel> homeModelArrayList;

    public HomeAdapter(ArrayList<HomeModel> homeModelArrayList) {
        this.homeModelArrayList = homeModelArrayList;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parenting_item_layout, parent, false);

        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.HomeViewHolder holder, int position) {

        holder.imageView.setImageResource(homeModelArrayList.get(position).getImage());
        holder.title.setText(homeModelArrayList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return homeModelArrayList.size();
    }

    class HomeViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_article_image);
            title = itemView.findViewById(R.id.tv_article_title);
        }
    }
}
