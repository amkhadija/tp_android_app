package ca.khadi.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import ca.khadi.myapp.models.DBAdapter;
import ca.khadi.myapp.models.Journee;

public class PlanSemaineActivity extends AppCompatActivity {
// actvity de plan de semaine
private ArrayAdapter<String> listAdapter;
    private DBAdapter dbAdapter;
    private ListView listing;
    ListView plan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_semaine);
        setTitle("Plan semaine");
        setWidgets();
        Intent recu=getIntent();
        String liste=recu.getStringExtra("registre");
        Toast.makeText(this, liste, Toast.LENGTH_LONG).show();
        TextView tv=new TextView(this);
        tv.setText(liste);
        plan.addView(tv);
    }

    private void setWidgets() {
        plan = findViewById(R.id.plan);
        //recuperer les donnees envoyer dans l'intente
        Intent recuIntent = getIntent();
        String liste=recuIntent.getStringExtra("registre");
        String choix = recuIntent.getStringExtra("nom");

        TextView tv1 = new TextView(this);
        tv1.setTextSize(20);
        tv1.setText( liste);
        plan.addView(tv1);
    }

  /*  @Override
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
            case R.id.afficher:
                afficher();
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/

    private void afficher() {

    }

    private void retour() {
        Intent i = new Intent(PlanSemaineActivity.this, CollectionActivity.class);
        startActivity(i);
    }
}