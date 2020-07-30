package com.example.syedabdullah.qrbarcodescanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;


public class StartActivity extends Activity {
RatingBar myrating;
Button startscanning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    startscanning=findViewById(R.id.scan);
    myrating=findViewById(R.id.myratingbar);

    myrating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
            Toast.makeText(getApplicationContext(),"You rated us "+v+"",Toast.LENGTH_SHORT).show();
        }
    });


    startscanning.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);

        }
    });
    }




}
