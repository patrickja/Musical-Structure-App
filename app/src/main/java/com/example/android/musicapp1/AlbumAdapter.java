package com.example.android.musicapp1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(Activity context, ArrayList<Album> Albums) {

        super(context, 0, Albums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Album currentAlbum = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.songTitle);
        songTextView.setText(currentAlbum.getSongName());

        TextView albumTextView = (TextView) listItemView.findViewById(R.id.albumTitle);
        albumTextView.setText(currentAlbum.getAlbumName());

        ImageView imageOneImageView = (ImageView) listItemView.findViewById(R.id.imageOne);
        imageOneImageView.setImageResource(currentAlbum.getImageResourceId1());

        ImageView imageTwoImageView = (ImageView) listItemView.findViewById(R.id.imageTwo);
        imageTwoImageView.setImageResource(currentAlbum.getImageResourceId2());

        return listItemView;
    }
}
