package com.geniusnine.android.clanguage.RatingApp;
//calling ratingbar view
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.geniusnine.android.clanguage.R;

public class Rating extends AppCompatActivity {
RatingBar ratingBarr;
    Button ratingbarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        ratingBarr=(RatingBar)findViewById(R.id.ratingBar);
        ratingbarButton=(Button)findViewById(R.id.ratingbutton);
        ratingbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating=String.valueOf(ratingBarr.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
