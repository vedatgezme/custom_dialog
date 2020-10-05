package com.kronosapp.sqldersleri;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.view.WindowManager;



public class Activity extends AppCompatActivity  {

 
    CardView remainmeLater, rateUs,dontShow;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
     setContentView(R.layout.activity_ilk_ekran);
     Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
     setSupportActionBar(toolbar);
     
     showDiaglog();
     
    }


    private  void showDiaglog()
    {
        final AlertDialog.Builder builder = new AlertDialog.Builder(ilk_ekran.this);
        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_dialog, viewGroup, false);

        remainmeLater = (CardView) dialogView.findViewById(R.id.remainmeLater);
        dontShow = (CardView) dialogView.findViewById(R.id.dontShow);
        rateUs = (CardView) dialogView.findViewById(R.id.rateUs);

        builder.setView(dialogView);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();

        remainmeLater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                // WHEN "CANCEL" Clicked
                alertDialog.cancel();
            }
        });
        dontShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                // WHEN "DONT SHOW AGAİN" Clicked
                alertDialog.cancel();
            }
        });

        rateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                alertDialog.cancel();
                // WHEN RATE US Clicked
            }
        });
    }

}

