package com.tsmid.fransisco.tesdo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface {

    @GET("res_users?login=ardo15.project@gmail.com")
    Call<List<model>> getJSON();
}
