package com.rynfar.work2;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show();
        Log.d("sss","onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show();
        Log.d("sss","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show();
        Log.d("sss","onResume");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show();
        Log.d("sss","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
        Log.d("sss","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show();
        Log.d("sss","onRestart");
    }
}

