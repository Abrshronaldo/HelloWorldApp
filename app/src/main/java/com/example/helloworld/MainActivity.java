package com.example.helloworld;

import java.lang.reflect.Field;
import android.widget.Button;
import android.view.View;

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
        layout.setOrientation(LinearLayout.VERTICAL);



          
        TextView tv = new TextView(this);

        tv.setText("enter something");
        tv.setTextSize(30);

               
   


      input.setBackground(null); 

  
Button submitButton = new Button(this);
submitButton.setText("Submit");
submitButton.setTextSize(20);
                                                                  
   
    layout.addView(submitButton);
// Optional: Set an OnClickListener to define what happens when the button is clicked
    submitButton.setOnClickListener(new View.OnClickListener() {
                                                                       
    @Override
    public void onClick(View v) {  
     EditText input = new EditText(v.getContext());
        input.setHint("Type here...");
         input.setTextSize(20);


        
       try {
    Field f = TextView.class.getDeclaredField("mCursorDrawableRes");
    f.setAccessible(true);
    f.set(input, R.drawable.custom_cursor);
} catch (Exception e) {
    e.printStackTrace(); // Or log it
}


    layout.addView(input);
}
});

         // Add views to layout
        layout.addView(tv);
             
                                 
        // Set layout as content view
        setContentView(layout);

  
        
    }
}

