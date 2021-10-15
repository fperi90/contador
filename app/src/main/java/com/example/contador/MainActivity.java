package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static String TAG= "DEBUG TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this,transicion2.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: la app ha empezado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: la app se ha detenido");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: la app está en pausa");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: el proceso (app) se ha destruido.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: el proceso se ha vuelto a poner en marcha.");
    }

    public void sendMessage2(View view) {
        Intent intent = new Intent(this,transicion3.class);
        startActivity(intent);
    }
}