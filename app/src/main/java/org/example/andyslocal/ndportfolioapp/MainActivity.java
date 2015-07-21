package org.example.andyslocal.ndportfolioapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Button spotifyButton;
    private Button scoresButton;
    private Button libraryButton;
    private Button buildItButton;
    private Button xyzButton;
    private Button capstoneButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyButton = (Button) findViewById(R.id.spotifyButton);

        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Spotify App Coming Soon", Toast.LENGTH_LONG).show();
            }
        });


        Button scoresButton = (Button) findViewById(R.id.scoresButton);

        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Football Scores App Coming Soon", Toast.LENGTH_LONG).show();
            }
        });

        Button libraryButton = (Button) findViewById(R.id.libraryButton);

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "library App Coming Soon", Toast.LENGTH_LONG).show();
            }
        });

        Button buildItButton = (Button) findViewById(R.id.buildItButton);

        buildItButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Build It Better App Coming Soon", Toast.LENGTH_LONG).show();
            }
        });

        Button xyzButton = (Button) findViewById(R.id.xyzButton);

        xyzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "XYZ Reader App Coming Soon", Toast.LENGTH_LONG).show();
            }
        });

        Button capstoneButton = (Button) findViewById(R.id.capstoneButton);

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "capstone App Coming Soon. Will be awesome!", Toast.LENGTH_LONG).show();
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
