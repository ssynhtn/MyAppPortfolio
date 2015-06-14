package com.ssynhtn.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button mSpotifyButton;
    private Button mScoresButton;
    private Button mLibraryButton;
    private Button mBuildItButton;
    private Button mXyzReaderButton;
    private Button mCapstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotifyButton = (Button) findViewById(R.id.button_spotify);
        mScoresButton = (Button) findViewById(R.id.button_scores);
        mLibraryButton = (Button) findViewById(R.id.button_library);
        mBuildItButton = (Button) findViewById(R.id.button_build_it);
        mXyzReaderButton = (Button) findViewById(R.id.button_xyz_reader);
        mCapstoneButton = (Button) findViewById(R.id.button_capstone);

        mSpotifyButton.setOnClickListener(this);
        mScoresButton.setOnClickListener(this);
        mLibraryButton.setOnClickListener(this);
        mBuildItButton.setOnClickListener(this);
        mXyzReaderButton.setOnClickListener(this);
        mCapstoneButton.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        String toast = null;
        if(v == mSpotifyButton) {
            toast = getString(R.string.toast_spotify);
        } else if(v == mScoresButton) {
            toast = getString(R.string.toast_scores);
        } else if(v == mLibraryButton) {
            toast = getString(R.string.toast_library);
        } else if(v == mBuildItButton) {
            toast = getString(R.string.toast_build_it);
        } else if(v == mXyzReaderButton) {
            toast = getString(R.string.toast_xyz_reader);
        } else if(v == mCapstoneButton) {
            toast = getString(R.string.toast_capstone);
        }

        if(toast != null) {
            Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        }
    }
}
