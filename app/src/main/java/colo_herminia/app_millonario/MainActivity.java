package colo_herminia.app_millonario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dashboardButtonClicked(View v) {

        // Intent object to launch the related activity
        Intent intent = null;

        // Determine the activity to launch according to the Id of the Button clicked
        switch (v.getId()) {

            // Activity for getting a new quotation and adding it to favourites
            case R.id.bPlay:
                intent = new Intent(this, PlayActivity.class);
                startActivity(intent);
                break;

            // Activity for displaying and managing the favourite quotations
            case R.id.bScores:
                intent = new Intent(this, ScoresActivity.class);
                startActivity(intent);
                break;

            // Activity for configuring the application
            case R.id.bSettings:
                intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                break;

        }

        // Launch the required activity
        if (intent != null) {
            startActivity(intent);
        }
    }
}
