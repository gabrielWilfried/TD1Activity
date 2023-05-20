package com.example.td1activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // displaying the the msg "the main activity was created"
        Log.i("MainActivity", "The main activity was created");
    }
    //Using the class MenuInflater in the onCreateOptionsMenu function to create menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_item1:
                Log.d("Menu", ""+item.getTitle().toString()+" selected ");
                return true;
            case R.id.menu_item2:
                Log.d("Menu", ""+item.getTitle().toString()+" selected ");
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}