package com.snowman.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    private ArrayList<RecyclerViewItem> arrayList;
    //1. добавляем Listener для события onClick
    private Listener listener;

    interface Listener {
        void onClick(int position);
    }

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
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, final int position) {
    CardView cardView = holder.cardView;
    RecyclerViewItem recyclerViewItem = arrayList.get(position);
    holder.imageView.setImageResource(recyclerViewItem.getImageRecource());
    holder.pizzaNameTextView.setText(recyclerViewItem.getPizzaName());
    holder.descriptionTextView.setText(recyclerViewItem.getDescription());
    //3
     cardView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             if(listener!=null){
                 listener.onClick(position);
             }
         }
     });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView pizzaNameTextView;
        public TextView descriptionTextView;
        public CardView cardView;
        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            pizzaNameTextView = itemView.findViewById(R.id.textView1);
            descriptionTextView = itemView.findViewById(R.id.textView2);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }

    //2
    public void setListener(Listener listener){
        this.listener = listener;
    }
}
