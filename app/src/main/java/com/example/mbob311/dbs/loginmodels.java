package com.example.mbob311.dbs;

public class loginmodels {

    int id_login;
    int id_users;
    int status_login;

    // contrustor(empty)
    public loginmodels() {
    }

    // constructor
    public loginmodels(int id_login, int id_users, int status_login) {
        this.id_login = id_login;
        this.id_users = id_users;
        this.status_login = status_login;
    }

    /*Setter and Getter*/

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    public int getId_users() {
        return id_users;
    }

    public void setId_users(int id_users) {
        this.id_users = id_users;
    }

    public int getStatus_login() {
        return status_login;
    }

    public void setStatus_login(int status_login) {
        this.status_login = status_login;
    }
}
