package com.example.helloworld;

import android.view.Window;
import androidx.core.content.ContextCompat;
import android.view.WindowManager;

import android.widget.ImageView;

import android.graphics.Color;

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
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);

// Position it (example: top-left corner with margins)
imgParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
imgParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
imgParams.leftMargin = 0;
imgParams.topMargin = 0;

imageView.setPadding(0, 0, 0, 0);

imageView.setScaleType(ImageView.ScaleType.FIT_XY);


imageView.setImageResource(R.drawable.abrsh);

                                                                                                       
       

ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.MATCH_PARENT
);

                                                                         
TextView tv = new TextView(this);
tv.setId(View.generateViewId());
  tv.setText("touch one of the box :first player is always X  ");
tv.setTextSize(15);
tv.setGravity(Gravity.CENTER);   // centers text inside the TextView
// Other options: Gravity.LEFT, Gravity.RIGHT, Gravity.TOP, Gravity.BOTTOM


tv.setBackgroundColor(Color.argb(255, 255, 255, 255));

// Constrain to top and left only
params.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
params.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                            
// Now apply margins
                                                                         
tv.setLayoutParams(params);


                                                                 

ConstraintLayout.LayoutParams zparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT

);
TextView t = new TextView(this);
t.setId(View.generateViewId());
  

t.setBackgroundColor(Color.argb(255, 255, 255, 255));

// Constrain to top and left only
zparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
zparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

// Now apply margins

t.setLayoutParams(zparams);

 
//layout.addView(lineview);

layout.addView(imageView);         
layout.addView(lineview);

layout.addView(t);
    layout.addView(tv);
                                         
        // Set layout as content view
        setContentView(layout);

  
        

}
}
