package com.brigosha.theclassroom.SplashScreenPackage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.brigosha.theclassroom.MainActivity;

import io.realm.Realm;
import io.realm.mongodb.App;
import io.realm.mongodb.AppConfiguration;
import io.realm.mongodb.Credentials;
import io.realm.mongodb.User;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class SplashActivity extends AppCompatActivity {
    /*  Set theme from manifest file.
        Theme is saved inside styles.xml
        Icons from appIcon.co
        drawable/splash.xml is used as theme instead of layoutInflater for faster loading
        Check v<24 compatibility
     */

    String appid = "the_classroom-ryilw";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //simulate heavy operations
//        for (int i =0; i<=1000000;i++) {
//            long d = (long) tan(atan(tan(atan(tan(atan(tan(atan(tan(atan(123456789.123456789))))))))));
//            System.out.println(d);
//        }


        Realm.init(this);
            App app = new App(new AppConfiguration.Builder(appid).build());

//        Credentials credentials = Credentials.anonymous();
//        app.loginAsync(credentials, result -> {
//            if (result.isSuccess()) {
//                Log.v("QUICKSTART", "Successfully authenticated anonymously.");
//                User user = app.currentUser();
//                // interact with realm using your user object here
//            } else {
//                Log.e("QUICKSTART", "Failed to log in. Error: " + result.getError());
//            }
//        });

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}