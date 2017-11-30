package com.example.hpfolio.dialogs;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Storage extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        textView = (TextView)findViewById(R.id.tvData);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.hpfolio.dialogs", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("myKey","ab cde fg ").apply();

        String myStoredDatainSharedPreferences = sharedPreferences.getString("myKey","");
        textView.setText(myStoredDatainSharedPreferences);
    }
}
