package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Momento2 extends AppCompatActivity {
    Toolbar toolbar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_momento2);
        toolbar2 = findViewById(R.id.toolbar2);
        //Metodo para reemplazar el action bar
        setSupportActionBar(toolbar2);

        ActionBar myActionBar = getSupportActionBar();

        if (myActionBar != null) {
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
                Intent i = new Intent(Momento2.this, Momento1.class);
                startActivity(i);
                return true;
            case R.id.atras:
                Intent i2 = new Intent(Momento2.this, Momento3.class);
                startActivity(i2);
            default:
                return true;
        }
    }
}
