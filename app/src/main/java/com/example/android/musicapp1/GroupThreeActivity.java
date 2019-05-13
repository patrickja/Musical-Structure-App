package com.example.android.musicapp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GroupThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        ArrayList<Album> Albums = new ArrayList<Album>();

        Albums.add(new Album("Stand Up and Be Strong", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Lately", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Crazy Mixed Up World", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("All Is Well", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Bus Named Desire", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Whatcha Need", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Standing Water", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Success Is Not So Sweet", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("The Great Exaggerator", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Oxygen", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Good For You", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Slowly Rising", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Fearless Leader (Hidden Track)", "Record: The Silver Lining 2006", R.drawable.play1, R.drawable.purchase1));

        AlbumAdapter adapter =
                new AlbumAdapter(this, Albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
