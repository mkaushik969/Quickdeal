package com.manas.quickdeal.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.manas.quickdeal.Activities.ServicesActivity;
import com.manas.quickdeal.Models.Items;
import com.manas.quickdeal.R;

import java.util.ArrayList;


public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder> {

    Context context;
    ArrayList<Items> itemsList;

    public ItemsAdapter(Context context, ArrayList<Items> itemsList) {
        this.context = context;
        this.itemsList=itemsList;
    }

    @Override
    public ItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemsViewHolder holder,final int position) {
        holder.textView.setText(itemsList.get(position).getName());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,ServicesActivity.class);
                intent.putExtra("id",itemsList.get(position).getId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    class ItemsViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        View view;

        public ItemsViewHolder(View itemView) {
            super(itemView);
            view=itemView;
            textView=(TextView)itemView.findViewById(R.id.items_name);
        }
    }


}
