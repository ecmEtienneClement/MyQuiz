package etienne.clement.ecmquestionnaires.Controleur;

import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.Questions;
import etienne.clement.ecmquestionnaires.Model.Reponses;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/14/21.
 */
public final class JSTC3 extends ControleurMere {
    public static JSTC3 sJSTC3;
    public int note = 0;

    public JSTC3() {
        super();
    }

    public static JSTC3 getJSTC3() {
        if (JSTC3.sJSTC3 == null) {
            JSTC3.sJSTC3 = new JSTC3();
        }
        return sJSTC3;
    }


    Questions premiere_question = new Questions("JavaScript est un langage orienté objet ?");
    Questions deuxieme_question = new Questions("Une classe contient ?");
    Questions troisieme_question = new Questions("Le  mot-clé this permet :");
    Questions quatrieme_question = new Questions("Une classe est créée à partir d'un objet ?");
    Questions cinquieme_question = new Questions("En javaScript le mot class permet de créér une classe ?");
    Questions sixieme_question = new Questions("Une classe abstraite est :");
    Questions septieme_question = new Questions("En javaScripte la classe mère de toutes les classes est ?");
    Questions huitieme_question = new Questions("Une classe est une instance d'un objet ?");
    Questions neuvieme_question = new Questions("Quelle est la bonne définition ?");
    Questions dixieme_question = new Questions("L'attribut prototype permet ?");

    //Mise en place des differentes des reponses...

    Reponses premiere_reponse = new Reponses("Vrai", "Faux", 2);
    Reponses deuxieme_reponse = new Reponses("des fonctions  et des attributs", "que des attributs", "que des méthodes", 1);
    Reponses troisieme_reponse = new Reponses("la destruction d'une classe", "a un objet de s'autoréférencer", "la création d'objet", 2);
    Reponses quatrieme_reponse = new Reponses("Vrai", "Faux", 2);
    Reponses cinquieme_reponse = new Reponses("Vrai", "Faux", 2);
    Reponses sixieme_reponse = new Reponses("une classe mère", "une classe qui ne peut pas être instanciée dans une application", "une classe sans méthode", 2);
    Reponses septieme_reponse = new Reponses("Super", "Classe", "Object", 3);
    Reponses huitieme_reponse = new Reponses("Vrai", "Faux", 2);
    Reponses neuvieme_reponse = new Reponses("var ecm = super Object();", "var ecm = new Object();", "var ecm = this Object();", 2);
    Reponses dixieme_reponse = new Reponses("D'instancier une classe", "de spécifier tous les attributs et mèthodes communs à toutes", "de supprimer un objet", 2);


    public Questions tableau_questions[] = {premiere_question, deuxieme_question, troisieme_question, quatrieme_question,
            cinquieme_question, sixieme_question, septieme_question, huitieme_question, neuvieme_question,
            dixieme_question};

    //Mise en placde de mon tableau de reponses...

    public Reponses tableau_reponses[] = {premiere_reponse, deuxieme_reponse, troisieme_reponse, quatrieme_reponse,
            cinquieme_reponse, sixieme_reponse, septieme_reponse, huitieme_reponse, neuvieme_reponse, dixieme_reponse};


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
