package com.example.contentprovider.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns._ID

class NotesDatabaseHelper (
    context: Context
) :SQLiteOpenHelper(context, name= "databaseNotes", factory= null, version= 1) {


    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE $TABLE_NOTES (" +
            "$_ID INTEGER NOT NULL PRIMARY KEY, " +
            "$TITLE_NOTES TEXT NOT NULL," +
            "$DESCRIPTION_NOTES TEXT NOT NULL")
    }

    companion object {
        const val TABLE_NOTES: String = "Notes"
        const val TITLE_NOTES: String = "title"
        const val DESCRIPTION_NOTES: String = "description"
    }
}

private fun SQLiteDatabase?.execSQL(sql: String?, s: String) {

}
