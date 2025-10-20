package com.example.helloworld;

import android.view.Window;
import androidx.core.content.ContextCompat;


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
                                      
          LineView lineView = new LineView(this);
         Window window = getWindow();
window.setStatusBarColor(ContextCompat.getColor(this, android.R.color.white));
                  
//yes
  
                                                                      
                                                                           

ConstraintLayout layout = new ConstraintLayout(this);

ConstraintLayout.LayoutParams Dparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);


TextView t = new TextView(this);
t.setId(View.generateViewId());
t.setText("or");
t.setTextSize(15);

// Constrain to top and left only
Dparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Dparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

// Now apply margins
Dparams.leftMargin = 200; // x position
Dparams.topMargin =  700; // y position

t.setLayoutParams(Dparams);



                                                                                                         
       

ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);

                                                                         
TextView tv = new TextView(this);
tv.setId(View.generateViewId());
tv.setText("enter   ");
tv.setTextSize(15);

// Constrain to top and left only
params.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
params.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                            
// Now apply margins
params.leftMargin = 50; // x position
params.topMargin =  700; // y position
                                                                         
tv.setLayoutParams(params);


                      
                                                      
 
TextView ubmitButton = new TextView(this);
ubmitButton.setId(View.generateViewId());
ubmitButton.setText("O");
ubmitButton.setTextSize(15);


ConstraintLayout.LayoutParams Eparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Eparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Eparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             
                   Eparams.leftMargin=250;
                 Eparams.topMargin=700;
              ubmitButton.setLayoutParams(Eparams);

               layout.addView(ubmitButton);


     ubmitButton.setOnClickListener(new View.OnClickListener() {
      
    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());


input.setId(View.generateViewId());
input.setText("O");
input.setTextSize(15);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

     Cparams.leftMargin=250;
     Cparams.topMargin=250;
  input.setLayoutParams(Cparams);

layout.addView(input);


                                                                            
//        layout.addView(input);




//          submitButton.setOnClickListener(null);






}

});

  

TextView submitButton = new TextView(this);
submitButton.setId(View.generateViewId());
submitButton.setText("X");
submitButton.setTextSize(15);                                   

                                               
ConstraintLayout.LayoutParams Bparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Bparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Bparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;      
                                                                                               
                   Bparams.leftMargin=150;
                 Bparams.topMargin=700;
              submitButton.setLayoutParams(Bparams);

               layout.addView(submitButton);
                                                                 
                            
                                                                
 submitButton.setOnClickListener(new View.OnClickListener() {
                                                                       
    @Override
    public void onClick(View v) {  
                       

  

TextView input = new TextView(v.getContext());


input.setId(View.generateViewId());
input.setText("X");
input.setTextSize(15);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                             
     Cparams.leftMargin=150;
     Cparams.topMargin=250;
  input.setLayoutParams(Cparams);
                                            
layout.addView(input);       
      
      
                                                                                                                                                                                                    
                 
//        layout.addView(input);                        

       


//          submitButton.setOnClickListener(null);    
                                      
                
 
          
 

}

});
 

         // Add views to layout
        
         layout.addView(lineView); 

    layout.addView(tv);
       
                                     
        // Set layout as content view
        setContentView(layout);

  
        
    }
}

