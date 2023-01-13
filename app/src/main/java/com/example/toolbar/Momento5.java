package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Momento5 extends AppCompatActivity {
    Toolbar toolbar5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_momento5);

        toolbar5=findViewById(R.id.toolbar5);
        //Metodo para reemplazar el action bar
        setSupportActionBar(toolbar5);

        ActionBar myActionBar = getSupportActionBar();



        if (myActionBar !=null){
            myActionBar.setDisplayHomeAsUpEnabled(true);

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.siguiente:
                Intent i = new Intent(Momento5.this, Momento4.class);
                startActivity(i);
                return true;
            case R.id.atras:
                Intent i2 = new Intent(Momento5.this, MainActivity.class);
                startActivity(i2);
            default:
                return true;
        }
    }
}
