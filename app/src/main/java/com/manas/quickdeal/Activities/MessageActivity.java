package com.manas.quickdeal.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.manas.quickdeal.Adapters.MessageItemAdapter;
import com.manas.quickdeal.Models.MessageItems;
import com.manas.quickdeal.R;

import java.util.ArrayList;

public class MessageActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<MessageItems> messageItemsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chats");
        setUpRecyclerView();

    }


    private void setUpRecyclerView()
    {
        //fetch messages from server using users userid

        recyclerView=(RecyclerView)findViewById(R.id.message_rv);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        messageItemsArrayList=new ArrayList<>();
        messageItemsArrayList.add(new MessageItems(0,"GLOBAL ELECTRONICS","No Problem Sir. Will update Soon.","2","5",false));
        messageItemsArrayList.add(new MessageItems(1,"GLOBAL ELECTRONICS","No Problem Sir. Will update Soon.","2","0",true));
        messageItemsArrayList.add(new MessageItems(2,"GLOBAL ELECTRONICS","No Problem Sir. Will update Soon.","3","0",false));
        messageItemsArrayList.add(new MessageItems(3,"GLOBAL ELECTRONICS","No Problem Sir. Will update Soon.","4","0",false));
        messageItemsArrayList.add(new MessageItems(4,"GLOBAL ELECTRONICS","No Problem Sir. Will update Soon.","5","0",true));
        messageItemsArrayList.add(new MessageItems(5,"GLOBAL ELECTRONICS","No Problem Sir. Will update Soon.","6","2",false));
        messageItemsArrayList.add(new MessageItems(6,"GLOBAL ELECTRONICS","No Problem Sir. Will update Soon.","7","3",false));
        messageItemsArrayList.add(new MessageItems(7,"GLOBAL ELECTRONICS","No Problem Sir. Will update Soon.","8","0",false));
        messageItemsArrayList.add(new MessageItems(8,"GLOBAL ELECTRONICS","No Problem Sir. Will update Soon.","2","0",false));
        messageItemsArrayList.add(new MessageItems(9,"GLOBAL ELECTRONICS","No Problem Sir. Will update Soon.","9","0",false));

        recyclerView.setAdapter(new MessageItemAdapter(this,messageItemsArrayList));

    }

}
