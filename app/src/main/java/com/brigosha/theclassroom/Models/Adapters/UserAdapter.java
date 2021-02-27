package com.brigosha.theclassroom.Models.Adapters;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.brigosha.theclassroom.Models.User;
import com.brigosha.theclassroom.R;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>{

    private ArrayList<User> users;
    ItemClicked activity;

    public interface ItemClicked{
        void onItemClicked(int index);
        void onCallButtonClicked(int index);
    }


    public UserAdapter(Context context, ArrayList<User> users){
        this.users = users;
        activity = (ItemClicked) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView user_img;
        ImageButton user_call_btn;
        TextView user_name, user_mail, user_num;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            user_img = itemView.findViewById(R.id.user_img);
            user_mail = itemView.findViewById(R.id.user_mail);
            user_name = itemView.findViewById(R.id.user_name);
            user_num = itemView.findViewById(R.id.user_num);
            user_call_btn = itemView.findViewById(R.id.user_call_btn);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemClicked(users.indexOf((User) v.getTag()));
                }
            });

            user_call_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onCallButtonClicked(users.indexOf((User) v.getTag()));
                }
            });
        }
    }

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
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

}
