package com.example.borgerkong;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class BurgerAdapter extends RecyclerView.Adapter<BurgerAdapter.BurgerViewHolder>{

    private ArrayList<Burger> burgersToAdapt;

    public void setData(ArrayList<Burger> burgersToAdapt) {
        // This is basically a Setter that we use to give data to the adapter
        this.burgersToAdapt = burgersToAdapt;
    }

    @NonNull
    @Override
    public BurgerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.burger, parent, false);

        BurgerViewHolder burgerViewHolder = new BurgerViewHolder(view);

        return burgerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BurgerViewHolder holder, int position) {

        final Burger burgerAtPosition = burgersToAdapt.get(position);

        holder.nameTextView.setText(burgerAtPosition.getItemName());
        holder.calorieTextView.setText(burgerAtPosition.getCalorie());
        holder.amtTextView.setText(Integer.toString(burgerAtPosition.getPrice()));

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, BurgerDetailActivity.class);
                intent.putExtra("BurgerID", burgerAtPosition.getItemID());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return burgersToAdapt.size();
    }

    public static class BurgerViewHolder extends RecyclerView.ViewHolder {

        public View view;
        public TextView nameTextView;
        public TextView calorieTextView;
        public TextView amtTextView;



        public BurgerViewHolder(@NonNull View v) {

            super(v);
            view = v;
            nameTextView = v.findViewById(R.id.bname);
            calorieTextView = v.findViewById(R.id.bcal);
            amtTextView = v.findViewById(R.id.bAmt);

        }
    }
}
