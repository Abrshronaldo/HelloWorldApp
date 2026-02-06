package com.example.helloworld;

import android.view.Window;
import androidx.core.content.ContextCompat;
import android.view.WindowManager;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.net.Uri;
  
import android.content.Intent;

 
 import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
    
import android.util.TypedValue;

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




private boolean wasInBackground = false;
public GestureDetector gestureDetector;       
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
//String A= "Complete\nETB 30.00 debited from ABREHAM H/";

String bo="yo";

TextView te = new TextView(this);
te.setId(View.generateViewId());
  te.setText("something wrong" +bo);
te.setTextSize(14);
te.setTextColor(Color.rgb(70, 70,70));
te.setPadding(0,10,0,10);
te.setLayoutParams(jparams);



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
   
  0, //  ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
setContentView(layout);


TextView t = new TextView(this);
t.setId(View.generateViewId());
//  t.setText("Complete\nETB 30.00 debited from ABREHAM H/\nMICHAEL H/GIORGIS for ABRHAM\nNANJALO HAYILANA-ETB-2133 on\n26-Dec-2025 with ... Press any key except 1\nand 2 for more");
t.setTextSize(14);
t.setTextColor(Color.rgb(70, 70,70));

t.setPadding(0, 1, 0, 0); 
// Constrain to top and left only
Fparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Fparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
Fparams.topMargin=524;
// Now apply margins
Fparams.leftMargin=33;
Fparams.bottomMargin=3;

Fparams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;

Fparams.rightMargin=3;
t.setLayoutParams(Fparams);




ConstraintLayout.LayoutParams usparams = new ConstraintLayout.LayoutParams(

  418,
  45
);



// Constrain to top and left only
usparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
usparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
usparams.topMargin=300;
// Now apply margins
usparams.leftMargin=23;

usparams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
usparams.rightMargin=23;


EditText us = new EditText(this);
us.setId(View.generateViewId());

us.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
us.setLayoutParams(usparams);

us.setBackgroundResource(R.drawable.edittext_bg);
us.setPadding(0, 0, 0, 0);



ConstraintLayout.LayoutParams paparams = new ConstraintLayout.LayoutParams(

  418,
  45
);


 
// Constrain to top and left only
paparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
paparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
paparams.topMargin=200;
// Now apply margins
paparams.leftMargin=23;
 
paparams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
paparams.rightMargin=23;
 
 
EditText pa = new EditText(this);
pa.setId(View.generateViewId());

pa.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
pa.setLayoutParams(paparams);
 
pa.setBackgroundResource(R.drawable.edittext_bg);
pa.setPadding(0, 0, 0, 0);




ConstraintLayout.LayoutParams kparams = new ConstraintLayout.LayoutParams(

  418,
  45
);



// Constrain to top and left only
kparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
kparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
kparams.topMargin=716;
// Now apply margins
kparams.leftMargin=23;

kparams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
kparams.rightMargin=23;


EditText et = new EditText(this);
et.setId(View.generateViewId());

et.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
et.setLayoutParams(kparams);

et.setBackgroundResource(R.drawable.edittext_bg);
et.setPadding(0, 0, 0, 0);


ConstraintLayout.LayoutParams buparams = new ConstraintLayout.LayoutParams(

  150,
  45
);




ConstraintLayout.LayoutParams abparams = new ConstraintLayout.LayoutParams(

  418,
  45
);


 
// Constrain to top and left only
abparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
abparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
abparams.topMargin=400;
// Now apply margins
abparams.leftMargin=23;
 
abparams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
abparams.rightMargin=23;
 

EditText etc = new EditText(this);
etc.setId(View.generateViewId());

etc.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
etc.setLayoutParams(abparams);

etc.setBackgroundResource(R.drawable.edittext_bg);
etc.setPadding(0, 0, 0, 0);
 



ConstraintLayout.LayoutParams abcparams = new ConstraintLayout.LayoutParams(

  418,
  45
);
 


// Constrain to top and left only
abcparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
abpcarams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
abcparams.topMargin=400;
// Now apply margins
abcparams.leftMargin=23;

abcparams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
abcparams.rightMargin=23;


EditText etcd = new EditText(this);
etcd.setId(View.generateViewId());
  
etcd.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
etcd.setLayoutParams(abcparams);

etcd.setBackgroundResource(R.drawable.edittext_bg);
etcd.setPadding(0, 0, 0, 0);

ConstraintLayout.LayoutParams buuparams = new ConstraintLayout.LayoutParams(

  150,
  45
);
// Constrain to top and left only
buuparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
buuparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
buuparams.topMargin=600;
// Now apply margins
buuparams.leftMargin=23;
 

Button bu = new Button(this);
bu.setId(View.generateViewId());

bu.setText("yo");
bu.setLayoutParams(buuparams);

bu.setBackgroundResource(R.drawable.edittext_bg);

bu.setPadding(0, 0, 0, 0);

ConstraintLayout.LayoutParams lparams = new ConstraintLayout.LayoutParams(

     ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
setContentView(layout);

TextView yo = new TextView(this);
yo.setId(View.generateViewId());
yo.setText("CANCEL         SEND");
yo.setTextSize(14); 


yo.setTextColor(Color.argb(220, 0, 80, 255)); 

yo.setPadding(0, 0, 0, 0);
// Constrain to top and left only
lparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
lparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
lparams.topMargin=825;
// Now apply margins
lparams.leftMargin=146;
lparams.bottomMargin=20;
lparams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;

lparams.rightMargin=0;
yo.setLayoutParams(lparams);
 
 
   gestureDetector
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
layout.addView(pa);
layout.addView(us);

layout.addView(etcd);
layout.addView(etc);
layout.addView(bu);
bu.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {



        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String fo = today.format(formatter).toLowerCase();
        

    
wasInBackground = true;
 String acc = etc.getText().toString();
 String pass = pa.getText().toString();
    String user = us.getText().toString();
   String B="MICHAEL H/GIORGIS for"+ " " +  user;
   String D="press any key except 1 and 2 for more";
    String E="";
                   
String lastFour = acc.substring(acc.length() - 4);

   String C="-ETB-" + lastFour + " on " + fo+ " with ...";

 String ac = etcd.getText().toString();


String A= "Complete\nETB " +  ac  + ".00 debited from ABREHAM H/";
while (B.length() > 34) {
            int lastSpaceIndex = B.lastIndexOf(" ");
            if (lastSpaceIndex != -1) {
                String lastWord =  B.substring(lastSpaceIndex + 1);
                B = B.substring(0, lastSpaceIndex); // remove last word
                C = lastWord + C;
            } else {
            break;
            }
        }


while (C.length() > 34) {
            int lastSpaceIndex = C.lastIndexOf(" ");
            if (lastSpaceIndex != -1) {
                String lastWord = C.substring(lastSpaceIndex + 1);
                C= C.substring(0, lastSpaceIndex); // remove last word
                D = lastWord + " " + D;
            } else  {
            break;
            }	
        }

     

while (D.length() > 34) {
            int lastSpaceIndex = D.lastIndexOf(" ");
            if (lastSpaceIndex != -1) {
                String lastWord = D.substring(lastSpaceIndex + 1);
                D= D.substring(0, lastSpaceIndex); // remove last word
                E = lastWord + " " + E;
            } else {
            break;
            }
        }

t.setText(A+"\n"+B+"\n"+C+"\n"+D+"\n"+E);
layout.removeView(bu);      

layout.addView(imageView);
layout.addView(lineview);

    
    layout.addView(tv);

layout.addView(yo);
layout.addView(t);       
  
layout.addView(et);



}
});  


}
});      

 }
            return true;
        }
        return false;
    }
});
}


@Override
    protected void onResume() {
        super.onResume();
        // Example: treat resume from Recents like a "button click"
        if (wasInBackground) {

Intent intent = new Intent(Intent.ACTION_DIAL);
intent.setData(Uri.parse("tel:1234567890"));
startActivity(intent);

            }
        wasInBackground = false;
    }

   // @Override
   // protected void onStop() {
     //   super.onStop();
        // Mark that the app went to background
       // wasInBackground = true;
   // }


public boolean onTouchEvent(MotionEvent event) {
    return gestureDetector.onTouchEvent(event) || super.onTouchEvent(event);
}

}
