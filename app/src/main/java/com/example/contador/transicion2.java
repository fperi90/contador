package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class transicion2 extends AppCompatActivity {
    public static String TAG = "MENSAJE DE onTouch.";
    View panel;
    TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transicion2);
        txtMessage = (TextView) findViewById(R.id.textViewTransition2);
        panel = (View) findViewById(R.id.viewToTouch);
        panel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        txtMessage.setText("Estas usando el touch.");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        txtMessage.setText("El touch se ha desplazado.");
                        break;
                    case MotionEvent.ACTION_UP:
                        txtMessage.setText("El touch se ha levantado.");
                        break;
                }
                return true;
            }
        });
    }

}