package pizza.lachgar.ma.pizzarecipes.services;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import pizza.lachgar.ma.pizzarecipes.R;

public class descriptionAct extends AppCompatActivity {
    private TextView titrePizza, contenuDescription, contenuIngrédients, contenuPreparation;
    private ImageView imagePizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description2);
        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getString(R.string.toolbar));

        // Initialiser les autres vues
        titrePizza = findViewById(R.id.titrePizza);
        contenuDescription = findViewById(R.id.contenuDescription);
        contenuIngrédients = findViewById(R.id.contenuIngrédients);
        imagePizza = findViewById(R.id.imagePizza);
        contenuPreparation = findViewById(R.id.contenuPreparation);

        // Récupérer et définir les valeurs à partir de l'intent
        titrePizza.setText(getIntent().getStringExtra("titrePizza"));
        contenuDescription.setText(getIntent().getStringExtra("contenuDescription"));
        contenuIngrédients.setText(getIntent().getStringExtra("contenuIngrédients"));
        contenuPreparation.setText(getIntent().getStringExtra("contenuPreparation"));
        int imageResId = getIntent().getIntExtra("imagePizza", -1);
        imagePizza.setImageResource(imageResId);
    }
}
