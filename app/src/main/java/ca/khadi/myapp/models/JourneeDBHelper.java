package ca.khadi.myapp.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class JourneeDBHelper extends SQLiteOpenHelper {
    public static final String BD_NOM="bdeb";
    public static final int VERSION=1;

    // tables
   public static final String TABLE_Journee="journee";
    public static final String COL_ID="_ID";
    public static final String COL_JOUR="jour";
    public static final String COL_PETITDEJ="petitDej";
    public static final String COL_DINER="diner";
    public static final String COL_SOUPER="souper";


    //ddl de table
    public static final String DDL_JOURNEE="create table "+TABLE_Journee+"("+COL_ID+
            "	integer primary key autoincrement,"+COL_JOUR+
            "	TEXT,"+
            COL_PETITDEJ+" TEXT,"+COL_DINER+" TEXT," +
                        COL_SOUPER+" TEXT)";

    public JourneeDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DDL_JOURNEE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
