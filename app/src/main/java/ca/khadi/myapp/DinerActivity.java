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

public class DinerActivity extends AppCompatActivity {
    private ListView listingDinner;
    private ArrayList<HashMap<String, String>> values = new ArrayList<HashMap<String, String>>();
    HashMap<String, String> map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diner);
        setTitle("Dîner");
        listingDinner = findViewById(R.id.listingDinner);
        map = new HashMap<String, String>();
        map.put("nom", "Haricot blanc");
        map.put("brevage", "au boulletes des viandes hachés");
        map.put("image", String.valueOf(R.drawable.diner1));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Lazagne");
        map.put("brevage", "à servir avec salade");
        map.put("image", String.valueOf(R.drawable.diner2));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "couscous");
        map.put("brevage", "au légumes et viande");
        map.put("image", String.valueOf(R.drawable.diner3));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Curry au poulet");
        map.put("brevage", "servi avec riz ou pain naan");
        map.put("image", String.valueOf(R.drawable.diner4));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Pâte avec sauce de tomate");
        map.put("brevage", "au poulet");
        map.put("image", String.valueOf(R.drawable.diner5));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Tajine pois et poulet");
        map.put("brevage", "aux légumes");
        map.put("image", String.valueOf(R.drawable.diner6));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Saumon et pomme de terre");
        map.put("brevage", "au four");
        map.put("image", String.valueOf(R.drawable.diner7));
        values.add(map);
        SimpleAdapter adapter = new SimpleAdapter(DinerActivity.this, values, R.layout.element,
                new String[] {"nom", "brevage", "image"}, new int[]{R.id.txtNom, R.id.txtClasse, R.id.img});

        listingDinner.setAdapter(adapter);
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
        Intent i = new Intent(DinerActivity.this, RepasActivity.class);
        startActivity(i);
    }

}