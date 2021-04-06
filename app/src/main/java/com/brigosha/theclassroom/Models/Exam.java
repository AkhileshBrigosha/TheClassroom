package com.brigosha.theclassroom.Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "exams")
public class Exam {

    private String examSubject;           //Subject
    @PrimaryKey
    @NonNull
    private String examTitle;        //Topic or Chapter or TypeOfExam
    private Date examDateTimeStart;     //Exam start time and date
    private Date examDateTimeEnd;       //Exam end time and date
    private int examMaxScore;           //Maximum score possible                 //String?? - for ABCDF grades
    private String examUnits;           //Unit of the Score - points or marks etc
    private boolean isExamOngoing;      //Red banner on the card
    private String examUrl;             //Button click target
    private boolean isExamUrlActive;    //Exam button clickable?
    private String examIconUrl;         //Exam icon url


    public String getExamSubject() {
        return examSubject;
    }

    public void setExamSubject(String examSubject) {
        this.examSubject = examSubject;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    public Date getExamDateTimeStart() {
        return examDateTimeStart;
    }

    public void setExamDateTimeStart(Date examDateTimeStart) {
        this.examDateTimeStart = examDateTimeStart;
    }

    public Date getExamDateTimeEnd() {
        return examDateTimeEnd;
    }

    public void setExamDateTimeEnd(Date examDateTimeEnd) {
        this.examDateTimeEnd = examDateTimeEnd;
    }

    public int getExamMaxScore() {
        return examMaxScore;
    }

    public void setExamMaxScore(int examMaxScore) {
        this.examMaxScore = examMaxScore;
    }

    public String getExamUnits() {
        return examUnits;
    }

    public void setExamUnits(String examUnits) {
        this.examUnits = examUnits;
    }

    public boolean isExamOngoing() {
        return isExamOngoing;
    }

    public void setExamOngoing(boolean examOngoing) {
        isExamOngoing = examOngoing;
    }

    public String getExamUrl() {
        return examUrl;
    }

    public void setExamUrl(String examUrl) {
        this.examUrl = examUrl;
    }

    public boolean isExamUrlActive() {
        return isExamUrlActive;
    }

    public void setExamUrlActive(boolean examUrlActive) {
        isExamUrlActive = examUrlActive;
    }

    public String getExamIconUrl() {
        return examIconUrl;
    }

    public void setExamIconUrl(String examIconUrl) {
        this.examIconUrl = examIconUrl;
    }
}
