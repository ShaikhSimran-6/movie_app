package com.example.android;

import android.content.Intent;

import com.example.android.model.Movie;

public class AndroidUtil {
    public static  void passModelIntent(Intent intent, Movie model)
    {

        intent.putExtra("vote",model.getVoteAverage());
        intent.putExtra("title",model.getTitle());
        intent.putExtra("poster",model.getPosterPath());
        intent.putExtra("overview",model.getOverview());
        intent.putExtra("date",model.getReleaseDate());
    }

    public static  Movie getModelFromIntent(Intent intent)
    {
        Movie model=new Movie();
        model.setVoteAverage(intent.getStringExtra("vote"));
        model.setPosterPath(intent.getStringExtra("poster"));
        model.setOverview(intent.getStringExtra("overview"));
        model.setTitle(intent.getStringExtra("title"));
        model.setReleaseDate(intent.getStringExtra("date"));
        return model;
    }
}
