package com.ghavinj.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView peekABooTextView;
    private ToggleButton toggleButton;
    private ImageView peekabooImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peekABooTextView = (TextView)findViewById(R.id.peekABooTextView);
        peekabooImageView = (ImageView)findViewById(R.id.peekABooImageView);

        toggleButton = (ToggleButton)findViewById(R.id.toggleButtonID);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    peekABooTextView.setVisibility(View.VISIBLE);
                    peekabooImageView.setVisibility(View.VISIBLE);
                }else {
                    peekABooTextView.setVisibility(View.INVISIBLE);
                    peekabooImageView.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
