package com.example.helloworld;


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

        EditText input = new EditText(this);
        input.setHint("Type here...");
        input.setTextSize(20);
        
       try {
    Field f = TextView.class.getDeclaredField("mCursorDrawableRes");
    f.setAccessible(true);
    f.set(input, R.drawable.custom_cursor);
} catch (Exception e) {
    e.printStackTrace(); // Or log it
}


      input.setBackground(null); 

  


        // Add views to layout
        layout.addView(tv);
        layout.addView(input);

        // Set layout as content view
        setContentView(layout);


        
    }
}

