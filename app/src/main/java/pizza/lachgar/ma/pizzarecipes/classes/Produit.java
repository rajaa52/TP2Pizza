package pizza.lachgar.ma.pizzarecipes.classes;

public class Produit {
    private int id;
    private String nom;

    public int getPromo() {
        return promo;
    }

    private int promo;
    private int photo;
    private String description;
    private String detaisIngred;
    private double prix;
    private String categorie;
    private String preparation;

    private int nbrIngredients;
    private int duree;

    public String getPreparation() {
        return preparation;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public int getDuree() {
        return duree;
    }
public static int compteur=0;
    public Produit(String nom, int photo, String description,
                   double prix, String detaisIngred,
                   String categorie,int nbrIngredients,
                   int duree,int promo,String preparation) {
        this.nom = nom;
        this.preparation=preparation;
        this.duree=duree;
        this.nbrIngredients=nbrIngredients;
        this.photo = photo;
        this.description = description;
        this.prix = prix;
        this.detaisIngred = detaisIngred;
        this.categorie = categorie;
        this.promo=promo;
        this.id=compteur++;
    }
    public Produit() {
        this.nom = null;
        this.preparation=null;
        this.duree=0;
        this.nbrIngredients=0;
        this.photo = 0;
        this.description = null;
        this.prix = 0;
        this.detaisIngred = null;
        this.categorie = null;
        this.promo=0;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", promo=" + promo +
                ", photo=" + photo +
                ", description='" + description + '\'' +
                ", detaisIngred='" + detaisIngred + '\'' +
                ", prix=" + prix +
                ", categorie='" + categorie + '\'' +
                ", preparation='" + preparation + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", duree=" + duree +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPromo(int promo) {
        this.promo = promo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDetaisIngred(String detaisIngred) {
        this.detaisIngred = detaisIngred;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public int getPhoto() { return photo; }
    public String getDescription() { return description; }
    public String getDetaisIngred() { return detaisIngred; }
    public double getPrix() { return prix; }
    public String getCategorie() { return categorie; }
}