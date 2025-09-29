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


public class MainActivity extends Activity {

                                                   
                                                            
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
               LinearLayout layout = new LinearLayout(this);

       //  layout.setOrientation(LinearLayout.VERTICAL);
                       
         //  LineView lineView = new LineView(this);
      
//yes

                                                                  
        TextView tv = new TextView(this);

    tv.setText( "yes sir!");
        tv.setTextSize(30);

                                  
   


      

  
Button submitButton = new Button(this);
submitButton.setText("Submit");
submitButton.setTextSize(20);
                                                
                                      
                   layout.addView(submitButton);
                       
                       
                                                                
 submitButton.setOnClickListener(new View.OnClickListener() {
                                                                       
    @Override
    public void onClick(View v) {  
     EditText input = new EditText(v.getContext());
        input.setHint("Type here...");
         input.setTextSize(20);
       input.setBackground(null);
       
      LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
    LinearLayout.LayoutParams.MATCH_PARENT,
    LinearLayout.LayoutParams.WRAP_CONTENT
);
input.setLayoutParams(params);

      
       Context context = getContext();
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
         
        layout.addView(input);                        

       


//          submitButton.setOnClickListener(null);    
                                      
                
 
          
 

}

});
 

         // Add views to layout
        
     //    layout.addView(lineView); 

    layout.addView(tv);
       
                                     
        // Set layout as content view
        setContentView(layout);

  
        
    }
}

