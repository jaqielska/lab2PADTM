package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda OnCreate");
        //Toast.makeText(this, "Metoda onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda OnStart");
        //Toast.makeText(this, "Metoda onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda OnResume");
        //Toast.makeText(this, "Metoda onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda OnPause");
        Toast.makeText(this, "Metoda OnPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda OnStop");

    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda OnRestart");

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda OnDestroy");

    }
}
