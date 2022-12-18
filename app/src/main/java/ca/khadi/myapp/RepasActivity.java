package ca.khadi.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class RepasActivity extends AppCompatActivity {
    private TextView txtJour;
    String jour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repas);
        setTitle("Repas");
        setWidgets();
        Bundle extras = getIntent().getExtras();
        String jour = extras.getString("jour");

        txtJour.setText(jour);
        txtJour.setGravity(Gravity.CENTER);
        setBorderView(txtJour);
    }

    private void setWidgets() {
        txtJour=findViewById(R.id.txtJour);
    }
    private void setBorderView(TextView tv) {
        GradientDrawable gd=new GradientDrawable();
        gd.setColor(0xFF800080);
        gd.setCornerRadius(15);
        gd.setStroke(1, 0xFF000000);
        tv.setBackground(gd);
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
                Intent iCollection = new Intent(RepasActivity.this, CollectionActivity.class);
                startActivity(iCollection);

        }
        return super.onOptionsItemSelected(item);
    }

    private void retour() {
        Intent i = new Intent(RepasActivity.this, HomeActivity.class);
        startActivity(i);
    }

    public void onDejeuner(View view) {
        Intent i = new Intent(RepasActivity.this, CollectionActivity.class);
        i.putExtra("jour", txtJour.getText().toString());
        startActivity(i);
    }

    public void onSouper(View view) {
        Intent i = new Intent(RepasActivity.this, CollectionActivity.class);
        startActivity(i);
    }

    public void onDiner(View view) {
        Intent i = new Intent(RepasActivity.this, CollectionActivity.class);
        startActivity(i);
    }
}