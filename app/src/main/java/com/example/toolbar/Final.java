package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Final extends AppCompatActivity {
    Toolbar toolbarfinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        toolbarfinal=findViewById(R.id.toolbarfinal);
        //Metodo para reemplazar el action bar
        setSupportActionBar(toolbarfinal);

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
                Intent i = new Intent(Final.this, Final2.class);
                startActivity(i);
                return true;
            case R.id.atras:
                Intent i2 = new Intent(Final.this, Momento1.class);
                startActivity(i2);
            default:
                return true;
        }
    }
}