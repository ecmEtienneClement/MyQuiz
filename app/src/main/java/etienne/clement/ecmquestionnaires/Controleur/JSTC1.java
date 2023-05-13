package etienne.clement.ecmquestionnaires.Controleur;
import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.Questions;
import etienne.clement.ecmquestionnaires.Model.Reponses;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/13/21.
 */
public final class JSTC1 extends ControleurMere{
    public static JSTC1 sJSTC1 = null;
    int note = 0;

    private JSTC1() {
        super();
    }
    public static JSTC1 getJSTC1(){
        if (JSTC1.sJSTC1 ==null){
            JSTC1.sJSTC1 = new JSTC1();
        }
        return sJSTC1;
    }

    //	Mise en place des differentes questions....

    Questions premiere_question = new Questions("Avant d'être appelé JavaScript, le langage s'appelait ?");
    Questions deuxieme_question = new Questions("Le JavaScript est un langage ... ?");
    Questions troisieme_question = new Questions("Où dois-je placer de préférence mon code JavaScripte dans une page web ?");
    Questions quatrieme_question = new Questions("Dans une page html dans quelle balise on met le code JavaScript ?");
    Questions cinquieme_question = new Questions("Quelle est la bonne syntaxe pour référencer le scripte externe (xxx.js) ?");
    Questions sixieme_question = new Questions("JavaScript est créé à partir du langage Java ?");
    Questions septieme_question = new Questions("Lequel de ces logiciels peux interpreter le code JavaScript ?");
    Questions huitieme_question = new Questions("Laquelle des balises ferme un code JavaScript ?");
    Questions neuvieme_question = new Questions("Le code JavaScript d'une page web s'exécute sur le serveur qui héberge la page web ?");
    Questions dixieme_question = new Questions("Pour écrire un scripte JavaScript il faut obligatoirement un logiciel de traitement de texte comme word ?");

    //Mise en place des differentes des reponses...

    Reponses premiere_reponse = new Reponses("ECMAScript","ActionScript","CoffeeScript","LiveScript",4);
    Reponses deuxieme_reponse = new Reponses("Compilé","Précompilé","Interprété",3);
    Reponses troisieme_reponse = new Reponses("Juste avant la fin de la balise <body>","Dans la balise <head> qui est prévue à cet effet","Entre les balises <head> et <body>",1);
    Reponses quatrieme_reponse = new Reponses("<scripting>","<script>","<javascript>","< js >",2);
    Reponses cinquieme_reponse = new Reponses("<script src =\"xxx.js\">","<script href =\"xxx.js\">","<script name =\"xxx.js\">",1);
    Reponses sixieme_reponse = new Reponses("Vrai","Faux",2);
    Reponses septieme_reponse = new Reponses("VirtualBox","VLC","Firefox","Aucun",3);
    Reponses huitieme_reponse = new Reponses("</scripte>","</scrpt>","</script>","</cript>",3);
    Reponses neuvieme_reponse = new Reponses("Vrai","Faux",2);
    Reponses dixieme_reponse = new Reponses("Vrai","Faux",1);

    //Mise en place de mon tableau de questions...

    public Questions tableau_questions[]= {premiere_question,deuxieme_question,troisieme_question,quatrieme_question,
            cinquieme_question,sixieme_question,septieme_question,huitieme_question,neuvieme_question,
            dixieme_question};

    //Mise en placde de mon tableau de reponses...

    public Reponses tableau_reponses[]= {premiere_reponse,deuxieme_reponse,troisieme_reponse,quatrieme_reponse,
            cinquieme_reponse,sixieme_reponse,septieme_reponse,huitieme_reponse,neuvieme_reponse,dixieme_reponse};

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
