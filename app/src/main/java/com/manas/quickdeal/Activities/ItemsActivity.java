package com.manas.quickdeal.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.manas.quickdeal.Adapters.ItemsAdapter;
import com.manas.quickdeal.Models.Items;
import com.manas.quickdeal.R;

import java.util.ArrayList;

public class ItemsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Items> itemsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(getIntent().getStringExtra("name"));
        int mainId=getIntent().getIntExtra("id",0);
        setUpRecyclerView(mainId);

    }

    private void setUpRecyclerView(int mainId)
    {
        //fetch items from server using mainId

        recyclerView=(RecyclerView)findViewById(R.id.items_rv);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        itemsArrayList=new ArrayList<>();
        itemsArrayList.add(new Items(0,"LIGHTS AND LIGHTNING PRODUCTS"));
        itemsArrayList.add(new Items(1,"LIGHTS AND LIGHTNING PRODUCTS"));
        itemsArrayList.add(new Items(2,"LIGHTS AND LIGHTNING PRODUCTS"));
        itemsArrayList.add(new Items(3,"LIGHTS AND LIGHTNING PRODUCTS"));
        itemsArrayList.add(new Items(4,"LIGHTS AND LIGHTNING PRODUCTS"));
        itemsArrayList.add(new Items(5,"LIGHTS AND LIGHTNING PRODUCTS"));
        itemsArrayList.add(new Items(6,"LIGHTS AND LIGHTNING PRODUCTS"));
        itemsArrayList.add(new Items(7,"LIGHTS AND LIGHTNING PRODUCTS"));
        itemsArrayList.add(new Items(8,"LIGHTS AND LIGHTNING PRODUCTS"));
        itemsArrayList.add(new Items(9,"LIGHTS AND LIGHTNING PRODUCTS"));
        itemsArrayList.add(new Items(10,"LIGHTS AND LIGHTNING PRODUCTS"));

        recyclerView.setAdapter(new ItemsAdapter(this,itemsArrayList));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        int id = item.getItemId();

        if (id == R.id.action_messages) {
            startActivity(new Intent(this,MessageActivity.class));
            return true;
        }
        else if(id==R.id.action_profile)
        {

        }
        return true;
    }

}
