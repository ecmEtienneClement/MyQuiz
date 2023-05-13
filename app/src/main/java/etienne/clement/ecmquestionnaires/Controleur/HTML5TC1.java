package etienne.clement.ecmquestionnaires.Controleur;
import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.Reponses;
import etienne.clement.ecmquestionnaires.Model.Questions;
import etienne.clement.ecmquestionnaires.Vue.HTML5;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/13/21.
 */
public  final  class HTML5TC1 extends ControleurMere {
    public static HTML5TC1 sHTML5TC1 = null;
   int note = 0;
    private HTML5TC1() {
        super();
    }
    public static HTML5TC1 getHTML5TC1(){
        if (HTML5TC1.sHTML5TC1 ==null){
            HTML5TC1.sHTML5TC1 = new HTML5TC1();
        }
        return sHTML5TC1;
    }
    Questions premiere_question = new Questions("C'est quoi un élément sémantique ?");
    Questions deuxieme_question = new Questions("Choisir un élément sémantique ?");
    Questions troisieme_question = new Questions("Choisir un nouveau élément sémantique ?");
    Questions quatrieme_question = new Questions("Parmis ces nouveaux éléments sémantiques le quelle n'est pas supportés par Internet Explorer ?");
    Questions cinquieme_question = new Questions("La balise <main> spécifie le contenu principal d'un document ?");
    Questions sixieme_question = new Questions("Quelle nouvel éléments sémantiques est pris en charge par Internet Explorer 8 et antérieurs ?");
    Questions septieme_question = new Questions("La balise <mark> permet de définir un texte hachuré ?");

    //Mise en place des differentes des reponses...

    Reponses premiere_reponse = new Reponses("un élément qui affiche un sens","un élément qui a une signification","un élément ayant un attribut de sens",2);
    Reponses deuxieme_reponse = new Reponses("<span>","<div>","<table>",3);
    Reponses troisieme_reponse = new Reponses("<head>","<semantic>","<figcapition>","<article>",4);
    Reponses quatrieme_reponse = new Reponses("<header>","<figcapition>","<footer>","<details>",4);
    Reponses cinquieme_reponse = new Reponses("Vrai","Faux",1);
    Reponses sixieme_reponse = new Reponses("<article>","<main>","<aside>","<header>",2);
    Reponses septieme_reponse = new Reponses("Vrai","Faux",2);

    //Mise en place de mon tableau de questions...

    public Questions tableau_questions[]= {premiere_question,deuxieme_question,troisieme_question,quatrieme_question,
            cinquieme_question,sixieme_question,septieme_question};
    //Mise en placde de mon tableau de reponses...

    public Reponses tableau_reponses[]= {premiere_reponse,deuxieme_reponse,troisieme_reponse,quatrieme_reponse,
            cinquieme_reponse,sixieme_reponse,septieme_reponse};

    public int VerificationResultat(int a, int reponse, Context context, View view) {
        /*Cette methode appelle la methode de la classe mere pour la verfification des resultats
         * la methode de la classe fille appelle celle de la classe mere en la passant les parametres
         * a-reponse-tableau_reponse( qui est sur cette classe)-context-et view
         * Mais l'appelle de cette methode de la classe fille dans la classe action la passera les memes
         * parametres sauf le tableau_reponses qui cette parametre est deja passer par la classse fille */
        /*la note est renvoyer par la classe mere 1 ou 0 qui stoker ds la variable note de la
         * classe fille qui ensuit est renvoyer dans la classe action qui est aussi stoker ds une
         * variable note */

        note = super.VerificationResultat(a, reponse, tableau_reponses, context, view);
        return note;
    }
}
