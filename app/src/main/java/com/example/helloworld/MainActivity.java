package com.example.helloworld;

import android.view.Window;
import androidx.core.content.ContextCompat;
import android.view.WindowManager;

import android.widget.ImageView;

import java.lang.reflect.Field;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.app.Activity;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Context;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
public class MainActivity extends Activity {
       
 @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                                              
            getWindow().setFlags(
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN
    );                  
//yes
  
LineView lineview=new LineView(this);                                                                      



ConstraintLayout layout = new ConstraintLayout(this);

ConstraintLayout.LayoutParams Dparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);



 // Create an ImageView
ImageView imageView = new ImageView(this);
imageView.setId(View.generateViewId());

// Load image from drawable

// Set layout parameters
ConstraintLayout.LayoutParams imgParams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);

// Position it (example: top-left corner with margins)
imgParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
imgParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
imgParams.leftMargin = 50;
imgParams.topMargin = 100;
imageView.setImageResource(R.drawable.abrsh.png);

                                                                                                       
       

ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);

                                                                         
TextView tv = new TextView(this);
tv.setId(View.generateViewId());
  tv.setText("touch one of the box :first player is always X  ");
tv.setTextSize(15);

// Constrain to top and left only
params.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
params.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                            
// Now apply margins
params.leftMargin = 50; // x position
params.topMargin =  700; // y position
                                                                         
tv.setLayoutParams(params);


 
layout.addView(lineview);

layout.addView(imageView);         
    layout.addView(tv);
                                         
        // Set layout as content view
        setContentView(layout);

  
        

}
}
