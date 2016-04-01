package com.bitshifters.rohit.myappportfolio;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.btn_spotify_streamer_app) protected Button mSpofityStreamer;
    @Bind(R.id.btn_scores_app) protected Button mScores;
    @Bind(R.id.btn_library_app) protected Button mLibrary;
    @Bind(R.id.btn_build_it_bigger) protected Button mBuildItBigger;
    @Bind(R.id.btn_xyz_reader_app) protected Button mXYZReader;
    @Bind(R.id.btn_my_own_app) protected Button mCapstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding all views
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_spotify_streamer_app, R.id.btn_scores_app, R.id.btn_library_app,
            R.id.btn_build_it_bigger, R.id.btn_xyz_reader_app, R.id.btn_my_own_app})
    protected void onClick(View v){
        Log.v(TAG,"onClick");
        Resources resources = getResources();
        String commonText = "This button will launch my ";
        String toastText;
        switch (v.getId()){
            case R.id.btn_spotify_streamer_app:
                toastText = commonText + resources.getString(R.string.spotify_streamer_app);
                Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_scores_app:
                toastText = commonText + resources.getString(R.string.scores_app);
                Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_library_app:
                toastText = commonText + resources.getString(R.string.library_app);
                Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_build_it_bigger:
                toastText = commonText + resources.getString(R.string.build_it_bigger_app);
                Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_xyz_reader_app:
                toastText = commonText + resources.getString(R.string.xyz_reader_app);
                Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_my_own_app:
                toastText = commonText + resources.getString(R.string.my_own_app);
                Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
