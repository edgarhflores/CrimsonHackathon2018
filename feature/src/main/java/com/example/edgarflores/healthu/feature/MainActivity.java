package com.example.edgarflores.healthu.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button create_profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        create_profile=(Button) findViewById(R.id.button2);
        create_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateProfile();

            }
        });



    }
    public void openCreateProfile(){
        Intent intent = new Intent(this, CreateProfile.class);
        startActivity (intent);
    }
}
