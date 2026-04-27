package com.example.hello;

import android.view.Window;
import androidx.core.content.ContextCompat;
import android.view.WindowManager;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.net.Uri;


import android.content.Intent;
import android.provider.Settings;
    
     
   import android.Manifest;
import android.content.pm.PackageManager;
import androidx.core.app.ActivityCompat;
  
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
 
   import androidx.appcompat.app.AppCompatActivity;

  public class MainActivity extends AppCompatActivity {

    private TextView te;
    private LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        ConstraintLayout layout = new ConstraintLayout(this);

        ConstraintLayout.LayoutParams jparams = new ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        );
        jparams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        jparams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        jparams.topMargin = 50;
        jparams.leftMargin = 100;

        te = new TextView(this);
        te.setId(View.generateViewId());
        te.setText("waiting");
        te.setTextSize(14);
        te.setTextColor(Color.rgb(70, 70, 70));
        te.setPadding(0, 10, 0, 10);
        te.setLayoutParams(jparams);

        layout.addView(te);
        setContentView(layout);

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

       
 
if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) 
    != PackageManager.PERMISSION_GRANTED) {

    ActivityCompat.requestPermissions(this,
        new String[]{ Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
} else {
    startLocationUpdates();
}


    
}


    private void startLocationUpdates() {
        LocationListener locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                te.setText("Lat: " + latitude + ", Lon: " + longitude);
            }
        };

  
         if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            
                      
            // Register Network
            if (locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
                locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 2000, 1, locationListener);
            }
        }
    } 

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,
 int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
   if (requestCode == 1 && grantResults.length > 0 &&
 grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            startLocationUpdates();
        } else {
            te.setText("Permission denied");
        }
    }
}
    
