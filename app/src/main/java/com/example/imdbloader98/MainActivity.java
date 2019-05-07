package com.example.imdbloader98;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.imdbloader98.pojo.IMDB;
import com.example.imdbloader98.retrofit.RetrofitAPIInterface;
import com.example.imdbloader98.retrofit.RetrofitServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_Net = findViewById(R.id.btn_Net);
        btn_Net.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("register", "onResponse: one");
                RetrofitAPIInterface client = RetrofitServiceGenerator.createService(RetrofitAPIInterface.class);
                Log.d("register", "onResponse: TWO");
                //Get Register element
                Call<IMDB> imdbCall = client.IMDB_CALL("sky","77d67210");
                imdbCall.enqueue(new Callback<IMDB>() {
                    @Override
                    public void onResponse(Call<IMDB> call, Response<IMDB> response) {
                        Toast.makeText(MainActivity.this, "accept", Toast.LENGTH_SHORT).show();
                        Log.d("register", "onResponse: ACCEPT");
                    }

                    @Override
                    public void onFailure(Call<IMDB> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "fail", Toast.LENGTH_SHORT).show();
                        Log.d("register", "onResponse: FOUR");
                    }
                });
            }
        });


    }
}
