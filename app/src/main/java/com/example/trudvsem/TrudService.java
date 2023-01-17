package com.example.trudvsem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface TrudService {
    // GET v1/vacancies/region/:region_code

    @GET("/v1/vacancies/region/{region_code}")
    Call<List<Vacancies>> getVacancies (
            @Path("region_code") String region_code,
            @Path("source") String source,
            @Path("name") String company_name,
            @Path("job_name") String job_name);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://opendata.trudvsem.ru/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
