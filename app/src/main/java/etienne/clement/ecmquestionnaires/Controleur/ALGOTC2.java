package etienne.clement.ecmquestionnaires.Controleur;

import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.*;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/20/21.
 */
public class ALGOTC2 extends ControleurMere {
    public static ALGOTC2 sALGOTC2 = null;
    public int note = 0;

    public ALGOTC2() {
        super();
    }

    public static final ALGOTC2 getALGOTC2() {
        if (ALGOTC2.sALGOTC2 == null) {
            ALGOTC2.sALGOTC2 = new ALGOTC2();
        }
        return sALGOTC2;
    }

    // Mise en place de mes questions
    Questions premiere_question = new Questions("Un sous-programme est obligatoirement caractérisé par :?");
    Questions deuxieme_question = new Questions("Une fonction renvoie une ou plusieurs valeurs : ?");
    Questions troisieme_question = new Questions("Une procédure  renvoie une seule valeur :?");
    Questions quatrieme_question = new Questions("Un tableau est : ?");
    Questions cinquieme_question = new Questions("Dans la mémoire centrale, les éléments d’un tableau sont stockés :?");
    Questions sixieme_question = new Questions("Les éléments d’un tableau sont affichés :?");
    Questions septieme_question = new Questions("Après avoir créé un tableau on peut y effectuer :?");
    Questions huitieme_question = new Questions("Quel le résultat de cet algorithme?\n" + "S ←-0 ;\n"
            + "Pouri<--1 à n faire\n" + "S <--S + t[i];\n" + "Ecrire(“le résultat est:”, S);: ?");
    Questions neuvieme_question = new Questions("Une chaîne de caractère :  ?");
    Questions dixieme_question = new Questions("Une variable de type chaîne a une taille prédéfinie entre ?");
    Questions onzieme_question = new Questions("La fonction prédéfinie longueur (s ) : entier; retourne :?");

    // ..........

    Reponses premiere_reponse = new Reponses("un chiffre  ", "un type ", " un nom unique", 3);
    Reponses deuxieme_reponse = new Reponses("Vrai", " Faux  ", 2);
    Reponses troisieme_reponse = new Reponses("Vrai", " Faux  ", 2);
    Reponses quatrieme_reponse = new Reponses("un ensemble de données",
            "Une collection séquentielle d’éléments de même type ", "Une suite de chaînes de caractère ", 2);
    Reponses cinquieme_reponse = new Reponses("de façon linéaire ", " de façon aléatoire ", 1);
    Reponses sixieme_reponse = new Reponses("Un à un  ", " Deux à deux", " En vrac", 1);
    Reponses septieme_reponse = new Reponses("plusieurs opérations ", "Aucune opération", "Une seule opération ", 1);
    Reponses huitieme_reponse = new Reponses(" Calculer la somme des éléments du tableau ",
            "Calculer le produit des éléments du tableau", " Trier les éléments du tableau ", 1);
    Reponses neuvieme_reponse = new Reponses("c’est une collection de caractères spéciaux",
            "c’est une collection de mot ", "c’est une collection de  caractères ", 3);
    Reponses dixieme_reponse = new Reponses("0 à 128 ", "0 à 255", "1 à 255 ", 3);
    Reponses onzieme_reponse = new Reponses("la position de s ", "la longueur courante de s ", "la position de s", 2);
    public Questions tableau_questions[] = {premiere_question, deuxieme_question, troisieme_question, quatrieme_question,
            cinquieme_question, sixieme_question, septieme_question, huitieme_question, neuvieme_question,
            dixieme_question, onzieme_question,

    };

    public Reponses tableau_reponses[] = {premiere_reponse, deuxieme_reponse, troisieme_reponse, quatrieme_reponse,
            cinquieme_reponse, sixieme_reponse, septieme_reponse, huitieme_reponse, neuvieme_reponse, dixieme_reponse,
            onzieme_reponse};

    public int VerificationResultat(int a, int reponse, Context context, View view) {
        /*Cette methode appelle la methode de la classe mere pour la verfification des resultats
         * la methode de la classe fille appelle celle de la classe mere en la passant les parametres
         * a-reponse-tableau_reponse( qui est sur cette classe)-context-et view
         * Mais l'appelle de cette methode de la classe fille dans la classe action la passera les memes
         * parametres sauf le tableau_reponses qui cette parametre est deja passer par la classse fille */
        note = super.VerificationResultat(a, reponse, tableau_reponses, context, view);
        /*la note est renvoyer par la classe mere 1 ou 0 qui stoker ds la variable note de la
         * classe fille qui ensuit est renvoyer dans la classe action qui est aussi stoker ds une
         * variable note */
        return note;
    }
}
