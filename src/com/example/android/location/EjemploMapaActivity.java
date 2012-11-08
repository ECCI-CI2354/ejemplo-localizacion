package com.example.android.location;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class EjemploMapaActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_mapa);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_ejemplo_mapa, menu);
        return true;
    }
}
