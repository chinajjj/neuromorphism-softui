package com.basel.softui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.basel.neumorphism.Neu;
import com.basel.neumorphism.ViewShape;

import androidx.core.content.ContextCompat;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView title = findViewById(R.id.title);

        final EditText search = findViewById(R.id.search);

        final LinearLayout song_info = findViewById(R.id.song_info);
        final ImageView song_thumb = findViewById(R.id.song_thumb);

        final ImageButton song_back = findViewById(R.id.song_back);
        final ImageButton song_forward = findViewById(R.id.song_forward);
        final ImageButton song_play = findViewById(R.id.song_play);

        final SeekBar song_seek = findViewById(R.id.song_seek);
        final ProgressBar progress_bar = findViewById(R.id.progress_bar);

        final Switch toggle_switch = findViewById(R.id.toggle_switch);
        final ToggleButton toggle_button = findViewById(R.id.toggle_button);
        final CheckBox check_box = findViewById(R.id.check_box);
        final RadioButton radio_button = findViewById(R.id.radio_button);

        song_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TapsActivity.class);
                startActivity(intent);
            }
        });

        int backgroundColor = ContextCompat.getColor(this, R.color.colorPrimary);
        int controlColor = ContextCompat.getColor(this, R.color.colorPrimaryDark);

        new Neu(this,true)
                .with(search,song_info,song_seek,toggle_switch,toggle_button,check_box,radio_button)
                .clipChildren(song_thumb)
                .parentColor(backgroundColor)
                .controlColor(controlColor)
                .withRoundedCorners(24)
                .neuIt();


        new Neu(this,true)
                .with(song_play)
                .viewShape(ViewShape.VIEW_SHAPE_CIRCULAR)
                .parentColor(backgroundColor)
                .controlColor(controlColor)
                .withBorders(3)
                .neuIt();

        new Neu(this,true)
                .with(song_back,song_forward)
                .viewShape(ViewShape.VIEW_SHAPE_CIRCULAR)
                .parentColor(backgroundColor)
                .controlColor(controlColor)
                .withCurvedSurface()
                .neuIt();

        new Neu(this,true)
                .with(progress_bar)
                .viewShape(ViewShape.VIEW_SHAPE_CIRCULAR)
                .parentColor(backgroundColor)
                .neuIt();


    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
