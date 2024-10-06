package pizza.lachgar.ma.pizzarecipes.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import pizza.lachgar.ma.pizzarecipes.R;
import pizza.lachgar.ma.pizzarecipes.classes.Produit;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> produits;
    private LayoutInflater inflater;

    public PizzaAdapter(List<Produit> produits, Activity activity) {
        this.produits = produits;
        inflater = LayoutInflater.from(activity);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.activity_item, parent, false);
        }

        TextView id = convertView.findViewById(R.id.id);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView prix = convertView.findViewById(R.id.prix);
        ImageView image = convertView.findViewById(R.id.image);
        TextView categorie = convertView.findViewById(R.id.categorie);
        TextView nbrIngredient = convertView.findViewById(R.id.nbrIngredients);
        TextView duree = convertView.findViewById(R.id.duree);
        TextView promo = convertView.findViewById(R.id.promo);


        Produit produit = produits.get(position);
        id.setText(String.valueOf(produit.getId()));
        nom.setText(produit.getNom());
        prix.setText(String.valueOf(produit.getPrix())+" dh");
        duree.setText(String.valueOf(produit.getDuree())+" min");
        nbrIngredient.setText(String.valueOf(produit.getNbrIngredients())+" ingrédients");
        image.setImageResource(produit.getPhoto());
        categorie.setText(produit.getCategorie());
        promo.setText(String.valueOf(produit.getPromo())+"%");

        return convertView;
    }
}