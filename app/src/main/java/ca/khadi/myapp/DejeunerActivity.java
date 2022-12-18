package ca.khadi.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class DejeunerActivity extends AppCompatActivity {
    private ListView listing;
    private ArrayList<HashMap<String, String>> values = new ArrayList<HashMap<String, String>>();
    HashMap<String, String> map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dejeuner);
        setTitle("Déjeuner");
        setListeners();
        
        listing = findViewById(R.id.listingDinner);
        map = new HashMap<String, String>();
        map.put("nom", "Baguel au fromage");
        map.put("brevage", "Jus orange et café");
        map.put("image", String.valueOf(R.drawable.dej1));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Gruau au fruit");
        map.put("brevage", "Jus d'orange");
        map.put("image", String.valueOf(R.drawable.dej2));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Pancake au miel, banane et pacane");
        map.put("brevage", "jus d'orange");
        map.put("image", String.valueOf(R.drawable.dej3));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "3asida à l'huile d'olive et dattes");
        map.put("brevage", "café");
        map.put("image", String.valueOf(R.drawable.dej4));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Melawi tartiné au confiture et fromage créme");
        map.put("brevage", "Café");
        map.put("image", String.valueOf(R.drawable.dej5));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Oeuf dur, olive, fromage, tomate et concombre");
        map.put("brevage", "Thé Turque");
        map.put("image", String.valueOf(R.drawable.dej6));
        values.add(map);

        map = new HashMap<String, String>();
        map.put("nom", "Omlette, olive, tomate, concombre, formage");
        map.put("brevage", "Thé ou café");
        map.put("image", String.valueOf(R.drawable.dej7));
        values.add(map);
        SimpleAdapter adapter = new SimpleAdapter(DejeunerActivity.this, values, R.layout.element,
                new String[] {"nom", "brevage", "image"}, new int[]{R.id.txtNom, R.id.txtClasse, R.id.img});

        listing.setAdapter(adapter);
    }

    private void setListeners() {
        listing.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(DejeunerActivity.this,listing.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });
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
        Intent i = new Intent(DejeunerActivity.this, RepasActivity.class);
        startActivity(i);
    }

}