https://github.com/user-attachments/assets/6f9c7da2-6894-420f-987c-ad1a960b4934

## Description
Cette application Android permet de présenter une liste de pizzas avec les recettes détaillées de chacune. Elle propose des fonctionnalités pour afficher la liste des pizzas, consulter les détails de chaque pizza, et inclut un écran de démarrage animé s'appliquant sur le titre de l'application.

## Fonctionnalités principales
- **Splash Screen** : Un écran de démarrage avec une animation avant l'affichage de la liste des pizzas préparant au processus de lancement.
- **Affichage des Pizzas** : Une liste de pizzas avec un aperçu des prix, promotions, nombre d'ingrédients et une image significative.
- **Détails de la Pizza** : Lorsque l'utilisateur clique sur une pizza, il est redirigé vers une page détaillant les ingrédients et les étapes de préparation.


## Structure du projet
Le projet est organisé en plusieurs packages pour faciliter la gestion du code :
- `classes` : Contient la classe `Produit` qui représente les pizzas.
- `dao` : Contient l'interface générique `IDao` pour la gestion des données.
- `service` : Implémente la gestion des produits via la classe `ProduitService`.
- `adapter` : Contient la classe `PizzaAdapter` pour l'affichage des pizzas dans une `ListView`.
