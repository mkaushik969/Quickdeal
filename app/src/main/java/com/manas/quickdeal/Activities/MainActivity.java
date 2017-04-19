package com.manas.quickdeal.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.manas.quickdeal.Adapters.MainMenuAdapter;
import com.manas.quickdeal.Models.MainMenuItem;
import com.manas.quickdeal.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<MainMenuItem> mainMenuItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        setUpRecyclerView();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }

    private void setUpRecyclerView()
    {
        recyclerView=(RecyclerView)findViewById(R.id.main_rv);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);

        mainMenuItems=new ArrayList<>();
        mainMenuItems.add(new MainMenuItem(0,"APPAREL, TEXTILES & ACCESSORIES",R.drawable.ic_appareel));
        mainMenuItems.add(new MainMenuItem(1,"AUTO & TRANSPORTATION",R.drawable.ic_auto));
        mainMenuItems.add(new MainMenuItem(2,"ELECTRONIC & APPLICANCES",R.drawable.ic_electronics));
        mainMenuItems.add(new MainMenuItem(3,"HARDWARE 7 TOOLS",R.drawable.ic_hardware));
        mainMenuItems.add(new MainMenuItem(4,"APPAREL, TEXTILES & ACCESSORIES",R.drawable.ic_appareel));
        mainMenuItems.add(new MainMenuItem(5,"AUTO & TRANSPORTATION",R.drawable.ic_auto));
        mainMenuItems.add(new MainMenuItem(6,"ELECTRONIC & APPLICANCES",R.drawable.ic_electronics));
        mainMenuItems.add(new MainMenuItem(7,"HARDWARE 7 TOOLS",R.drawable.ic_hardware));
        mainMenuItems.add(new MainMenuItem(8,"APPAREL, TEXTILES & ACCESSORIES",R.drawable.ic_appareel));
        mainMenuItems.add(new MainMenuItem(9,"AUTO & TRANSPORTATION",R.drawable.ic_auto));
        mainMenuItems.add(new MainMenuItem(10,"ELECTRONIC & APPLICANCES",R.drawable.ic_electronics));
        mainMenuItems.add(new MainMenuItem(11,"HARDWARE 7 TOOLS",R.drawable.ic_hardware));

        recyclerView.setAdapter(new MainMenuAdapter(this,mainMenuItems));

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
