package com.snowman.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    private ArrayList<RecyclerViewItem> arrayList = new ArrayList<>();

    public RecyclerViewAdapter(ArrayList<RecyclerViewItem> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,parent,false);
        RecyclerViewViewHolder recyclerViewViewHolder = new RecyclerViewViewHolder(view);
        return recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
    RecyclerViewItem recyclerViewItem = arrayList.get(position);
    holder.imageView.setImageResource(recyclerViewItem.getImageRecource());
    holder.pizzaNameTextView.setText(recyclerViewItem.getPizzaName());
    holder.descriptionTextView.setText(recyclerViewItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView pizzaNameTextView;
        public TextView descriptionTextView;
        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            pizzaNameTextView = itemView.findViewById(R.id.textView1);
            descriptionTextView = itemView.findViewById(R.id.textView2);
        }
    }
}
