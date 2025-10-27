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
         int X=0;
                                                                    
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



TextView submitButton = new TextView(this);
submitButton.setId(View.generateViewId());
submitButton.setText("       ");
submitButton.setTextSize(50);                                   

                                               
ConstraintLayout.LayoutParams Bparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Bparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Bparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;      
                                                                                               
                   Bparams.leftMargin=122;
                 Bparams.topMargin=222;
              submitButton.setLayoutParams(Bparams);

               layout.addView(submitButton);
                                                                 
                            
                                                                
 submitButton.setOnClickListener(new View.OnClickListener() {
                                                                       
    @Override
    public void onClick(View v) {  
                       

  

TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8)

input.setText("X");
else
input.setText("O");
input.setTextSize(15);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
     Cparams.leftMargin=122;
     Cparams.topMargin=222;
  input.setLayoutParams(Cparams);
                                            
layout.addView(input);       
X++;      
      
}

});
 
     






TextView ubmitButton = new TextView(this);
ubmitButton.setId(View.generateViewId());
ubmitButton.setText("       ");
ubmitButton.setTextSize(50);


ConstraintLayout.LayoutParams Bparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Bparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Bparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             >
                   Bparams.leftMargin=203;
                 Bparams.topMargin=222;
              ubmitButton.setLayoutParams(Bparams);

               layout.addView(ubmitButton);



 ubmitButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8)

input.setText("X");
else
input.setText("O");
input.setTextSize(15);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Cparams.leftMargin=203;
     Cparams.topMargin=222;
  input.setLayoutParams(Cparams);

layout.addView(input);
X++;

}

});
    
     
TextView bmitButton = new TextView(this);
bmitButton.setId(View.generateViewId());
bmitButton.setText("       ");
bmitButton.setTextSize(50);


ConstraintLayout.LayoutParams Bparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Bparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Bparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             >
                   Bparams.leftMargin=286;
                 Bparams.topMargin=222;
              bmitButton.setLayoutParams(Bparams);

               layout.addView(bmitButton);



 bmitButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8)

input.setText("X");
else
input.setText("O");
input.setTextSize(15);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Cparams.leftMargin=286;
     Cparams.topMargin=222;
  input.setLayoutParams(Cparams);

layout.addView(input);

X++;
}

});
     


TextView mitButton = new TextView(this);
mitButton.setId(View.generateViewId());
mitButton.setText("       ");
mitButton.setTextSize(50);


ConstraintLayout.LayoutParams Bparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Bparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Bparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             >
                   Bparams.leftMargin=122;
                 Bparams.topMargin=264;
              mitButton.setLayoutParams(Bparams);

               layout.addView(mitButton);



 mitButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8)

input.setText("X");
else
input.setText("O");
input.setTextSize(15);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Cparams.leftMargin=203;
     Cparams.topMargin=264;
  input.setLayoutParams(Cparams);
   layout.addView(input);
X++;

}

});


TextView itButton = new TextView(this);
itButton.setId(View.generateViewId());
itButton.setText("       ");
itButton.setTextSize(50);


ConstraintLayout.LayoutParams Bparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Bparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Bparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             >
                   Bparams.leftMargin=122;
                 Bparams.topMargin=264;
              itButton.setLayoutParams(Bparams);

               layout.addView(itButton);



 itButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8)

input.setText("X");
else
input.setText("O");
input.setTextSize(15);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Cparams.leftMargin=203;
     Cparams.topMargin=264;
  input.setLayoutParams(Cparams);

layout.addView(input);
X++;

}

});
	

TextView tButton = new TextView(this);
tButton.setId(View.generateViewId());
tButton.setText("       ");
tButton.setTextSize(50);


ConstraintLayout.LayoutParams Bparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Bparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Bparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             >
                   Bparams.leftMargin=286;
                 Bparams.topMargin=264;
               tButton.setLayoutParams(Bparams);

               layout.addView(tButton);



 tButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8)

input.setText("X");
else
input.setText("O");
input.setTextSize(15);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Cparams.leftMargin=286;
     Cparams.topMargin=264;     
	
 input.setLayoutParams(Cparams);

layout.addView(input);       

X++;

}

});

      
TextView aButton = new TextView(this);
aButton.setId(View.generateViewId());
aButton.setText("       ");
aButton.setTextSize(50);


ConstraintLayout.LayoutParams Bparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Bparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Bparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             >
                   Bparams.leftMargin=122;
                 Bparams.topMargin=350;
               aButton.setLayoutParams(Bparams);

               layout.addView(aButton);



 aButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8)

input.setText("X");
else
input.setText("O");
input.setTextSize(15);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Cparams.leftMargin=122;
     Cparams.topMargin=350;

 input.setLayoutParams(Cparams);
   layout.addView(input);

X++;

}

});
    

TextView bButton = new TextView(this);
bButton.setId(View.generateViewId());
bButton.setText("       ");
bButton.setTextSize(50);


ConstraintLayout.LayoutParams Bparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Bparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Bparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             >
                   Bparams.leftMargin=203;
                 Bparams.topMargin=350;
               bButton.setLayoutParams(Bparams);

               layout.addView(bButton);



 bButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8)

input.setText("X");
else
input.setText("O");
input.setTextSize(15);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Cparams.leftMargin=203;

     Cparams.topMargin=350;

 input.setLayoutParams(Cparams);
   layout.addView(input);
X++;
}

});


TextView cButton = new TextView(this);
cButton.setId(View.generateViewId());
cButton.setText("       ");
cButton.setTextSize(50);


ConstraintLayout.LayoutParams Bparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Bparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Bparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             >
                   Bparams.leftMargin=203;
                 Bparams.topMargin=350;
               cButton.setLayoutParams(Bparams);

               layout.addView(cButton);



 cButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8)

input.setText("X");
else
input.setText("O");
input.setTextSize(15);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Cparams.leftMargin=203;

     Cparams.topMargin=350;

 input.setLayoutParams(Cparams);
   
layout.addView(input);
X++;
}

});
   

TextView dButton = new TextView(this);
dButton.setId(View.generateViewId());
dButton.setText("       ");
dButton.setTextSize(50);


ConstraintLayout.LayoutParams Bparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Bparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Bparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             >
                   Bparams.leftMargin=286;
                 Bparams.topMargin=350;
               dButton.setLayoutParams(Bparams);

              layout.addView(dButton);



 dButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8)

input.setText("X");
else
input.setText("O");
input.setTextSize(15);


ConstraintLayout.LayoutParams Cparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Cparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Cparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Cparams.leftMargin=286;

     Cparams.topMargin=350;

 input.setLayoutParams(Cparams);
layout.addView(input);
X++;
}

});



      // Add views to layout
        
         layout.addView(lineView); 

    layout.addView(tv);
       
                                     
        // Set layout as content view
        setContentView(layout);

  
        
    }
}

