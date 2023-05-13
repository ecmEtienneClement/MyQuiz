package etienne.clement.ecmquestionnaires.Controleur;

import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.Reponses;
import etienne.clement.ecmquestionnaires.Model.Questions;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/14/21.
 */
public final class JSTC2 extends ControleurMere {

    public static JSTC2 sJSTC2 = null;
    int note = 0;

    private JSTC2() {
        super();
    }

    public static JSTC2 getJSTC2() {
        if (JSTC2.sJSTC2 == null) {
            JSTC2.sJSTC2 = new JSTC2();
        }
        return sJSTC2;
    }

    Questions premiere_question = new Questions("La quelle de ces variables sera déclarée correctement ?");
    Questions deuxieme_question = new Questions("Par quoi on peut encadrée une chaine de caractères ?");
    Questions troisieme_question = new Questions("Cette concaténation,  est-elle correcte var ecm = \"j'aime\"-'le javaScript'; ?");
    Questions quatrieme_question = new Questions("Quelle est le résultat de ce code \n var nombre1 =\"5\", var nombre2 =\"7\", \n result = nombre1 + nombre2 ?");
    Questions cinquieme_question = new Questions("Dans quelle ordre doit-on voir apparaître ces structures ?");
    Questions sixieme_question = new Questions("Quelle est la valeur ecm dans l'instruction suivante \n var ecm : count++; ?");
    Questions septieme_question = new Questions("Quelle est l'utilité de break dans une boucle ?");
    Questions huitieme_question = new Questions("Quelle est la particularité d'une boucle do while ?");
    Questions neuvieme_question = new Questions("Quelle est la syntaxe exacte d'une boucle for ?");
    Questions dixieme_question = new Questions("Dans une boucle for ,à quel moment le bloc d'incrémentation est-il exécuté ?");

    //Mise en place des differentes des reponses...

    Reponses premiere_reponse = new Reponses("var 1variable =1 0;", "var variable = 55;", "var var = 4;", "text ='ecm'", 2);
    Reponses deuxieme_reponse = new Reponses("par des chevrons :<>", "il est possible d'utiliser les deux ci-dessus.", "par des guillemets: \"\"", 3);
    Reponses troisieme_reponse = new Reponses("Vrai", "Faux", 2);
    Reponses quatrieme_reponse = new Reponses("12", "-2", "57", "75", 3);
    Reponses cinquieme_reponse = new Reponses("if>else if>else", "if>else>else if", "else>if>else if", 1);
    Reponses sixieme_reponse = new Reponses("juste l'incrémentation", "count sans incrémentation", "count incrémentée de 1", 2);
    Reponses septieme_reponse = new Reponses("il permet d'arrêter l'itération en cours et de quitter la boucle", "il permet de faire une pause", "il permet d'arrêter l'itération en cours et de passer à la suivante", 1);
    Reponses huitieme_reponse = new Reponses("aucune, c'est la forme longue de la boucle while", "les instructions sont exécutées au moins une fois", "la condition n'est exécutées qu'au début de chaque itération", 2);
    Reponses neuvieme_reponse = new Reponses("for(condition; initialisation; \nconclusion){}", "for(initialisation; incrémentation; \ncondition){}", "for(initialisation; condition; \nincrémentation){}", 3);
    Reponses dixieme_reponse = new Reponses("pendant chaque itération", "à la fin de chaque itération", "au début de chaque itération", 2);


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
