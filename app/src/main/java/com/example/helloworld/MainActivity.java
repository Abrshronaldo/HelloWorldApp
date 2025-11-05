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
 char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

 boolean hasWon(char player) {
        for (int i = 0; i < 3; i++) {
if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
  (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;
        }
return (board[0][0]== player && board[1][1] == player && board[2][2] == player) ||
  (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }
     
 boolean isDraw() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }



boolean gameEnded = false;

     char currentPlayer = 'X';                                                                    

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


if (hasWon( currentPlayer ) {
    gameEnded = true;
    Toast.makeText(this, "Game Over! Player X wins!", 
Toast.LENGTH_SHORT).show();
}

 
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
if (X==0 || X==2 || X==4 || X==6 || X==8){
board[0][0]='X';
input.setText("X");
}
else{
board[0][0]='O';
input.setText("O");
input.setTextSize(15);
}

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


ConstraintLayout.LayoutParams Eparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Eparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Eparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             
                   Eparams.leftMargin=203;
                 Eparams.topMargin=222;
              ubmitButton.setLayoutParams(Eparams);

               layout.addView(ubmitButton);



 ubmitButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8){
board[1][0]='X';

input.setText("X");
}
else {

board[1][0]='O';
input.setText("O");
input.setTextSize(15);
}

ConstraintLayout.LayoutParams Fparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Fparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Fparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Fparams.leftMargin=203;
     Fparams.topMargin=222;
  input.setLayoutParams(Fparams);

layout.addView(input);
X++;

}

});
    
     
TextView bmitButton = new TextView(this);
bmitButton.setId(View.generateViewId());
bmitButton.setText("       ");
bmitButton.setTextSize(50);


ConstraintLayout.LayoutParams Gparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Gparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Gparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             
                   Gparams.leftMargin=286;
                 Gparams.topMargin=222;
              bmitButton.setLayoutParams(Gparams);

               layout.addView(bmitButton);



 bmitButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8){
board[2][0]='X';

input.setText("X");

}
else{
board[2][0]='X';
input.setText("O");
input.setTextSize(15);

}
ConstraintLayout.LayoutParams Hparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Hparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Hparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Hparams.leftMargin=286;
     Hparams.topMargin=222;
  input.setLayoutParams(Hparams);

layout.addView(input);

X++;
}

});
     


TextView mitButton = new TextView(this);
mitButton.setId(View.generateViewId());
mitButton.setText("       ");
mitButton.setTextSize(50);


ConstraintLayout.LayoutParams Iparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Iparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Iparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             
                   Iparams.leftMargin=122;
                 Iparams.topMargin=300;
              mitButton.setLayoutParams(Iparams);

               layout.addView(mitButton);



 mitButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8){
board[0][1]='X';
input.setText("X");
}

else{

board[0][1]='O';

input.setText("O");
input.setTextSize(15);

}
ConstraintLayout.LayoutParams Jparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Jparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Jparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Jparams.leftMargin=122;
     Jparams.topMargin=300;
  input.setLayoutParams(Jparams);
   layout.addView(input);
X++;

}

});


TextView itButton = new TextView(this);
itButton.setId(View.generateViewId());
itButton.setText("       ");
itButton.setTextSize(50);


ConstraintLayout.LayoutParams Kparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Kparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Kparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             
                   Kparams.leftMargin=203;
                 Kparams.topMargin=300;
              itButton.setLayoutParams(Kparams);

               layout.addView(itButton);



 itButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8){
board[1][1]='X';
input.setText("X");

}
else{
board[1][1]='O';
input.setText("O");
input.setTextSize(15);

}
ConstraintLayout.LayoutParams Lparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Lparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Lparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

 Lparams.leftMargin=203;
     Lparams.topMargin=300;
  input.setLayoutParams(Lparams);

layout.addView(input);
X++;

}

});
	

TextView tButton = new TextView(this);
tButton.setId(View.generateViewId());
tButton.setText("       ");
tButton.setTextSize(50);


ConstraintLayout.LayoutParams Mparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Mparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Mparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                            
                   Mparams.leftMargin=286;
                 Mparams.topMargin=300;
               tButton.setLayoutParams(Mparams);

               layout.addView(tButton);



 tButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8){
board[2][1]='X';
input.setText("X");

}
else{
board[2][1]='O';
input.setText("O");
input.setTextSize(15);

}
ConstraintLayout.LayoutParams Nparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Nparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Nparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Nparams.leftMargin=286;
     Nparams.topMargin=300;     
	
 input.setLayoutParams(Nparams);

layout.addView(input);       

X++;

}

});

      
TextView aButton = new TextView(this);
aButton.setId(View.generateViewId());
aButton.setText("       ");
aButton.setTextSize(50);


ConstraintLayout.LayoutParams Oparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Oparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Oparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             
                   Oparams.leftMargin=122;
                 Oparams.topMargin=375;
               aButton.setLayoutParams(Oparams);

               layout.addView(aButton);



 aButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8){
board[0][2]='X';
input.setText("X");
}
else{
board[0][2]='O';
input.setText("O");
input.setTextSize(15);
}

ConstraintLayout.LayoutParams Pparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Pparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Pparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Pparams.leftMargin=122;
     Pparams.topMargin=375;

 input.setLayoutParams(Pparams);
   layout.addView(input);

X++;

}

});
    

TextView bButton = new TextView(this);
bButton.setId(View.generateViewId());
bButton.setText("       ");
bButton.setTextSize(50);


ConstraintLayout.LayoutParams Qparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Qparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Qparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             
                   Qparams.leftMargin=203;
                 Qparams.topMargin=375;
               bButton.setLayoutParams(Qparams);

               layout.addView(bButton);



 bButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8){
board[1][2]='X';
input.setText("X");
}

else{
board[1][2]='O';
input.setText("O");
input.setTextSize(15);
}

ConstraintLayout.LayoutParams Rparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Rparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Rparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Rparams.leftMargin=203;

     Rparams.topMargin=375;

 input.setLayoutParams(Rparams);
   layout.addView(input);
X++;
}

});


TextView cButton = new TextView(this);
cButton.setId(View.generateViewId());
cButton.setText("       ");
cButton.setTextSize(50);


ConstraintLayout.LayoutParams Sparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Sparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Sparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             
                   Sparams.leftMargin=203;
                 Sparams.topMargin=375;
               cButton.setLayoutParams(Sparams);

               layout.addView(cButton);



 cButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8){
board[1][2]='X';

input.setText("X");

}
else{
board[1][2]='O';
input.setText("O");
input.setTextSize(15);

}
ConstraintLayout.LayoutParams Tparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Tparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Tparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Tparams.leftMargin=203;

     Tparams.topMargin=375;

 input.setLayoutParams(Tparams);
   
layout.addView(input);
X++;
}

});
   

TextView dButton = new TextView(this);
dButton.setId(View.generateViewId());
dButton.setText("       ");
dButton.setTextSize(50);


ConstraintLayout.LayoutParams Uparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.WRAP_CONTENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
         // Constrain to top and left only
Uparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Uparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                                                                             
                   Uparams.leftMargin=286;
                 Uparams.topMargin=375;
               dButton.setLayoutParams(Uparams);

              layout.addView(dButton);



 dButton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {




TextView input = new TextView(v.getContext());



input.setId(View.generateViewId());
if (X==0 || X==2 || X==4 || X==6 || X==8){
board[2][2]='X';
input.setText("X");
}
else {
board[2][2]='O';
input.setText("O");
input.setTextSize(15);
}

ConstraintLayout.LayoutParams Vparams = new ConstraintLayout.LayoutParams(
    ConstraintLayout.LayoutParams.MATCH_PARENT,
    ConstraintLayout.LayoutParams.WRAP_CONTENT
);
Vparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
Vparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

Vparams.leftMargin=286;

     Vparams.topMargin=375;

 input.setLayoutParams(Vparams);
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

