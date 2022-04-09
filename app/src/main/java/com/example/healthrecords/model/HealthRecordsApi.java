package com.example.healthrecords.model;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface HealthRecordApi {
    @GET("TranNhuTri/data/main/infor.json")
    Single<List<HealthRecord>> getHealthRecords();
}
