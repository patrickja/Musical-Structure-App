package com.example.android.musicapp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GroupTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        ArrayList<Album> Albums = new ArrayList<Album>();

        Albums.add(new Album("Closing Time", "Record: Feeling Strangely Fine 1998", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Singing in My Sleep", "Record: Feeling Strangely Fine 1998", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Made to Last", "Record: GFeeling Strangely Fine 1998", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Never You Mind", "Record: Feeling Strangely Fine 1998", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Secret Smile", "Record: Feeling Strangely Fine 1998", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("DND", "Record: Feeling Strangely Fine 1998", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Completely Pleased", "Record: Feeling Strangely Fine 1998", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("This Will Be My Year", "Record: Feeling Strangely Fine 1998", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("All Worked Out", "Record: Feeling Strangely Fine 1998", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("California", "Record: Feeling Strangely Fine 1998", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("She Spreads Her Wings", "Record: Feeling Strangely Fine 1998", R.drawable.play1, R.drawable.purchase1));
        Albums.add(new Album("Gone to the Movies", "Record: Feeling Strangely Fine 1998", R.drawable.play1, R.drawable.purchase1));

        AlbumAdapter adapter =
                new AlbumAdapter(this, Albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

