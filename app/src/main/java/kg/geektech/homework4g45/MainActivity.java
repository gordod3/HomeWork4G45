package kg.geektech.homework4g45;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<CountryModel> countryModels;
    public final static String MAIN_ACTIVITY_INT_WHAT_IS_CONTINENT = "WhatIsContinent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.activity_main_recyclerView);
        recyclerView.setAdapter(new CountryAdapter(countryModels));
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(MAIN_ACTIVITY_INT_WHAT_IS_CONTINENT, 2);
        startActivity(intent);
    }

    private void loadData() {
        countryModels = new ArrayList<>();
        countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_caf), "CAF"));
        countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_cas), "CAS"));
        countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_ceu), "CEU"));
        countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_cna), "CNA"));
        countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_coc), "COC"));
        countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_csa), "CSA"));
    }
}