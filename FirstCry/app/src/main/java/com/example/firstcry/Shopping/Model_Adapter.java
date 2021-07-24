package com.example.firstcry.Shopping;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.firstcry.R;
import java.util.ArrayList;

public class Model_Adapter extends RecyclerView.Adapter<Model_Holder>{

    private ArrayList<Image_Model> imageButtons;

    public Model_Adapter(ArrayList<Image_Model> imageButtons) {
        this.imageButtons = imageButtons;
    }

    @NonNull
    @Override
    public Model_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_layout,parent,false);
        return new Model_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Model_Holder holder, int position) {
        Image_Model model=imageButtons.get(position);
        holder.setData(model);
    }

    @Override
    public int getItemCount() {
        return imageButtons.size();
    }
}