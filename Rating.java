package com.example.arunesh.signupactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class Rating extends AppCompatActivity {

    RatingBar rb;
    TextView val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        rb=(RatingBar)findViewById(R.id.rtb);
        val=(TextView)findViewById(R.id.rater);

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                val.setText("You rated "+rating);
            }
        });
    }
}
