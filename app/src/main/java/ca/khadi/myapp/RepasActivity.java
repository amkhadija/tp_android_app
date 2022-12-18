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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RepasActivity extends AppCompatActivity {
    private TextView txtJour;
    String jour;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repas);
        setTitle("Repas");
        setWidgets();
        Bundle extras = getIntent().getExtras();
        String jour = extras.getString("jour");
        Toast.makeText(this, jour, Toast.LENGTH_SHORT).show();
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Toast.makeText(RepasActivity.this, jour, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(RepasActivity.this, CollectionActivity.class);
                i.putExtra("jour", jour);
                Toast.makeText(RepasActivity.this, jour, Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        txtJour.setText(jour);
        txtJour.setGravity(Gravity.CENTER);
        setBorderView(txtJour);
        //setListernes();
    }

    private void setWidgets() {
        txtJour = findViewById(R.id.txtJour);
        imageView2 = findViewById(R.id.imageView2);
    }

    private void setListernes() {
//        imageView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//              //  Toast.makeText(RepasActivity.this, jour, Toast.LENGTH_SHORT).show();
//                Intent i = new Intent(RepasActivity.this, CollectionActivity.class);
//               i.putExtra("jour", "test");
//                startActivity(i);
//            }
//        });
    }


    private void setBorderView(TextView tv) {
        GradientDrawable gd = new GradientDrawable();
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
            case R.id.afficher:
                Intent iCollection = new Intent(RepasActivity.this, CollectionActivity.class);
                startActivity(iCollection);

        }
        return super.onOptionsItemSelected(item);
    }

    private void retour() {
        Intent i = new Intent(RepasActivity.this, HomeActivity.class);
        startActivity(i);
    }

//    public void onDejeuner(View view) {
//       // Toast.makeText(this, jour, Toast.LENGTH_SHORT).show();
//        Intent i = new Intent(RepasActivity.this, CollectionActivity.class);
//       // i.putExtra("jour", jour);
//        startActivity(i);
//    }

    public void onSouper(View view) {
        Intent i = new Intent(RepasActivity.this, CollectionActivity.class);
        startActivity(i);
    }

    public void onDiner(View view) {
        Intent i = new Intent(RepasActivity.this, CollectionActivity.class);
        startActivity(i);
    }
}