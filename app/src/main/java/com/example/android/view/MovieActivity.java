package com.example.android.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.android.AndroidUtil;
import com.example.android.R;
import com.example.android.databinding.ActivityMovieBinding;
import com.example.android.model.Movie;

public class MovieActivity extends AppCompatActivity {

    private Movie movie;
    private ActivityMovieBinding activityMovieBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);


//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        activityMovieBinding = DataBindingUtil.setContentView(this, R.layout.activity_movie);




            movie = AndroidUtil.getModelFromIntent(getIntent());
            activityMovieBinding.setMovie(movie);
//          getSupportActionBar().setTitle((movie.getTitle()));
        }


}