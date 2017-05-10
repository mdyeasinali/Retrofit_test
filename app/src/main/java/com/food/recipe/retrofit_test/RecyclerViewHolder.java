package com.food.recipe.retrofit_test;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by pc on 5/10/2017.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView title,publisher_name,pub_date,status;


    public RecyclerViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

        title = (TextView) itemView.findViewById(R.id.hobby);
        publisher_name = (TextView) itemView.findViewById(R.id.name);
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(, "", Toast.LENGTH_SHORT).show();
    }
}