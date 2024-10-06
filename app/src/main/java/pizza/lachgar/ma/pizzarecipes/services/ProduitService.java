package pizza.lachgar.ma.pizzarecipes.services;

import java.util.ArrayList;
import java.util.List;
import pizza.lachgar.ma.pizzarecipes.dao.IDao;
import pizza.lachgar.ma.pizzarecipes.classes.Produit;

public class ProduitService implements IDao<Produit> {
    private List<Produit> listeProduits = new ArrayList<>();

    @Override
    public boolean create(Produit p) {
        return listeProduits.add(p);
    }

    @Override
    public boolean update(Produit p) {

        return false;
    }

    @Override
    public boolean delete(Produit p) {
        return listeProduits.remove(p);
    }

    @Override
    public List<Produit> findAll() {
        return listeProduits;
    }

    @Override
    public Produit findById(int id) {
        for (Produit p : listeProduits) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}