package com.brigosha.theclassroom.DAO;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.brigosha.theclassroom.Models.Assignment;

@Dao
public interface AssignmentDAO {

    @Query("SELECT * FROM assignments")
    LiveData<Assignment> getAssignments();

    @Insert
    void insertAssignment(Assignment... assignments);

    @Delete
    void deleteAssignment(Assignment... assignments);

    @Update(onConflict = REPLACE)
    void updateAssignment(Assignment... assignments);

}
