package com.brigosha.theclassroom.Models;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.brigosha.theclassroom.R;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    @NonNull
    private String userId;
    @NonNull
    private String userName;

    private String userEmail;

    private String userNumber;

    public User(String uid, String uname, String umail, String unum) {
        userName = uname;
        userEmail = umail;
        userId = uid;
        userNumber = unum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }
}

class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>{

    private ArrayList<User> users;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_user_info,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setTag(users.get(position));
        holder.user_name.setText(users.get(position).getUserName());
        holder.user_mail.setText(users.get(position).getUserEmail());
        holder.user_img.setImageResource(R.drawable.ic_menu_myplaces);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView user_img;
        TextView user_name, user_mail, user_num;

         public ViewHolder(@NonNull View itemView) {
             super(itemView);
             user_img = itemView.findViewById(R.id.user_img);
             user_mail = itemView.findViewById(R.id.user_mail);
             user_name = itemView.findViewById(R.id.user_name);
             user_num = itemView.findViewById(R.id.user_num);
         }
    }
}
