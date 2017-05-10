package com.food.recipe.retrofit_test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by pc on 5/10/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<Recipe_model> item;


    public RecyclerViewAdapter(List<Recipe_model> list) {
        this.item = list;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_row, null);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(layoutView);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        //holder.title.setText(item.get(position).getTitle());
        holder.publisher_name.setText(item.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}
