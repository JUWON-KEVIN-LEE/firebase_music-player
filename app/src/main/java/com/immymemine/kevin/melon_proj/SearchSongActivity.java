package com.immymemine.kevin.melon_proj;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class SearchSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_song);
        Toolbar toolbar = findViewById(R.id.toolBar);
        toolbar.setTitle("검색");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_commom, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemIndex=item.getItemId();
        if(itemIndex==R.id.action_exit){
            Intent intent=new Intent();
            setResult(MainActivity.RESULT_OK_SEARCH,intent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
