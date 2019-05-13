package com.example.android.musicapp1;

public class Album {

    private String mSongName;

    private String mAlbumName;

    private int mImageResourceId1;

    private int mImageResourceId2;

    public Album(String SongName, String AlbumName, int imageResourceId1, int imageResourceId2) {
        mSongName = SongName;
        mAlbumName = AlbumName;
        mImageResourceId1 = imageResourceId1;
        mImageResourceId2 = imageResourceId2;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public int getImageResourceId1() {
        return mImageResourceId1;
    }

    public int getImageResourceId2() {
        return mImageResourceId2;
    }
}