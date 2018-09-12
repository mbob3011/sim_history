package com.example.mbob311.dbs;

public class usermodels {

    int id_users;
    String username;
    String password;
    int status_user;

    // contrustor(empty)
    public usermodels() {
    }

    // constructor
    public usermodels(int id_users, String username, String password, int status_user) {
        this.id_users = id_users;
        this.username = username;
        this.password = password;
        this.status_user = status_user;
    }

    /*Setter and Getter*/

    public int getId_users() {
        return id_users;
    }

    public void setId_users(int id_users) {
        this.id_users = id_users;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus_user() {
        return status_user;
    }

    public void setStatus_user(int status_user) {
        this.status_user = status_user;
    }
}