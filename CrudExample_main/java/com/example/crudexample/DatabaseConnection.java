package com.example.crudexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseConnection extends SQLiteOpenHelper {
    final static String databasename="Student";
    final static String tablename="student";
    final static String col1="name";
    final static String col2="course_name";
    final static String col3="fee";

    public DatabaseConnection(@Nullable Context context) {
        super(context, databasename, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+tablename+"("+col1+" text primary key,"+col2+" text,"+ col3 +" text)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists "+tablename);

    }

    public boolean insert(String toString, String toString1, String toString2) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(col1,toString);
        contentValues.put(col2,toString1);
        contentValues.put(col3,toString2);
        long r=db.insert(tablename,null,contentValues);
        if(r==-1){
            return false;
        }
        else{
            return true;
        }
    }

    public Cursor display() {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor c=db.rawQuery("select * from "+tablename,null);
        return c;

    }

    public boolean delete(String toString) {
        SQLiteDatabase db=this.getWritableDatabase();
        long r=db.delete(tablename,col1+"=?",new String[]{toString});
        if(r==-1){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean update(String toString) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(col2,"Java");
        values.put(col3,"6000");
        long r=db.update(tablename,values,col1+"=?",new String[]{toString});
        if(r==-1){
            return false;
        }
        else{
            return true;
        }

    }
}
