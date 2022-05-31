package com.zeljkostankovic.hftm_mobilde_development_course;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent abstractIntend = new Intent();
        abstractIntend.setAction(Intent.ACTION_SEND);
        abstractIntend.putExtra(Intent.EXTRA_TEXT,"Text von abstraktem Intent");
        abstractIntend.setType("text/plain");

        if(abstractIntend.resolveActivity(getPackageManager()) != null) {
            startActivity(abstractIntend);
        }
    }



}