package com.example.mbob311.dbs;


import android.app.Service;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dimas Maulana on 2/27/17.
 * Email : araymaulana66@gmail.com
 */

public class DBHelper extends SQLiteOpenHelper {

    // static variable
    private static final int DATABASE_VERSION = 1;

    // Database name
    private static final String DATABASE_NAME = "SIM_History";

    // table users
    private static final String TABLE_USERS = "users";
    // column tables
    private static final String KEY_ID_USERS = "id_users";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_STATUS_USER = "status_user";
    private static final String KEY_TIME_STAMP = "time_stamp";

    // table login
    private static final String TABLE_LOGIN = "login";
    // column tables
    private static final String KEY_ID_LOGIN = "id_login";
    private static final String KEY_STATUS_LOGIN = "status_login";

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Create table
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_USERS = "CREATE TABLE " + TABLE_USERS + "("
                + KEY_ID_USERS + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
                + KEY_USERNAME + " VARCHAR,"
                + KEY_PASSWORD + " VARCHAR,"
                + KEY_STATUS_USER + " INTEGER,"
                + KEY_TIME_STAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL" + ")";
        db.execSQL(CREATE_TABLE_USERS);

        String CREATE_TABLE_LOGIN = "CREATE TABLE " + TABLE_LOGIN + "("
                + KEY_ID_LOGIN + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
                + KEY_ID_USERS + " INTEGER NOT NULL,"
                + KEY_STATUS_LOGIN + " INTEGER,"
                + KEY_TIME_STAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL" + ")";
        db.execSQL(CREATE_TABLE_LOGIN);
    }

    // on Upgrade database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        onCreate(db);
    }
}
