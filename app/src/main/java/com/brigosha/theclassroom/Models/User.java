package com.brigosha.theclassroom.Models;

public class User {

    private String userEmail;
    private String userId;
    private String userName;
    private String userNumber;
    private String userPassword;

    public User( String userId, String userName,String userEmail, String userNumber, String userPassword) {
        this.userEmail = userEmail;
        this.userId = userId;
        this.userName = userName;
        this.userNumber = userNumber;
        this.userPassword = userPassword;
    }

    public User(){}

    // Standard getters & setters
    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    public String getUserNumber() { return userNumber; }
    public void setUserNumber(String userNumber) { this.userNumber = userNumber; }
    public String getUserPassword() { return userPassword; }
    public void setUserPassword(String userPassword) { this.userPassword = userPassword; }
}
