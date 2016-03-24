package com.bitshifters.rohit.myappportfolio;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = MainActivity.class.getSimpleName();
    private Button spotifyStreamer, scoresApp, libraryApp, buildItBiggerApp, xyzReaderApp, capstoneMyOwnApp;
    private Context context;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "onCreate Method");
        setContentView(R.layout.activity_main);
        //Calling initializeEverything Method
        initializeEverything();
    }

    private void initializeEverything(){
        Log.v(TAG,"initializeEverything Method");

        //Setting up context and resources
        context = getApplicationContext();
        resources = getResources();

        //Initializing all buttons
        spotifyStreamer = (Button) findViewById(R.id.btn_spotify_streamer_app);
        scoresApp = (Button) findViewById(R.id.btn_scores_app);
        libraryApp = (Button) findViewById(R.id.btn_library_app);
        buildItBiggerApp = (Button) findViewById(R.id.btn_build_it_bigger);
        xyzReaderApp = (Button) findViewById(R.id.btn_xyz_reader_app);
        capstoneMyOwnApp = (Button) findViewById(R.id.btn_my_own_app);

        //Setting up OnClickListers for all the buttons
        spotifyStreamer.setOnClickListener(this);
        scoresApp.setOnClickListener(this);
        libraryApp.setOnClickListener(this);
        buildItBiggerApp.setOnClickListener(this);
        xyzReaderApp.setOnClickListener(this);
        capstoneMyOwnApp.setOnClickListener(this);
    }

    //Click Events
    @Override
    public void onClick(View v) {
        Log.v(TAG, "onClick Method");
        String commonText = "This button will launch my ";
        String toastText;
        switch (v.getId()){
            case R.id.btn_spotify_streamer_app:
                toastText = commonText + resources.getString(R.string.spotify_streamer_app);
                Toast.makeText(context,toastText,Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_scores_app:
                toastText = commonText + resources.getString(R.string.scores_app);
                Toast.makeText(context,toastText,Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_library_app:
                toastText = commonText + resources.getString(R.string.library_app);
                Toast.makeText(context,toastText,Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_build_it_bigger:
                toastText = commonText + resources.getString(R.string.build_it_bigger_app);
                Toast.makeText(context,toastText,Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_xyz_reader_app:
                toastText = commonText + resources.getString(R.string.xyz_reader_app);
                Toast.makeText(context,toastText,Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_my_own_app:
                toastText = commonText + resources.getString(R.string.my_own_app);
                Toast.makeText(context,toastText,Toast.LENGTH_LONG).show();
                break;
        }
    }
}
