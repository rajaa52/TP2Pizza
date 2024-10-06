package pizza.lachgar.ma.pizzarecipes.services;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import pizza.lachgar.ma.pizzarecipes.adapter.PizzaAdapter;
import pizza.lachgar.ma.pizzarecipes.classes.Produit;
import pizza.lachgar.ma.pizzarecipes.R;

public class ListPizzaActivity extends AppCompatActivity {
    private ProduitService fs = new ProduitService();
    private ListView list;
    private PizzaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fs.create(new Produit(
                "PEPPERONI-SAUSAGE STUFFED PIZZA",
                R.drawable.pizza1,
                "Une pizza généreusement garnie de pepperoni et de saucisse, avec une croûte farcie de fromage fondant",55
                ,"- 1 sachet (7 g) de levure sèche active\n- 1-1/4 tasses d'eau tiède (43° à 46°)\n- 2 cuillères à soupe d'huile d'olive\n- 1-1/2 cuillères à café de sel\n- 1 cuillère à café de sucre\n- 3-1/2 à 4 tasses de farine tout usage\n"
                ,
                "Végétarienne",
                6,
                45,
                10, "ÉTAPE 1:\n\n Dans un petit bol, dissoudre la levure dans de l'eau tiède. Dans un grand bol, mélanger l'huile, le sel, le sucre, le mélange de levure et 1 tasse de farine; battre à vitesse moyenne jusqu'à obtention d'une pâte lisse. Ajouter suffisamment de farine restante pour former une pâte ferme.\n\nÉTAPE 2:\n\n Transférer la pâte sur une surface farinée; pétrir jusqu'à ce qu'elle soit lisse et élastique, environ 6-8 minutes. Placer dans un bol graissé, retourner une fois pour graisser le dessus. Couvrir avec un film plastique et laisser lever dans un endroit chaud jusqu'à ce qu'elle double de volume, environ 1 heure.\n\nÉTAPE 3:\n\n Préchauffer le four à 220°C. Graisser un moule de 33x23 cm. Dégonfler la pâte; la diviser en trois portions. Sur une surface légèrement farinée, combiner deux portions de pâte et les étaler en un rectangle de 38x28 cm. Transférer dans le moule préparé, en appuyant sur le fond et les côtés du moule. Garnir de 2 tasses de mozzarella et 2 tasses de cheddar. Saupoudrer de farine, assaisonnements, saucisse cuite, champignons et pepperoni.\n\nÉTAPE 4:\n\n Étaler la pâte restante en un rectangle de 33x23 cm. Placer la pâte sur la garniture, sceller les bords en les pinçant, et piquer le dessus avec une fourchette. Saupoudrer avec le reste des fromages. Cuire sur une grille inférieure pendant 10 minutes.\n\nÉTAPE 5:\n\n Réduire la température du four à 190°C. Étaler la sauce tomate sur le fromage. Cuire encore 30-35 minutes ou jusqu'à ce que les bords soient légèrement dorés. Laisser reposer 10 minutes avant de couper. Si désiré, saupoudrer de parmesan. Donne : 12 parts."));

                fs.create(new Produit(
                "MARGHERITA PIZZA",
                R.drawable.pizza2,
                "A classic Italian pizza with fresh mozzarella and basil",
                39.99,
                        "- 2 tasses de farine tout usage\n- 1 c. à café de levure sèche active\n- 1/2 tasse d'eau tiède (43°C)\n- 1/2 c. à café de sucre\n- 2 c. à soupe d'huile d'olive\n- 1/4 c. à café de sel\n- 1 tasse de mozzarella fraîche\n- 1/4 tasse de feuilles de basilic\n- 1/2 tasse de sauce tomate\n",

                        "Classique",
                8,
                25,
                10, // Promo en pourcentage (par exemple 10% de réduction)
                "ÉTAPE 1:\n\nDans un petit bol, dissoudre la levure et le sucre dans de l'eau tiède. Laisser reposer jusqu'à ce que des bulles se forment, environ 5 minutes. Ajouter la farine, l'huile d'olive et le sel. Remuer jusqu'à formation d'une pâte.\n\nÉTAPE 2:\n\nTransférer la pâte sur une surface farinée et pétrir pendant 5 à 7 minutes, jusqu'à ce qu'elle devienne lisse et élastique. Couvrir et laisser lever pendant 30 minutes. Étaler la pâte en un cercle de 30 cm.\n\nÉTAPE 3:\n\nPréchauffer le four à 245°C. Étaler la sauce tomate sur la pâte en laissant une bordure autour des bords. Ajouter la mozzarella et le basilic frais. Arroser d'huile d'olive.\n\nÉTAPE 4:\n\nCuire au four pendant 10-12 minutes, ou jusqu'à ce que la croûte soit dorée et que le fromage soit bouillonnant. Laisser reposer quelques minutes avant de découper. Donne: 8 parts."
        ));

        fs.create(new Produit(
                "BRUSCHETTA",
                R.drawable.pizza4,
                "Vous pourriez avoir besoin d'un couteau et d'une fourchette pour cette pizza copieuse ! Chargée de saveurs italiennes et de nombreuses tomates fraîches, elle est destinée à devenir un favori de la famille. Elle est encore meilleure avec une croûte de blé entier faite maison ! —Debra Kell, Owasso, Oklahoma",
                65.00,
                "- 1/2 livre de saucisse de porc maigre en vrac\n" +
                        "- 1 croûte de pizza précuite de 12 pouces\n" +
                        "- 1 paquet (170 g) de pepperoni de dinde tranché\n" +
                        "- 2 tasses de mozzarella partiellement écrémée râpée\n" +
                        "- 1-1/2 tasses de tomates prunes hachées\n" +
                        "- 1/2 tasse de feuilles de basilic frais, finement tranchées\n" +
                        "- 1 cuillère à soupe d'huile d'olive\n" +
                        "- 2 gousses d'ail, émincées\n" +
                        "- 1/2 cuillère à café de thym frais haché ou 1/8 cuillère à café de thym séché\n" +
                        "- 1/2 cuillère à café de vinaigre balsamique\n" +
                        "- 1/4 cuillère à café de sel\n" +
                        "- 1/8 cuillère à café de poivre\n" +
                        "- Feuilles de basilic frais supplémentaires, facultatif",
                "végétarienne",
                14,
                14,
                5,
                "ÉTAPE 1 :\n\nDans une petite poêle, cuire la saucisse à feu moyen jusqu'à ce qu'elle ne soit plus rose ; égoutter. Placer la croûte sur une plaque à pâtisserie non graissée. Garnir de pepperoni, de saucisse et de fromage. Cuire au four à 450° pendant 10 à 12 minutes ou jusqu'à ce que le fromage soit fondu.\n\n" +
                        "ÉTAPE 2 :\n\nDans un petit bol, combiner les tomates, le basilic tranché, l'huile, l'ail, le thym, le vinaigre, le sel et le poivre. Verser sur la pizza. Garnir de basilic supplémentaire si désiré. Donne : 8 parts."
        ));

        fs.create(new Produit(
                "LOADED MEXICAN PIZZA",
                R.drawable.pizza7,
                "Cette pizza mexicaine est pleine de saveurs grâce aux haricots noirs, épinards, jalapeños et deux types de fromage. Un plat sain et délicieux qui plaira à toute la famille.",
                65.00,
                "- 1 boîte (15 onces) de haricots noirs, rincés et égouttés\n" +
                        "- 1 oignon rouge moyen, haché\n" +
                        "- 1 petit poivron jaune doux, haché\n" +
                        "- 3 cuillères à café de poudre de chili\n" +
                        "- 3/4 cuillère à café de cumin moulu\n" +
                        "- 3 tomates moyennes, hachées\n" +
                        "- 1 piment jalapeño, épépiné et finement haché\n" +
                        "- 1 gousse d'ail, émincée\n" +
                        "- 1 croûte de pizza mince précuite de 12 pouces\n" +
                        "- 2 tasses d'épinards frais hachés\n" +
                        "- 2 cuillères à soupe de coriandre fraîche hachée\n" +
                        "- Sauce piquante au goût\n" +
                        "- 1/2 tasse de cheddar réduit en gras râpé\n" +
                        "- 1/2 tasse de fromage pepper jack râpé",
                "Vegan",
                12,
                15,
                4,
                "ÉTAPE 1 :\n\nDans un petit bol, écraser les haricots noirs. Incorporer l'oignon, le poivron jaune, la poudre de chili et le cumin. Dans un autre bol, mélanger les tomates, le jalapeño et l'ail.\n\n" +
                        "ÉTAPE 2 :\n\nPlacer la croûte sur une plaque à pizza non graissée de 12 pouces ; étaler avec le mélange de haricots. Garnir du mélange de tomates et d'épinards. Saupoudrer de coriandre, de sauce piquante et de fromages.\n\n" +
                        "ÉTAPE 3 :\n\nCuire au four à 400° pendant 12-15 minutes ou jusqu'à ce que le fromage soit fondu. Donne : 6 parts."
        ));


        fs.create(new Produit(
                "PESTO CHICKEN PIZZA",
                R.drawable.pizza6,
                "Cette pizza au poulet et pesto est légère, délicieuse et saine, avec des poivrons, des champignons et du poulet. Elle est parfaite pour un dîner équilibré et savoureux.",
                70.00,
                "- 2 cuillères à café de levure sèche active\n" +
                        "- 1 tasse d'eau tiède (110° à 115°)\n" +
                        "- 2-3/4 tasses de farine à pain\n" +
                        "- 1 cuillère à soupe plus 2 cuillères à café d'huile d'olive, divisée\n" +
                        "- 1 cuillère à soupe de sucre\n" +
                        "- 1-1/2 cuillères à café de sel, divisées\n" +
                        "- 1/2 livre de poitrine de poulet désossée et sans peau, coupée en morceaux de 1,2 cm\n" +
                        "- 1 petit oignon, coupé en deux et tranché finement\n" +
                        "- 1/2 poivron vert, rouge et jaune, en julienne\n" +
                        "- 1/2 tasse de champignons frais tranchés\n" +
                        "- 3 cuillères à soupe de pesto préparé\n" +
                        "- 1-1/2 tasses (170g) de mozzarella partiellement écrémée râpée\n" +
                        "- 1/4 cuillère à café de poivre",
                "Sans Gluten",
                13,
                20,
                5,
                "ÉTAPE 1 :\n\nDans un grand bol, dissoudre la levure dans l'eau tiède. Incorporer 1 tasse de farine, 1 cuillère à soupe d'huile, le sucre et 1 cuillère à café de sel. Ajouter la farine restante ; battre jusqu'à ce que le mélange soit homogène.\n\n" +
                        "ÉTAPE 2 :\n\nSur une surface légèrement farinée, pétrir jusqu'à obtenir une pâte lisse et élastique, environ 6-8 minutes. Placer la pâte dans un bol légèrement graissé, tourner pour enrober le dessus. Couvrir et laisser lever dans un endroit chaud jusqu'à ce qu'elle double de volume, environ 1 heure.\n\n" +
                        "ÉTAPE 3 :\n\nDans une grande poêle antiadhésive à feu moyen, cuire le poulet, l'oignon, les poivrons et les champignons dans le reste de l'huile jusqu'à ce que le poulet ne soit plus rosé et que les légumes soient tendres. Retirer du feu et mettre de côté.\n\n" +
                        "ÉTAPE 4 :\n\nDégazer la pâte ; l'étaler en un cercle de 38 cm. Transférer sur une plaque à pizza de 35 cm. Former légèrement les bords. Étaler avec le pesto. Garnir du mélange de poulet et de fromage. Saupoudrer de poivre et du sel restant.\n\n" +
                        "ÉTAPE 5 :\n\nCuire au four à 200°C pendant 18-20 minutes ou jusqu'à ce que la croûte et le fromage soient légèrement dorés."
        ));

        fs.create(new Produit(
                "LOADED MEXICAN PIZZA",
                R.drawable.pizza7,
                "Cette pizza mexicaine est riche en saveurs avec des haricots noirs, des épices et des légumes frais. Parfaite pour un repas équilibré et savoureux.",
                65.00,
                "- 1 boîte (425 g) de haricots noirs, rincés et égouttés\n" +
                        "- 1 oignon rouge moyen, haché\n" +
                        "- 1 petit poivron doux jaune, haché\n" +
                        "- 3 cuillères à café de poudre de chili\n" +
                        "- 3/4 cuillère à café de cumin moulu\n" +
                        "- 3 tomates moyennes, hachées\n" +
                        "- 1 piment jalapeño, épépiné et finement haché\n" +
                        "- 1 gousse d'ail, émincée\n" +
                        "- 1 croûte de pizza fine précuite de 30 cm\n" +
                        "- 2 tasses d'épinards frais hachés\n" +
                        "- 2 cuillères à soupe de coriandre fraîche hachée\n" +
                        "- Sauce piquante au goût\n" +
                        "- 1/2 tasse de cheddar faible en gras râpé\n" +
                        "- 1/2 tasse de fromage pepper jack râpé",
                "Gourmet",
                12,
                15,
                4,
                "ÉTAPE 1 :\n\nDans un petit bol, écraser les haricots noirs. Incorporer l'oignon, le poivron jaune, la poudre de chili et le cumin. Dans un autre bol, mélanger les tomates, le jalapeño et l'ail.\n\n" +
                        "ÉTAPE 2 :\n\nPlacer la croûte sur une plaque à pizza non graissée de 30 cm ; étaler avec le mélange de haricots. Garnir du mélange de tomates et d'épinards. Saupoudrer de coriandre, de sauce piquante et des fromages.\n\n" +
                        "ÉTAPE 3 :\n\nCuire au four à 200°C pendant 12-15 minutes ou jusqu'à ce que le fromage soit fondu. Donne : 6 parts."
        ));
        fs.create(new Produit(
                "BACON CHEESEBURGER PIZZA",
                R.drawable.pizza8,
                "Cette pizza combine deux favoris : le cheeseburger et la pizza. Parfaite pour les enfants et les adultes qui adorent ces deux classiques !",
                70.00,
                "- 225 g de boeuf haché\n" +
                        "- 1 petit oignon, haché\n" +
                        "- 1 croûte de pain italien précuite (450 g)\n" +
                        "- 1 boîte (225 g) de sauce à pizza\n" +
                        "- 6 tranches de bacon, cuites et émiettées\n" +
                        "- 20 rondelles de cornichons à l'aneth\n" +
                        "- 2 tasses (225 g) de mozzarella râpée\n" +
                        "- 2 tasses (225 g) de cheddar râpé\n" +
                        "- 1 cuillère à café d'assaisonnement pour pizza ou d'assaisonnement italien",
                "Vegan",
                9,
                10,
                3,
                "ÉTAPE 1 :\n\nDans une poêle, cuire le boeuf haché et l'oignon à feu moyen jusqu'à ce que la viande ne soit plus rose. Égoutter et réserver.\n\n" +
                        "ÉTAPE 2 :\n\nPlacer la croûte sur une plaque à pizza non graissée de 30 cm. Étaler avec la sauce à pizza. Garnir du mélange de viande, du bacon, des cornichons et des fromages. Saupoudrer de l'assaisonnement pour pizza. Cuire au four à 230°C pendant 8-10 minutes ou jusqu'à ce que le fromage soit fondu. Donne : 8 parts."
        ));


        list = findViewById(R.id.listPizza);
        adapter = new PizzaAdapter(fs.findAll(), this);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Produit selectedProduit = (Produit) adapter.getItem(position);
                Intent intent = new Intent(ListPizzaActivity.this, descriptionAct.class);
                intent.putExtra("titrePizza", selectedProduit.getNom());
                intent.putExtra("contenuDescription", selectedProduit.getDescription());
                intent.putExtra("contenuIngrédients", selectedProduit.getDetaisIngred());
                intent.putExtra("nbrIngredients", selectedProduit.getNbrIngredients());
                intent.putExtra("duree", selectedProduit.getDuree());
                intent.putExtra("contenuPreparation", selectedProduit.getPreparation());


                intent.putExtra("imagePizza", selectedProduit.getPhoto());

                startActivity(intent);
            }
        });
    }
}