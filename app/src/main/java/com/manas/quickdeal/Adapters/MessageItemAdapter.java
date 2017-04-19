package com.manas.quickdeal.Adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.manas.quickdeal.Models.MessageItems;
import com.manas.quickdeal.R;

import java.util.ArrayList;


public class MessageItemAdapter extends RecyclerView.Adapter<MessageItemAdapter.MessageViewHolder>{

    Context context;
    ArrayList<MessageItems> messageItemsArrayList;

    public MessageItemAdapter(Context context, ArrayList<MessageItems> messageItemsArrayList) {
        this.context = context;
        this.messageItemsArrayList = messageItemsArrayList;
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.message_item_layout,parent,false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {

        MessageItems items=messageItemsArrayList.get(position);
        holder.name.setText(items.getName());
        holder.msg.setText(items.getMsg());
        holder.time.setText(items.getTime()+" min ago");
        if(!items.getNo_of_msgs().equals("0"))
        {
            holder.no_of_msgs.setVisibility(View.VISIBLE);
            holder.no_of_msgs.setText(items.getNo_of_msgs());
            holder.name.setTextColor(ContextCompat.getColor(context, R.color.colorAccent));
        }
        if(items.isDealDone())
            holder.deal.setImageResource(R.drawable.ic_done_all_black_24dp);

    }

    @Override
    public int getItemCount() {
        return messageItemsArrayList.size();
    }

    class MessageViewHolder extends RecyclerView.ViewHolder
    {
        TextView name,msg,time,no_of_msgs;
        ImageView deal;

        public MessageViewHolder(View itemView) {
            super(itemView);

            name=(TextView)itemView.findViewById(R.id.service_name);
            msg=(TextView)itemView.findViewById(R.id.message_msg);
            time=(TextView)itemView.findViewById(R.id.message_time);
            no_of_msgs=(TextView)itemView.findViewById(R.id.message_noofmsgs);
            deal=(ImageView)itemView.findViewById(R.id.message_deal);
        }
    }
}
