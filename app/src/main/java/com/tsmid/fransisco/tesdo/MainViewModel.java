package com.tsmid.fransisco.tesdo;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;


import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<List<model>> mainItemLiveData;
    private static final String TAG = "MainViewModel";

    public MainViewModel() {
        super();
        mainItemLiveData = new MutableLiveData<>();
    }

    public MutableLiveData<List<model>> getData(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit=
                new Retrofit.Builder()
                        .baseUrl("http://101.50.3.189/brt-api/index.php/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(client)
                        .build();
        Interface requestInterface=retrofit.create(Interface.class);
        Call<List<model>> call = requestInterface.getJSON();
        call.enqueue(new Callback<List<model>>() {
            @Override
            public void onResponse(Call<List<model>> call, Response<List<model>> response) {
                Log.i(TAG, "onResponse: "+response.body().get(0).getSaleTeamId());
                mainItemLiveData.postValue(response.body());
            }

            @Override
            public void onFailure(Call<List<model>> call, Throwable t) {
                Log.e(TAG, "onFailure: "+t.getMessage());
            }
        });

        return mainItemLiveData;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
