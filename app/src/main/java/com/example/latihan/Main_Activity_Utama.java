package com.example.latihan;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Main_Activity_Utama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main___utama);
    }
    public void signup(View view){
        Intent intent = new Intent(Main_Activity_Utama.this, Home.class);
        startActivity(intent);
    }
//    txt.setOnClickListener(new View.OnClickListener(){
//       @Override
//       public void onClick(View v){
//
//        }
//    });

//    txt.setOnClickListener (new View.OnClickListener(){
//        @Override
//                public void onClick(View v){
//            Intent i = new Intent (MainActivity.this, Activity_Kedua.class);
//            startActivity(i);
//        }
//    });
}
