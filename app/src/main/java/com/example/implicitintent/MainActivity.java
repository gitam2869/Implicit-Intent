package com.example.implicitintent;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "textMessage");
        sendIntent.setType("text/plain"); // ""text/plain"" MIME type

        if (sendIntent.resolveActivity(getPackageManager()) != null)
            startActivity(sendIntent);
        else {
            //notify user
        }
    }
}