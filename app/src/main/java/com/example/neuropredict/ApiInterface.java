package com.example.neuropredict;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("/signup")
    Call<User> getUserInformation(@Field("patient_id") String patient_id);




}
