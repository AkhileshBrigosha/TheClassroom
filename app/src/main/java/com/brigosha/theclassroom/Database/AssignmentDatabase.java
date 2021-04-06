package com.brigosha.theclassroom.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.brigosha.theclassroom.DAO.AssignmentDAO;
import com.brigosha.theclassroom.Models.Assignment;

@Database(entities = {Assignment.class}, version = 1)
abstract class AssignmentDatabase extends RoomDatabase {
//    abstract public AssignmentDAO
}
