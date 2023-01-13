package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Momento1 extends AppCompatActivity {
    Toolbar toolbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_momento1);
        toolbar1 = findViewById(R.id.toolbar1);

        //Metodo para reemplazar el action bar
        setSupportActionBar(toolbar1);

        ActionBar myActionBar = getSupportActionBar();



        if (myActionBar != null) {
            myActionBar.setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.siguiente:
                Intent i = new Intent(Momento1.this, Final.class);
                startActivity(i);
                return true;
            case R.id.atras:
                Intent i2 = new Intent(Momento1.this, Momento2.class);
                startActivity(i2);
            default:
                return true;
        }
    }
}