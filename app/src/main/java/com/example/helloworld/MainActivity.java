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
layout.setLayoutParams(new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.addView(submitButton);layout.addView(submitButton);out.LayoutParams.MATCH_PARENT
));
                  
TextView tv = new TextView(this);
tv.setId(View.generateViewId());
tv.setText("yes sir!");
tv.setTextSize(30);

ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);

// Constrain to top and left only
params.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
params.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

// Now apply margins
params.leftMargin = 100; // x position
params.topMargin =  500; // y position

tv.setLayoutParams(params);

                          
Button submitButton = new Button(this);
submitButton.setText("Submit");
submitButton.setTextSize(20);
                                                
                   params.leftMargin=100;
                 params.topMargin=200;                   
                   layout.addView(submitButton);
                       
                       
                                                                
 submitButton.setOnClickListener(new View.OnClickListener() {
                                                                       
    @Override
    public void onClick(View v) {  
     EditText input = new EditText(v.getContext());
        input.setHint("Type here...");
         input.setTextSize(20);
       input.setBackground(null);
     params.leftMargin=100;
     params.topMargin=300;
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

