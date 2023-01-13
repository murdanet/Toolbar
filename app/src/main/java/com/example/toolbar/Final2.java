package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Final2 extends AppCompatActivity {
    Toolbar toolbarfinal2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final2);
        toolbarfinal2 = findViewById(R.id.toolbarfinal2);
        //Metodo para reemplazar el action bar
        setSupportActionBar(toolbarfinal2);

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
                Intent i = new Intent(Final2.this, MainActivity.class);
                startActivity(i);
                return true;
            case R.id.atras:
                Intent i2 = new Intent(Final2.this, Final.class);
                startActivity(i2);
            default:
                return true;
        }
    }
}
