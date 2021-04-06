package com.brigosha.theclassroom.SplashScreenPackage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.brigosha.theclassroom.MainActivity;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class SplashActivity extends AppCompatActivity {
    /*  Set theme from manifest file.
        Theme is saved inside styles.xml
        Icons from appIcon.co
        drawable/splash.xml is used as theme instead of layoutInflater for faster loading
        Check v<24 compatibility
     */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        simulate heavy operations
//        for (int i =0; i<=1000000;i++) {
//            long d = (long) tan(atan(tan(atan(tan(atan(tan(atan(tan(atan(123456789.123456789))))))))));
//            System.out.println(d);
//        }






        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}