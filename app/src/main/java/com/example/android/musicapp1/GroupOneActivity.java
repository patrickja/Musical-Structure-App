package com.example.android.musicapp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class  GroupOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        ArrayList<Album> Albums = new ArrayList<Album>();

        Albums.add(new Album("Karats", "Record: Paralysis 2004", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Toothpicks and Salt", "Record: Paralysis 2004", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Waiting", "Record: Paralysis 2004", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Angel", "Record: Paralysis 2004", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Spanish", "Record: Paralysis 2004", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Grey on Blue", "Record: Paralysis 2004", R.drawable.play1, R.drawable.purchase1));

        AlbumAdapter adapter =
                new AlbumAdapter(this, Albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}



