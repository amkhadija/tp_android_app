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
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
//test
    //declaration des composantes
    private ListView listing_jours;
    private String[] semaines = {"Dimanche","Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi"};
    private ArrayAdapter<String> monAdapter;

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
        monAdapter = new ArrayAdapter<>(HomeActivity.this, android.R.layout.simple_list_item_1, semaines);
        listing_jours.setAdapter(monAdapter);
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
                //Toast.makeText(MainActivity.this, semaines[i], Toast.LENGTH_LONG).show();
            }
        });
    }
/*
*  private void setListeners() {
        listing.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(ActivityListView.this, ActivityJour.class);
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
            }
        });
    }
* */


}