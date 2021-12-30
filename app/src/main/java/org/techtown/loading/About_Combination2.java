package org.techtown.loading;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class About_Combination2 extends AppCompatActivity {
    public static TextView resulttextview;

    Button ReviewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__combination2);


        ReviewButton = findViewById(R.id.ReviewButton);


        ReviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About_Combination2.this, Health_review.class);
                startActivity(intent);
            }
        });
    }
}
