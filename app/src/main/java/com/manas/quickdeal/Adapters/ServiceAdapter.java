package com.manas.quickdeal.Adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.manas.quickdeal.Models.Service;
import com.manas.quickdeal.R;

import java.util.ArrayList;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.ServiceViewHolder>{

    Context context;
    ArrayList<Service> services;

    public ServiceAdapter(Context context, ArrayList<Service> services) {
        this.context = context;
        this.services = services;
    }

    @Override
    public ServiceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.service_item_layout,parent,false);
        return new ServiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ServiceViewHolder holder, int position) {
        holder.name.setText(services.get(position).getName());
        holder.dist.setText(services.get(position).getDist()+" km away");
    }

    @Override
    public int getItemCount() {
        return services.size();
    }

    class ServiceViewHolder extends RecyclerView.ViewHolder
    {
        TextView name;
        TextView dist;

        public ServiceViewHolder(View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.service_name);
            dist=(TextView)itemView.findViewById(R.id.service_dist);
    }
}
}

