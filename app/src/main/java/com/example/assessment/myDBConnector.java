package com.example.assessment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class myDBConnector extends SQLiteOpenHelper {
    private static final int DB_VERSION =1;
    private static final String DB_NAME="Registration.db";
    private static final String TABLE_Users = "Users";
    private static final String COLUMN_ID="UsersID";
    private static final String COLUMN_Name="Name";
    private static final String COLUMN_UserName="UserName";
    private static final String COLUMN_Password="Password";

    public myDBConnector(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, factory, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_table = "CREATE TABLE " +
                TABLE_Users + "(" +
                COLUMN_ID + "INTEGER PRIMARY KEY ," +
                COLUMN_Name + " TEXT NOT NULL," +
                COLUMN_UserName + " TEXT NOT NULL," +
                COLUMN_Password + "INTEGER NOT NULL" + ")";


        db.execSQL(CREATE_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void addNewUser(String name, String userName, String password){
        ContentValues values = new ContentValues();

        values.put(COLUMN_Name, name);
        values.put(COLUMN_UserName, userName);
        values.put(COLUMN_Password, password);

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_Users, null, values);
        db.close();
    }

    public boolean checkLogin(String username , String password){
        boolean result = false;
        String query = "Select * FROM " + TABLE_Users + " WHERE " + COLUMN_UserName + "= \"" +username+"\"";

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(query,null);

        if (cursor.moveToFirst()){
            if(cursor.getString(3).equals(password)){
                result = true;

            }
        }else {
            result = false;
        }
        cursor.close();
        db.close();
        return result;
    }
    public String findUser(String Username){
        String s = null;
        String query = "Select * FROM " + TABLE_Users + " WHERE " + COLUMN_UserName + "= \"" +Username+"\"";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query,null);
        if (cursor.moveToFirst()){
            s = Integer.parseInt(cursor.getString(0)) +
                    cursor.getString(1)+
                    cursor.getString(2)+
                    cursor.getString(3);
        }
        cursor.close();
        db.close();
        return s;

    }
}

