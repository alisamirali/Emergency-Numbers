package com.example.emergencynumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String police = "122";
    private String fire = "180";
    private String ambulance = "123";
    private String child = "16000";
    private String consumer = "19588";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void policeButton(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + police));
        startActivity(intent);
    }

    public void fireButton(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + fire));
        startActivity(intent);
    }

    public void ambulanceButton(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + ambulance));
        startActivity(intent);
    }

    public void childButton(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + child));
        startActivity(intent);
    }

    public void consumerButton(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + consumer));
        startActivity(intent);
    }
}