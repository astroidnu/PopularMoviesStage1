package com.example.android.popularmovies.repository;

import com.example.android.popularmovies.api.ApiWrapper;
import com.example.android.popularmovies.api.NetworkService;
import com.example.android.popularmovies.data.Movie;
import com.example.android.popularmovies.data.Review;
import com.example.android.popularmovies.data.Video;
import com.example.android.popularmovies.utils.Constants;
import com.example.android.popularmovies.vo.Resource;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by ibnumuzzakkir on 16/06/2017.
 * Android Developer
 * Garena Indonesia
 */

public class MainRepository extends BaseRepository {
    public MainRepository(NetworkService networkService) {
        super(networkService);
    }

    /**
     * Get Movies Data
     * @Param Sorting Type
     * */
    public Flowable<Resource<List<Movie>>> getMovies(String sort) {
        return networkService.getMoviesData(sort,Constants.TOKEN)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .map(ApiWrapper::fetchApi);
    }

    /**
     * Get Movie Trailer Data
     * @Param Movie ID
     * */
    public Flowable<Resource<List<Video>>> getVideos(String id){
        return networkService.getVideoData(id, Constants.TOKEN)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .map(ApiWrapper::fetchApi);
    }

    /**
     * Get Movie Review Data
     * @Param Movie ID
     * */

    public Flowable<Resource<List<Review>>> getReviews(String id){
        return networkService.getReviewData(id, Constants.TOKEN)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .map(ApiWrapper::fetchApi);
    }

}
