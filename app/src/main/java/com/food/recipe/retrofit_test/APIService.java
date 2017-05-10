package com.food.recipe.retrofit_test;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by pc on 5/10/2017.
 */

public interface APIService {
    @GET("recipe_api.php")
    Call<List<Recipe_model>> getUserData();

}
