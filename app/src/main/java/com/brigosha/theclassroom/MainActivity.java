package com.brigosha.theclassroom;

import android.os.Bundle;

import com.brigosha.theclassroom.Models.User;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> users = null;

        users.add(new User("001","Arun", "a@run.com", "4569852212"));
        users.add(new User("002","Ravi", "r@avi.com", "6546846846"));
        users.add(new User("003","Kaps", "k@aps.com", "5455686868"));
        users.add(new User("004","Akhi", "a@khi.com", "1785783728"));
        users.add(new User("005","Saju", "s@aju.com", "7139852757"));
        users.add(new User("006","Pran", "p@ran.com", "1769672855"));
        users.add(new User("007","Vnay", "v@nay.com", "7179782372"));
        users.add(new User("008","Abdl", "a@bdl.com", "7879867868"));



    }
}