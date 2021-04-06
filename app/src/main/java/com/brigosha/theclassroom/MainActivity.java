package com.brigosha.theclassroom;

import android.os.Bundle;
import android.widget.Toast;

import com.brigosha.theclassroom.Models.Adapters.UserAdapter;
import com.brigosha.theclassroom.Models.User;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements UserAdapter.ItemClicked{

    RecyclerView recyclerView;
    LinearLayoutManager manager;
    RecyclerView.Adapter userAdapter;
    ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        manager = new GridLayoutManager(this,1,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(manager);

        users = new ArrayList<User>();
        users.add(new User("001","Arun", "a@run.com", "4569852212","1234"));
        users.add(new User("002","Ravi", "r@avi.com", "6546846846","1234"));
        users.add(new User("003","Kaps", "k@aps.com", "5455686868","1234"));
        users.add(new User("004","Akhi", "a@khi.com", "1785783728","1234"));
        users.add(new User("005","Saju", "s@aju.com", "7139852757","1234"));
        users.add(new User("006","Pran", "p@ran.com", "1769672855","1234"));
        users.add(new User("007","Vnay", "v@nay.com", "7179782372","1234"));
        users.add(new User("008","Abdl", "a@bdl.com", "7879867868","1234"));

        userAdapter = new UserAdapter(this,users);
        recyclerView.setAdapter(userAdapter);
//        String s = "mongodb+srv://akhilesh:brigosha@classroomcluster.z0vo8.mongodb.net/ClassroomDatabase?retryWrites=true&w=majority";

    }

    @Override
    public void onItemClicked(int index) {
        Toast.makeText(this,"ID: " + users.get(index).getUserId(),Toast.LENGTH_SHORT).show();
    }

}