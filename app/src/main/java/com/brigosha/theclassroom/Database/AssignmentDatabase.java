package com.brigosha.theclassroom.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.brigosha.theclassroom.DAO.AssignmentDAO;
import com.brigosha.theclassroom.Models.Assignment;

@Database(entities = {Assignment.class}, version = 1)
public abstract class AssignmentDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "CLASSROOM-DB";
    private static AssignmentDatabase assignmentDbInstance;

    public abstract AssignmentDAO asgDao();
    public static AssignmentDatabase getAssignmentDao(Context context){
        if(assignmentDbInstance == null){
            assignmentDbInstance = Room.databaseBuilder(context,AssignmentDatabase.class,DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return assignmentDbInstance;
    }

}
