package com.example.recyclerviewwithcustomobjects;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    ArrayList<Person> people;
    Context context;

    public RecyclerAdapter(ArrayList<Person> people, Context context) {
        //getting the data to be displayed
        this.people = people;
        this.context = context;
    }

    @NonNull
    @Override
    //inflating an item layout for each item. These views are going to be populated with item data
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    //This is where interaction with the layout elements occur. eg setting text to TextViews etc.
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.tvFirstName.setText("First name: " + people.get(i).getFirstName());
        viewHolder.tvLastName.setText("Last name: " + people.get(i).getLastName());
        viewHolder.tvAge.setText("Age: " + String.valueOf(people.get(i).getAge()));
        viewHolder.tvFavoriteColor.setText("Favorite color: " + people.get(i).getFavoriteColor());
        viewHolder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, people.get(i).getFirstName() + " clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    //Getting total number of items
    public int getItemCount() {
        return people.size();
    }

    //getting the layout elements such as TextViews etc.
    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout layout;
        TextView tvFirstName;
        TextView tvLastName;
        TextView tvAge;
        TextView tvFavoriteColor;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.itemLayout);
            tvFirstName = itemView.findViewById(R.id.tvFirstName);
            tvLastName = itemView.findViewById(R.id.tvLastName);
            tvAge = itemView.findViewById(R.id.tvAge);
            tvFavoriteColor = itemView.findViewById(R.id.tvColor);
        }
    }
}