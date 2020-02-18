package com.example.mdcontextualmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPress = findViewById(R.id.btnPress);
        //Button is a View Object
        registerForContextMenu(btnPress);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //First of all we create a menu.xml file.
        //After create the menu.xml file here let's say

        getMenuInflater().inflate(R.menu.my_menu,menu);
        //If you run this app after write this code,your "Press me" Button have a menu.
        //If you press on one or two second,you can see this menu.

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.color_blue:
                Toast.makeText(MainActivity.this,"Color Blue is selected.",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.color_green:
                Toast.makeText(MainActivity.this,"Color Green is selected.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.color_red:
                Toast.makeText(MainActivity.this,"Color Red is selected.",Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onContextItemSelected(item);
    }
}
