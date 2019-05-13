package com.example.android.musicapp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView groupOne = findViewById(R.id.groupOne);

        groupOne.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent groupOneIntent = new Intent(MainActivity.this, GroupOneActivity.class);

                startActivity(groupOneIntent);
            }


        });

        TextView groupTwo = findViewById(R.id.groupTwo);

        groupTwo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent groupTwoIntent = new Intent(MainActivity.this, GroupTwoActivity.class);

                startActivity(groupTwoIntent);
            }


        });

        TextView groupThree = findViewById(R.id.groupThree);

        groupThree.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent groupThreeIntent = new Intent(MainActivity.this, GroupThreeActivity.class);

                startActivity(groupThreeIntent);
            }
        });
    }
}
