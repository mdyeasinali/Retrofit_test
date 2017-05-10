package com.food.recipe.retrofit_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getUserList();
    }
    private void getUserList() {
        try {
            APIService service = ApiClient.getRetrofit().create(APIService.class);
            Call<List<Recipe_model>> call = service.getUserData();

            call.enqueue(new Callback<List<Recipe_model>>() {
                @Override
                public void onResponse(Call<List<Recipe_model>> call, Response<List<Recipe_model>> response) {
                    //Log.d("onResponse", response.message());

                    List<Recipe_model> userList = response.body();
                    layoutManager = new LinearLayoutManager(MainActivity.this);

                    RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler);
                    recyclerView.setLayoutManager(layoutManager);

                    RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(userList);

                    recyclerView.setAdapter(recyclerViewAdapter);


                }

                @Override
                public void onFailure(Call<List<Recipe_model>> call, Throwable t) {

                }
            });
        }catch (Exception e) {}
    }
}
