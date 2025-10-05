package com.example.helloworld;

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
                  
//yes

                                                                                      
        
ConstraintLayout layout = new ConstraintLayout(this);

ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);

                                                             
TextView tv = new TextView(this);
tv.setId(View.generateViewId());
tv.setText("yes sir!");
tv.setTextSize(30);


// Constrain to top and left only
params.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
params.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

// Now apply margins
params.leftMargin = 100; // x position
params.topMargin =  100; // y position
                       
tv.setLayoutParams(params);

                          
Button submitButton = new Button(this);
submitButton.setText("Submit");
submitButton.setTextSize(20);
        

      
ConstraintLayout.LayoutParams Bparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Bparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Bparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;      
                                                                                               
                   Bparams.leftMargin=100;
                 Bparams.topMargin=200;                   

              submitButton.setLayoutParams(Bparams);

               layout.addView(submitButton);
                                                                 
                            
                                                                
 submitButton.setOnClickListener(new View.OnClickListener() {
                                                                       
    @Override
    public void onClick(View v) {  
     EditText input = new EditText(v.getContext());
        input.setHint("Type here...");
         input.setTextSize(20);
       input.setBackground(null);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                             
     Cparams.leftMargin=100;
     Cparams.topMargin=700;
  input.setLayoutParams(Cparams);
                                            
layout.addView(input);       
      
      
       Context context =v.getContext();
if (context instanceof Activity) {
    ViewGroup root = (ViewGroup) ((Activity) context).findViewById(android.R.id.content);
    root.addView(input);
}
                                                                                                                                                                                             
        try {
    Field f = TextView.class.getDeclaredField("mCursorDrawableRes");
    f.setAccessible(true);
    f.set(input, R.drawable.custom_cursor);
} catch (Exception e) {
    e.printStackTrace(); // Or log it
}
         
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

