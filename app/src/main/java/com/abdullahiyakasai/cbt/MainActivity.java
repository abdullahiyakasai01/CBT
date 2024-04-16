package com.abdullahiyakasai.cbt;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void main_btn(View view) {
        int id = view.getId();  // Get the ID of the view that was clicked

        if (id == R.id.btn_play) {
            // Start the playActivity if the play button is clicked
            startActivity(new Intent(MainActivity.this, playActivity.class));
        } else if (id == R.id.btn_setting) {
            // Start the settingActivity if the setting button is clicked
            startActivity(new Intent(MainActivity.this, settingActivity.class));
        } else if (id == R.id.btn_exit) {
            // Close the application if the exit button is clicked
            finishAffinity();
        }
    }
}
