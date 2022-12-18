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
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionActivity extends AppCompatActivity {

    private ListView listing;
    private ArrayList<HashMap<String, String>> values = new ArrayList<HashMap<String, String>>();
    HashMap<String, String> map;
    private TextView txtNom;
    String[] plats = {"Baguel au fromage","Gruau au fruit","Pancake au miel, banane et pacane","3asida à l'huile d'olive et dattes",
            "Melawi tartiné au confiture et fromage créme","Oeuf dur, olive, fromage, tomate et concombre",
            "Omlette, olive, tomate, concombre, formage"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
        setTitle("Ma collection");
        setWidgets();
        setListeners();

    }

    private void setWidgets() {
        listing = findViewById(R.id.listing);
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
//
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


        SimpleAdapter adapter = new SimpleAdapter(CollectionActivity.this, values, R.layout.element,
                new String[] {"nom", "brevage", "image"}, new int[]{R.id.txtNom, R.id.txtClasse, R.id.img});

        listing.setAdapter(adapter);
    }

    private void setListeners() {
        listing.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(CollectionActivity.this,dejeuner[i], Toast.LENGTH_LONG).show();
               Bundle extras = getIntent().getExtras();
                String jour = extras.getString("jour");
//                Toast.makeText(CollectionActivity.this, jour, Toast.LENGTH_SHORT).show();
                StringBuilder sb = new StringBuilder();
               sb = sb.append(jour+": ");
                sb= sb.append(plats[i]);
                Intent icol= new Intent(CollectionActivity.this,PlanSemaineActivity.class);
                icol.putExtra("nom",sb.toString());
                startActivity(icol);
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
//
    private void retour() {
         Intent i = new Intent(CollectionActivity.this, RepasActivity.class);
         startActivity(i);
    }

}