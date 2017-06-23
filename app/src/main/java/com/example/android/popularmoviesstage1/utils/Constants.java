package com.example.android.popularmoviesstage1.utils;

import com.example.android.popularmoviesstage1.BuildConfig;

/**
 * Created by ibnumuzzakkir on 15/06/2017.
 * Android Developer
 * Garena Indonesia
 */

public class Constants {
    public static String BASE_URL = "https://api.themoviedb.org/3/";
    public static String TOKEN =  BuildConfig.THE_MOVIE_DB_API_KEY;
    public static String BASE_URL_IMAGE = "http://image.tmdb.org/t/p/w185/";
    public static String BASE_URL_IMAGE_BACKDROP = "http://image.tmdb.org/t/p";

    public interface SORT_TYPE{
        int POPULAR_MOVIES = 0;
        int TOP_RATED_MOVIES = 1;
    }
}