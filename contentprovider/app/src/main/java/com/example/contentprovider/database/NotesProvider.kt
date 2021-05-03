package com.example.contentprovider.database

import android.content.ContentProvider
import android.content.ContentValues
import android.content.Context
import android.content.UriMatcher
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.media.UnsupportedSchemeException
import android.net.Uri
import android.provider.BaseColumns._ID
import com.example.contentprovider.database.NotesDatabaseHelper.Companion.TABLE_NOTES
import java.net.URI

class NotesProvider : ContentProvider() {

    private lateinit var mUriMatcher: UriMatcher
    private lateinit var dbHelper: NotesDatabaseHelper

    override fun onCreate(): Boolean {
        mUriMatcher = UriMatcher(UriMatcher.NO_MATCH)
        mUriMatcher.addURI(AUTHORITY, path="notes", NOTES)
        mUriMatcher.addURI(AUTHORITY, path="notes/#", NOTES_BY_ID)
        IF (context != null) {
            dbHelper = NotesDatabaseHelper(context as Context)
        }
        return true
    }


    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int {
        if (mUriMatcher.match(uri) == NOTES_BY_ID) {
            val db: SQLiteDatabase = dbHelper.writableDatabase
            val linesAffect = db.delete(TABLE_NOTES, "$_ID =?", arrayOf(uri.lastPathSegment))
            db.close()
            context?.contentResolver?.notifyChange(uri, null)
            return linesAffect
        } else {
            throw UnsupportedSchemeException("URI inválida para exclusão")
        }
    }

    override fun getType(uri: Uri): String? = throw UnsupportedSchemeException("URI não implementada")

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        TODO("Implement this to handle requests to insert a new row.")
    }



    override fun query(
        uri: Uri, projection: Array<String>?, selection: String?,
        selectionArgs: Array<String>?, sortOrder: String?
    ): Cursor? {
        TODO("Implement this to handle query requests from clients.")
    }

    override fun update(
        uri: Uri, values: ContentValues?, selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        TODO("Implement this to handle requests to update one or more rows.")
    }

    companion object {
        const val AUTHORITY = "com.example.contentprovider.provider"
        val BASE_URI = Uri.parse(uriString= "content://$AUTHORITY")
        val URI_NOTES = Uri.withAppendedPath(BASE_URI, pathSegment: "notes")
        const val NOTES = 1
        const val NOTES_BY_ID = 2
    }
}