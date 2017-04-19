package com.manas.quickdeal.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.manas.quickdeal.Activities.ItemsActivity;
import com.manas.quickdeal.Models.MainMenuItem;
import com.manas.quickdeal.R;

import java.util.ArrayList;


public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuAdapter.MainMenuViewHolder> {

    Context context;
    ArrayList<MainMenuItem> mainMenuItems;

    public MainMenuAdapter(Context context, ArrayList<MainMenuItem> mainMenuItems) {
        this.context = context;
        this.mainMenuItems = mainMenuItems;
    }

    @Override
    public MainMenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.main_menu_item_layout,parent,false);
        return new MainMenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainMenuViewHolder holder, final int position) {

        holder.textView.setText(mainMenuItems.get(position).getName());
        holder.imageView.setImageResource(mainMenuItems.get(position).getRes());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,ItemsActivity.class);
                intent.putExtra("id",mainMenuItems.get(position).getId());
                intent.putExtra("name",mainMenuItems.get(position).getName());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mainMenuItems.size();
    }

    class MainMenuViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        ImageView imageView;
        View view;

        public MainMenuViewHolder(final View itemView) {
            super(itemView);
            view=itemView;
            textView=(TextView)itemView.findViewById(R.id.main_menu_item_name);
            imageView=(ImageView) itemView.findViewById(R.id.main_menu_item_image);
        }

    }
}
