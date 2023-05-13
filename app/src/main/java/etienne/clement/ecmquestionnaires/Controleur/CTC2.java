package etienne.clement.ecmquestionnaires.Controleur;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import etienne.clement.ecmquestionnaires.Model.Reponses;
import etienne.clement.ecmquestionnaires.Model.Questions;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/7/21.
 */
public final class CTC2 extends ControleurMere {
    public int note = 0;
    private static CTC2 mCTC2 = null;

    private CTC2() {
        super();
    }

    public static final CTC2 getmCTC2() {
        if (CTC2.mCTC2 == null) {
            CTC2.mCTC2 = new CTC2();
        }
        return mCTC2;
    }


    Questions premiere_question = new Questions("Il existe 3 types de boucles lesquelles ?");
    Questions deuxieme_question = new Questions("L'instruction if (x % 2=0) retourne ?");
    Questions troisieme_question = new Questions("a=0;  b=0;  ok= \"ok\";  L'instruction if(a==0) if(b==0) printf(ok); Affiche ?");
    Questions quatrieme_question = new Questions("Que fait l'instruction break ?");
    Questions cinquieme_question = new Questions("Il est toujours possible de remplacer une construction switch "
            + " par une serie de constructions if imbriquées :?");
    Questions sixieme_question = new Questions("l'instruction goto ?");


    Reponses premiere_reponse = new Reponses("var ,char ,for", "if..else,else,switch", "do while,while et for", 2);
    Reponses deuxieme_reponse = new Reponses("false", "true", "0", "erreur", 4);
    Reponses troisieme_reponse = new Reponses("ok ok", "0 0 ok", "0 ok", "ok", 4);
    Reponses quatrieme_reponse = new Reponses("interrompt le déroulement de la boucle en passant à l'instruction suivant la boucle ",
            "met un terme à l'execution de la fonction", "met fin à l'éxécution", 1);
    Reponses cinquieme_reponse = new Reponses("vrai", "faux", 1);
    Reponses sixieme_reponse = new Reponses("permet classiquement le branchement en fin de programme", "permet classiquement le branchement en début de programme", "permet classiquement le branchement en un emplacement "
            + "                               quelconque du programme ", 3);


    public Questions tableau_questions[] = {premiere_question, deuxieme_question, troisieme_question, quatrieme_question,
            cinquieme_question, sixieme_question};


    public Reponses tableau_reponses[] = {premiere_reponse, deuxieme_reponse, troisieme_reponse, quatrieme_reponse,
            cinquieme_reponse, sixieme_reponse};

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
