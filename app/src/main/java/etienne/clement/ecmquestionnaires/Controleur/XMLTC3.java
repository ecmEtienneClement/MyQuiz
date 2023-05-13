package etienne.clement.ecmquestionnaires.Controleur;

import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.*;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/20/21.
 */
public class XMLTC3 extends ControleurMere {
    public static XMLTC3 sXMLTC3 = null;
    public int note = 0;

    private XMLTC3() {
        super();
    }

    public static XMLTC3 getXMLTC3() {
        if (XMLTC3.sXMLTC3 == null) {
            XMLTC3.sXMLTC3 = new XMLTC3();
        }
        return sXMLTC3;
    }

    // Mise en place de mes questions
    Questions premiere_question = new Questions("Combien de fois peut être déclarée une même instance de noms?");
    Questions deuxieme_question = new Questions("Dans un espace de noms, chaque instance de document contient :?");
    Questions troisieme_question = new Questions("Dans une URL, la partie procédure correspond à : ?");
    Questions quatrieme_question = new Questions("Le concept d'espace de noms correspond : ?");
    Questions cinquieme_question = new Questions("Qu'est ce qu'une instance d'espace de noms : ?");
    Questions sixieme_question = new Questions(
            "Qu'est ce qui permet d'éviter les conflits de noms dans les instances de noms qualifiées ?");
    Questions septieme_question = new Questions("Les documents XML sont des espaces de noms ?");
    Questions huitieme_question = new Questions("Les URI permettent d'identifier les espaces de noms ?");
    Questions neuvieme_question = new Questions("Les URL sont incluses dans les URI ?");
    // ..............................

    Reponses premiere_reponse = new Reponses("zéro, une ou plusieurs instances de documents XML ",
            " plusieurs instances de documents XML", " une ou plusieurs instances de documents XML", 1);
    Reponses deuxieme_reponse = new Reponses("zero ou plusieurs instances de noms", "zero instance de noms",
            " une et une seule instance de noms", 1);
    Reponses troisieme_reponse = new Reponses(" un nom de domaine", "un nom d'hôte", "un protocole ", 3);
    Reponses quatrieme_reponse = new Reponses("à la notion de collections d'attributs",
            "à la notion de collections de noms dans laquelle on puise pour écrire ou parler ",
            "à la notion de collections de fonctions utilisées dans une DTD", 2);
    Reponses cinquieme_reponse = new Reponses("une fonction", " une opération", " une URI ", 3);
    Reponses sixieme_reponse = new Reponses("un contexte ", "une DTD", "un attribut", 1);
    Reponses septieme_reponse = new Reponses("Non", "Oui", 2);
    Reponses huitieme_reponse = new Reponses("Non", "Oui", 2);

    Reponses neuvieme_reponse = new Reponses("Non", "Oui", 2);
    public Questions tableau_questions[] = {premiere_question, deuxieme_question, troisieme_question, quatrieme_question,
            cinquieme_question, sixieme_question, septieme_question, huitieme_question, neuvieme_question,

    };

    public Reponses tableau_reponses[] = {premiere_reponse, deuxieme_reponse, troisieme_reponse, quatrieme_reponse,
            cinquieme_reponse, sixieme_reponse, septieme_reponse, huitieme_reponse, neuvieme_reponse};

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
