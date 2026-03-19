package com.example.hello;

import android.view.Window;
import androidx.core.content.ContextCompat;
import android.view.WindowManager;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.net.Uri;
  
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
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


 @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                                              
            getWindow().setFlags(
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN
    );                  
//yes
  
  
 
 
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

TextView te = new TextView(this);
te.setId(View.generateViewId());
  te.setText("waiting");
te.setTextSize(14);
te.setTextColor(Color.rgb(70, 70,70));
te.setPadding(0,10,0,10);
te.setLayoutParams(jparams);

layout.addView(te);


if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
    ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
    return;
}


LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

LocationListener locationListener = new LocationListener() {
    @Override
    public void onLocationChanged(Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
       String latitudeStr = String.valueOf(latitude);
        String longitudeStr = String.valueOf(longitude);
        
        // Output the updated GPS coordinates as Strings
        te.setText("Lat: " + latitudeStr + ", Lon: " + longitudeStr);
        
        }
};




locationManager.requestLocationUpdates(
    LocationManager.GPS_PROVIDER,
    2000,   // minimum time interval between updates (ms)
    1,      // minimum distance between updates (meters)
    locationListener
);
    


                                                                                                       

setContentView(layout);
                          
}

 
 }
