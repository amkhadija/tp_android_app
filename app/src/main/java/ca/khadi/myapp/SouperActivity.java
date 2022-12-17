package ca.khadi.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class SouperActivity extends AppCompatActivity {
    private ListView listingSouper;
    private ArrayList<HashMap<String, String>> values = new ArrayList<HashMap<String, String>>();
    HashMap<String, String> map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_souper);
        setTitle("Souper");
        listingSouper = findViewById(R.id.listingSouper);
        map = new HashMap<String, String>();
        map.put("nom", "Soupe vermicelle");
        map.put("details", "au poulet et légumes");
        map.put("image", String.valueOf(R.drawable.souper1));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Crépe salée au thon");
        map.put("details", "servi avec salade au choix");
        map.put("image", String.valueOf(R.drawable.souper2));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Quich d'épinards");
        map.put("details", "avec ricotte et poulet");
        map.put("image", String.valueOf(R.drawable.souper3));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Chakchouka");
        map.put("details", "au merguez");
        map.put("image", String.valueOf(R.drawable.souper4));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Soupe d'orge");
        map.put("details", "et brique au oeuf et thon");
        map.put("image", String.valueOf(R.drawable.souper5));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Gratin de chou fleur");
        map.put("details", "au poulet");
        map.put("image", String.valueOf(R.drawable.souper6));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Pizza fruit de mer");
        map.put("details", "servi avec fruit");
        map.put("image", String.valueOf(R.drawable.souper7));
        values.add(map);
        SimpleAdapter adapter = new SimpleAdapter(SouperActivity.this, values, R.layout.element,
                new String[] {"nom", "details", "image"}, new int[]{R.id.txtNom, R.id.txtClasse, R.id.img});

        listingSouper.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int option = item.getItemId();
        switch (option) {
            case R.id.btnReturn:
                retour();
                break;
            case R.id.btnAdd:
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void retour() {
        Intent is = new Intent(SouperActivity.this, RepasActivity.class);
        startActivity(is);
    }

}