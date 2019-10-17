package com.example.landscape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int num;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("logo", "-------");
        Log.d("logo", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = 0;
        tv = findViewById(R.id.tv);
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d("logo", "onStart");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("logo", "onPause");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.d("logo", "onRestart");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d("logo", "onResume");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("logo", "onStop");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("logo", "onDestroy");
    }

    public void showToast(View view){
        Toast toast=Toast. makeText(getApplicationContext(),num + " Tostadas creadas.",Toast. LENGTH_SHORT);
        toast. setMargin(1,1);
        toast. show();
    }

    public void increase(View view) {
        num++;
        tv.setText(Integer.toString(num));
    }

}
