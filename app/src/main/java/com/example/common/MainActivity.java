package com.example.common;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("CicloDeVida","OnCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("CicloDeVida", "OnStart");
        Toast.makeText(getApplicationContext(), "OnStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("CicloDeVida", "OnResume");
        Toast.makeText(getApplicationContext(), "OnResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("CicloDeVida", "OnPause");
        Toast.makeText(getApplicationContext(), "OnPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("CicloDeVida", "OnStop");
        Toast.makeText(getApplicationContext(), "OnStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("CicloDeVida", "OnRestart");
        Toast.makeText(getApplicationContext(), "OnRestart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("CicloDeVida", "OnDestroy");
        Toast.makeText(getApplicationContext(), "OnDestroy", Toast.LENGTH_LONG).show();
    }
}

//test