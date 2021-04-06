package com.brigosha.theclassroom.Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "assignments")
public class Assignment {

    private String asgSubject;                //Asg Title or Subject
    @PrimaryKey
    @NonNull
    private String asgTitle;             //Asg Subtitle or Topic or Chapter
    private float asgCompletionPercent;     //Asg progress bar percent
    private boolean isAsgNew;               //Yellow banner on the Card
    private String asgIconUrl;              //Asg icon url

    public String getAsgSubject() {
        return asgSubject;
    }

    public void setAsgSubject(String asgSubject) {
        this.asgSubject = asgSubject;
    }

    public String getAsgTitle() {
        return asgTitle;
    }

    public void setAsgTitle(String asgTitle) {
        this.asgTitle = asgTitle;
    }

    public float getAsgCompletionPercent() {
        return asgCompletionPercent;
    }

    public void setAsgCompletionPercent(float asgCompletionPercent) {
        this.asgCompletionPercent = asgCompletionPercent;
    }

    public boolean isAsgNew() {
        return isAsgNew;
    }

    public void setAsgNew(boolean asgNew) {
        isAsgNew = asgNew;
    }

    public String getAsgIconUrl() {
        return asgIconUrl;
    }

    public void setAsgIconUrl(String asgIconUrl) {
        this.asgIconUrl = asgIconUrl;
    }
}
