package com.example.androidtask1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserService {
    @GET("users")
    Call<List<UserResponse>> getAllUsers();

    @POST("users/authenticate")
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);
}
