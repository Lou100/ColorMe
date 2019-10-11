package com.example.colorme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
//Programming button and constraint view
    private View windowView;
    private Button colorMeButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Creating an array list of colors
        colors = new int[]{Color.CYAN, Color.GREEN, Color.RED, Color.BLUE, Color.BLACK, Color.DKGRAY,
                           Color.LTGRAY, Color.MAGENTA, Color.YELLOW};
//finding and programming the constraint view
        windowView = (View) findViewById(R.id.windowView);

//finding and programming Button
        colorMeButton = (Button) findViewById(R.id.colorMeButton);
        colorMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Attaching array list to background
                int colorArrayLength = colors.length;
                Random random = new Random();
                int randomNum = random.nextInt(colorArrayLength);

                windowView.setBackgroundColor(colors[randomNum]);

                Log.d("Random", String.valueOf(randomNum));



               // Log.d("TEST", "TAP");
            }
        });
    }
}
