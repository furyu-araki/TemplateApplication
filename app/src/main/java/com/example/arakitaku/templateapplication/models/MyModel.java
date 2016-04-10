package com.example.arakitaku.templateapplication.models;

import com.example.arakitaku.templateapplication.models.dto.GitHubApiResponse;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * 自作のモデル
 */
public class MyModel {

    Retrofit retrofit;

    @Inject
    MyModel(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public Observable<List<GitHubApiResponse.Repository>> search(String query) {
        return retrofit.create(SearchApi.class).searchRepositories("takuaraki");
    }


    public interface SearchApi {
        @GET("/users/{user}/repos")
        Observable<List<GitHubApiResponse.Repository>> searchRepositories(@Path("user") String userName);
    }

}
