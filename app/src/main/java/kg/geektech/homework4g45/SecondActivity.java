package kg.geektech.homework4g45;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<CountryModel> countryModels;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = findViewById(R.id.activity_second_recyclerView);
        loadData();
        recyclerView.setAdapter(new CountryAdapter(countryModels, null));
    }

    private void loadData() {
        countryModels = new ArrayList<>();
        switch (getIntent().getIntExtra("WhatIsContinent", 6)) {
            case 0:
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_caf_ao), "Angola"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_caf_er), "Eritrea"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_caf_lr), "Liberia"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_caf_mg), "Madagascar"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_caf_ro), "Chad"));
                return;
            case 1:
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_cas_cn), "China"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_cas_in), "India"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_cas_pk), "Pakistan"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_cas_th), "Thailand"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_cas_vn), "Vietnam"));
                return;
            case 2:
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_ceu_ch), "Sweden"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_ceu_de), "Germany"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_ceu_fr), "France"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_ceu_gb), "Great Britain"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_ceu_it), "Italy"));
                return;
            case 3:
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_cna_ca), "Canada"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_cna_jm), "Jamaica"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_cna_us), "USA"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_cna_uy), "Uruguay"));
                return;
            case 4:
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_coc_au), "Australia"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_coc_fj), "Fiji"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_coc_nz), "New Zealand"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_coc_pg), "Papua New Guinea"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_coc_ws), "Samoa"));
                return;
            case 5:
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_csa_ar), "Argentine"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_csa_br), "Brazil"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_csa_cl), "Chili"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_csa_co), "Columbia"));
                countryModels.add(new CountryModel(AppCompatResources.getDrawable(this, R.drawable.ic_csa_pe), "Peru"));
                return;
            case 6: finish();
        }
    }

}