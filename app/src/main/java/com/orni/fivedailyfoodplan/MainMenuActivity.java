package com.orni.fivedailyfoodplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainMenuActivity extends Activity {

    ImageButton ForKidsButton, ForAdultButton, ForOldButton, ForGainButton, ForLoseButton, ForExitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        initializeItems();
        setListener();
    }

    public void initializeItems() {
        ForKidsButton = (ImageButton) findViewById(R.id.imageButtonKids);
        ForAdultButton = (ImageButton) findViewById(R.id.imageButtonAdult);
        ForOldButton = (ImageButton) findViewById(R.id.imageButtonOld);
        ForGainButton = (ImageButton) findViewById(R.id.imageButtonGain);
        ForLoseButton = (ImageButton) findViewById(R.id.imageButtonLose);

    }

    public void setListener() {
        ForKidsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainIntent = new Intent(MainMenuActivity.this, FoodPlanForKidsActivity.class);
                startActivity(MainIntent);


            }
        });

        ForAdultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainIntent = new Intent(MainMenuActivity.this, FoodPlanForAdultActivity.class);
                startActivity(MainIntent);

            }
        });

        ForOldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainIntent = new Intent(MainMenuActivity.this, FoodPlanForOlderActivity.class);
                startActivity(MainIntent);


            }
        });

        ForGainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainIntent = new Intent(MainMenuActivity.this, FoodPlanForGainWeightActivity.class);
                startActivity(MainIntent);


            }
        });

        ForLoseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainIntent = new Intent(MainMenuActivity.this, FoodPlanForLoseWeightActivity.class);
                startActivity(MainIntent);


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_food_plan_for_older, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        System.exit(0);
    }
}
