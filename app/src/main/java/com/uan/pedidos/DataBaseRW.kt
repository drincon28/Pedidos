package com.uan.pedidos

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class DataBaseRW (var context: Context) : SQLiteOpenHelper(context, "pedidosdb",null, 1) {

    val DATABASE_NAME = "pedidosdb"

    val TABLENAME = "users"

    val COL_NAME = "Names"
    val COL_SURNAME = "Surnames"
    val COL_PASSWORD = "Password"
    val COL_PHONE = "PhoneNumber"
    val COL_MAIL = "Mail"
    val COL_ID = "ID"

    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //onCreate(db);
    }

    /*
     *
     */
    fun insertData(user: User) {
        val database = this.writableDatabase
        val contentValues = ContentValues()

        contentValues.put(COL_NAME, user.getName())
        contentValues.put(COL_MAIL, user.getMail())

        val result = database.insert(TABLENAME, null, contentValues)

        if (result == (0).toLong()) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }
    }

    /*
     *
     */
    fun readData(): MutableList<User> {
        val list: MutableList<User> = ArrayList()
        val db = this.readableDatabase
        val query = "Select * from $TABLENAME"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            do {
                val user = User("", "", 0, "", "", 0)
                user.setID(result.getString(result.getColumnIndex(COL_ID)).toInt())
                user.setName(result.getString(result.getColumnIndex(COL_NAME)))
                list.add(user)
            }
            while (result.moveToNext())
        }
        return list
    }
}