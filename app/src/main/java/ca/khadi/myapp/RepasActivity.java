package ca.khadi.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class RepasActivity extends AppCompatActivity {
    private TextView txtJour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repas);
        setTitle("Repas");
        txtJour=findViewById(R.id.txtJour);
        Bundle extras=getIntent().getExtras();
        String jour=extras.getString("jour");
        txtJour.setText(jour);

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
}