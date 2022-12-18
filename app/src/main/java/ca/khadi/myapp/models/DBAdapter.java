package ca.khadi.myapp.models;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;

public class DBAdapter {
    private SQLiteDatabase dBase;
    private JourneeDBHelper dbHelper;
    private Context context;

    public DBAdapter(Context context) {
        this.context = context;
        this.dbHelper=new JourneeDBHelper(context, JourneeDBHelper.BD_NOM, null,
                JourneeDBHelper.VERSION);
    }

    //methode open
    public void openBd(){
        dBase=dbHelper.getWritableDatabase();
    }
    //methode fermer
    public void fermerBd(){
        dBase.close();
    }

    //methode ajouterJournee insert
    public void ajouterJournee(Journee j){
        openBd();
        // recuperer des valeurs
        String jour=j.getJour();
        String petitDej=j.getPetitDej();
        String diner=j.getDiner();
        String souper=j.getSouper();
        ContentValues cv=new ContentValues();
        cv.put(JourneeDBHelper.COL_JOUR, jour);
        cv.put(JourneeDBHelper.COL_PETITDEJ, petitDej);
        cv.put(JourneeDBHelper.COL_DINER, diner);
        cv.put(JourneeDBHelper.COL_SOUPER, souper);

        dBase.insert(JourneeDBHelper.TABLE_Journee, null, cv);
        Toast.makeText(context, "Ajout reussi", Toast.LENGTH_LONG).show();
        fermerBd();
    }
    public ArrayList<Journee>listerDonner(){
        openBd();
        String[] cols = {JourneeDBHelper.COL_JOUR, JourneeDBHelper.COL_PETITDEJ, JourneeDBHelper.COL_DINER,JourneeDBHelper.COL_SOUPER};
        Cursor cursor = dBase.query(JourneeDBHelper.TABLE_Journee, cols,null, null, null, null, null);
        cursor.moveToFirst();
        ArrayList<Journee>registre=new ArrayList<>();
        while(!cursor.isAfterLast()){

            String jour=cursor.getString(2);
            String petitDej=cursor.getString(1);
           // String diner=cursor.getString(3);
            //String souper=cursor.getString(4);
            registre.add(new Journee(jour, petitDej));
            cursor.moveToNext();
        }
        fermerBd();
        return registre;
    }
}
