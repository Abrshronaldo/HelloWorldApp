package com.example.helloworld;

import android.view.Window;
import androidx.core.content.ContextCompat;
import android.view.WindowManager;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;

import android.view.Gravity;
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




ConstraintLayout.LayoutParams jparams = new ConstraintLayout.LayoutParams(

  ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);

   

// Constrain to top and left only
jparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
jparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
jparams.topMargin=50;
// Now apply margins
jparams.leftMargin=100;
jparams.bottomMargin=3;


jparams.rightMargin=3;



TextView te = new TextView(this);
te.setId(View.generateViewId());
  te.setText("something wrong");
te.setTextSize(14);
te.setTextColor(Color.rgb(70, 70,70));
te.setPadding(0,10,0,10);
te.setLayoutParams(jparams);

layout.addView(te);


// Create an ImageView
ImageView imageView = new ImageView(this);
imageView.setId(View.generateViewId());
 
// Load image from drawable

// Set layout parameters
ConstraintLayout.LayoutParams imgParams = new ConstraintLayout.LayoutParams(
    ConstraintLayousetContentView(layout);setContentView(layout);t.LayoutParams.MATCH_PARENT,
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
    474,
    412
);       


                                                                         
TextView tv = new TextView(this);
tv.setId(View.generateViewId());
  
Drawable bg = ContextCompat.getDrawable(this, R.drawable.rounded_layer);
// example tint
tv.setBackground(bg);
//tv.setBackgroundColor(Color.argb(255, 255, 255, 255));

// Constrain to top and left only
params.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
params.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
params.topMargin=480;
// Now apply margins
params.leftMargin=3;  
params.bottomMargin=3;


params.rightMargin=3;
tv.setLayoutParams(params); 

                          
ConstraintLayout.LayoutParams Fparams = new ConstraintLayout.LayoutParams(
   
  ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
setContentView(layout);


TextView t = new TextView(this);
t.setId(View.generateViewId());
  t.setText("Complete");
t.setTextSize(14);
t.setTextColor(Color.rgb(70, 70,70));

// Constrain to top and left only
Fparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Fparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
Fparams.topMargin=524;
// Now apply margins
Fparams.leftMargin=33;
Fparams.bottomMargin=3;


Fparams.rightMargin=3;
t.setLayoutParams(Fparams);
 
//layout.addView(lineview);


 
  GestureDetector gestureDetector
 = new GestureDetector(this,
 new GestureDetector.SimpleOnGestureListener() {
    private static final int SWIPE_THRESHOLD = 100;
    private static final int SWIPE_VELOCITY_THRESHOLD = 100;

    @Override
    public boolean onFling(MotionEvent e1,
 MotionEvent e2, float velocityX, float velocityY) {
        float diffX = e2.getX() - e1.getX();
        if (Math.abs(diffX)
 > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
            if (diffX < 0) {


layout.addView(te);
te.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

layout.addView(imageView);
layout.addView(lineview);


    layout.addView(tv);


layout.addView(t);       
  
  }
});      

 }
            return true;
        }
        return false;
    }
});
}

public boolean onTouchEvent(MotionEvent event) {
    return gestureDetector.onTouchEvent(event) || super.onTouchEvent(event);
}

}
