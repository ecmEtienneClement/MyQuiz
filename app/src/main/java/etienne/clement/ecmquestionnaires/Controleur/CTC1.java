package etienne.clement.ecmquestionnaires.Controleur;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import etienne.clement.ecmquestionnaires.Model.Questions;
import etienne.clement.ecmquestionnaires.Model.Reponses;
import etienne.clement.ecmquestionnaires.Vue.ACTION;
import etienne.clement.ecmquestionnaires.Vue.RESULTAT;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/6/21.
 */
public final class CTC1 extends ControleurMere {
    int note = 0;
    private static CTC1 mCTC1 = null;

    private CTC1() {
        super();
    }

    public static final CTC1 getmCTC1() {
        if (CTC1.mCTC1 == null) {
            CTC1.mCTC1 = new CTC1();
        }
        return mCTC1;
    }


    Questions premiere_question = new Questions("Une directive du prépocesseur est une ligne qui commence par ?");
    Questions deuxieme_question = new Questions("Qu'est ce qu'une bibliothèque ?");
    Questions troisieme_question = new Questions("Quel est le nom de la fonction principale d'un programme ?");
    Questions quatrieme_question = new Questions("Quelle symbole  termine toujours une instruction ?");
    Questions cinquieme_question = new Questions("Comment écrire un commentaire sur une seule ligne ?");
    Questions sixieme_question = new Questions("Quelle est la fonction qui permet d'afficher du texte à l'écran en mode console ?");
    Questions septieme_question = new Questions("Quelle symbole permet d'effectuer un retour à la ligne à l'écran?");
    Questions huitieme_question = new Questions("Quelle symbole permet d'effectuer un retour du curseur à gauche de l'écran ?");
    Questions neuvieme_question = new Questions("Un fichier source c à pour extension ?");
    Questions dixieme_question = new Questions("Le programme chargé de traduire votre code en language binaire est appelé ?");


    Reponses premiere_reponse = new Reponses("{", "#", "/*", "//", 2);
    Reponses deuxieme_reponse = new Reponses("Un fichier contenant mon programme", "Un fichier source déjà écrit contenant des fonctions toutes prêtes", "Un fichier permettant d'afficher du texte à l'écran", 2);
    Reponses troisieme_reponse = new Reponses("N'importe quel nom star", "main", "principal", 2);
    Reponses quatrieme_reponse = new Reponses(".", ";", ",", "}", 2);
    Reponses cinquieme_reponse = new Reponses("/@* mon commentaire*/", "/*/ mon commentaire//", "// mon commentaire", "/* mon commentaire", 3);
    Reponses sixieme_reponse = new Reponses("fprintf(<<un message>>)", "print(<<un message>>)", "Aff(<<un message>>)", "prinf(\"un message\")", 4);
    Reponses septieme_reponse = new Reponses("tab n", "tab t", "tab r", "tab b", 1);
    Reponses huitieme_reponse = new Reponses("tab n", "tab t", "tab r", "tab b", 3);
    Reponses neuvieme_reponse = new Reponses(".pas", ".c", ".txt", ".exe", 2);
    Reponses dixieme_reponse = new Reponses("le programmeur", "le traducteur", "le compilateur", "le linkeur", 3);

    public Questions tableau_questions[] = {premiere_question, deuxieme_question, troisieme_question, quatrieme_question,
            cinquieme_question, sixieme_question, septieme_question, huitieme_question, neuvieme_question,
            dixieme_question};

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