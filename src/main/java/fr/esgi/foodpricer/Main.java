package fr.esgi.foodpricer;

/**
 * TODO REFACTO
 *
 *
 * Food
 *     type = assiette / sandwich
 *     name => nom du plat (aucun interet dans les calculs)
 *     prix(en fonction du type)
 *         ASSIETTE
 *             15
 *         SANDWICH
 *             10
 * Beverage
 *     beverage => nom de la boisson (aucun interet de calculs)
 *     size => petit/moyen/grand
 *     prix(en fonction du type)
 *         PETIT
 *             2
 *         MOYEN
 *             3
 *         GRAND
 *             4
 * Dessert
 *     dessert => nom du dessert comme les autres noms
 *     taille du dessert => normal/special
 *     prix(en fonction du type)
 *         NORMAL
 *             2
 *         SPECIAL
 *             4
 *
 * coffee => boolean
 *
 *
 * FORMULE
 *     assiette, moyenne boisson, dessert normal 18
 *     assiette, grande boisson, dessert special 21
 *     sandich, moyenne boisson, dessert normal 13
 *     sandwich, grande boisson, dessert speical 16
 */

public class Main {
    public static void main(String[] args) {
        // pour tester, lancer en ligne de commande :
        // java Program "assiette" "couscous" "coca" "moyen" "baba" "normal" "yes"
        // Note: Make sure the class name matches the file name when compiling and running in Java.
        App app = new App();
        int price = app.Compute(args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
        System.out.println("Prix à payer : " + price + "€");
    }
}
