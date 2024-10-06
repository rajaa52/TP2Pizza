package pizza.lachgar.ma.pizzarecipes.services;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import pizza.lachgar.ma.pizzarecipes.R;

public class SplashActivity extends AppCompatActivity {
    private ImageView img;
    private TextView textView;
    private String[] words;
    private int index = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        img = findViewById(R.id.img);
        textView = findViewById(R.id.presentation);

        img.setImageResource(R.drawable.icon);

        String phrase = textView.getText().toString();
        words = phrase.split(" ");

        animateText();

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
            startActivity(intent);
            finish();
        }, 4000);
    }

    private void animateText() {
        StringBuilder displayedText = new StringBuilder();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (index < words.length) {
                    if (displayedText.length() > 0) {
                        displayedText.append(" ");
                    }

                    displayedText.append(words[index]);

                    textView.setText(displayedText.toString());

                    index++;
                    handler.postDelayed(this, 400);
                }
            }
        }, 400);
    }


}
