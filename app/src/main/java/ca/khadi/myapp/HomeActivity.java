package ca.khadi.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeActivity extends AppCompatActivity {
//test
    //declaration des composantes
    private ListView listing_jours;
    private String[] semaines = {"Dimanche","Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi"};
    private ArrayAdapter<String> monAdapter;
    TextView jour, dejeuner, dinner, souper;
    ArrayList<HashMap<String, String>> values = new ArrayList<HashMap<String, String>>();
    HashMap<String, String> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Home");
        // getSupportActionBar().hide();

        setWidgets();
        setListeners();
    }


    private void setWidgets() {

        listing_jours = findViewById(R.id.listing_jours);
        map = new HashMap<String, String>();
        listing_jours.setAdapter(monAdapter);
        jour = findViewById(R.id.jour);
        dejeuner = findViewById(R.id.dejeuner);
        dinner = findViewById(R.id.dinner);
        souper= findViewById(R.id.souper);
        map.put("jour", "");
        map.put("dejeuner", "");
        map.put("dinner", "");
        map.put("souper", "");
        values.add(map);
       // monAdapter = new ArrayAdapter<>(HomeActivity.this, R.layout.plan_jour, R.id.jour, semaines);
        SimpleAdapter adapter = new SimpleAdapter(HomeActivity.this, values, R.layout.plan_jour,
                new String[] {"jour", "dejeuner", "dinner", "souper"}, new int[]{R.id.jour, R.id.dejeuner, R.id.dinner, R.id.souper});
    }
    private void setListeners() {
        listing_jours.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(HomeActivity.this, RepasActivity.class);
                String jour="";
                if(i==0){
                    jour="Dimanche";
                }else if(i==1){
                    jour="Lundi";
                }else if(i==2){
                    jour="Mardi";
                } else if(i==3){
                    jour="Mercredi";
                }else if(i==4){
                    jour="Jeudi";
                }else if(i==5){
                    jour="Vendredi";
                }else if(i==6){
                    jour="Samedi";
                }
                intent.putExtra("jour",jour);
                startActivity(intent);

                startActivity(intent);
                Toast.makeText(HomeActivity.this, semaines[i], Toast.LENGTH_LONG).show();
            }
        });
    }





}