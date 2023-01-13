package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Miguel Urdaneta
    //Defino una variable Toolbar
     Toolbar toolbar1;
     MediaPlayer mysong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Referencia al toolbar
        setContentView(R.layout.activity_main);
        toolbar1=findViewById(R.id.toolbar1);
        //Metodo para reemplazar el action bar
        setSupportActionBar(toolbar1);

        ActionBar myActionBar = getSupportActionBar();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mysong= MediaPlayer.create(MainActivity.this,R.raw.hotlinebling);
        mysong.start();

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
        switch (item.getItemId()){
            case R.id.siguiente:
                Intent i = new Intent (MainActivity.this, Momento5.class);
                startActivity(i);
                return true;
            case R.id.atras:
                Toast.makeText(MainActivity.this,"No puedes volver tras",Toast.LENGTH_LONG);
            default:
                return true;
        }

    }
}