package pizza.lachgar.ma.pizzarecipes.services;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import pizza.lachgar.ma.pizzarecipes.R;

public class SplashActivity extends AppCompatActivity {
    private ImageView img; // ImageView pour afficher l'image
    private TextView textView; // TextView pour afficher la phrase
    private String[] words; // Tableau pour stocker les mots de la phrase
    private int index = 0; // Pour suivre l'index du mot actuel
    private Handler handler = new Handler(); // Pour gérer le timing de l'animation

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        img = findViewById(R.id.img); // Assurez-vous d'avoir un ImageView avec cet ID dans votre layout
        textView = findViewById(R.id.presentation); // Assurez-vous d'avoir ce TextView dans votre layout

        // Afficher l'image sans animation
        img.setImageResource(R.drawable.icon); // Remplacez "your_image" par le nom de votre image

        // Récupérer la phrase à partir du TextView et la diviser en mots
        String phrase = textView.getText().toString(); // Récupérer la phrase
        words = phrase.split(" "); // Diviser la phrase en mots

        // Démarrer l'animation de texte
        animateText();

        // Lancer la nouvelle activité après 2000 ms
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
            startActivity(intent);
            finish();
        }, 4000);
    }

    private void animateText() {
        // Réinitialiser le texte à vide au début
        StringBuilder displayedText = new StringBuilder();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (index < words.length) {
                    // Ajouter un espace si ce n'est pas le premier mot
                    if (displayedText.length() > 0) {
                        displayedText.append(" ");
                    }

                    // Ajouter le mot actuel
                    displayedText.append(words[index]);

                    // Mettre à jour le TextView avec le texte accumulé
                    textView.setText(displayedText.toString());

                    index++; // Passer au mot suivant
                    handler.postDelayed(this, 400); // Répéter après 500 ms
                }
            }
        }, 400); // Commencer après 500 ms
    }


}
