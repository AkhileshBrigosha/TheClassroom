package com.brigosha.theclassroom.Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "schedules")
public class Schedule {
    @PrimaryKey
    @NonNull
    private String scheduleTitle;           //Schedule Title or Subject
    private Date scheduleDateTimeStart;     //Schedule start time and date
    private Date scheduleDateTimeEnd;       //Schedule end time and date
    private String scheduleInstructor;      //Instructor who is taking the class        //User datatype??
    private boolean isScheduleOngoing;      //Red banner on the card??
    private String scheduleUrl;             //Button click target
    private boolean isScheduleUrlActive;    //Join class button clickable?
    private String scheduleIconUrl;         //Schedule icon url

    public String getScheduleTitle() {
        return scheduleTitle;
    }

    public void setScheduleTitle(String scheduleTitle) {
        this.scheduleTitle = scheduleTitle;
    }

    public Date getScheduleDateTimeStart() {
        return scheduleDateTimeStart;
    }

    public void setScheduleDateTimeStart(Date scheduleDateTimeStart) {
        this.scheduleDateTimeStart = scheduleDateTimeStart;
    }

    public Date getScheduleDateTimeEnd() {
        return scheduleDateTimeEnd;
    }

    public void setScheduleDateTimeEnd(Date scheduleDateTimeEnd) {
        this.scheduleDateTimeEnd = scheduleDateTimeEnd;
    }

    public String getScheduleInstructor() {
        return scheduleInstructor;
    }

    public void setScheduleInstructor(String scheduleInstructor) {
        this.scheduleInstructor = scheduleInstructor;
    }

    public boolean isScheduleOngoing() {
        return isScheduleOngoing;
    }

    public void setScheduleOngoing(boolean scheduleOngoing) {
        isScheduleOngoing = scheduleOngoing;
    }

    public String getScheduleUrl() {
        return scheduleUrl;
    }

    public void setScheduleUrl(String scheduleUrl) {
        this.scheduleUrl = scheduleUrl;
    }

    public boolean isScheduleUrlActive() {
        return isScheduleUrlActive;
    }

    public void setScheduleUrlActive(boolean scheduleUrlActive) {
        isScheduleUrlActive = scheduleUrlActive;
    }

    public String getScheduleIconUrl() {
        return scheduleIconUrl;
    }

    public void setScheduleIconUrl(String scheduleIconUrl) {
        this.scheduleIconUrl = scheduleIconUrl;
    }
}
