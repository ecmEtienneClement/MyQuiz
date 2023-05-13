package etienne.clement.ecmquestionnaires.Controleur;
import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.Reponses;
import etienne.clement.ecmquestionnaires.Model.Questions;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/13/21.
 */
public class HTML5TC2 extends ControleurMere{
    public static HTML5TC2 sHTML5TC2 = null;
    public int note = 0;
    private HTML5TC2(){
        super();
    }
    public static final HTML5TC2 getHTML5TC2(){
        if (HTML5TC2.sHTML5TC2 == null){
            HTML5TC2.sHTML5TC2 = new HTML5TC2();
        }
        return sHTML5TC2;
    }


    Questions premiere_question = new Questions("Existe-t-il un élément de HTML 5 permettant d'afficher une carte ?");
    Questions deuxieme_question = new Questions("Un élément graphiques de HTML 5 ?");
    Questions troisieme_question = new Questions("Faire la bonne correspondance de <svg> :?");
    Questions quatrieme_question = new Questions("Faire la bonne correspondance de <maps> :?");
    Questions cinquieme_question = new Questions("Faire la bonne correspondance de <canvas> :?");
    Questions sixieme_question = new Questions("Un concurrent de Google Maps ?");
    Questions septieme_question = new Questions("Faire la bonne correspondance de <footer> :?");
    Questions huitieme_question = new Questions("Faire la bonne correspondance de <nav> :?");
    Questions neuvieme_question = new Questions("Faire la bonne correspondance de <aside> :?");
    Questions dixieme_question = new Questions("Faire la bonne correspondance de <header> :?");

    // Mise en place des differentes des reponses...

    Reponses premiere_reponse = new Reponses("Vrai", "Faux", 2);
    Reponses deuxieme_reponse = new Reponses("<canvas>", "<graph>", "<draw>", "<show>", 1);
    Reponses troisieme_reponse = new Reponses("Il permet de dessiner des graphiques vectoriels",
            "Il permet de dessiner des graphiques à la volée", "Il permet d'afficher des cartes dans une page web ", 1);
    Reponses quatrieme_reponse = new Reponses("Il permet de dessiner des graphiques vectoriels",
            "Il permet de dessiner des graphiques à la volée", "Il permet d'afficher des cartes dans une page web ", 3);
    Reponses cinquieme_reponse = new Reponses("Il permet de dessiner des graphiques vectoriels",
            "Il permet de dessiner des graphiques à la volée", "Il permet d'afficher des cartes dans une page web ", 2);
    Reponses sixieme_reponse = new Reponses("Heart", "MyMap", "Here", 3);
    Reponses septieme_reponse = new Reponses("Il spécifie un pied de page pour un document",
            "Il spécifie un en-tête pour un document",
            "Il définit un contenu en dehors du contenu dans lequel il est place",
            "Il définit un ensemble de liens de navigation", 1);
    Reponses huitieme_reponse = new Reponses("Il spécifie un pied de page pour un document",
            "Il spécifie un en-tête pour un document",
            "Il définit un contenu en dehors du contenu dans lequel il est place",
            "Il définit un ensemble de liens de navigation", 4);
    Reponses neuvieme_reponse = new Reponses("Il spécifie un pied de page pour un document",
            "Il spécifie un en-tête pour un document",
            "Il définit un contenu en dehors du contenu dans lequel il est place",
            "Il définit un ensemble de liens de navigation", 3);
    Reponses dixieme_reponse = new Reponses("Il spécifie un pied de page pour un document",
            "Il spécifie un en-tête pour un document",
            "Il définit un contenu en dehors du contenu dans lequel il est place",
            "Il définit un ensemble de liens de navigation", 2);

    public Questions tableau_questions[] = { premiere_question, deuxieme_question, troisieme_question, quatrieme_question,
            cinquieme_question, sixieme_question, septieme_question, huitieme_question, neuvieme_question,
            dixieme_question };

    public Reponses tableau_reponses[] = { premiere_reponse, deuxieme_reponse, troisieme_reponse, quatrieme_reponse,
            cinquieme_reponse, sixieme_reponse, septieme_reponse, huitieme_reponse, neuvieme_reponse, dixieme_reponse };

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
