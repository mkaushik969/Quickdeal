package com.manas.quickdeal.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.manas.quickdeal.Models.Service;
import com.manas.quickdeal.R;
import com.manas.quickdeal.Adapters.ServiceAdapter;

import java.util.ArrayList;

public class ServicesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Service> services;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Services");
        setUpRecyclerView(getIntent().getIntExtra("id",0));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Create Message", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }

    private void setUpRecyclerView(int itemId)
    {
        //fetch services from server using itemId

        recyclerView=(RecyclerView)findViewById(R.id.services_rv);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        services=new ArrayList<>();
        services.add(new Service(0,"GLOBAL ELECTRONICS","0.8 km away"));
        services.add(new Service(1,"GLOBAL ELECTRONICS","0.8 km away"));
        services.add(new Service(2,"GLOBAL ELECTRONICS","0.8 km away"));
        services.add(new Service(3,"GLOBAL ELECTRONICS","0.8 km away"));
        services.add(new Service(4,"GLOBAL ELECTRONICS","0.8 km away"));
        services.add(new Service(5,"GLOBAL ELECTRONICS","0.8 km away"));
        services.add(new Service(6,"GLOBAL ELECTRONICS","0.8 km away"));
        services.add(new Service(7,"GLOBAL ELECTRONICS","0.8 km away"));
        services.add(new Service(8,"GLOBAL ELECTRONICS","0.8 km away"));
        services.add(new Service(9,"GLOBAL ELECTRONICS","0.8 km away"));

        recyclerView.setAdapter(new ServiceAdapter(this,services));

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
